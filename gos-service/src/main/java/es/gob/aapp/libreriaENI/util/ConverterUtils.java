package es.gob.aapp.libreriaENI.util;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import es.gob.aapp.model.eni.xml.w3c.ObjectFactory;
import es.gob.aapp.model.eni.xml.w3c.SignatureType;
import org.apache.xerces.dom.ElementNSImpl;
import org.apache.xerces.dom.TextImpl;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;



public class ConverterUtils {
	
	private ConverterUtils() {}


	private static final String TEXT_XML = "text/xml";

	private static final String APPLICATION_PDF = "application/pdf";

	private static final String APPLICATION_OGG = "application/ogg";
	
	/**
	 * Devuelve el mime que tendría un documento según el nombre del formato de
	 * éste.
	 * 
	 * @param nombreFormato nombreFormato
	 * @return String
	 */
	public static String getMimeByNombreFormato(String nombreFormato) {
		
		String mime;
		// DOCUMENTOS MAS COMUNES
		if ("PDF".equalsIgnoreCase(nombreFormato)) {
			mime = APPLICATION_PDF;
		} else if ("XML".equalsIgnoreCase(nombreFormato)) {
			mime = TEXT_XML;
		} else if ("XSIG".equalsIgnoreCase(nombreFormato)) {
			mime = TEXT_XML;
		} else if ("TXT".equalsIgnoreCase(nombreFormato)) {
			mime = "text/plain";
		} else if ("HTML".equalsIgnoreCase(nombreFormato)) {
			mime = "text/html";

			// OFFICE Y OPENOFFICE
			// WORD
		} else if ("DOC".equalsIgnoreCase(nombreFormato)) {
			mime = "application/msword";
		} else if ("DOCX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
		} else if ("ODT".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.oasis.opendocument.text";
		} else if ("DOTX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/application/vnd.openxmlformats-officedocument.wordprocessingml.template";
		} else if ("DOCM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-word.document.macroEnabled.12";
		} else if ("DOTM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-word.template.macroEnabled.12";

			// HOJAS DE CALCULO
		} else if ("XLS".equalsIgnoreCase(nombreFormato)) {
			mime = "application/msexcel";
		} else if ("XLSX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
		} else if ("XLTX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.spreadsheetml.template";
		} else if ("XLSM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-excel.sheet.macroEnabled.12";
		} else if ("XLTM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-excel.template.macroEnabled.12";
		} else if ("XLAM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-excel.addin.macroEnabled.12";
		} else if ("XLSB".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-excel.sheet.binary.macroEnabled.12";

			// PRESENTACIONES
		} else if ("PPT".equalsIgnoreCase(nombreFormato)) {
			mime = "application/mspowerpoint";
		} else if ("PPTX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
		} else if ("POTX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.presentationml.template";
		} else if ("PPSX".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.openxmlformats-officedocument.presentationml.slideshow";
		} else if ("PPAM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-powerpoint.addin.macroEnabled.12";
		} else if ("PPTM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-powerpoint.presentation.macroEnabled.12";
		} else if ("POTM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-powerpoint.template.macroEnabled.12";
		} else if ("PPSM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-powerpoint.slideshow.macroEnabled.12";

			// OTROS DOCUMENTOS DE OFFICE
			// Microsoft Project
		} else if ("MPP".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-project";
			// Microsoft Visio
		} else if ("VSD".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.ms-visio";

		} else if ("RTF".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-rtf";

			// IMAGENES
		} else if ("JPG".equalsIgnoreCase(nombreFormato) || "JPEG".equalsIgnoreCase(nombreFormato)) {
			mime = "image/jpeg";
		} else if ("PNG".equalsIgnoreCase(nombreFormato)) {
			mime = "image/png";
		} else if ("GIF".equalsIgnoreCase(nombreFormato)) {
			mime = "image/gif";
		} else if ("TIF".equalsIgnoreCase(nombreFormato)) {
			mime = "image/tiff";
		} else if ("SVF".equalsIgnoreCase(nombreFormato)) {
			mime = "image/vnd-dwg";
		} else if ("SVG".equalsIgnoreCase(nombreFormato)) {
			mime = "image/svg+xml";

			// CERTIFICADOS
		} else if ("P12".equalsIgnoreCase(nombreFormato)) {
			mime = "application/pkcs-12";
		} else if ("CERT".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-x509-ca-cert";

		} else if ("PS".equalsIgnoreCase(nombreFormato)) {
			mime = "application/postscript";

			// COMPRESIÓN DE FICHEROS
		} else if ("BZ".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-bzip";
		} else if ("BZ2".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-bzip2";
		} else if ("ZIP".equalsIgnoreCase(nombreFormato)) {
			mime = "application/zip";
		} else if ("GZIP".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-gzip";
		} else if ("RAR".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-rar";			

			// AUDIO
		} else if ("RM".equalsIgnoreCase(nombreFormato)) {
			mime = "application/vnd.rn-realmedia";
		} else if ("AIF".equalsIgnoreCase(nombreFormato)) {
			mime = "audio/aiff";
		} else if ("AU".equalsIgnoreCase(nombreFormato)) {
			mime = "audio/basic";
		} else if ("MIDI".equalsIgnoreCase(nombreFormato)) {
			mime = "audio/midi";
		} else if ("MPG".equalsIgnoreCase(nombreFormato)) {
			mime = "audio/mpeg";
		} else if ("OGA".equalsIgnoreCase(nombreFormato)) {
			mime = APPLICATION_OGG;
		} else if ("OGG".equalsIgnoreCase(nombreFormato)) {
			mime = APPLICATION_OGG;			
		} else if ("MP3".equalsIgnoreCase(nombreFormato)) {
			mime = "audio/mpeg3";

			// VIDEO
		} else if ("DVI".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-dvi";
		} else if ("AVI".equalsIgnoreCase(nombreFormato)) {
			mime = "application/x-troff-msvideo";
		} else if ("MOV".equalsIgnoreCase(nombreFormato)) {
			mime = "video/quicktime";

		} else if ("WEBM".equalsIgnoreCase(nombreFormato)) {
			mime = "video/webm";
		}
		else if ("MPEG".equalsIgnoreCase(nombreFormato)) {
			mime = "video/mpv";
		}
		else if("MP4".equalsIgnoreCase(nombreFormato)){
			mime = "video/mp4";
		}
		else {
			mime = "application/octet-stream";
		}
		return mime;
	}

