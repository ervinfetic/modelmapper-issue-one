//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ToDo - this types should be moved to OTA_CommonTypes. It's required in a common types file, since the both AuthRQ/RS use it.
 * 
 * <p>Java class for AuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CheckAuthorization" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="CreditCardAuthorization" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                   &lt;attribute name="SourceType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="NormalTransaction"/>
 *                         &lt;enumeration value="MailOrPhoneOrder"/>
 *                         &lt;enumeration value="UnattendedTerminal"/>
 *                         &lt;enumeration value="MerchantIsSuspicious"/>
 *                         &lt;enumeration value="eCommerceSecuredTransaction"/>
 *                         &lt;enumeration value="eCommerceUnsecuredTransaction"/>
 *                         &lt;enumeration value="InFlightAirPhone"/>
 *                         &lt;enumeration value="CID_NotLegible"/>
 *                         &lt;enumeration value="CID_NotOnCard"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ExtendedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="AuthorizationCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[A-Za-z0-9]{1,12}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ReversalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="CardPresentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="E_CommerceCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                   &lt;attribute name="AuthTransactionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                   &lt;attribute name="AuthVerificationValue" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="DriversLicenseAuthorization" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="IgnoreReservationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PrincipalCompanyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationType", propOrder = {
    "checkAuthorization",
    "creditCardAuthorization",
    "driversLicenseAuthorization",
    "bookingReferenceID"
})
public class AuthorizationType_2008A {

    @XmlElement(name = "CheckAuthorization")
    protected AuthorizationType_2008A.CheckAuthorization_2008A checkAuthorization;
    @XmlElement(name = "CreditCardAuthorization")
    protected AuthorizationType_2008A.CreditCardAuthorization_2008A creditCardAuthorization;
    @XmlElement(name = "DriversLicenseAuthorization")
    protected DocumentType_2008A driversLicenseAuthorization;
    @XmlElement(name = "BookingReferenceID")
    protected AuthorizationType_2008A.BookingReferenceID_2008A bookingReferenceID;
    @XmlAttribute(name = "PrincipalCompanyCode")
    protected String principalCompanyCode;

    /**
     * Gets the value of the checkAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType_2008A.CheckAuthorization_2008A }
     *     
     */
    public AuthorizationType_2008A.CheckAuthorization_2008A getCheckAuthorization() {
        return checkAuthorization;
    }

    /**
     * Sets the value of the checkAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType_2008A.CheckAuthorization_2008A }
     *     
     */
    public void setCheckAuthorization(AuthorizationType_2008A.CheckAuthorization_2008A value) {
        this.checkAuthorization = value;
    }

    /**
     * Gets the value of the creditCardAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType_2008A.CreditCardAuthorization_2008A }
     *     
     */
    public AuthorizationType_2008A.CreditCardAuthorization_2008A getCreditCardAuthorization() {
        return creditCardAuthorization;
    }

    /**
     * Sets the value of the creditCardAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType_2008A.CreditCardAuthorization_2008A }
     *     
     */
    public void setCreditCardAuthorization(AuthorizationType_2008A.CreditCardAuthorization_2008A value) {
        this.creditCardAuthorization = value;
    }

    /**
     * Gets the value of the driversLicenseAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType_2008A }
     *     
     */
    public DocumentType_2008A getDriversLicenseAuthorization() {
        return driversLicenseAuthorization;
    }

