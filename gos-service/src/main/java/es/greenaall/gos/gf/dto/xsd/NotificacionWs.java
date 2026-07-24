
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificacionWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificacionWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bop" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codArchi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codArchiAcuse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProvi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="desEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMotiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProvi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desRecep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desVial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeExped" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeRemes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expedicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fecArchi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecEmiBop" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecPubBop" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRegistSalid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="forNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="hectometro" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="idHisPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisRecNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTipNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impCosta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="kilometro" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="letInfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letSuper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notificador" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numBop" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numEnvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numInfer" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRegisSalid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numRemes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numSuper" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razSocia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="situacionEvento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipPerso" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipVial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totDeuda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "NotificacionWs", propOrder = {
    "apellido1",
    "apellido2",
    "bloque",
    "bop",
    "codArchi",
    "codArchiAcuse",
    "codEntid",
    "codEvento",
    "codMunic",
    "codPosta",
    "codProvi",
    "correo",
    "desEntid",
    "desExped",
    "desMotiv",
    "desMunic",
    "desNotif",
    "desProvi",
    "desRecep",
    "desVial",
    "descripcion",
    "domicilio",
    "ejeExped",
    "ejeNotif",
    "ejeRemes",
    "escalera",
    "expedicion",
    "fecArchi",
    "fecContr",
    "fecEmiBop",
    "fecEnvio",
    "fecNotif",
    "fecPubBop",
    "fecRecNotif",
    "fecRegistSalid",
    "forNotif",
    "hectometro",
    "idHisPerso",
    "idHisRecNotif",
    "idNotif",
    "idPerso",
    "idTipNotif",
    "impCosta",
    "kilometro",
    "letInfer",
    "letSuper",
    "localidad",
    "motNotif",
    "nombre",
    "notificador",
    "numBop",
    "numDocum",
    "numEnvio",
    "numExped",
    "numInfer",
    "numNotif",
    "numRegisSalid",
    "numRemes",
    "numSuper",
    "observacion",
    "planta",
    "portal",
    "puerta",
    "razSocia",
    "receptor",
    "situacion",
    "situacionEvento",
    "tipPerso",
    "tipVial",
    "totDeuda",
    "usuContr"
})
public class NotificacionWs {

