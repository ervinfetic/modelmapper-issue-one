//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleSegmentAdditionalInfoType complex type identifies the data that descibes the supplemental information assocated with a vehicle segment.  Such information may be associated with the reservation of a vehicle, but is not normally included.
 * 
 * <p>Java class for VehicleSegmentAdditionalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSegmentAdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RentalPaymentAmount" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PricedCoverages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricedOffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="VendorMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VendorMessage" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WrittenConfInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentAdditionalInfoType", propOrder = {
    "paymentRules",
    "rentalPaymentAmount",
    "pricedCoverages",
    "pricedOffLocService",
    "vendorMessages",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
public class VehicleSegmentAdditionalInfoType_2008A {

    @XmlElement(name = "PaymentRules")
    protected VehicleSegmentAdditionalInfoType_2008A.PaymentRules_2008A paymentRules;
    @XmlElement(name = "RentalPaymentAmount")
    protected List<PaymentDetailType_2008A> rentalPaymentAmount;
    @XmlElement(name = "PricedCoverages")
    protected VehicleSegmentAdditionalInfoType_2008A.PricedCoverages_2008A pricedCoverages;
    @XmlElement(name = "PricedOffLocService")
    protected List<OffLocationServicePricedType_2008A> pricedOffLocService;
    @XmlElement(name = "VendorMessages")
    protected VehicleSegmentAdditionalInfoType_2008A.VendorMessages_2008A vendorMessages;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType_2008A> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType_2008A tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2008A tpaExtensions;
    @XmlAttribute(name = "WrittenConfInd")
    protected Boolean writtenConfInd;

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.PaymentRules_2008A }
     *     
     */
    public VehicleSegmentAdditionalInfoType_2008A.PaymentRules_2008A getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.PaymentRules_2008A }
     *     
     */
    public void setPaymentRules(VehicleSegmentAdditionalInfoType_2008A.PaymentRules_2008A value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the rentalPaymentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPaymentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPaymentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType_2008A }
     * 
     * 
     */
    public List<PaymentDetailType_2008A> getRentalPaymentAmount() {
        if (rentalPaymentAmount == null) {
            rentalPaymentAmount = new ArrayList<PaymentDetailType_2008A>();
        }
        return this.rentalPaymentAmount;
    }

    /**
     * Gets the value of the pricedCoverages property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.PricedCoverages_2008A }
     *     
     */
    public VehicleSegmentAdditionalInfoType_2008A.PricedCoverages_2008A getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * Sets the value of the pricedCoverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.PricedCoverages_2008A }
     *     
     */
    public void setPricedCoverages(VehicleSegmentAdditionalInfoType_2008A.PricedCoverages_2008A value) {
        this.pricedCoverages = value;
    }

    /**
     * Gets the value of the pricedOffLocService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedOffLocService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedOffLocService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType_2008A }
     * 
     * 
     */
    public List<OffLocationServicePricedType_2008A> getPricedOffLocService() {
        if (pricedOffLocService == null) {
            pricedOffLocService = new ArrayList<OffLocationServicePricedType_2008A>();
        }
        return this.pricedOffLocService;
    }

    /**
     * Gets the value of the vendorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.VendorMessages_2008A }
     *     
     */
    public VehicleSegmentAdditionalInfoType_2008A.VendorMessages_2008A getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Sets the value of the vendorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType_2008A.VendorMessages_2008A }
     *     
     */
    public void setVendorMessages(VehicleSegmentAdditionalInfoType_2008A.VendorMessages_2008A value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType_2008A }
     * 
     * 
     */
    public List<VehicleLocationDetailsType_2008A> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<VehicleLocationDetailsType_2008A>();
        }
        return this.locationDetails;
    }

    /**
     * Gets the value of the tourInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTourInfoType_2008A }
     *     
     */
    public VehicleTourInfoType_2008A getTourInfo() {
        return tourInfo;
    }

    /**
     * Sets the value of the tourInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTourInfoType_2008A }
     *     
     */
    public void setTourInfo(VehicleTourInfoType_2008A value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType_2008A }
     *     
     */
    public TPAExtensionsType_2008A getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType_2008A }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType_2008A value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the writtenConfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrittenConfInd() {
        return writtenConfInd;
    }

    /**
     * Sets the value of the writtenConfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrittenConfInd(Boolean value) {
        this.writtenConfInd = value;
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
     *         &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
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
        "paymentRule"
    })
    public static class PaymentRules_2008A {

        @XmlElement(name = "PaymentRule", required = true)
        protected List<MonetaryRuleType_2008A> paymentRule;

        /**
         * Gets the value of the paymentRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryRuleType_2008A }
         * 
         * 
         */
        public List<MonetaryRuleType_2008A> getPaymentRule() {
            if (paymentRule == null) {
                paymentRule = new ArrayList<MonetaryRuleType_2008A>();
            }
            return this.paymentRule;
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
     *         &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/>
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
        "pricedCoverage"
    })
    public static class PricedCoverages_2008A {

        @XmlElement(name = "PricedCoverage", required = true)
        protected List<CoveragePricedType_2008A> pricedCoverage;

        /**
         * Gets the value of the pricedCoverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedCoverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoveragePricedType_2008A }
         * 
         * 
         */
        public List<CoveragePricedType_2008A> getPricedCoverage() {
            if (pricedCoverage == null) {
                pricedCoverage = new ArrayList<CoveragePricedType_2008A>();
            }
            return this.pricedCoverage;
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
     *         &lt;element name="VendorMessage" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="99"/>
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
        "vendorMessage"
    })
    public static class VendorMessages_2008A {

        @XmlElement(name = "VendorMessage", required = true)
        protected List<FormattedTextType_2008A> vendorMessage;

        /**
         * Gets the value of the vendorMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormattedTextType_2008A }
         * 
         * 
         */
        public List<FormattedTextType_2008A> getVendorMessage() {
            if (vendorMessage == null) {
                vendorMessage = new ArrayList<FormattedTextType_2008A>();
            }
            return this.vendorMessage;
        }

    }

}