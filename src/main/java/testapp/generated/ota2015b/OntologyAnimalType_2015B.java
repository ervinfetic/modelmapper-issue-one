//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Animal type, weight with ontology reference.
 * 
 * <p>Java class for OntologyAnimalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntologyAnimalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Detail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferPetType">
 *                           &lt;attribute name="OtherType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Weight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ServiceAnimalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyAnimalType", propOrder = {
    "detail"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.MultiModalOfferType_2015B.TripCharacteristics_2015B.Animals_2015B.class
})
public class OntologyAnimalType_2015B {

    @XmlElement(name = "Detail")
    protected List<OntologyAnimalType_2015B.Detail_2015B> detail;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "ServiceAnimalInd")
    protected Boolean serviceAnimalInd;

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OntologyAnimalType_2015B.Detail_2015B }
     * 
     * 
     */
    public List<OntologyAnimalType_2015B.Detail_2015B> getDetail() {
        if (detail == null) {
            detail = new ArrayList<OntologyAnimalType_2015B.Detail_2015B>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the serviceAnimalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceAnimalInd() {
        return serviceAnimalInd;
    }

    /**
     * Sets the value of the serviceAnimalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceAnimalInd(Boolean value) {
        this.serviceAnimalInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Type">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferPetType">
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
     *         &lt;element name="Weight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType">
     *               &lt;/extension>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "type",
        "weight",
        "ontologyExtension"
    })
    public static class Detail_2015B {

        @XmlElement(name = "Type", required = true)
        protected OntologyAnimalType_2015B.Detail_2015B.Type_2015B type;
        @XmlElement(name = "Weight")
        protected OntologyAnimalType_2015B.Detail_2015B.Weight_2015B weight;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType_2015B ontologyExtension;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link OntologyAnimalType_2015B.Detail_2015B.Type_2015B }
         *     
         */
        public OntologyAnimalType_2015B.Detail_2015B.Type_2015B getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyAnimalType_2015B.Detail_2015B.Type_2015B }
         *     
         */
        public void setType(OntologyAnimalType_2015B.Detail_2015B.Type_2015B value) {
            this.type = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link OntologyAnimalType_2015B.Detail_2015B.Weight_2015B }
         *     
         */
        public OntologyAnimalType_2015B.Detail_2015B.Weight_2015B getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyAnimalType_2015B.Detail_2015B.Weight_2015B }
         *     
         */
        public void setWeight(OntologyAnimalType_2015B.Detail_2015B.Weight_2015B value) {
            this.weight = value;
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
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferPetType">
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
            protected ListOfferPetType_2015B value;
            @XmlAttribute(name = "OtherType")
            protected String otherType;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * Source: Pets Policy Code (PET) OpenTravel codelist.
             * 
             * @return
             *     possible object is
             *     {@link ListOfferPetType_2015B }
             *     
             */
            public ListOfferPetType_2015B getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfferPetType_2015B }
             *     
             */
            public void setValue(ListOfferPetType_2015B value) {
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Weight_2015B
            extends OntologyWeightType_2015B
        {


        }

    }

}