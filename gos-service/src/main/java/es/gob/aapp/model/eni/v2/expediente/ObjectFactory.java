
package es.gob.aapp.model.eni.v2.expediente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.gob.aapp.model.eni.v2.expediente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Expediente_QNAME = new QName("http://administracionelectronica.gob.es/ENI/XSD/v2.0/expediente-e", "expediente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.gob.aapp.model.eni.v2.expediente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoExpediente }
     * 
     */
    public TipoExpediente createTipoExpediente() {
        return new TipoExpediente();
    }

    /**
     * Create an instance of {@link TipoMetadatosAdicionales }
     * 
     */
    public TipoMetadatosAdicionales createTipoMetadatosAdicionales() {
        return new TipoMetadatosAdicionales();
    }

    /**
     * Create an instance of {@link MetadatoAdicional }
     * 
     */
    public MetadatoAdicional createMetadatoAdicional() {
        return new MetadatoAdicional();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoExpediente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v2.0/expediente-e", name = "expediente")
    public JAXBElement<TipoExpediente> createExpediente(TipoExpediente value) {
        return new JAXBElement<TipoExpediente>(_Expediente_QNAME, TipoExpediente.class, null, value);
    }

}
