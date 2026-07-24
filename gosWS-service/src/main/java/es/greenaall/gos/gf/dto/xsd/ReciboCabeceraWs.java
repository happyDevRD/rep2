
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReciboCabeceraWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReciboCabeceraWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCauMovim" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codCuentBancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntidBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codImpue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSucurBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desCauMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desElemeidOrgCobro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desElemeidOrgGesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntOrganidOrgCobro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntOrganidOrgGesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntidBancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desImpue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desOrganidOrgCobro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desOrganidOrgGesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desPadro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSucurBancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digContrBancar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeCarEjecu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ejeCargo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ejeConta" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeExped" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ejeImpue" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejePaseRecau" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecAnula" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecAplic" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecAprem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecCobro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecLimitEje" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecMovim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecNotifVolun" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecPresc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRecib" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idFracc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisFracc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idImpue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOrgCobro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOrgGesti" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impCobro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impCosta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impFracc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impInter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impOtros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impPendi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impPrinc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impRecar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impRecib" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impreso" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="marNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="modPerte" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nomPadro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCarEjecu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numCargo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numPaseRecau" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRecReal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRecib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRemes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numRemesPad" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perImpos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porBonif" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="razSocia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refDomic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="regActiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipCarEjecu" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipCargo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipCobro" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipExacc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipPerso" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
@XmlType(name = "ReciboCabeceraWs", propOrder = {
    "apellido1",
    "apellido2",
    "codCauMovim",
    "codCuentBancar",
    "codEntid",
    "codEntidBancar",
    "codImpue",
    "codMovim",
    "codSucurBancar",
    "desCauMovim",
    "desElemeidOrgCobro",
    "desElemeidOrgGesti",
    "desEntOrganidOrgCobro",
    "desEntOrganidOrgGesti",
    "desEntidBancar",
    "desImpue",
    "desObjTribu",
    "desOrganidOrgCobro",
    "desOrganidOrgGesti",
    "desPadro",
    "desSucurBancar",
    "descripcion",
    "digContrBancar",
    "ejeCarEjecu",
    "ejeCargo",
    "ejeConta",
    "ejeExped",
    "ejeImpue",
    "ejePaseRecau",
    "ejeRecib",
    "estRecib",
    "fecAnula",
    "fecAplic",
    "fecAprem",
    "fecCobro",
    "fecContr",
    "fecData",
    "fecLimit",
    "fecLimitEje",
    "fecMovim",
    "fecNotif",
    "fecNotifVolun",
    "fecPresc",
    "fecRecib",
    "idDomBanca",
    "idFracc",
    "idHisDomBanca",
    "idHisFracc",
    "idHisObjTribu",
    "idHisPerso",
    "idHisRecib",
    "idImpue",
    "idObjTribu",
    "idOrgCobro",
    "idOrgGesti",
    "idPerso",
    "idRecib",
    "impCobro",
    "impCosta",
    "impFracc",
    "impInter",
    "impOtros",
    "impPendi",
    "impPrinc",
    "impRecar",
    "impRecib",
    "impreso",
    "marNotif",
    "modPerte",
    "nomPadro",
    "nombre",
    "numCarEjecu",
    "numCargo",
    "numDocum",
    "numExped",
    "numObjTribu",
    "numPaseRecau",
    "numRecReal",
    "numRecib",
    "numRemes",
    "numRemesPad",
    "observacion",
    "perImpos",
    "porBonif",
    "razSocia",
    "refDomic",
    "regActiv",
    "situacion",
    "tipCarEjecu",
    "tipCargo",
    "tipCobro",
    "tipExacc",
    "tipPerso",
    "tipo",
    "usuContr"
})
public class ReciboCabeceraWs {

