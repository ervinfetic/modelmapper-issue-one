//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains certain traveler-specific information required for quoting or booking an insurance plan.
 * 
 * <p>Java class for IndCoverageReqsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndCoverageReqsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndTripCost" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightAccidentAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoveredLuggage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LuggageItem" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
 *                             &lt;element name="ItemDeclaredValue">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LuggagePremium" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreexistingConditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreexistingCondition" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                           &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndCoverageReqsType", propOrder = {
    "indTripCost",
    "flightAccidentAmount",
    "coveredLuggage",
    "preexistingConditions"
})
public class IndCoverageReqsType_2015B {

    @XmlElement(name = "IndTripCost")
    protected IndCoverageReqsType_2015B.IndTripCost_2015B indTripCost;
    @XmlElement(name = "FlightAccidentAmount")
    protected IndCoverageReqsType_2015B.FlightAccidentAmount_2015B flightAccidentAmount;
    @XmlElement(name = "CoveredLuggage")
    protected IndCoverageReqsType_2015B.CoveredLuggage_2015B coveredLuggage;
    @XmlElement(name = "PreexistingConditions")
    protected IndCoverageReqsType_2015B.PreexistingConditions_2015B preexistingConditions;

    /**
     * Gets the value of the indTripCost property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType_2015B.IndTripCost_2015B }
     *     
     */
    public IndCoverageReqsType_2015B.IndTripCost_2015B getIndTripCost() {
        return indTripCost;
    }

    /**
     * Sets the value of the indTripCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType_2015B.IndTripCost_2015B }
     *     
     */
    public void setIndTripCost(IndCoverageReqsType_2015B.IndTripCost_2015B value) {
        this.indTripCost = value;
    }

    /**
     * Gets the value of the flightAccidentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType_2015B.FlightAccidentAmount_2015B }
     *     
     */
    public IndCoverageReqsType_2015B.FlightAccidentAmount_2015B getFlightAccidentAmount() {
        return flightAccidentAmount;
    }

    /**
     * Sets the value of the flightAccidentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType_2015B.FlightAccidentAmount_2015B }
     *     
     */
    public void setFlightAccidentAmount(IndCoverageReqsType_2015B.FlightAccidentAmount_2015B value) {
        this.flightAccidentAmount = value;
    }

    /**
     * Gets the value of the coveredLuggage property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B }
     *     
     */
    public IndCoverageReqsType_2015B.CoveredLuggage_2015B getCoveredLuggage() {
        return coveredLuggage;
    }

    /**
     * Sets the value of the coveredLuggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B }
     *     
     */
    public void setCoveredLuggage(IndCoverageReqsType_2015B.CoveredLuggage_2015B value) {
        this.coveredLuggage = value;
    }

    /**
     * Gets the value of the preexistingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType_2015B.PreexistingConditions_2015B }
     *     
     */
    public IndCoverageReqsType_2015B.PreexistingConditions_2015B getPreexistingConditions() {
        return preexistingConditions;
    }

