
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LiquidacionWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LiquidacionWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1Propi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2Propi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCuentDomBanca" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntidDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codImpue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codOrgAprob" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codSucurDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="cuoAutol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cuoLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="desBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntidDomBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desIntDemor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMotiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desOrgAprob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desRepPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSanci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSucurDomBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desVario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digContrDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="dirPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeAutol" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeExped" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeImpue" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeLiqui" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecBonif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecLiqui" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="funBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAutol" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idExped" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisPropi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisRepPropi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idImpue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idLiqui" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPropi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idRepPropi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impBonAutol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impBonLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impSanci" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impVario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="intDemor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="liqNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="modPerte" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="modRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="motLiqui" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nifPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nifRepPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numAutol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numLiqui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numRecib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRemes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perImpos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porBonif" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="razRepPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razSociaPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipLiqui" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipPersoPropi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="totLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "LiquidacionWs", propOrder = {
    "apellido1Propi",
    "apellido2Propi",
    "codCuentDomBanca",
    "codEntid",
    "codEntidDomBanca",
    "codImpue",
    "codMunDomNotif",
    "codOrgAprob",
    "codPosDomNotif",
    "codProDomNotif",
    "codSucurDomBanca",
    "cuoAutol",
    "cuoLiqui",
    "desBonif",
    "desEntid",
    "desEntidDomBanca",
    "desIntDemor",
    "desMotiv",
    "desMunDomNotif",
    "desObjTribu",
    "desOrgAprob",
    "desProDomNotif",
    "desRepPropi",
    "desSanci",
    "desSucurDomBanca",
    "desVario",
    "digContrDomBanca",
    "dirPosDomNotif",
    "ejeAutol",
    "ejeExped",
    "ejeImpue",
    "ejeLiqui",
    "ejeNotif",
    "ejeRecib",
    "estRecib",
    "fecBonif",
    "fecContr",
    "fecLiqui",
    "fecNotif",
    "fecRecNotif",
    "funBonif",
    "idAutol",
    "idDomBanca",
    "idDomNotif",
    "idExped",
    "idHisDomBanca",
    "idHisDomNotif",
    "idHisObjTribu",
    "idHisOtro",
    "idHisPropi",
    "idHisRecib",
    "idHisRepPropi",
    "idImpue",
    "idLiqui",
    "idNotif",
    "idObjTribu",
    "idOtro",
    "idPropi",
    "idRecib",
    "idRepPropi",
    "impBonAutol",
    "impBonLiqui",
    "impSanci",
    "impVario",
    "intDemor",
    "liqNotif",
    "modPerte",
    "modRecib",
    "motLiqui",
    "nifPropi",
    "nifRepPropi",
    "nombrePropi",
    "numAutol",
    "numBonif",
    "numExped",
    "numLiqui",
    "numNotif",
    "numObjTribu",
    "numRecib",
    "numRemes",
    "observaciones",
    "orgBonif",
    "perImpos",
    "porBonif",
    "razRepPropi",
    "razSociaPropi",
    "tipLiqui",
    "tipPersoPropi",
    "totLiqui",
    "usuContr"
})
public class LiquidacionWs {