	/**
	 * Devuelve el mime que tendría un tipo de firma determinado.
	 * 
	 * @param tipoFirma tipoFirma
	 * @return String
	 */
	public static String getMimeByTipoFirma(String tipoFirma) {
		String mime = null;
		if ("Adobe PDF".contentEquals(tipoFirma) || "TF06".contentEquals(tipoFirma)) {
			mime = APPLICATION_PDF;
		} else if (StringUtils.hasText(tipoFirma) && ("TF02".contentEquals(tipoFirma) || "TF03".contentEquals(tipoFirma)
				|| tipoFirma.toUpperCase().contains("XADES"))) {
			mime = TEXT_XML;
		} else if (StringUtils.hasText(tipoFirma) && ("TF04".contentEquals(tipoFirma) || "TF05".contentEquals(tipoFirma)
				|| tipoFirma.toUpperCase().contains("CADES"))) {
			mime = "application/octet-stream";
		}
		return mime;
	}



	public static String objectXMLToString(Object obj) {
		String s = null;
		if (obj instanceof String) {
			s = (String) obj;
		} else if (obj instanceof ElementNSImpl) {
			Element e = (Element) obj;
			try {
				TransformerFactory factory = TransformerFactory.newInstance();
				factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
				javax.xml.transform.Transformer transformer = factory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

				StreamResult result = new StreamResult(new StringWriter());
				DOMSource source = new DOMSource(e.getFirstChild());
				transformer.transform(source, result);

				s = result.getWriter().toString();
				s = checkIfNoSpecialCharacter(s, e);
			} catch (TransformerException ex) {
				//
			}
			
		} else {
			s = obj.toString();
		}
		return s;
	}

	private static String checkIfNoSpecialCharacter(String s, Element e) {
		String resultado = s;
		if (s != null && s.contains("?&gt") && e.getFirstChild() instanceof TextImpl) {

			TextImpl text = (TextImpl) e.getFirstChild();
			resultado = text.getData();

		}
		return resultado;
	}

	/**
	 * Decodifica un contenido en base64, si es necesario lo decodifica
	 * recursivamente (hasta 10 veces) hasta que el contenido ya no está en
	 * base64
	 *
	 * @param base64Content base64Content
	 * @return byte[]
	 */
	public static byte[] base64Decode(byte[] base64Content) {
		int maxDecodes = 10;
		int decodes = 0;
		while (Base64.isBase64(base64Content)) {
			Assert.isTrue(decodes <= maxDecodes, "Superado máximo número de decodes");
			base64Content = Base64.decode(base64Content);
			decodes++;
		}
		return base64Content;
	}

	/**
	 * Convierte un SignatureType en un array de bytes
	 *
	 * @param signature signature
	 * @return byte[]
	 * @throws JAXBException JAXBException
	 */
	public static byte[] signatureToArrayOfBytes(SignatureType signature) throws JAXBException {
		ObjectFactory of = new ObjectFactory();
		JAXBElement<SignatureType> jaxbElement = of.createSignature(signature);
		JAXBContext jc = JAXBContext.newInstance(SignatureType.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		marshaller.marshal(jaxbElement, outputStream);

		return outputStream.toByteArray();
	}

	/**
	 * Convierte un array de bytes en un SignatureType
	 *
	 * @param contenidoSignature contenidoSignature
	 * @return SignatureType
	 * @throws JAXBException JAXBException
	 */
	public static SignatureType arrayOfBytesToSignature(byte[] contenidoSignature) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(SignatureType.class.getPackage().getName());

		Unmarshaller unmarshaller = jc.createUnmarshaller(); //
		JAXBElement<?> e = (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(contenidoSignature));
		return (SignatureType) e.getValue();
	}

}
