//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to define the types of transportation offered.
 * 
 * <p>Java class for TransportationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportations" type="{http://www.opentravel.org/OTA/2003/05}TransportationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
    "transportations"
})
@XmlSeeAlso({
    RelativePositionType_2015B.class
})
public class TransportationsType_2015B {

    @XmlElement(name = "Transportations")
    protected TransportationType_2015B transportations;

    /**
     * Gets the value of the transportations property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationType_2015B }
     *     
     */
    public TransportationType_2015B getTransportations() {
        return transportations;
    }

    /**
     * Sets the value of the transportations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationType_2015B }
     *     
     */
    public void setTransportations(TransportationType_2015B value) {
        this.transportations = value;
    }

}