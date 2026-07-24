
package java.io.xsd;

import java.rmi.xsd.RemoteException;
import es.greenaall.gos.gf.ws.Exception;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IOException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IOException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gf.gos.greenaall.es}Exception"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOException")
@XmlSeeAlso({
    RemoteException.class
})
public class IOException
    extends Exception
{


}