    @XmlElementRef(name = "apellido1", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "apellido2", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "bloque", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloque;
    @XmlElementRef(name = "bop", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> bop;
    @XmlElementRef(name = "codArchi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codArchi;
    @XmlElementRef(name = "codArchiAcuse", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codArchiAcuse;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codEvento", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEvento;
    @XmlElementRef(name = "codMunic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codMunic;
    @XmlElementRef(name = "codPosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosta;
    @XmlElementRef(name = "codProvi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codProvi;
    @XmlElementRef(name = "correo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> correo;
    @XmlElementRef(name = "desEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntid;
    @XmlElementRef(name = "desExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desExped;
    @XmlElementRef(name = "desMotiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMotiv;
    @XmlElementRef(name = "desMunic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMunic;
    @XmlElementRef(name = "desNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desNotif;
    @XmlElementRef(name = "desProvi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProvi;
    @XmlElementRef(name = "desRecep", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRecep;
    @XmlElementRef(name = "desVial", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desVial;
    @XmlElementRef(name = "descripcion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "domicilio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilio;
    @XmlElementRef(name = "ejeExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeExped;
    @XmlElementRef(name = "ejeNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeNotif;
    @XmlElementRef(name = "ejeRemes", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRemes;
    @XmlElementRef(name = "escalera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escalera;
    @XmlElementRef(name = "expedicion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expedicion;
    @XmlElementRef(name = "fecArchi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecArchi;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecEmiBop", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecEmiBop;
    @XmlElementRef(name = "fecEnvio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecEnvio;
    @XmlElementRef(name = "fecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecNotif;
    @XmlElementRef(name = "fecPubBop", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecPubBop;
    @XmlElementRef(name = "fecRecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRecNotif;
    @XmlElementRef(name = "fecRegistSalid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRegistSalid;
    @XmlElementRef(name = "forNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> forNotif;
    @XmlElementRef(name = "hectometro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> hectometro;
    @XmlElementRef(name = "idHisPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPerso;
    @XmlElementRef(name = "idHisRecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisRecNotif;
    @XmlElementRef(name = "idNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idNotif;
    @XmlElementRef(name = "idPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPerso;
    @XmlElementRef(name = "idTipNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTipNotif;
    @XmlElementRef(name = "impCosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impCosta;
    @XmlElementRef(name = "kilometro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> kilometro;
    @XmlElementRef(name = "letInfer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letInfer;
    @XmlElementRef(name = "letSuper", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letSuper;
    @XmlElementRef(name = "localidad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidad;
    @XmlElementRef(name = "motNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> motNotif;
    @XmlElementRef(name = "nombre", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "notificador", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> notificador;
    @XmlElementRef(name = "numBop", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numBop;
    @XmlElementRef(name = "numDocum", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDocum;
    @XmlElementRef(name = "numEnvio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEnvio;
    @XmlElementRef(name = "numExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numExped;
    @XmlElementRef(name = "numInfer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numInfer;
    @XmlElementRef(name = "numNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numNotif;
    @XmlElementRef(name = "numRegisSalid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numRegisSalid;
    @XmlElementRef(name = "numRemes", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numRemes;
    @XmlElementRef(name = "numSuper", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numSuper;
    @XmlElementRef(name = "observacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacion;
    @XmlElementRef(name = "planta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planta;
    @XmlElementRef(name = "portal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portal;
    @XmlElementRef(name = "puerta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puerta;
    @XmlElementRef(name = "razSocia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSocia;
    @XmlElementRef(name = "receptor", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> receptor;
    @XmlElementRef(name = "situacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> situacion;
    @XmlElementRef(name = "situacionEvento", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> situacionEvento;
    @XmlElementRef(name = "tipPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipPerso;
    @XmlElementRef(name = "tipVial", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipVial;
    @XmlElementRef(name = "totDeuda", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totDeuda;
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
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloque(JAXBElement<String> value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad bop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBop() {
        return bop;
    }

    /**
     * Define el valor de la propiedad bop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBop(JAXBElement<Short> value) {
        this.bop = value;
    }

    /**
     * Obtiene el valor de la propiedad codArchi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodArchi() {
        return codArchi;
    }

    /**
     * Define el valor de la propiedad codArchi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodArchi(JAXBElement<Long> value) {
        this.codArchi = value;
    }

    /**
     * Obtiene el valor de la propiedad codArchiAcuse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodArchiAcuse() {
        return codArchiAcuse;
    }

    /**
     * Define el valor de la propiedad codArchiAcuse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodArchiAcuse(JAXBElement<Long> value) {
        this.codArchiAcuse = value;
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
     * Obtiene el valor de la propiedad codEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEvento() {
        return codEvento;
    }

    /**
     * Define el valor de la propiedad codEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEvento(JAXBElement<String> value) {
        this.codEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodMunic() {
        return codMunic;
    }

    /**
     * Define el valor de la propiedad codMunic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodMunic(JAXBElement<Short> value) {
        this.codMunic = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPosta() {
        return codPosta;
    }

    /**
     * Define el valor de la propiedad codPosta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPosta(JAXBElement<Integer> value) {
        this.codPosta = value;
    }

    /**
     * Obtiene el valor de la propiedad codProvi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodProvi() {
        return codProvi;
    }

    /**
     * Define el valor de la propiedad codProvi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodProvi(JAXBElement<Short> value) {
        this.codProvi = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCorreo(JAXBElement<Integer> value) {
        this.correo = value;
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
     * Obtiene el valor de la propiedad desExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesExped() {
        return desExped;
    }

    /**
     * Define el valor de la propiedad desExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesExped(JAXBElement<String> value) {
        this.desExped = value;
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
     * Obtiene el valor de la propiedad desMunic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMunic() {
        return desMunic;
    }

    /**
     * Define el valor de la propiedad desMunic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMunic(JAXBElement<String> value) {
        this.desMunic = value;
    }

    /**
     * Obtiene el valor de la propiedad desNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesNotif() {
        return desNotif;
    }

    /**
     * Define el valor de la propiedad desNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesNotif(JAXBElement<String> value) {
        this.desNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad desProvi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesProvi() {
        return desProvi;
    }

    /**
     * Define el valor de la propiedad desProvi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesProvi(JAXBElement<String> value) {
        this.desProvi = value;
    }

    /**
     * Obtiene el valor de la propiedad desRecep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRecep() {
        return desRecep;
    }

    /**
     * Define el valor de la propiedad desRecep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRecep(JAXBElement<String> value) {
        this.desRecep = value;
    }

    /**
     * Obtiene el valor de la propiedad desVial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesVial() {
        return desVial;
    }

    /**
     * Define el valor de la propiedad desVial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesVial(JAXBElement<String> value) {
        this.desVial = value;
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
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomicilio(JAXBElement<String> value) {
        this.domicilio = value;
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
     * Obtiene el valor de la propiedad ejeRemes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeRemes() {
        return ejeRemes;
    }

    /**
     * Define el valor de la propiedad ejeRemes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeRemes(JAXBElement<Short> value) {
        this.ejeRemes = value;
    }

    /**
     * Obtiene el valor de la propiedad escalera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEscalera() {
        return escalera;
    }

    /**
     * Define el valor de la propiedad escalera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEscalera(JAXBElement<String> value) {
        this.escalera = value;
    }

    /**
     * Obtiene el valor de la propiedad expedicion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpedicion() {
        return expedicion;
    }

    /**
     * Define el valor de la propiedad expedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpedicion(JAXBElement<Integer> value) {
        this.expedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecArchi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecArchi() {
        return fecArchi;
    }

    /**
     * Define el valor de la propiedad fecArchi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecArchi(JAXBElement<XMLGregorianCalendar> value) {
        this.fecArchi = value;
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
     * Obtiene el valor de la propiedad fecEmiBop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecEmiBop() {
        return fecEmiBop;
    }

    /**
     * Define el valor de la propiedad fecEmiBop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecEmiBop(JAXBElement<XMLGregorianCalendar> value) {
        this.fecEmiBop = value;
    }

    /**
     * Obtiene el valor de la propiedad fecEnvio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecEnvio() {
        return fecEnvio;
    }

    /**
     * Define el valor de la propiedad fecEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecEnvio(JAXBElement<XMLGregorianCalendar> value) {
        this.fecEnvio = value;
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
     * Obtiene el valor de la propiedad fecPubBop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecPubBop() {
        return fecPubBop;
    }

    /**
     * Define el valor de la propiedad fecPubBop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecPubBop(JAXBElement<XMLGregorianCalendar> value) {
        this.fecPubBop = value;
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
     * Obtiene el valor de la propiedad fecRegistSalid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecRegistSalid() {
        return fecRegistSalid;
    }

    /**
     * Define el valor de la propiedad fecRegistSalid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecRegistSalid(JAXBElement<XMLGregorianCalendar> value) {
        this.fecRegistSalid = value;
    }

    /**
     * Obtiene el valor de la propiedad forNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getForNotif() {
        return forNotif;
    }

    /**
     * Define el valor de la propiedad forNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setForNotif(JAXBElement<Short> value) {
        this.forNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad hectometro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getHectometro() {
        return hectometro;
    }

    /**
     * Define el valor de la propiedad hectometro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setHectometro(JAXBElement<Short> value) {
        this.hectometro = value;
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
     * Obtiene el valor de la propiedad idHisRecNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisRecNotif() {
        return idHisRecNotif;
    }

    /**
     * Define el valor de la propiedad idHisRecNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisRecNotif(JAXBElement<Long> value) {
        this.idHisRecNotif = value;
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
     * Obtiene el valor de la propiedad idTipNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTipNotif() {
        return idTipNotif;
    }

    /**
     * Define el valor de la propiedad idTipNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTipNotif(JAXBElement<Long> value) {
        this.idTipNotif = value;
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
     * Obtiene el valor de la propiedad kilometro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setKilometro(JAXBElement<Short> value) {
        this.kilometro = value;
    }

    /**
     * Obtiene el valor de la propiedad letInfer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetInfer() {
        return letInfer;
    }

    /**
     * Define el valor de la propiedad letInfer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetInfer(JAXBElement<String> value) {
        this.letInfer = value;
    }

    /**
     * Obtiene el valor de la propiedad letSuper.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetSuper() {
        return letSuper;
    }

    /**
     * Define el valor de la propiedad letSuper.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetSuper(JAXBElement<String> value) {
        this.letSuper = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidad(JAXBElement<String> value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad motNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMotNotif() {
        return motNotif;
    }

    /**
     * Define el valor de la propiedad motNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMotNotif(JAXBElement<Short> value) {
        this.motNotif = value;
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
     * Obtiene el valor de la propiedad notificador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNotificador() {
        return notificador;
    }

    /**
     * Define el valor de la propiedad notificador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNotificador(JAXBElement<Short> value) {
        this.notificador = value;
    }

    /**
     * Obtiene el valor de la propiedad numBop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumBop() {
        return numBop;
    }

    /**
     * Define el valor de la propiedad numBop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumBop(JAXBElement<Integer> value) {
        this.numBop = value;
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
     * Obtiene el valor de la propiedad numEnvio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumEnvio() {
        return numEnvio;
    }

    /**
     * Define el valor de la propiedad numEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumEnvio(JAXBElement<Integer> value) {
        this.numEnvio = value;
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
     * Obtiene el valor de la propiedad numInfer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumInfer() {
        return numInfer;
    }

    /**
     * Define el valor de la propiedad numInfer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumInfer(JAXBElement<Short> value) {
        this.numInfer = value;
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
     * Obtiene el valor de la propiedad numRegisSalid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumRegisSalid() {
        return numRegisSalid;
    }

    /**
     * Define el valor de la propiedad numRegisSalid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumRegisSalid(JAXBElement<Long> value) {
        this.numRegisSalid = value;
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
     * Obtiene el valor de la propiedad numSuper.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumSuper() {
        return numSuper;
    }

    /**
     * Define el valor de la propiedad numSuper.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumSuper(JAXBElement<Short> value) {
        this.numSuper = value;
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
     * Obtiene el valor de la propiedad planta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanta() {
        return planta;
    }

    /**
     * Define el valor de la propiedad planta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanta(JAXBElement<String> value) {
        this.planta = value;
    }

    /**
     * Obtiene el valor de la propiedad portal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortal() {
        return portal;
    }

    /**
     * Define el valor de la propiedad portal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortal(JAXBElement<String> value) {
        this.portal = value;
    }

    /**
     * Obtiene el valor de la propiedad puerta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuerta() {
        return puerta;
    }

    /**
     * Define el valor de la propiedad puerta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuerta(JAXBElement<String> value) {
        this.puerta = value;
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
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setReceptor(JAXBElement<Short> value) {
        this.receptor = value;
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
     * Obtiene el valor de la propiedad situacionEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSituacionEvento() {
        return situacionEvento;
    }

    /**
     * Define el valor de la propiedad situacionEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSituacionEvento(JAXBElement<Short> value) {
        this.situacionEvento = value;
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
     * Obtiene el valor de la propiedad tipVial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipVial() {
        return tipVial;
    }

    /**
     * Define el valor de la propiedad tipVial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipVial(JAXBElement<String> value) {
        this.tipVial = value;
    }

    /**
     * Obtiene el valor de la propiedad totDeuda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotDeuda() {
        return totDeuda;
    }

    /**
     * Define el valor de la propiedad totDeuda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotDeuda(JAXBElement<BigDecimal> value) {
        this.totDeuda = value;
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