    @XmlElementRef(name = "apellido1", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "apellido2", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "codCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codCauMovim;
    @XmlElementRef(name = "codCuentBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCuentBancar;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codEntidBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntidBancar;
    @XmlElementRef(name = "codImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codImpue;
    @XmlElementRef(name = "codMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codMovim;
    @XmlElementRef(name = "codSucurBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codSucurBancar;
    @XmlElementRef(name = "desCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCauMovim;
    @XmlElementRef(name = "desElemeidOrgCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desElemeidOrgCobro;
    @XmlElementRef(name = "desElemeidOrgGesti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desElemeidOrgGesti;
    @XmlElementRef(name = "desEntOrganidOrgCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntOrganidOrgCobro;
    @XmlElementRef(name = "desEntOrganidOrgGesti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntOrganidOrgGesti;
    @XmlElementRef(name = "desEntidBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntidBancar;
    @XmlElementRef(name = "desImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desImpue;
    @XmlElementRef(name = "desObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desObjTribu;
    @XmlElementRef(name = "desOrganidOrgCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desOrganidOrgCobro;
    @XmlElementRef(name = "desOrganidOrgGesti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desOrganidOrgGesti;
    @XmlElementRef(name = "desPadro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desPadro;
    @XmlElementRef(name = "desSucurBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSucurBancar;
    @XmlElementRef(name = "descripcion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "digContrBancar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> digContrBancar;
    @XmlElementRef(name = "ejeCarEjecu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ejeCarEjecu;
    @XmlElementRef(name = "ejeCargo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ejeCargo;
    @XmlElementRef(name = "ejeConta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeConta;
    @XmlElementRef(name = "ejeExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ejeExped;
    @XmlElementRef(name = "ejeImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeImpue;
    @XmlElementRef(name = "ejePaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejePaseRecau;
    @XmlElementRef(name = "ejeRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRecib;
    @XmlElementRef(name = "estRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estRecib;
    @XmlElementRef(name = "fecAnula", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecAnula;
    @XmlElementRef(name = "fecAplic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecAplic;
    @XmlElementRef(name = "fecAprem", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecAprem;
    @XmlElementRef(name = "fecCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecCobro;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecData", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecData;
    @XmlElementRef(name = "fecLimit", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecLimit;
    @XmlElementRef(name = "fecLimitEje", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecLimitEje;
    @XmlElementRef(name = "fecMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecMovim;
    @XmlElementRef(name = "fecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecNotif;
    @XmlElementRef(name = "fecNotifVolun", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecNotifVolun;
    @XmlElementRef(name = "fecPresc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecPresc;
    @XmlElementRef(name = "fecRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRecib;
    @XmlElementRef(name = "idDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomBanca;
    @XmlElementRef(name = "idFracc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idFracc;
    @XmlElementRef(name = "idHisDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomBanca;
    @XmlElementRef(name = "idHisFracc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisFracc;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPerso;
    @XmlElementRef(name = "idHisRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisRecib;
    @XmlElementRef(name = "idImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idImpue;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idOrgCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOrgCobro;
    @XmlElementRef(name = "idOrgGesti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOrgGesti;
    @XmlElementRef(name = "idPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPerso;
    @XmlElementRef(name = "idRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idRecib;
    @XmlElementRef(name = "impCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impCobro;
    @XmlElementRef(name = "impCosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impCosta;
    @XmlElementRef(name = "impFracc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impFracc;
    @XmlElementRef(name = "impInter", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impInter;
    @XmlElementRef(name = "impOtros", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impOtros;
    @XmlElementRef(name = "impPendi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impPendi;
    @XmlElementRef(name = "impPrinc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impPrinc;
    @XmlElementRef(name = "impRecar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impRecar;
    @XmlElementRef(name = "impRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impRecib;
    @XmlElementRef(name = "impreso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> impreso;
    @XmlElementRef(name = "marNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> marNotif;
    @XmlElementRef(name = "modPerte", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modPerte;
    @XmlElementRef(name = "nomPadro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomPadro;
    @XmlElementRef(name = "nombre", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "numCarEjecu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCarEjecu;
    @XmlElementRef(name = "numCargo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCargo;
    @XmlElementRef(name = "numDocum", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDocum;
    @XmlElementRef(name = "numExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numExped;
    @XmlElementRef(name = "numObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numObjTribu;
    @XmlElementRef(name = "numPaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numPaseRecau;
    @XmlElementRef(name = "numRecReal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRecReal;
    @XmlElementRef(name = "numRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRecib;
    @XmlElementRef(name = "numRemes", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numRemes;
    @XmlElementRef(name = "numRemesPad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numRemesPad;
    @XmlElementRef(name = "observacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacion;
    @XmlElementRef(name = "perImpos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perImpos;
    @XmlElementRef(name = "porBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porBonif;
    @XmlElementRef(name = "razSocia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSocia;
    @XmlElementRef(name = "refDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> refDomic;
    @XmlElementRef(name = "regActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> regActiv;
    @XmlElementRef(name = "situacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> situacion;
    @XmlElementRef(name = "tipCarEjecu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipCarEjecu;
    @XmlElementRef(name = "tipCargo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipCargo;
    @XmlElementRef(name = "tipCobro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipCobro;
    @XmlElementRef(name = "tipExacc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipExacc;
    @XmlElementRef(name = "tipPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipPerso;
    @XmlElementRef(name = "tipo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipo;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1(JAXBElement<String> value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2(JAXBElement<String> value) {
        this.apellido2 = value;
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
     * Obtiene el valor de la propiedad codImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodImpue() {
        return codImpue;
    }

    /**
     * Define el valor de la propiedad codImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodImpue(JAXBElement<String> value) {
        this.codImpue = value;
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
     * Obtiene el valor de la propiedad desElemeidOrgCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesElemeidOrgCobro() {
        return desElemeidOrgCobro;
    }

    /**
     * Define el valor de la propiedad desElemeidOrgCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesElemeidOrgCobro(JAXBElement<String> value) {
        this.desElemeidOrgCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad desElemeidOrgGesti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesElemeidOrgGesti() {
        return desElemeidOrgGesti;
    }

    /**
     * Define el valor de la propiedad desElemeidOrgGesti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesElemeidOrgGesti(JAXBElement<String> value) {
        this.desElemeidOrgGesti = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntOrganidOrgCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntOrganidOrgCobro() {
        return desEntOrganidOrgCobro;
    }

    /**
     * Define el valor de la propiedad desEntOrganidOrgCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntOrganidOrgCobro(JAXBElement<String> value) {
        this.desEntOrganidOrgCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntOrganidOrgGesti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntOrganidOrgGesti() {
        return desEntOrganidOrgGesti;
    }

    /**
     * Define el valor de la propiedad desEntOrganidOrgGesti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntOrganidOrgGesti(JAXBElement<String> value) {
        this.desEntOrganidOrgGesti = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntidBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntidBancar() {
        return desEntidBancar;
    }

    /**
     * Define el valor de la propiedad desEntidBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntidBancar(JAXBElement<String> value) {
        this.desEntidBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad desImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesImpue() {
        return desImpue;
    }

    /**
     * Define el valor de la propiedad desImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesImpue(JAXBElement<String> value) {
        this.desImpue = value;
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
     * Obtiene el valor de la propiedad desOrganidOrgCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesOrganidOrgCobro() {
        return desOrganidOrgCobro;
    }

    /**
     * Define el valor de la propiedad desOrganidOrgCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesOrganidOrgCobro(JAXBElement<String> value) {
        this.desOrganidOrgCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad desOrganidOrgGesti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesOrganidOrgGesti() {
        return desOrganidOrgGesti;
    }

    /**
     * Define el valor de la propiedad desOrganidOrgGesti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesOrganidOrgGesti(JAXBElement<String> value) {
        this.desOrganidOrgGesti = value;
    }

    /**
     * Obtiene el valor de la propiedad desPadro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesPadro() {
        return desPadro;
    }

    /**
     * Define el valor de la propiedad desPadro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesPadro(JAXBElement<String> value) {
        this.desPadro = value;
    }

    /**
     * Obtiene el valor de la propiedad desSucurBancar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSucurBancar() {
        return desSucurBancar;
    }

    /**
     * Define el valor de la propiedad desSucurBancar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSucurBancar(JAXBElement<String> value) {
        this.desSucurBancar = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
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
     * Obtiene el valor de la propiedad ejeCarEjecu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEjeCarEjecu() {
        return ejeCarEjecu;
    }

    /**
     * Define el valor de la propiedad ejeCarEjecu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEjeCarEjecu(JAXBElement<XMLGregorianCalendar> value) {
        this.ejeCarEjecu = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeCargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEjeCargo() {
        return ejeCargo;
    }

    /**
     * Define el valor de la propiedad ejeCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEjeCargo(JAXBElement<XMLGregorianCalendar> value) {
        this.ejeCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeConta() {
        return ejeConta;
    }

    /**
     * Define el valor de la propiedad ejeConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeConta(JAXBElement<Short> value) {
        this.ejeConta = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEjeExped() {
        return ejeExped;
    }

    /**
     * Define el valor de la propiedad ejeExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEjeExped(JAXBElement<XMLGregorianCalendar> value) {
        this.ejeExped = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeImpue() {
        return ejeImpue;
    }

    /**
     * Define el valor de la propiedad ejeImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeImpue(JAXBElement<Short> value) {
        this.ejeImpue = value;
    }

    /**
     * Obtiene el valor de la propiedad ejePaseRecau.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjePaseRecau() {
        return ejePaseRecau;
    }

    /**
     * Define el valor de la propiedad ejePaseRecau.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjePaseRecau(JAXBElement<Short> value) {
        this.ejePaseRecau = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeRecib() {
        return ejeRecib;
    }

    /**
     * Define el valor de la propiedad ejeRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeRecib(JAXBElement<Short> value) {
        this.ejeRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad estRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEstRecib() {
        return estRecib;
    }

    /**
     * Define el valor de la propiedad estRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEstRecib(JAXBElement<Short> value) {
        this.estRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAnula.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecAnula() {
        return fecAnula;
    }

    /**
     * Define el valor de la propiedad fecAnula.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecAnula(JAXBElement<XMLGregorianCalendar> value) {
        this.fecAnula = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecAplic() {
        return fecAplic;
    }

    /**
     * Define el valor de la propiedad fecAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecAplic(JAXBElement<XMLGregorianCalendar> value) {
        this.fecAplic = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAprem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecAprem() {
        return fecAprem;
    }

    /**
     * Define el valor de la propiedad fecAprem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecAprem(JAXBElement<XMLGregorianCalendar> value) {
        this.fecAprem = value;
    }

    /**
     * Obtiene el valor de la propiedad fecCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecCobro() {
        return fecCobro;
    }

    /**
     * Define el valor de la propiedad fecCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecCobro(JAXBElement<XMLGregorianCalendar> value) {
        this.fecCobro = value;
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
     * Obtiene el valor de la propiedad fecData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecData() {
        return fecData;
    }

    /**
     * Define el valor de la propiedad fecData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecData(JAXBElement<XMLGregorianCalendar> value) {
        this.fecData = value;
    }

    /**
     * Obtiene el valor de la propiedad fecLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecLimit() {
        return fecLimit;
    }

    /**
     * Define el valor de la propiedad fecLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecLimit(JAXBElement<XMLGregorianCalendar> value) {
        this.fecLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad fecLimitEje.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecLimitEje() {
        return fecLimitEje;
    }

    /**
     * Define el valor de la propiedad fecLimitEje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecLimitEje(JAXBElement<XMLGregorianCalendar> value) {
        this.fecLimitEje = value;
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
     * Obtiene el valor de la propiedad fecNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecNotif() {
        return fecNotif;
    }

    /**
     * Define el valor de la propiedad fecNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecNotif(JAXBElement<XMLGregorianCalendar> value) {
        this.fecNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNotifVolun.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecNotifVolun() {
        return fecNotifVolun;
    }

    /**
     * Define el valor de la propiedad fecNotifVolun.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecNotifVolun(JAXBElement<XMLGregorianCalendar> value) {
        this.fecNotifVolun = value;
    }

    /**
     * Obtiene el valor de la propiedad fecPresc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecPresc() {
        return fecPresc;
    }

    /**
     * Define el valor de la propiedad fecPresc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecPresc(JAXBElement<XMLGregorianCalendar> value) {
        this.fecPresc = value;
    }

    /**
     * Obtiene el valor de la propiedad fecRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecRecib() {
        return fecRecib;
    }

    /**
     * Define el valor de la propiedad fecRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecRecib(JAXBElement<XMLGregorianCalendar> value) {
        this.fecRecib = value;
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
     * Obtiene el valor de la propiedad idFracc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdFracc() {
        return idFracc;
    }

    /**
     * Define el valor de la propiedad idFracc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdFracc(JAXBElement<Long> value) {
        this.idFracc = value;
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
     * Obtiene el valor de la propiedad idHisFracc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisFracc() {
        return idHisFracc;
    }

    /**
     * Define el valor de la propiedad idHisFracc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisFracc(JAXBElement<Long> value) {
        this.idHisFracc = value;
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
     * Obtiene el valor de la propiedad idHisPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisPerso() {
        return idHisPerso;
    }

    /**
     * Define el valor de la propiedad idHisPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisPerso(JAXBElement<Long> value) {
        this.idHisPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisRecib() {
        return idHisRecib;
    }

    /**
     * Define el valor de la propiedad idHisRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisRecib(JAXBElement<Long> value) {
        this.idHisRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdImpue() {
        return idImpue;
    }

    /**
     * Define el valor de la propiedad idImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdImpue(JAXBElement<Long> value) {
        this.idImpue = value;
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
     * Obtiene el valor de la propiedad idOrgCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOrgCobro() {
        return idOrgCobro;
    }

    /**
     * Define el valor de la propiedad idOrgCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOrgCobro(JAXBElement<Long> value) {
        this.idOrgCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrgGesti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOrgGesti() {
        return idOrgGesti;
    }

    /**
     * Define el valor de la propiedad idOrgGesti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOrgGesti(JAXBElement<Long> value) {
        this.idOrgGesti = value;
    }

    /**
     * Obtiene el valor de la propiedad idPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPerso() {
        return idPerso;
    }

    /**
     * Define el valor de la propiedad idPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPerso(JAXBElement<Long> value) {
        this.idPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad idRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdRecib() {
        return idRecib;
    }

    /**
     * Define el valor de la propiedad idRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdRecib(JAXBElement<Long> value) {
        this.idRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad impCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpCobro() {
        return impCobro;
    }

    /**
     * Define el valor de la propiedad impCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpCobro(JAXBElement<BigDecimal> value) {
        this.impCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad impCosta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpCosta() {
        return impCosta;
    }

    /**
     * Define el valor de la propiedad impCosta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpCosta(JAXBElement<BigDecimal> value) {
        this.impCosta = value;
    }

    /**
     * Obtiene el valor de la propiedad impFracc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpFracc() {
        return impFracc;
    }

    /**
     * Define el valor de la propiedad impFracc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpFracc(JAXBElement<BigDecimal> value) {
        this.impFracc = value;
    }

    /**
     * Obtiene el valor de la propiedad impInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpInter() {
        return impInter;
    }

    /**
     * Define el valor de la propiedad impInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpInter(JAXBElement<BigDecimal> value) {
        this.impInter = value;
    }

    /**
     * Obtiene el valor de la propiedad impOtros.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpOtros() {
        return impOtros;
    }

    /**
     * Define el valor de la propiedad impOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpOtros(JAXBElement<BigDecimal> value) {
        this.impOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad impPendi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpPendi() {
        return impPendi;
    }

    /**
     * Define el valor de la propiedad impPendi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpPendi(JAXBElement<BigDecimal> value) {
        this.impPendi = value;
    }

    /**
     * Obtiene el valor de la propiedad impPrinc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpPrinc() {
        return impPrinc;
    }

    /**
     * Define el valor de la propiedad impPrinc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpPrinc(JAXBElement<BigDecimal> value) {
        this.impPrinc = value;
    }

    /**
     * Obtiene el valor de la propiedad impRecar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpRecar() {
        return impRecar;
    }

    /**
     * Define el valor de la propiedad impRecar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpRecar(JAXBElement<BigDecimal> value) {
        this.impRecar = value;
    }

    /**
     * Obtiene el valor de la propiedad impRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpRecib() {
        return impRecib;
    }

    /**
     * Define el valor de la propiedad impRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpRecib(JAXBElement<BigDecimal> value) {
        this.impRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad impreso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getImpreso() {
        return impreso;
    }

    /**
     * Define el valor de la propiedad impreso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setImpreso(JAXBElement<Short> value) {
        this.impreso = value;
    }

    /**
     * Obtiene el valor de la propiedad marNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMarNotif() {
        return marNotif;
    }

    /**
     * Define el valor de la propiedad marNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMarNotif(JAXBElement<Short> value) {
        this.marNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad modPerte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModPerte() {
        return modPerte;
    }

    /**
     * Define el valor de la propiedad modPerte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModPerte(JAXBElement<Short> value) {
        this.modPerte = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPadro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomPadro() {
        return nomPadro;
    }

    /**
     * Define el valor de la propiedad nomPadro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomPadro(JAXBElement<String> value) {
        this.nomPadro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numCarEjecu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCarEjecu() {
        return numCarEjecu;
    }

    /**
     * Define el valor de la propiedad numCarEjecu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCarEjecu(JAXBElement<Integer> value) {
        this.numCarEjecu = value;
    }

    /**
     * Obtiene el valor de la propiedad numCargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCargo() {
        return numCargo;
    }

    /**
     * Define el valor de la propiedad numCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCargo(JAXBElement<Integer> value) {
        this.numCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumDocum() {
        return numDocum;
    }

    /**
     * Define el valor de la propiedad numDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumDocum(JAXBElement<String> value) {
        this.numDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad numExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumExped() {
        return numExped;
    }

    /**
     * Define el valor de la propiedad numExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumExped(JAXBElement<String> value) {
        this.numExped = value;
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
     * Obtiene el valor de la propiedad numPaseRecau.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumPaseRecau() {
        return numPaseRecau;
    }

    /**
     * Define el valor de la propiedad numPaseRecau.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumPaseRecau(JAXBElement<Integer> value) {
        this.numPaseRecau = value;
    }

    /**
     * Obtiene el valor de la propiedad numRecReal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumRecReal() {
        return numRecReal;
    }

    /**
     * Define el valor de la propiedad numRecReal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumRecReal(JAXBElement<Integer> value) {
        this.numRecReal = value;
    }

    /**
     * Obtiene el valor de la propiedad numRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumRecib() {
        return numRecib;
    }

    /**
     * Define el valor de la propiedad numRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumRecib(JAXBElement<Integer> value) {
        this.numRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad numRemes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumRemes() {
        return numRemes;
    }

    /**
     * Define el valor de la propiedad numRemes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumRemes(JAXBElement<Short> value) {
        this.numRemes = value;
    }

    /**
     * Obtiene el valor de la propiedad numRemesPad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumRemesPad() {
        return numRemesPad;
    }

    /**
     * Define el valor de la propiedad numRemesPad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumRemesPad(JAXBElement<Short> value) {
        this.numRemesPad = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacion(JAXBElement<String> value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad perImpos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerImpos() {
        return perImpos;
    }

    /**
     * Define el valor de la propiedad perImpos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerImpos(JAXBElement<String> value) {
        this.perImpos = value;
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
     * Obtiene el valor de la propiedad razSocia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazSocia() {
        return razSocia;
    }

    /**
     * Define el valor de la propiedad razSocia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazSocia(JAXBElement<String> value) {
        this.razSocia = value;
    }

    /**
     * Obtiene el valor de la propiedad refDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRefDomic() {
        return refDomic;
    }

    /**
     * Define el valor de la propiedad refDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRefDomic(JAXBElement<Integer> value) {
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
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSituacion(JAXBElement<Short> value) {
        this.situacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCarEjecu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipCarEjecu() {
        return tipCarEjecu;
    }

    /**
     * Define el valor de la propiedad tipCarEjecu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipCarEjecu(JAXBElement<Short> value) {
        this.tipCarEjecu = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipCargo() {
        return tipCargo;
    }

    /**
     * Define el valor de la propiedad tipCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipCargo(JAXBElement<Short> value) {
        this.tipCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCobro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipCobro() {
        return tipCobro;
    }

    /**
     * Define el valor de la propiedad tipCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipCobro(JAXBElement<Short> value) {
        this.tipCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipExacc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipExacc() {
        return tipExacc;
    }

    /**
     * Define el valor de la propiedad tipExacc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipExacc(JAXBElement<Short> value) {
        this.tipExacc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipPerso() {
        return tipPerso;
    }

    /**
     * Define el valor de la propiedad tipPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipPerso(JAXBElement<Short> value) {
        this.tipPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipo(JAXBElement<Short> value) {
        this.tipo = value;
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