    @XmlElementRef(name = "apellido1Propi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1Propi;
    @XmlElementRef(name = "apellido2Propi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2Propi;
    @XmlElementRef(name = "codCuentDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codCuentDomBanca;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codEntidDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntidDomBanca;
    @XmlElementRef(name = "codImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codImpue;
    @XmlElementRef(name = "codMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codMunDomNotif;
    @XmlElementRef(name = "codOrgAprob", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codOrgAprob;
    @XmlElementRef(name = "codPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosDomNotif;
    @XmlElementRef(name = "codProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codProDomNotif;
    @XmlElementRef(name = "codSucurDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codSucurDomBanca;
    @XmlElementRef(name = "cuoAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cuoAutol;
    @XmlElementRef(name = "cuoLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cuoLiqui;
    @XmlElementRef(name = "desBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desBonif;
    @XmlElementRef(name = "desEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntid;
    @XmlElementRef(name = "desEntidDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntidDomBanca;
    @XmlElementRef(name = "desIntDemor", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desIntDemor;
    @XmlElementRef(name = "desMotiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMotiv;
    @XmlElementRef(name = "desMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMunDomNotif;
    @XmlElementRef(name = "desObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desObjTribu;
    @XmlElementRef(name = "desOrgAprob", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desOrgAprob;
    @XmlElementRef(name = "desProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProDomNotif;
    @XmlElementRef(name = "desRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRepPropi;
    @XmlElementRef(name = "desSanci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSanci;
    @XmlElementRef(name = "desSucurDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSucurDomBanca;
    @XmlElementRef(name = "desVario", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desVario;
    @XmlElementRef(name = "digContrDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> digContrDomBanca;
    @XmlElementRef(name = "dirPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPosDomNotif;
    @XmlElementRef(name = "ejeAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeAutol;
    @XmlElementRef(name = "ejeExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeExped;
    @XmlElementRef(name = "ejeImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeImpue;
    @XmlElementRef(name = "ejeLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeLiqui;
    @XmlElementRef(name = "ejeNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeNotif;
    @XmlElementRef(name = "ejeRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRecib;
    @XmlElementRef(name = "estRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estRecib;
    @XmlElementRef(name = "fecBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecBonif;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecLiqui;
    @XmlElementRef(name = "fecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecNotif;
    @XmlElementRef(name = "fecRecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRecNotif;
    @XmlElementRef(name = "funBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> funBonif;
    @XmlElementRef(name = "idAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idAutol;
    @XmlElementRef(name = "idDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomBanca;
    @XmlElementRef(name = "idDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomNotif;
    @XmlElementRef(name = "idExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idExped;
    @XmlElementRef(name = "idHisDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomBanca;
    @XmlElementRef(name = "idHisDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomNotif;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisOtro;
    @XmlElementRef(name = "idHisPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPropi;
    @XmlElementRef(name = "idHisRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisRecib;
    @XmlElementRef(name = "idHisRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisRepPropi;
    @XmlElementRef(name = "idImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idImpue;
    @XmlElementRef(name = "idLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idLiqui;
    @XmlElementRef(name = "idNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idNotif;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOtro;
    @XmlElementRef(name = "idPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPropi;
    @XmlElementRef(name = "idRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idRecib;
    @XmlElementRef(name = "idRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idRepPropi;
    @XmlElementRef(name = "impBonAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impBonAutol;
    @XmlElementRef(name = "impBonLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impBonLiqui;
    @XmlElementRef(name = "impSanci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impSanci;
    @XmlElementRef(name = "impVario", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impVario;
    @XmlElementRef(name = "intDemor", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> intDemor;
    @XmlElementRef(name = "liqNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> liqNotif;
    @XmlElementRef(name = "modPerte", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modPerte;
    @XmlElementRef(name = "modRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modRecib;
    @XmlElementRef(name = "motLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> motLiqui;
    @XmlElementRef(name = "nifPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifPropi;
    @XmlElementRef(name = "nifRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifRepPropi;
    @XmlElementRef(name = "nombrePropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePropi;
    @XmlElementRef(name = "numAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numAutol;
    @XmlElementRef(name = "numBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numBonif;
    @XmlElementRef(name = "numExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numExped;
    @XmlElementRef(name = "numLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLiqui;
    @XmlElementRef(name = "numNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numNotif;
    @XmlElementRef(name = "numObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numObjTribu;
    @XmlElementRef(name = "numRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRecib;
    @XmlElementRef(name = "numRemes", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numRemes;
    @XmlElementRef(name = "observaciones", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "orgBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgBonif;
    @XmlElementRef(name = "perImpos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perImpos;
    @XmlElementRef(name = "porBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porBonif;
    @XmlElementRef(name = "razRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razRepPropi;
    @XmlElementRef(name = "razSociaPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSociaPropi;
    @XmlElementRef(name = "tipLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipLiqui;
    @XmlElementRef(name = "tipPersoPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipPersoPropi;
    @XmlElementRef(name = "totLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totLiqui;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad apellido1Propi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1Propi() {
        return apellido1Propi;
    }

    /**
     * Define el valor de la propiedad apellido1Propi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1Propi(JAXBElement<String> value) {
        this.apellido1Propi = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2Propi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2Propi() {
        return apellido2Propi;
    }

    /**
     * Define el valor de la propiedad apellido2Propi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2Propi(JAXBElement<String> value) {
        this.apellido2Propi = value;
    }

    /**
     * Obtiene el valor de la propiedad codCuentDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodCuentDomBanca() {
        return codCuentDomBanca;
    }

    /**
     * Define el valor de la propiedad codCuentDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodCuentDomBanca(JAXBElement<BigDecimal> value) {
        this.codCuentDomBanca = value;
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
     * Obtiene el valor de la propiedad codEntidDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntidDomBanca() {
        return codEntidDomBanca;
    }

    /**
     * Define el valor de la propiedad codEntidDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntidDomBanca(JAXBElement<Short> value) {
        this.codEntidDomBanca = value;
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
     * Obtiene el valor de la propiedad codMunDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodMunDomNotif() {
        return codMunDomNotif;
    }

    /**
     * Define el valor de la propiedad codMunDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodMunDomNotif(JAXBElement<Short> value) {
        this.codMunDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrgAprob.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodOrgAprob() {
        return codOrgAprob;
    }

    /**
     * Define el valor de la propiedad codOrgAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodOrgAprob(JAXBElement<Short> value) {
        this.codOrgAprob = value;
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
     * Obtiene el valor de la propiedad codProDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodProDomNotif() {
        return codProDomNotif;
    }

    /**
     * Define el valor de la propiedad codProDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodProDomNotif(JAXBElement<Short> value) {
        this.codProDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucurDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodSucurDomBanca() {
        return codSucurDomBanca;
    }

    /**
     * Define el valor de la propiedad codSucurDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodSucurDomBanca(JAXBElement<Short> value) {
        this.codSucurDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad cuoAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCuoAutol() {
        return cuoAutol;
    }

    /**
     * Define el valor de la propiedad cuoAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCuoAutol(JAXBElement<BigDecimal> value) {
        this.cuoAutol = value;
    }

    /**
     * Obtiene el valor de la propiedad cuoLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCuoLiqui() {
        return cuoLiqui;
    }

    /**
     * Define el valor de la propiedad cuoLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCuoLiqui(JAXBElement<BigDecimal> value) {
        this.cuoLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad desBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesBonif() {
        return desBonif;
    }

    /**
     * Define el valor de la propiedad desBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesBonif(JAXBElement<String> value) {
        this.desBonif = value;
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
     * Obtiene el valor de la propiedad desEntidDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntidDomBanca() {
        return desEntidDomBanca;
    }

    /**
     * Define el valor de la propiedad desEntidDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntidDomBanca(JAXBElement<String> value) {
        this.desEntidDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desIntDemor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesIntDemor() {
        return desIntDemor;
    }

    /**
     * Define el valor de la propiedad desIntDemor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesIntDemor(JAXBElement<String> value) {
        this.desIntDemor = value;
    }

    /**
     * Obtiene el valor de la propiedad desMotiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMotiv() {
        return desMotiv;
    }

    /**
     * Define el valor de la propiedad desMotiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMotiv(JAXBElement<String> value) {
        this.desMotiv = value;
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
     * Obtiene el valor de la propiedad desOrgAprob.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesOrgAprob() {
        return desOrgAprob;
    }

    /**
     * Define el valor de la propiedad desOrgAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesOrgAprob(JAXBElement<String> value) {
        this.desOrgAprob = value;
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
     * Obtiene el valor de la propiedad desRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRepPropi() {
        return desRepPropi;
    }

    /**
     * Define el valor de la propiedad desRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRepPropi(JAXBElement<String> value) {
        this.desRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad desSanci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSanci() {
        return desSanci;
    }

    /**
     * Define el valor de la propiedad desSanci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSanci(JAXBElement<String> value) {
        this.desSanci = value;
    }

    /**
     * Obtiene el valor de la propiedad desSucurDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSucurDomBanca() {
        return desSucurDomBanca;
    }

    /**
     * Define el valor de la propiedad desSucurDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSucurDomBanca(JAXBElement<String> value) {
        this.desSucurDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desVario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesVario() {
        return desVario;
    }

    /**
     * Define el valor de la propiedad desVario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesVario(JAXBElement<String> value) {
        this.desVario = value;
    }

    /**
     * Obtiene el valor de la propiedad digContrDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDigContrDomBanca() {
        return digContrDomBanca;
    }

    /**
     * Define el valor de la propiedad digContrDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDigContrDomBanca(JAXBElement<Short> value) {
        this.digContrDomBanca = value;
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
     * Obtiene el valor de la propiedad ejeAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeAutol() {
        return ejeAutol;
    }

    /**
     * Define el valor de la propiedad ejeAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeAutol(JAXBElement<Short> value) {
        this.ejeAutol = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeExped() {
        return ejeExped;
    }

    /**
     * Define el valor de la propiedad ejeExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeExped(JAXBElement<Short> value) {
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
     * Obtiene el valor de la propiedad ejeLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeLiqui() {
        return ejeLiqui;
    }

    /**
     * Define el valor de la propiedad ejeLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeLiqui(JAXBElement<Short> value) {
        this.ejeLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeNotif() {
        return ejeNotif;
    }

    /**
     * Define el valor de la propiedad ejeNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeNotif(JAXBElement<Short> value) {
        this.ejeNotif = value;
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
     * Obtiene el valor de la propiedad fecBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecBonif() {
        return fecBonif;
    }

    /**
     * Define el valor de la propiedad fecBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecBonif(JAXBElement<XMLGregorianCalendar> value) {
        this.fecBonif = value;
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
     * Obtiene el valor de la propiedad fecLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecLiqui() {
        return fecLiqui;
    }

    /**
     * Define el valor de la propiedad fecLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecLiqui(JAXBElement<XMLGregorianCalendar> value) {
        this.fecLiqui = value;
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
     * Obtiene el valor de la propiedad fecRecNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecRecNotif() {
        return fecRecNotif;
    }

    /**
     * Define el valor de la propiedad fecRecNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecRecNotif(JAXBElement<XMLGregorianCalendar> value) {
        this.fecRecNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad funBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunBonif() {
        return funBonif;
    }

    /**
     * Define el valor de la propiedad funBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunBonif(JAXBElement<String> value) {
        this.funBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad idAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdAutol() {
        return idAutol;
    }

    /**
     * Define el valor de la propiedad idAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdAutol(JAXBElement<Long> value) {
        this.idAutol = value;
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
     * Obtiene el valor de la propiedad idExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdExped() {
        return idExped;
    }

    /**
     * Define el valor de la propiedad idExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdExped(JAXBElement<Long> value) {
        this.idExped = value;
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
     * Obtiene el valor de la propiedad idHisPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisPropi() {
        return idHisPropi;
    }

    /**
     * Define el valor de la propiedad idHisPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisPropi(JAXBElement<Long> value) {
        this.idHisPropi = value;
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
     * Obtiene el valor de la propiedad idHisRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisRepPropi() {
        return idHisRepPropi;
    }

    /**
     * Define el valor de la propiedad idHisRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisRepPropi(JAXBElement<Long> value) {
        this.idHisRepPropi = value;
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
     * Obtiene el valor de la propiedad idLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdLiqui() {
        return idLiqui;
    }

    /**
     * Define el valor de la propiedad idLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdLiqui(JAXBElement<Long> value) {
        this.idLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad idNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdNotif() {
        return idNotif;
    }

    /**
     * Define el valor de la propiedad idNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdNotif(JAXBElement<Long> value) {
        this.idNotif = value;
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
     * Obtiene el valor de la propiedad idPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPropi() {
        return idPropi;
    }

    /**
     * Define el valor de la propiedad idPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPropi(JAXBElement<Long> value) {
        this.idPropi = value;
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
     * Obtiene el valor de la propiedad idRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdRepPropi() {
        return idRepPropi;
    }

    /**
     * Define el valor de la propiedad idRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdRepPropi(JAXBElement<Long> value) {
        this.idRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad impBonAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpBonAutol() {
        return impBonAutol;
    }

    /**
     * Define el valor de la propiedad impBonAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpBonAutol(JAXBElement<BigDecimal> value) {
        this.impBonAutol = value;
    }

    /**
     * Obtiene el valor de la propiedad impBonLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpBonLiqui() {
        return impBonLiqui;
    }

    /**
     * Define el valor de la propiedad impBonLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpBonLiqui(JAXBElement<BigDecimal> value) {
        this.impBonLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad impSanci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpSanci() {
        return impSanci;
    }

    /**
     * Define el valor de la propiedad impSanci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpSanci(JAXBElement<BigDecimal> value) {
        this.impSanci = value;
    }

    /**
     * Obtiene el valor de la propiedad impVario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpVario() {
        return impVario;
    }

    /**
     * Define el valor de la propiedad impVario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpVario(JAXBElement<BigDecimal> value) {
        this.impVario = value;
    }

    /**
     * Obtiene el valor de la propiedad intDemor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIntDemor() {
        return intDemor;
    }

    /**
     * Define el valor de la propiedad intDemor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIntDemor(JAXBElement<BigDecimal> value) {
        this.intDemor = value;
    }

    /**
     * Obtiene el valor de la propiedad liqNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getLiqNotif() {
        return liqNotif;
    }

    /**
     * Define el valor de la propiedad liqNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setLiqNotif(JAXBElement<Short> value) {
        this.liqNotif = value;
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
     * Obtiene el valor de la propiedad modRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModRecib() {
        return modRecib;
    }

    /**
     * Define el valor de la propiedad modRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModRecib(JAXBElement<Short> value) {
        this.modRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad motLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMotLiqui() {
        return motLiqui;
    }

    /**
     * Define el valor de la propiedad motLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMotLiqui(JAXBElement<Short> value) {
        this.motLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad nifPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifPropi() {
        return nifPropi;
    }

    /**
     * Define el valor de la propiedad nifPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifPropi(JAXBElement<String> value) {
        this.nifPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad nifRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifRepPropi() {
        return nifRepPropi;
    }

    /**
     * Define el valor de la propiedad nifRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifRepPropi(JAXBElement<String> value) {
        this.nifRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePropi() {
        return nombrePropi;
    }

    /**
     * Define el valor de la propiedad nombrePropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePropi(JAXBElement<String> value) {
        this.nombrePropi = value;
    }

    /**
     * Obtiene el valor de la propiedad numAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAutol() {
        return numAutol;
    }

    /**
     * Define el valor de la propiedad numAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAutol(JAXBElement<String> value) {
        this.numAutol = value;
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
     * Obtiene el valor de la propiedad numLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumLiqui() {
        return numLiqui;
    }

    /**
     * Define el valor de la propiedad numLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumLiqui(JAXBElement<String> value) {
        this.numLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad numNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumNotif() {
        return numNotif;
    }

    /**
     * Define el valor de la propiedad numNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumNotif(JAXBElement<Integer> value) {
        this.numNotif = value;
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
     * Obtiene el valor de la propiedad orgBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgBonif() {
        return orgBonif;
    }

    /**
     * Define el valor de la propiedad orgBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgBonif(JAXBElement<String> value) {
        this.orgBonif = value;
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
     * Obtiene el valor de la propiedad razRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazRepPropi() {
        return razRepPropi;
    }

    /**
     * Define el valor de la propiedad razRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazRepPropi(JAXBElement<String> value) {
        this.razRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad razSociaPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazSociaPropi() {
        return razSociaPropi;
    }

    /**
     * Define el valor de la propiedad razSociaPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazSociaPropi(JAXBElement<String> value) {
        this.razSociaPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad tipLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipLiqui() {
        return tipLiqui;
    }

    /**
     * Define el valor de la propiedad tipLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipLiqui(JAXBElement<Short> value) {
        this.tipLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPersoPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipPersoPropi() {
        return tipPersoPropi;
    }

    /**
     * Define el valor de la propiedad tipPersoPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipPersoPropi(JAXBElement<Short> value) {
        this.tipPersoPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad totLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotLiqui() {
        return totLiqui;
    }

    /**
     * Define el valor de la propiedad totLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotLiqui(JAXBElement<BigDecimal> value) {
        this.totLiqui = value;
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
