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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Activity related information with ontology reference.
 * 
 * <p>Java class for OntologyActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntologyActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTourActivityCategory">
 *                 &lt;attribute name="OtherType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "OntologyActivityType", propOrder = {
    "type",
    "ontologyExtension"
})
public class OntologyActivityType_2015B {

    @XmlElement(name = "Type")
    protected OntologyActivityType_2015B.Type_2015B type;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType_2015B ontologyExtension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyActivityType_2015B.Type_2015B }
     *     
     */
    public OntologyActivityType_2015B.Type_2015B getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyActivityType_2015B.Type_2015B }
     *     
     */
    public void setType(OntologyActivityType_2015B.Type_2015B value) {
        this.type = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTourActivityCategory">
     *       &lt;attribute name="OtherType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class Type_2015B {

        @XmlValue
        protected ListOfferTourActivityCategory_2015B value;
        @XmlAttribute(name = "OtherType")
        protected String otherType;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: OpenTravel
         * 
         * @return
         *     possible object is
         *     {@link ListOfferTourActivityCategory_2015B }
         *     
         */
        public ListOfferTourActivityCategory_2015B getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferTourActivityCategory_2015B }
         *     
         */
        public void setValue(ListOfferTourActivityCategory_2015B value) {
            this.value = value;
        }

        /**
         * Gets the value of the otherType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherType() {
            return otherType;
        }

        /**
         * Sets the value of the otherType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherType(String value) {
            this.otherType = value;
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
