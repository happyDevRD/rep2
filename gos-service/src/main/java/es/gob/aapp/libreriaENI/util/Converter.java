package es.gob.aapp.libreriaENI.util;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Node;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Converter {

	private Converter() {}

	public static String listaToString(List<String> lista) {
		return String.join(" , ", lista);
	}


	public static byte[] convertFirmaBase64toDSSignature(byte[] data) throws IOException {
		String nodoSignature;
		String nodoFirmaBase64;

		String expresionSignature = "//*[local-name()='Signature']";
		try {
			nodoSignature =XMLUtils.signatureString(expresionSignature, data);
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}

		// si ya viene con el nodo ds:signature no hacer nada (se pone distinto para CSV)
		if (!"".equals(nodoSignature)) {
			// sacar la firma decodificarla e incluirla
			String dataB64 = new String(data);

			String expresionFirmaBase64 = "//*[local-name()='FirmaBase64']";
			try {
				nodoFirmaBase64 = XMLUtils.signatureString(expresionFirmaBase64, data);
			} catch (Exception e) {
				throw new IOException(e.getMessage());
			}

			String contenidoNodoFirmaBase64;
			try {
				contenidoNodoFirmaBase64 = XMLUtils.getNodoValue(expresionFirmaBase64,
						data);
			} catch (Exception e) {
				throw new IOException("No se ha encontrado el nodo de firma del expediente: " + e.getMessage());
			}

			byte[] firmaDecode = Base64.decodeBase64(contenidoNodoFirmaBase64.getBytes(StandardCharsets.UTF_8));
			String firmaDsSignature = new String(firmaDecode);

			// nos puede llegar varias veces codificado en base64. lo vamos decodificando
			while (Base64.isBase64(firmaDsSignature)) {
				byte[] uncodificadoB64 = Base64
						.decodeBase64(firmaDsSignature.getBytes(XMLUtils.UTF8_CHARSET));
				firmaDsSignature = new String(uncodificadoB64);

			}

			/*
			 * esto esta porque si nos envian en firmabase64 una firma internally detached
			 * pasarla sin cambiar nada por ejemplo los expedientes de junta andalucia
			 */

			String nodoAfirma = "";
			try {
				Node nodoPadre = XMLUtils.getNode(firmaDsSignature.getBytes(XMLUtils.UTF8_CHARSET), "*");
				String[] partes = nodoPadre.getNodeName().split(":");

				if (partes.length > 1)
					nodoAfirma = partes[1];
				else
					nodoAfirma = partes[0];

			} catch (Exception e) {
				// se comenta porque en caso de expediente con firma cades attached implicit
				// debe devolverse el exp tal cual para validar
				// y no saltar esta excepcion que interrumpe el metodo
				//"AVISO!!!!!!!! XMLUtils.deFirmaBase64_A_DSSignature: se comenta porque en caso de expediente con firma cades attached implicit debe devolverse el exp tal cual para validar";

			}

			if ("Signature".equals(nodoAfirma)) {
				dataB64 = dataB64.replace(nodoFirmaBase64, firmaDsSignature);
			}

			return dataB64.getBytes(StandardCharsets.UTF_8);

		} else {
			return data;
		}

	}


}
