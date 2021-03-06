//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

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


/**
 * This complex type identifies payment cards that are acceptable for a specific form of payment, along with the ability to provide free text information regarding payment cards.
 * 
 * <p>Java class for AcceptablePaymentCardsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptablePaymentCardsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptablePaymentCards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptablePaymentCard" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptablePaymentCardsInfoType", propOrder = {
    "acceptablePaymentCards",
    "info"
})
public class AcceptablePaymentCardsInfoType_2008A {

    @XmlElement(name = "AcceptablePaymentCards")
    protected AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A acceptablePaymentCards;
    @XmlElement(name = "Info")
    protected FormattedTextType_2008A info;

    /**
     * Gets the value of the acceptablePaymentCards property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A }
     *     
     */
    public AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A getAcceptablePaymentCards() {
        return acceptablePaymentCards;
    }

    /**
     * Sets the value of the acceptablePaymentCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A }
     *     
     */
    public void setAcceptablePaymentCards(AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A value) {
        this.acceptablePaymentCards = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType_2008A }
     *     
     */
    public FormattedTextType_2008A getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType_2008A }
     *     
     */
    public void setInfo(FormattedTextType_2008A value) {
        this.info = value;
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
     *         &lt;element name="AcceptablePaymentCard" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
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
        "acceptablePaymentCard"
    })
    public static class AcceptablePaymentCards_2008A {

        @XmlElement(name = "AcceptablePaymentCard", required = true)
        protected List<AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A.AcceptablePaymentCard_2008A> acceptablePaymentCard;

        /**
         * Gets the value of the acceptablePaymentCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acceptablePaymentCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcceptablePaymentCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A.AcceptablePaymentCard_2008A }
         * 
         * 
         */
        public List<AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A.AcceptablePaymentCard_2008A> getAcceptablePaymentCard() {
            if (acceptablePaymentCard == null) {
                acceptablePaymentCard = new ArrayList<AcceptablePaymentCardsInfoType_2008A.AcceptablePaymentCards_2008A.AcceptablePaymentCard_2008A>();
            }
            return this.acceptablePaymentCard;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AcceptablePaymentCard_2008A {

            @XmlAttribute(name = "CardType")
            protected String cardType;
            @XmlAttribute(name = "CardName")
            protected String cardName;
            @XmlAttribute(name = "UsagePercentage")
            protected BigDecimal usagePercentage;
            @XmlAttribute(name = "UsageAmount")
            protected BigDecimal usageAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the cardType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardType() {
                return cardType;
            }

            /**
             * Sets the value of the cardType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardType(String value) {
                this.cardType = value;
            }

            /**
             * Gets the value of the cardName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardName() {
                return cardName;
            }

            /**
             * Sets the value of the cardName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardName(String value) {
                this.cardName = value;
            }

            /**
             * Gets the value of the usagePercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUsagePercentage() {
                return usagePercentage;
            }

            /**
             * Sets the value of the usagePercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUsagePercentage(BigDecimal value) {
                this.usagePercentage = value;
            }

            /**
             * Gets the value of the usageAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUsageAmount() {
                return usageAmount;
            }

            /**
             * Sets the value of the usageAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUsageAmount(BigDecimal value) {
                this.usageAmount = value;
            }

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

        }

    }

}
