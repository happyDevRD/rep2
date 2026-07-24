
package es.greenaall.gos.gf.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjetoTributarioRc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjetoTributarioRc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.gf.gos.greenaall.es/xsd}ObjetoTributario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codConce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCuentBancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntidBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codPostaDomic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codSucurBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desCauMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunicDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desOtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProviDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSucBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digContrBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="dirPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirPostaDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domiciliado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeConce" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejePaseRecau" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="etiGruAtrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecAltaDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecAltaHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecMovimDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecMovimHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idGrupo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTarObjet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nifOtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nifSujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPaseRecau" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="refCatasDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipCuent" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipProce" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="valAtrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjetoTributarioRc", propOrder = {
    "rest"
})
public class ObjetoTributarioRc
    extends ObjetoTributario
{

    @XmlElementRefs({
        @XmlElementRef(name = "actRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codConce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codCuentBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codEntidBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codPostaDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codSucurBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desEntBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desMunicDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desProviDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desSucBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "digContrBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dirPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dirPostaDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "domiciliado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ejeConce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ejePaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "etiGruAtrib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fecAltaDesde", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fecAltaHasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fecMovimDesde", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fecMovimHasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idGrupo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idTarObjet", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "modulo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nifOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nifSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numPaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "refCatasDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipCuent", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipProce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "valAtrib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "IdTarObjet" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 1137 de http://10.234.253.178:8080/GestionTributos/services/GestionTributos?wsdl
     * línea 1081 de http://10.234.253.178:8080/GestionTributos/services/GestionTributos?wsdl
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
