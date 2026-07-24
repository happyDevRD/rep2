
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjetoTributarioWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjetoTributarioWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="apellido1Otro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido1SujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2Otro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2SujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCauMovim" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codCuentBancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntidBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codPostaDomic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codSucurBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desCauMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunicDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProviDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSucBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digContrBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="dirPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirPostaDomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domiciliado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecMovim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idGrupo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nifOtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nifSujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreOtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreSujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porBonif" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="razSociaOtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razSociaSujPasiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="regActiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tarPerso" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipCuent" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipPersoOtro" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipPersoSujPasiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipProce" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjetoTributarioWs", propOrder = {
    "actRecib",
    "apellido1Otro",
    "apellido1SujPasiv",
    "apellido2Otro",
    "apellido2SujPasiv",
    "codCauMovim",
    "codCuentBancar",
    "codEntid",
    "codEntidBancar",
    "codMovim",
    "codPosDomNotif",
    "codPostaDomic",
    "codSucurBancar",
    "codTipObjTribu",
    "desCauMovim",
    "desEntBanca",
    "desEntid",
    "desMunDomNotif",
    "desMunicDomic",
    "desObjTribu",
    "desProDomNotif",
    "desProviDomic",
    "desSucBanca",
    "desTipObjTribu",
    "digContrBancar",
    "dirPosDomNotif",
    "dirPostaDomic",
    "domiciliado",
    "fecAlta",
    "fecContr",
    "fecMovim",
    "idDomBanca",
    "idDomNotif",
    "idDomic",
    "idGrupo",
    "idHisDomBanca",
    "idHisDomNotif",
    "idHisDomic",
    "idHisObjTribu",
    "idHisOtro",
    "idHisSujPasiv",
    "idHisTipObjTribu",
    "idObjTribu",
    "idOtro",
    "idSujPasiv",
    "idTipObjTribu",
    "modulo",
    "nifOtro",
    "nifSujPasiv",
    "nombreOtro",
    "nombreSujPasiv",
    "numBonif",
    "numObjTribu",
    "observaciones",
    "porBonif",
    "razSociaOtro",
    "razSociaSujPasiv",
    "refDomic",
    "regActiv",
    "tarPerso",
    "tipCuent",
    "tipPersoOtro",
    "tipPersoSujPasiv",
    "tipProce",
    "usuContr"
})
public class ObjetoTributarioWs {

