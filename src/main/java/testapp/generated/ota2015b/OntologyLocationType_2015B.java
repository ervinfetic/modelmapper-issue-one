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
 * Location information with ontology reference.
 * 
 * <p>Java class for OntologyLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntologyLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferLocationType">
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
 *         &lt;choice>
 *           &lt;element name="GeneralLocation" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Geocode" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;sequence>
 *                         &lt;element name="Latitude">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                         &lt;element name="Longitude">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                       &lt;/sequence>
 *                       &lt;element name="UniversalAddress">
 *                         &lt;complexType>
 *                           &lt;simpleContent>
 *                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                               &lt;attribute name="OntologyRefID">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;pattern value="[0-9]{1,8}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/simpleContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="OntologyRefID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{1,8}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PhysicalLocation" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
@XmlType(name = "OntologyLocationType", propOrder = {
    "type",
    "generalLocation",
    "geocode",
    "physicalLocation",
    "ontologyExtension"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.MultiModalOfferType_2015B.TripCharacteristics_2015B.Location_2015B.class
})
public class OntologyLocationType_2015B {

    @XmlElement(name = "Type", required = true)
    protected OntologyLocationType_2015B.Type_2015B type;
    @XmlElement(name = "GeneralLocation")
    protected OntologyLocationType_2015B.GeneralLocation_2015B generalLocation;
    @XmlElement(name = "Geocode")
    protected OntologyLocationType_2015B.Geocode_2015B geocode;
    @XmlElement(name = "PhysicalLocation")
    protected OntologyLocationType_2015B.PhysicalLocation_2015B physicalLocation;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType_2015B ontologyExtension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType_2015B.Type_2015B }
     *     
     */
    public OntologyLocationType_2015B.Type_2015B getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType_2015B.Type_2015B }
     *     
     */
    public void setType(OntologyLocationType_2015B.Type_2015B value) {
        this.type = value;
    }

    /**
     * Gets the value of the generalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType_2015B.GeneralLocation_2015B }
     *     
     */
    public OntologyLocationType_2015B.GeneralLocation_2015B getGeneralLocation() {
        return generalLocation;
    }

    /**
     * Sets the value of the generalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType_2015B.GeneralLocation_2015B }
     *     
     */
    public void setGeneralLocation(OntologyLocationType_2015B.GeneralLocation_2015B value) {
        this.generalLocation = value;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType_2015B.Geocode_2015B }
     *     
     */
    public OntologyLocationType_2015B.Geocode_2015B getGeocode() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType_2015B.Geocode_2015B }
     *     
     */
    public void setGeocode(OntologyLocationType_2015B.Geocode_2015B value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the physicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType_2015B.PhysicalLocation_2015B }
     *     
     */
    public OntologyLocationType_2015B.PhysicalLocation_2015B getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType_2015B.PhysicalLocation_2015B }
     *     
     */
    public void setPhysicalLocation(OntologyLocationType_2015B.PhysicalLocation_2015B value) {
        this.physicalLocation = value;
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
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ontologyExtension"
    })
    public static class GeneralLocation_2015B
        extends OntologyCodeType_2015B
    {

        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType_2015B ontologyExtension;

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
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="Latitude">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *             &lt;element name="Longitude">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *           &lt;/sequence>
     *           &lt;element name="UniversalAddress">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                   &lt;attribute name="OntologyRefID">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[0-9]{1,8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="OntologyRefID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,8}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "latitude",
        "longitude",
        "universalAddress",
        "ontologyExtension"
    })
    public static class Geocode_2015B {

        @XmlElement(name = "Latitude")
        protected String latitude;
        @XmlElement(name = "Longitude")
        protected String longitude;
        @XmlElement(name = "UniversalAddress")
        protected OntologyLocationType_2015B.Geocode_2015B.UniversalAddress_2015B universalAddress;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType_2015B ontologyExtension;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the universalAddress property.
         * 
         * @return
         *     possible object is
         *     {@link OntologyLocationType_2015B.Geocode_2015B.UniversalAddress_2015B }
         *     
         */
        public OntologyLocationType_2015B.Geocode_2015B.UniversalAddress_2015B getUniversalAddress() {
            return universalAddress;
        }

        /**
         * Sets the value of the universalAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyLocationType_2015B.Geocode_2015B.UniversalAddress_2015B }
         *     
         */
        public void setUniversalAddress(OntologyLocationType_2015B.Geocode_2015B.UniversalAddress_2015B value) {
            this.universalAddress = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
        public static class UniversalAddress_2015B {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PhysicalLocation_2015B
        extends OntologyAddressType_2015B
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferLocationType">
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
        protected ListOfferLocationType_2015B value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Coverage Type (COV) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferLocationType_2015B }
         *     
         */
        public ListOfferLocationType_2015B getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferLocationType_2015B }
         *     
         */
        public void setValue(ListOfferLocationType_2015B value) {
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
