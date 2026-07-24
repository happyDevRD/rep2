package com.greenaall.certificado;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.util.ASN1Dump;

import com.greenaall.util.Global;



/**
 * Clase de utilidades de certificados.
 * 
 * @author dgarcia
 * 
 */
public class CertificateUtil {

	public Map<String, String> readPropertiesOid(X509Certificate cert,
			String proyecto) {

		//String appMode = Global.APP_MODO_MUESTRA;
		String appMode = Global.APP_MODO_PRODUCCION;
		
		/*if (proyecto != "NO_PRINT") {
			Config conf = new Config(proyecto);
			appMode = conf.getAppMode();
		} else {
			appMode = Global.APP_MODO_PRODUCCION;
		}*/
		
		Map<String, String> propiedadesOid = new HashMap<String, String>();

		// Obtengo los Oids
		Set<String> oids = cert.getNonCriticalExtensionOIDs();

		if (oids != null) {
			// Iteramos sobre los Oids
			for (String oid : oids) {

				try {
					byte[] extension = cert.getExtensionValue(oid);
					ByteArrayInputStream bais = new ByteArrayInputStream(
							extension);
					ASN1InputStream aIn = new ASN1InputStream(bais);
					ASN1OctetString extValue = (ASN1OctetString) aIn
							.readObject();
					aIn = new ASN1InputStream(new ByteArrayInputStream(
							extValue.getOctets()));
					ASN1Primitive extensionType = aIn.readObject();

					if (!Global.APP_MODO_PRODUCCION.equalsIgnoreCase(appMode))
						System.out.println("oid= " + oid + ", valor= "
								+ ASN1Dump.dumpAsString(extValue)
								+ "\n-\ntipo "
								+ ASN1Dump.dumpAsString(extensionType));

					readPropiedadesOid(oid, extValue, propiedadesOid);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		// Retornamos el conjunto de oids recuperados.
		return propiedadesOid;
	}

	public void readPropiedadesOid(String oidActual, ASN1Primitive extension,
			Map<String, String> propiedadesOid) {
		if (extension instanceof DERSequence) {
			// tengo un objeto de tipo secuence.
			DERSequence secuence = (DERSequence) extension;
			Enumeration<?> enumObjetos = secuence.getObjects();
			String oidUtilizadoNodo = oidActual;
			while (enumObjetos.hasMoreElements()) {
				ASN1Primitive objeto = (ASN1Primitive) enumObjetos
						.nextElement();
				// si este objeto fuese un identificador quiere decir que el
				// siguiente seria un objeto que queremos guardar
				if (objeto instanceof ASN1ObjectIdentifier) {
					ASN1ObjectIdentifier objetoID = (ASN1ObjectIdentifier) objeto;
					// este es el oid utilizado para los nodos que estan por
					// debajo del actual
					oidUtilizadoNodo = objetoID.getId();
				} else {
					readPropiedadesOid(oidUtilizadoNodo, objeto, propiedadesOid);
				}
			}
		} else if (extension instanceof DLSequence) {
			// tengo un objeto de tipo secuence.
			DLSequence secuence = (DLSequence) extension;
			Enumeration<?> enumObjetos = secuence.getObjects();
			String oidUtilizadoNodo = oidActual;
			while (enumObjetos.hasMoreElements()) {
				ASN1Primitive objeto = (ASN1Primitive) enumObjetos
						.nextElement();
				// si este objeto fuese un identificador quiere decir que el
				// siguiente seria un objeto que queremos guardar
				if (objeto instanceof ASN1ObjectIdentifier) {
					ASN1ObjectIdentifier objetoID = (ASN1ObjectIdentifier) objeto;
					// este es el oid utilizado para los nodos que estan por
					// debajo del actual
					oidUtilizadoNodo = objetoID.getId();
				} else {
					readPropiedadesOid(oidUtilizadoNodo, objeto, propiedadesOid);
				}
			}
		} else if (extension instanceof ASN1ObjectIdentifier) {
			// el objeto es un identificador.
			ASN1ObjectIdentifier objetoID = (ASN1ObjectIdentifier) extension;
			String oid = objetoID.getId();
			System.out.println("Valor perdido " + oid);
		} else if (extension instanceof DERIA5String) {
			// hemos localizado un par id-valor
			String valor = ((DERIA5String) extension).getString();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERVisibleString) {
			// hemos localizado un par id-valor
			String valor = ((DERVisibleString) extension).getString();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERPrintableString) {
			// hemos localizado un par id-valor
			String valor = ((DERPrintableString) extension).getString();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERBitString) {
			String valor = "" + ((DERBitString) extension).getPadBits();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERSet) {
			Enumeration<?> enumSet = ((DERSet) extension).getObjects();
			while (enumSet.hasMoreElements()) {
				readPropiedadesOid(oidActual,
						(ASN1Primitive) enumSet.nextElement(), propiedadesOid);
			}
		} else if (extension instanceof DERTaggedObject) {
			DERTaggedObject derTag = (DERTaggedObject) extension;
			if ((derTag.isExplicit())
					|| derTag.getObject() instanceof DERSequence) {
				ASN1Primitive nestedObj = derTag.getObject();
				readPropiedadesOid(oidActual, nestedObj, propiedadesOid);
			} else {
				DEROctetString derOct = (DEROctetString) derTag.getObject();
				readPropiedadesOid(oidActual, derOct, propiedadesOid);
			}
		} else if (extension instanceof DEROctetString) {
			DEROctetString oct = (DEROctetString) extension;
			ASN1InputStream aIn = new ASN1InputStream(new ByteArrayInputStream(
					oct.getOctets()));
			try {
				ASN1Primitive extensionObj = aIn.readObject();
				readPropiedadesOid(oidActual, extensionObj, propiedadesOid);
				aIn.close();
			} catch (IOException e) {
				// si no es un nuevo objeto codificado quizas sea un string(ej :
				// las crls se recuperan asi)
				propiedadesOid.put(oidActual, new String(oct.getOctets()));
			} catch (IllegalStateException e) {
				// Problema extra�o detectado con los certificados corruptos.
				// OID: 2.5.29.14 :java.lang.IllegalStateException: DER length
				// more than 4 bytes
				// DER length more than 4 bytes
				System.out.println("ERROR: " + e.getMessage());
			} catch (Exception e) {
				// Problema extra�o detectado con los certificados corruptos.
				// OID: 2.5.29.14 :java.lang.IllegalStateException: DER length
				// more than 4 bytes
				e.printStackTrace();
			}

		} else if (extension instanceof ASN1Integer) {
			String valor = ""
					+ ((ASN1Integer) extension).getValue().longValue();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERT61String) {
			String valor = ((DERT61String) extension).getString();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERUTF8String) {
			String valor = ((DERUTF8String) extension).getString();
			propiedadesOid.put(oidActual, valor);
		} else if (extension instanceof DERApplicationSpecific) {
			DERApplicationSpecific temp = (DERApplicationSpecific) extension;
			String valor = new String(temp.getContents());
			propiedadesOid.put(oidActual, valor);
		} else {
			System.out.println("Tipo de estructura ANS1 no soportada: "
					+ extension);
		}
	}

}
