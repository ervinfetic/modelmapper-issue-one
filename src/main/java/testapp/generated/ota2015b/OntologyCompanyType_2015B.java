//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Company name, code, travel segment with ontology reference.
 * 
 * <p>Java class for OntologyCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntologyCompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOrCode" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType"/>
 *         &lt;element name="TravelSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTravelSegment">
 *                 &lt;attribute name="OntologyRefID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,8}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyCompanyType", propOrder = {
    "nameOrCode",
    "travelSegment",
    "ontologyExtension"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.MultiModalOfferType_2015B.RequestingParty_2015B.class
})
public class OntologyCompanyType_2015B {

    @XmlElement(name = "NameOrCode", required = true)
    protected OntologyCodeType_2015B nameOrCode;
    @XmlElement(name = "TravelSegment")
    protected OntologyCompanyType_2015B.TravelSegment_2015B travelSegment;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType_2015B ontologyExtension;

    /**
     * Gets the value of the nameOrCode property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyCodeType_2015B }
     *     
     */
    public OntologyCodeType_2015B getNameOrCode() {
        return nameOrCode;
    }

    /**
     * Sets the value of the nameOrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyCodeType_2015B }
     *     
     */
    public void setNameOrCode(OntologyCodeType_2015B value) {
        this.nameOrCode = value;
    }

    /**
     * Gets the value of the travelSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyCompanyType_2015B.TravelSegment_2015B }
     *     
     */
    public OntologyCompanyType_2015B.TravelSegment_2015B getTravelSegment() {
        return travelSegment;
    }

    /**
     * Sets the value of the travelSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyCompanyType_2015B.TravelSegment_2015B }
     *     
     */
    public void setTravelSegment(OntologyCompanyType_2015B.TravelSegment_2015B value) {
        this.travelSegment = value;
    }

    /**
     * Gets the value of the ontologyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyExtensionType_2015B }
     *     
     */
    public OntologyExtensionType_2015B getOntologyExtension() {
        return ontologyExtension;
    }

    /**
     * Sets the value of the ontologyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyExtensionType_2015B }
     *     
     */
    public void setOntologyExtension(OntologyExtensionType_2015B value) {
        this.ontologyExtension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTravelSegment">
     *       &lt;attribute name="OntologyRefID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,8}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TravelSegment_2015B {

        @XmlValue
        protected ListOfferTravelSegment_2015B value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: OpenTravel
         * 
         * @return
         *     possible object is
         *     {@link ListOfferTravelSegment_2015B }
         *     
         */
        public ListOfferTravelSegment_2015B getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferTravelSegment_2015B }
         *     
         */
        public void setValue(ListOfferTravelSegment_2015B value) {
            this.value = value;
        }

        /**
         * Gets the value of the ontologyRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOntologyRefID() {
            return ontologyRefID;
        }

        /**
         * Sets the value of the ontologyRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOntologyRefID(String value) {
            this.ontologyRefID = value;
        }

    }

}