    @XmlElementRef(name = "actRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> actRecib;
    @XmlElementRef(name = "apellido1Otro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1Otro;
    @XmlElementRef(name = "apellido1SujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1SujPasiv;
    @XmlElementRef(name = "apellido2Otro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2Otro;
    @XmlElementRef(name = "apellido2SujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2SujPasiv;
    @XmlElementRef(name = "codCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codCauMovim;
    @XmlElementRef(name = "codCuentBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCuentBancar;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codEntidBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntidBancar;
    @XmlElementRef(name = "codMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codMovim;
    @XmlElementRef(name = "codPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosDomNotif;
    @XmlElementRef(name = "codPostaDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPostaDomic;
    @XmlElementRef(name = "codSucurBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codSucurBancar;
    @XmlElementRef(name = "codTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTipObjTribu;
    @XmlElementRef(name = "desCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCauMovim;
    @XmlElementRef(name = "desEntBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntBanca;
    @XmlElementRef(name = "desEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntid;
    @XmlElementRef(name = "desMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMunDomNotif;
    @XmlElementRef(name = "desMunicDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMunicDomic;
    @XmlElementRef(name = "desObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desObjTribu;
    @XmlElementRef(name = "desProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProDomNotif;
    @XmlElementRef(name = "desProviDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProviDomic;
    @XmlElementRef(name = "desSucBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSucBanca;
    @XmlElementRef(name = "desTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTipObjTribu;
    @XmlElementRef(name = "digContrBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> digContrBancar;
    @XmlElementRef(name = "dirPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPosDomNotif;
    @XmlElementRef(name = "dirPostaDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPostaDomic;
    @XmlElementRef(name = "domiciliado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> domiciliado;
    @XmlElementRef(name = "fecAlta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecAlta;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecMovim;
    @XmlElementRef(name = "idDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomBanca;
    @XmlElementRef(name = "idDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomNotif;
    @XmlElementRef(name = "idDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomic;
    @XmlElementRef(name = "idGrupo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idGrupo;
    @XmlElementRef(name = "idHisDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomBanca;
    @XmlElementRef(name = "idHisDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomNotif;
    @XmlElementRef(name = "idHisDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomic;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisOtro;
    @XmlElementRef(name = "idHisSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisSujPasiv;
    @XmlElementRef(name = "idHisTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisTipObjTribu;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOtro;
    @XmlElementRef(name = "idSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idSujPasiv;
    @XmlElementRef(name = "idTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTipObjTribu;
    @XmlElementRef(name = "modulo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modulo;
    @XmlElementRef(name = "nifOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifOtro;
    @XmlElementRef(name = "nifSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifSujPasiv;
    @XmlElementRef(name = "nombreOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOtro;
    @XmlElementRef(name = "nombreSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreSujPasiv;
    @XmlElementRef(name = "numBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numBonif;
    @XmlElementRef(name = "numObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numObjTribu;
    @XmlElementRef(name = "observaciones", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "porBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porBonif;
    @XmlElementRef(name = "razSociaOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSociaOtro;
    @XmlElementRef(name = "razSociaSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSociaSujPasiv;
    @XmlElementRef(name = "refDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> refDomic;
    @XmlElementRef(name = "regActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> regActiv;
    @XmlElementRef(name = "tarPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tarPerso;
    @XmlElementRef(name = "tipCuent", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipCuent;
    @XmlElementRef(name = "tipPersoOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipPersoOtro;
    @XmlElementRef(name = "tipPersoSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipPersoSujPasiv;
    @XmlElementRef(name = "tipProce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipProce;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad actRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getActRecib() {
        return actRecib;
    }

    /**
     * Define el valor de la propiedad actRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setActRecib(JAXBElement<Short> value) {
        this.actRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1Otro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1Otro() {
        return apellido1Otro;
    }

    /**
     * Define el valor de la propiedad apellido1Otro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1Otro(JAXBElement<String> value) {
        this.apellido1Otro = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1SujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1SujPasiv() {
        return apellido1SujPasiv;
    }

    /**
     * Define el valor de la propiedad apellido1SujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1SujPasiv(JAXBElement<String> value) {
        this.apellido1SujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2Otro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2Otro() {
        return apellido2Otro;
    }

    /**
     * Define el valor de la propiedad apellido2Otro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2Otro(JAXBElement<String> value) {
        this.apellido2Otro = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2SujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2SujPasiv() {
        return apellido2SujPasiv;
    }

    /**
     * Define el valor de la propiedad apellido2SujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2SujPasiv(JAXBElement<String> value) {
        this.apellido2SujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad codCauMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodCauMovim() {
        return codCauMovim;
    }

    /**
     * Define el valor de la propiedad codCauMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodCauMovim(JAXBElement<Short> value) {
        this.codCauMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad codCuentBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCuentBancar() {
        return codCuentBancar;
    }

    /**
     * Define el valor de la propiedad codCuentBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCuentBancar(JAXBElement<String> value) {
        this.codCuentBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntid() {
        return codEntid;
    }

    /**
     * Define el valor de la propiedad codEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntid(JAXBElement<Short> value) {
        this.codEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntidBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntidBancar() {
        return codEntidBancar;
    }

    /**
     * Define el valor de la propiedad codEntidBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntidBancar(JAXBElement<Short> value) {
        this.codEntidBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad codMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMovim() {
        return codMovim;
    }

    /**
     * Define el valor de la propiedad codMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMovim(JAXBElement<String> value) {
        this.codMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPosDomNotif() {
        return codPosDomNotif;
    }

    /**
     * Define el valor de la propiedad codPosDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPosDomNotif(JAXBElement<Integer> value) {
        this.codPosDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostaDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPostaDomic() {
        return codPostaDomic;
    }

    /**
     * Define el valor de la propiedad codPostaDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPostaDomic(JAXBElement<Integer> value) {
        this.codPostaDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucurBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodSucurBancar() {
        return codSucurBancar;
    }

    /**
     * Define el valor de la propiedad codSucurBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodSucurBancar(JAXBElement<Short> value) {
        this.codSucurBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTipObjTribu() {
        return codTipObjTribu;
    }

    /**
     * Define el valor de la propiedad codTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTipObjTribu(JAXBElement<String> value) {
        this.codTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad desCauMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCauMovim() {
        return desCauMovim;
    }

    /**
     * Define el valor de la propiedad desCauMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCauMovim(JAXBElement<String> value) {
        this.desCauMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntBanca() {
        return desEntBanca;
    }

    /**
     * Define el valor de la propiedad desEntBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntBanca(JAXBElement<String> value) {
        this.desEntBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntid() {
        return desEntid;
    }

    /**
     * Define el valor de la propiedad desEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntid(JAXBElement<String> value) {
        this.desEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad desMunDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMunDomNotif() {
        return desMunDomNotif;
    }

    /**
     * Define el valor de la propiedad desMunDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMunDomNotif(JAXBElement<String> value) {
        this.desMunDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad desMunicDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMunicDomic() {
        return desMunicDomic;
    }

    /**
     * Define el valor de la propiedad desMunicDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMunicDomic(JAXBElement<String> value) {
        this.desMunicDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad desObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesObjTribu() {
        return desObjTribu;
    }

    /**
     * Define el valor de la propiedad desObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesObjTribu(JAXBElement<String> value) {
        this.desObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad desProDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesProDomNotif() {
        return desProDomNotif;
    }

    /**
     * Define el valor de la propiedad desProDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesProDomNotif(JAXBElement<String> value) {
        this.desProDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad desProviDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesProviDomic() {
        return desProviDomic;
    }

    /**
     * Define el valor de la propiedad desProviDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesProviDomic(JAXBElement<String> value) {
        this.desProviDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad desSucBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSucBanca() {
        return desSucBanca;
    }

    /**
     * Define el valor de la propiedad desSucBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSucBanca(JAXBElement<String> value) {
        this.desSucBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTipObjTribu() {
        return desTipObjTribu;
    }

    /**
     * Define el valor de la propiedad desTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTipObjTribu(JAXBElement<String> value) {
        this.desTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad digContrBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDigContrBancar() {
        return digContrBancar;
    }

    /**
     * Define el valor de la propiedad digContrBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDigContrBancar(JAXBElement<Short> value) {
        this.digContrBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad dirPosDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirPosDomNotif() {
        return dirPosDomNotif;
    }

    /**
     * Define el valor de la propiedad dirPosDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirPosDomNotif(JAXBElement<String> value) {
        this.dirPosDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad dirPostaDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirPostaDomic() {
        return dirPostaDomic;
    }

    /**
     * Define el valor de la propiedad dirPostaDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirPostaDomic(JAXBElement<String> value) {
        this.dirPostaDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad domiciliado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDomiciliado() {
        return domiciliado;
    }

    /**
     * Define el valor de la propiedad domiciliado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDomiciliado(JAXBElement<Short> value) {
        this.domiciliado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAlta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecAlta() {
        return fecAlta;
    }

    /**
     * Define el valor de la propiedad fecAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecAlta(JAXBElement<XMLGregorianCalendar> value) {
        this.fecAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad fecContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecContr() {
        return fecContr;
    }

    /**
     * Define el valor de la propiedad fecContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecContr(JAXBElement<XMLGregorianCalendar> value) {
        this.fecContr = value;
    }

    /**
     * Obtiene el valor de la propiedad fecMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecMovim() {
        return fecMovim;
    }

    /**
     * Define el valor de la propiedad fecMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecMovim(JAXBElement<XMLGregorianCalendar> value) {
        this.fecMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad idDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomBanca() {
        return idDomBanca;
    }

    /**
     * Define el valor de la propiedad idDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomBanca(JAXBElement<Long> value) {
        this.idDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad idDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomNotif() {
        return idDomNotif;
    }

    /**
     * Define el valor de la propiedad idDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomNotif(JAXBElement<Long> value) {
        this.idDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomic() {
        return idDomic;
    }

    /**
     * Define el valor de la propiedad idDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomic(JAXBElement<Long> value) {
        this.idDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad idGrupo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdGrupo() {
        return idGrupo;
    }

    /**
     * Define el valor de la propiedad idGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdGrupo(JAXBElement<Long> value) {
        this.idGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomBanca() {
        return idHisDomBanca;
    }

    /**
     * Define el valor de la propiedad idHisDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomBanca(JAXBElement<Long> value) {
        this.idHisDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomNotif() {
        return idHisDomNotif;
    }

    /**
     * Define el valor de la propiedad idHisDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomNotif(JAXBElement<Long> value) {
        this.idHisDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomic() {
        return idHisDomic;
    }

    /**
     * Define el valor de la propiedad idHisDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomic(JAXBElement<Long> value) {
        this.idHisDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisObjTribu() {
        return idHisObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisObjTribu(JAXBElement<Long> value) {
        this.idHisObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisOtro() {
        return idHisOtro;
    }

    /**
     * Define el valor de la propiedad idHisOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisOtro(JAXBElement<Long> value) {
        this.idHisOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisSujPasiv() {
        return idHisSujPasiv;
    }

    /**
     * Define el valor de la propiedad idHisSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisSujPasiv(JAXBElement<Long> value) {
        this.idHisSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisTipObjTribu() {
        return idHisTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisTipObjTribu(JAXBElement<Long> value) {
        this.idHisTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdObjTribu() {
        return idObjTribu;
    }

    /**
     * Define el valor de la propiedad idObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdObjTribu(JAXBElement<Long> value) {
        this.idObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOtro() {
        return idOtro;
    }

    /**
     * Define el valor de la propiedad idOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOtro(JAXBElement<Long> value) {
        this.idOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad idSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdSujPasiv() {
        return idSujPasiv;
    }

    /**
     * Define el valor de la propiedad idSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdSujPasiv(JAXBElement<Long> value) {
        this.idSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTipObjTribu() {
        return idTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTipObjTribu(JAXBElement<Long> value) {
        this.idTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModulo(JAXBElement<Short> value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nifOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifOtro() {
        return nifOtro;
    }

    /**
     * Define el valor de la propiedad nifOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifOtro(JAXBElement<String> value) {
        this.nifOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad nifSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifSujPasiv() {
        return nifSujPasiv;
    }

    /**
     * Define el valor de la propiedad nifSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifSujPasiv(JAXBElement<String> value) {
        this.nifSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreOtro() {
        return nombreOtro;
    }

    /**
     * Define el valor de la propiedad nombreOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreOtro(JAXBElement<String> value) {
        this.nombreOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreSujPasiv() {
        return nombreSujPasiv;
    }

    /**
     * Define el valor de la propiedad nombreSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreSujPasiv(JAXBElement<String> value) {
        this.nombreSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad numBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumBonif() {
        return numBonif;
    }

    /**
     * Define el valor de la propiedad numBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumBonif(JAXBElement<String> value) {
        this.numBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad numObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumObjTribu() {
        return numObjTribu;
    }

    /**
     * Define el valor de la propiedad numObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumObjTribu(JAXBElement<Long> value) {
        this.numObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad porBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPorBonif() {
        return porBonif;
    }

    /**
     * Define el valor de la propiedad porBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPorBonif(JAXBElement<BigDecimal> value) {
        this.porBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad razSociaOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazSociaOtro() {
        return razSociaOtro;
    }

    /**
     * Define el valor de la propiedad razSociaOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazSociaOtro(JAXBElement<String> value) {
        this.razSociaOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad razSociaSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazSociaSujPasiv() {
        return razSociaSujPasiv;
    }

    /**
     * Define el valor de la propiedad razSociaSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazSociaSujPasiv(JAXBElement<String> value) {
        this.razSociaSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad refDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRefDomic() {
        return refDomic;
    }

    /**
     * Define el valor de la propiedad refDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRefDomic(JAXBElement<Long> value) {
        this.refDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad regActiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegActiv() {
        return regActiv;
    }

    /**
     * Define el valor de la propiedad regActiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegActiv(JAXBElement<Short> value) {
        this.regActiv = value;
    }

    /**
     * Obtiene el valor de la propiedad tarPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTarPerso() {
        return tarPerso;
    }

    /**
     * Define el valor de la propiedad tarPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTarPerso(JAXBElement<Short> value) {
        this.tarPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCuent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipCuent() {
        return tipCuent;
    }

    /**
     * Define el valor de la propiedad tipCuent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipCuent(JAXBElement<Short> value) {
        this.tipCuent = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPersoOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipPersoOtro() {
        return tipPersoOtro;
    }

    /**
     * Define el valor de la propiedad tipPersoOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipPersoOtro(JAXBElement<Short> value) {
        this.tipPersoOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPersoSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipPersoSujPasiv() {
        return tipPersoSujPasiv;
    }

    /**
     * Define el valor de la propiedad tipPersoSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipPersoSujPasiv(JAXBElement<Short> value) {
        this.tipPersoSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad tipProce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipProce() {
        return tipProce;
    }

    /**
     * Define el valor de la propiedad tipProce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipProce(JAXBElement<Short> value) {
        this.tipProce = value;
    }

    /**
     * Obtiene el valor de la propiedad usuContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuContr() {
        return usuContr;
    }

    /**
     * Define el valor de la propiedad usuContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuContr(JAXBElement<String> value) {
        this.usuContr = value;
    }

}
