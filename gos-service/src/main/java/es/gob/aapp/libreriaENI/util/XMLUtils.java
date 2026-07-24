package es.gob.aapp.libreriaENI.util;


import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import org.apache.commons.lang.StringUtils;
import org.apache.xerces.dom.DeferredElementImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class XMLUtils {

	private XMLUtils() {}

	private static final String VERSION_NTI_INCORRECTA = "La versión NTI no es correcta.";

	private static final String URL_SEAP_MINHAP_DOC = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/documento-e";

	private static final String URL_XML_DSIG = "http://www.w3.org/2000/09/xmldsig#";
	public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
	private static final String XMLNS = "xmlns";
	private static final String XMLNS_INSIDEWS = "xmlns:insidews";


	/*DOCUMENTO*/
	private static final String NAMESPACE_DOCUMENTO = EnumeracionDocumentoENI.ENI_V1.value();
	private static final String URL_SEAP_MINHAP_METADATOS_ADICIONALES_V1 = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/metadatosAdicionales";

	private static final String NAMESPACE_DOCUMENTO_CONTENIDO_V1 = EnumeracionDocumentoENI.ENI_V1.value() + "/contenido";

	private static final String NAMESPACE_DOCUMENTO_METADATOS_V1 = EnumeracionDocumentoENI.ENI_V1.value() + "/metadatos";

	private static final String NAMESPACE_FIRMA_V1 = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma";

	/*EXPEDIENTE*/
	public static final String NAMESPACE_METADATOSADIC = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService";
	public static final String NAMESPACE_EXPEDIENTE_V1 = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e";
	public static final String NAMESPACE_EXPEDIENTE_V2 = "http://administracionelectronica.gob.es/ENI/XSD/v2.0/expediente-e";


	public static Node getNode(byte[] xml, String tag) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document dom = db.parse(new ByteArrayInputStream(xml));

		return dom.getElementsByTagName(tag).item(0);
	}


	public static byte[] documentoAdicionalToEni(byte[] adicional) throws ParserConfigurationException, SAXException,
			IOException, TransformerFactoryConfigurationError, TransformerException {

		// calculamos el prefijo del primer nodo
		String prefijoDocENI = prefijoNamespace(new String(adicional), NAMESPACE_DOCUMENTO);
		Node nodoEni;
		if (!prefijoDocENI.trim().equals("")) {
			String pref = prefijoDocENI.split(":")[1];
			nodoEni = getNode(adicional, pref + ":documento");
		} else {
			nodoEni = getNode(adicional, "ns5:documento");
		}

		Element nodoEniElem = (Element) nodoEni;

		// recorre los namespaces para recoger los prefijos que utiliza en el xml
		String prefijo1 = prefijoNamespace(new String(adicional), NAMESPACE_DOCUMENTO_METADATOS_V1);
		String prefijo2 = prefijoNamespace(new String(adicional), NAMESPACE_FIRMA_V1);
		String prefijo3 = prefijoNamespace(new String(adicional), URL_XML_DSIG);
		String prefijo4 = prefijoNamespace(new String(adicional), NAMESPACE_DOCUMENTO);
		String prefijo5 = prefijoNamespace(new String(adicional), URL_SEAP_MINHAP_METADATOS_ADICIONALES_V1);
		String prefijo6 = prefijoNamespace(new String(adicional), URL_SEAP_MINHAP_DOC);
		String prefijo8 = prefijoNamespace(new String(adicional), NAMESPACE_DOCUMENTO_CONTENIDO_V1);

		nodoEniElem.setAttribute(XMLNS + prefijo1, NAMESPACE_DOCUMENTO_METADATOS_V1);
		nodoEniElem.setAttribute(XMLNS + prefijo2, NAMESPACE_FIRMA_V1);
		nodoEniElem.setAttribute(XMLNS + prefijo3, URL_XML_DSIG);
		nodoEniElem.setAttribute(XMLNS + prefijo4, NAMESPACE_DOCUMENTO);
		nodoEniElem.setAttribute(XMLNS + prefijo5, URL_SEAP_MINHAP_METADATOS_ADICIONALES_V1);
		nodoEniElem.setAttribute(XMLNS + prefijo6, URL_SEAP_MINHAP_DOC);
		nodoEniElem.setAttribute(XMLNS_INSIDEWS, URL_SEAP_MINHAP_DOC);
		nodoEniElem.setAttribute(XMLNS + prefijo8, NAMESPACE_DOCUMENTO_CONTENIDO_V1);
		nodoEniElem.setAttribute("xmlns:enidoc", NAMESPACE_DOCUMENTO);

		return XMLUtils.nodeToString(nodoEni).getBytes();
	}


	private static List<String> getNameSpacesNodoROOT(String xml)
			throws ParserConfigurationException, SAXException, IOException {
		Node nodoPadre = XMLUtils.getNode(xml.getBytes(XMLUtils.UTF8_CHARSET), "*");// * recoge el primer
		// nodo

		List<String> listaNameSpaces = new ArrayList<>();
		for (int i = 0; i < nodoPadre.getAttributes().getLength(); i++) {
			Node nodoTemp = nodoPadre.getAttributes().item(i);
			String nameSpace = nodoTemp.getNodeName() + "=" + nodoTemp.getNodeValue();
			listaNameSpaces.add(nameSpace);
		}
		return listaNameSpaces;
	}

	private static String nodeToString(Node node) throws TransformerFactoryConfigurationError, TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		Source source = new DOMSource(node);
		StringWriter sw = new StringWriter();
		StreamResult result = new StreamResult(sw);
		transformer.transform(source, result);
		return sw.toString();
	}

	/**
	 * Comprueba que exista el nodo elementNode dentro del documento XML especificado en filePath
	 * @param file fichero
	 * @param elementNode nodo a buscar
	 * @return texto encontrado
	 * @throws IOException IOException
	 * @throws XMLStreamException XMLStreamException
	 */
	public static String getNodeValue(File file, String elementNode) throws IOException, XMLStreamException {

		final XMLInputFactory factory = XMLInputFactory.newInstance();
		//desactiva todos los DTDs para evitar código malicioso
		factory.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
		try(final InputStream is = new FileInputStream(file)) {
			final XMLStreamReader reader = factory.createXMLStreamReader(is, "UTF-8");
			while (reader.hasNext()) {
				final int eventType = reader.next();
				if (eventType == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals(elementNode)) {
					String value = reader.getElementText();
					reader.close();
					return value;
				}
			}
			reader.close();
		}

		return null;
	}


	private static String prefijoNamespace(String stringXMLExpediente, String nameSpaceSearch)
			throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError {
		// busca el prefijo correspondiente al nodo expediente eni
		List<String> listaNameSpaces = XMLUtils.getNameSpacesNodoROOT(stringXMLExpediente);
		return buscarPrefijoNodoNAMESPACEDosPuntosDelante(listaNameSpaces, nameSpaceSearch);
	}


	public static String signatureString(String expression, byte[] data) throws ParserConfigurationException,
			SAXException, IOException, XPathExpressionException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new ByteArrayInputStream(data));
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();

		XPathExpression exprFirst = xpath.compile(expression);
		DeferredElementImpl nodeParent = (DeferredElementImpl) exprFirst.evaluate(doc, XPathConstants.NODE);
		return nodeToString(nodeParent);
	}


	public static String getNodoValue(String expression, byte[] data) throws IOException {
		String valorNodo;

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new ByteArrayInputStream(data));
			XPathFactory xpf = XPathFactory.newInstance();
			XPath xpath = xpf.newXPath();

			XPathExpression exprFirst = xpath.compile(expression);
			DeferredElementImpl nodeParent = (DeferredElementImpl) exprFirst.evaluate(doc, XPathConstants.NODE);

			if (nodeParent == null) {
				throw new IOException("ERROR Excepcion: XPathExpressionException: No ha encontrado la expresion: "
						+ expression + ", es nula");
			}
			valorNodo = nodeParent.getFirstChild().getNodeValue();
		} catch (XPathExpressionException e) {
			throw new IOException("ERROR Excepcion: XPathExpressionException : " + e.getMessage());
		} catch (DOMException e) {
			throw new IOException("ERROR Excepcion: DOMException : " + e.getMessage());
		} catch (ParserConfigurationException e) {
			throw new IOException("ERROR Excepcion: ParserConfigurationException : " + e.getMessage());
		} catch (SAXException e) {
			throw new IOException("ERROR Excepcion: SAXException : " + e.getMessage());
		} catch (IOException e) {
			throw new IOException("ERROR Excepcion: IOException : " + e.getMessage());
		}

		return valorNodo;
	}

	public static String construirExpedienteENIValido(String data, String dataConFirmaSinIdentar, String versionNTI) {

		dataConFirmaSinIdentar = dataConFirmaSinIdentar
				.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");

		String dataInicio = data.substring(0, data.indexOf("<ns7:expediente"));
		String dataFin = data.substring(data.indexOf("</ns7:expediente>") + "</ns7:expediente>".length());

		String dataFinal = dataInicio + dataConFirmaSinIdentar + dataFin;

		// aniadir los namespaces para que firma y validar valgan para expediente con y sin metadatos adicionales
		return incluirNamespacesParaValidarFirma(dataFinal, versionNTI);
	}

	public static String incluirNamespacesParaValidarFirma(String expedienteENIString, String versionNTI) {

		String data = null;
		if(StringUtils.isEmpty(versionNTI) || EnumeracionExpedienteENI.isEniV1(versionNTI)){

			//Version 1
			data = expedienteENIString.replace("<ns7:expediente",
					"<ns7:expediente xmlns:insidews=\"https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService\" xmlns:ns9=\"https://ssweb.seap.minhap.es/Inside/XSD/v1.0/expediente-e\" xmlns:ns8=\"https://ssweb.seap.minhap.es/Inside/XSD/v1.0/metadatosAdicionales\"");

		}else if(EnumeracionExpedienteENI.isEniV2(versionNTI)){

			//Version 2
			data = expedienteENIString.replace("<ns7:expediente",
					"<ns7:expediente xmlns:insidews=\"https://ssweb.seap.minhap.es/Inside/XSD/v2.0/WebService\" xmlns:ns9=\"https://ssweb.seap.minhap.es/Inside/XSD/v2.0/expediente-e\" xmlns:ns8=\"https://ssweb.seap.minhap.es/Inside/XSD/v2.0/metadatosAdicionales\"");

		}

		return data;
	}

	private static String buscarPrefijoNodoNAMESPACEDosPuntosDelante(List<String> listaNameSpaces,
																	 String nameSpaceABuscar) {
		String prefijo = "";
		for (int i = 0; i < listaNameSpaces.size(); i++) {

			if (listaNameSpaces.get(i).split("=")[1].equalsIgnoreCase(nameSpaceABuscar)) {
				String parte1 = listaNameSpaces.get(i).split("=")[0];
				if (parte1.contains(":")) {
					prefijo = parte1.split(":")[1];// le añado el dos puntos
					return ":" + prefijo;
				} else {
					return prefijo;// vacio no usa ningun prefijo para el namespace
				}
			}

		}

		return prefijo;
	}

	/**
	 * Funcionalidad para obtener la versionNTI del expediente modelo
	 * @param objetoExpedienteENI objetoExpedienteENI
	 * @return String
	 * @throws ExpedientENIValidationException ExpedientENIValidationException
	 */
	public static String getVersionNTI(ObjetoExpedienteENI objetoExpedienteENI) throws ExpedientENIValidationException {

		if(objetoExpedienteENI != null && objetoExpedienteENI.getMetadatos() != null){

			String versionNTI = objetoExpedienteENI.getMetadatos().getVersionNTI();
			if(StringUtils.isNotEmpty(versionNTI)){
				return versionNTI;
			}

		}

		throw new ExpedientENIValidationException(VERSION_NTI_INCORRECTA);
	}

	/**
	 * Funcionalidad para obtener la versionNTI del expedienteMetadato modelo
	 * @param objetoExpedienteMetadatos objetoExpedienteMetadatos
	 * @return String
	 * @throws ExpedientENIValidationException ExpedientENIValidationException
	 */
	public static String getVersionNTI(ObjetoExpedienteMetadatos objetoExpedienteMetadatos)
			throws ExpedientENIValidationException {

		if(objetoExpedienteMetadatos != null){

			String versionNTI = objetoExpedienteMetadatos.getVersionNTI();
			if(StringUtils.isNotEmpty(versionNTI)){
				return versionNTI;
			}

		}

		throw new ExpedientENIValidationException(VERSION_NTI_INCORRECTA);
	}

	/**
	 * Funcionalidad para obtener la versionNTI del documento modelo
	 * @param objetoDocumentoENI objetoDocumentoENI
	 * @return String
	 * @throws DocumentENIValidationException DocumentENIValidationException
	 */
	public static String getVersionNTI(ObjetoDocumentoENI objetoDocumentoENI)
			throws DocumentENIValidationException {

		if(objetoDocumentoENI != null && objetoDocumentoENI.getMetadatos() != null){

			String versionNTI = objetoDocumentoENI.getMetadatos().getVersionNTI();
			if(StringUtils.isNotEmpty(versionNTI)){
				return versionNTI;
			}

		}

		throw new DocumentENIValidationException(VERSION_NTI_INCORRECTA);
	}


	/**
	 * Funcionalidad para obtener la versionNTI del documentoMetadato modelo
	 * @param objetoDocumentoMetadatos objetoDocumentoMetadatos
	 * @return String
	 * @throws DocumentENIValidationException DocumentENIValidationException
	 */
	public static String getVersionNTI(ObjetoDocumentoMetadatos objetoDocumentoMetadatos)
			throws DocumentENIValidationException {

		if(objetoDocumentoMetadatos != null){

			String versionNTI = objetoDocumentoMetadatos.getVersionNTI();
			if(StringUtils.isNotEmpty(versionNTI)){
				return versionNTI;
			}

		}

		throw new DocumentENIValidationException(VERSION_NTI_INCORRECTA);
	}
}