    /**
     * Sets the value of the preexistingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType_2015B.PreexistingConditions_2015B }
     *     
     */
    public void setPreexistingConditions(IndCoverageReqsType_2015B.PreexistingConditions_2015B value) {
        this.preexistingConditions = value;
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
     *         &lt;element name="LuggageItem" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
     *                   &lt;element name="ItemDeclaredValue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LuggagePremium" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "luggageItem"
    })
    public static class CoveredLuggage_2015B {

        @XmlElement(name = "LuggageItem", required = true)
        protected List<IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B> luggageItem;

        /**
         * Gets the value of the luggageItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the luggageItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLuggageItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B }
         * 
         * 
         */
        public List<IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B> getLuggageItem() {
            if (luggageItem == null) {
                luggageItem = new ArrayList<IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B>();
            }
            return this.luggageItem;
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
         *         &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
         *         &lt;element name="ItemDeclaredValue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LuggagePremium" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "luggageDescription",
            "itemDeclaredValue",
            "luggagePremium"
        })
        public static class LuggageItem_2015B {

            @XmlElement(name = "LuggageDescription", required = true)
            protected FreeTextType_2015B luggageDescription;
            @XmlElement(name = "ItemDeclaredValue", required = true)
            protected IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.ItemDeclaredValue_2015B itemDeclaredValue;
            @XmlElement(name = "LuggagePremium")
            protected IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.LuggagePremium_2015B luggagePremium;
            @XmlAttribute(name = "LuggageType")
            protected String luggageType;

            /**
             * Gets the value of the luggageDescription property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextType_2015B }
             *     
             */
            public FreeTextType_2015B getLuggageDescription() {
                return luggageDescription;
            }

            /**
             * Sets the value of the luggageDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextType_2015B }
             *     
             */
            public void setLuggageDescription(FreeTextType_2015B value) {
                this.luggageDescription = value;
            }

            /**
             * Gets the value of the itemDeclaredValue property.
             * 
             * @return
             *     possible object is
             *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.ItemDeclaredValue_2015B }
             *     
             */
            public IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.ItemDeclaredValue_2015B getItemDeclaredValue() {
                return itemDeclaredValue;
            }

            /**
             * Sets the value of the itemDeclaredValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.ItemDeclaredValue_2015B }
             *     
             */
            public void setItemDeclaredValue(IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.ItemDeclaredValue_2015B value) {
                this.itemDeclaredValue = value;
            }

            /**
             * Gets the value of the luggagePremium property.
             * 
             * @return
             *     possible object is
             *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.LuggagePremium_2015B }
             *     
             */
            public IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.LuggagePremium_2015B getLuggagePremium() {
                return luggagePremium;
            }

            /**
             * Sets the value of the luggagePremium property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.LuggagePremium_2015B }
             *     
             */
            public void setLuggagePremium(IndCoverageReqsType_2015B.CoveredLuggage_2015B.LuggageItem_2015B.LuggagePremium_2015B value) {
                this.luggagePremium = value;
            }

            /**
             * Gets the value of the luggageType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLuggageType() {
                return luggageType;
            }

            /**
             * Sets the value of the luggageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLuggageType(String value) {
                this.luggageType = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ItemDeclaredValue_2015B {

                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the decimalPlaces property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * Sets the value of the decimalPlaces property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LuggagePremium_2015B {

                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the decimalPlaces property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * Sets the value of the decimalPlaces property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightAccidentAmount_2015B {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IndTripCost_2015B {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
     *         &lt;element name="PreexistingCondition" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *                 &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "preexistingCondition"
    })
    public static class PreexistingConditions_2015B {

        @XmlElement(name = "PreexistingCondition", required = true)
        protected List<IndCoverageReqsType_2015B.PreexistingConditions_2015B.PreexistingCondition_2015B> preexistingCondition;

        /**
         * Gets the value of the preexistingCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preexistingCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreexistingCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndCoverageReqsType_2015B.PreexistingConditions_2015B.PreexistingCondition_2015B }
         * 
         * 
         */
        public List<IndCoverageReqsType_2015B.PreexistingConditions_2015B.PreexistingCondition_2015B> getPreexistingCondition() {
            if (preexistingCondition == null) {
                preexistingCondition = new ArrayList<IndCoverageReqsType_2015B.PreexistingConditions_2015B.PreexistingCondition_2015B>();
            }
            return this.preexistingCondition;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *       &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PreexistingCondition_2015B
            extends FreeTextType_2015B
        {

            @XmlAttribute(name = "DiagnosisDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar diagnosisDate;
            @XmlAttribute(name = "LastTreatmentDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar lastTreatmentDate;

            /**
             * Gets the value of the diagnosisDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDiagnosisDate() {
                return diagnosisDate;
            }

            /**
             * Sets the value of the diagnosisDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDiagnosisDate(XMLGregorianCalendar value) {
                this.diagnosisDate = value;
            }

            /**
             * Gets the value of the lastTreatmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastTreatmentDate() {
                return lastTreatmentDate;
            }

            /**
             * Sets the value of the lastTreatmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastTreatmentDate(XMLGregorianCalendar value) {
                this.lastTreatmentDate = value;
            }

        }

    }

}