    /**
     * Sets the value of the driversLicenseAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType_2008A }
     *     
     */
    public void setDriversLicenseAuthorization(DocumentType_2008A value) {
        this.driversLicenseAuthorization = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType_2008A.BookingReferenceID_2008A }
     *     
     */
    public AuthorizationType_2008A.BookingReferenceID_2008A getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * Sets the value of the bookingReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType_2008A.BookingReferenceID_2008A }
     *     
     */
    public void setBookingReferenceID(AuthorizationType_2008A.BookingReferenceID_2008A value) {
        this.bookingReferenceID = value;
    }

    /**
     * Gets the value of the principalCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalCompanyCode() {
        return principalCompanyCode;
    }

    /**
     * Sets the value of the principalCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalCompanyCode(String value) {
        this.principalCompanyCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="IgnoreReservationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingReferenceID_2008A
        extends UniqueIDType_2008A
    {

        @XmlAttribute(name = "IgnoreReservationInd")
        protected Boolean ignoreReservationInd;

        /**
         * Gets the value of the ignoreReservationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIgnoreReservationInd() {
            return ignoreReservationInd;
        }

        /**
         * Sets the value of the ignoreReservationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIgnoreReservationInd(Boolean value) {
            this.ignoreReservationInd = value;
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
     *         &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankAcct"
    })
    public static class CheckAuthorization_2008A {

        @XmlElement(name = "BankAcct", required = true)
        protected BankAcctType_2008A bankAcct;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the bankAcct property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctType_2008A }
         *     
         */
        public BankAcctType_2008A getBankAcct() {
            return bankAcct;
        }

        /**
         * Sets the value of the bankAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctType_2008A }
         *     
         */
        public void setBankAcct(BankAcctType_2008A value) {
            this.bankAcct = value;
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
     *         &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="SourceType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="NormalTransaction"/>
     *             &lt;enumeration value="MailOrPhoneOrder"/>
     *             &lt;enumeration value="UnattendedTerminal"/>
     *             &lt;enumeration value="MerchantIsSuspicious"/>
     *             &lt;enumeration value="eCommerceSecuredTransaction"/>
     *             &lt;enumeration value="eCommerceUnsecuredTransaction"/>
     *             &lt;enumeration value="InFlightAirPhone"/>
     *             &lt;enumeration value="CID_NotLegible"/>
     *             &lt;enumeration value="CID_NotOnCard"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExtendedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AuthorizationCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[A-Za-z0-9]{1,12}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReversalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CardPresentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="E_CommerceCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="AuthTransactionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="AuthVerificationValue" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditCard"
    })
    public static class CreditCardAuthorization_2008A {

        @XmlElement(name = "CreditCard", required = true)
        protected PaymentCardType_2008A creditCard;
        @XmlAttribute(name = "SourceType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sourceType;
        @XmlAttribute(name = "ExtendedPaymentInd")
        protected Boolean extendedPaymentInd;
        @XmlAttribute(name = "AuthorizationCode")
        protected String authorizationCode;
        @XmlAttribute(name = "ReversalIndicator")
        protected Boolean reversalIndicator;
        @XmlAttribute(name = "CardPresentInd")
        protected Boolean cardPresentInd;
        @XmlAttribute(name = "E_CommerceCode")
        protected String eCommerceCode;
        @XmlAttribute(name = "AuthTransactionID")
        protected String authTransactionID;
        @XmlAttribute(name = "AuthVerificationValue")
        protected String authVerificationValue;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the creditCard property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType_2008A }
         *     
         */
        public PaymentCardType_2008A getCreditCard() {
            return creditCard;
        }

        /**
         * Sets the value of the creditCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType_2008A }
         *     
         */
        public void setCreditCard(PaymentCardType_2008A value) {
            this.creditCard = value;
        }

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the extendedPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtendedPaymentInd() {
            return extendedPaymentInd;
        }

        /**
         * Sets the value of the extendedPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtendedPaymentInd(Boolean value) {
            this.extendedPaymentInd = value;
        }

        /**
         * Gets the value of the authorizationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /**
         * Sets the value of the authorizationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorizationCode(String value) {
            this.authorizationCode = value;
        }

        /**
         * Gets the value of the reversalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReversalIndicator() {
            return reversalIndicator;
        }

        /**
         * Sets the value of the reversalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReversalIndicator(Boolean value) {
            this.reversalIndicator = value;
        }

        /**
         * Gets the value of the cardPresentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCardPresentInd() {
            return cardPresentInd;
        }

        /**
         * Sets the value of the cardPresentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCardPresentInd(Boolean value) {
            this.cardPresentInd = value;
        }

        /**
         * Gets the value of the eCommerceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getECommerceCode() {
            return eCommerceCode;
        }

        /**
         * Sets the value of the eCommerceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setECommerceCode(String value) {
            this.eCommerceCode = value;
        }

        /**
         * Gets the value of the authTransactionID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthTransactionID() {
            return authTransactionID;
        }

        /**
         * Sets the value of the authTransactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthTransactionID(String value) {
            this.authTransactionID = value;
        }

        /**
         * Gets the value of the authVerificationValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthVerificationValue() {
            return authVerificationValue;
        }

        /**
         * Sets the value of the authVerificationValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthVerificationValue(String value) {
            this.authVerificationValue = value;
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