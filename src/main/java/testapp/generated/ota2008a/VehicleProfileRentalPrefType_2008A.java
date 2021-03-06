//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Vehicle rental preferences can be specified for customers or companies to indicate their preferences for types of vehicles to be rented in specific travel situations. Companies may wish to specify certain class or types of cars that their employees are allowed to rent, or indicate special business needs for trucks for hauling goods, etc. Personal travelers may wish to indicate preferences for types of vehicles such as vans or SUVs for family vacations, or smaller, more sporty models when travelling alone. A customer may prefer to have a convertible or sun roof in a warm destination, but request a ski rack when vacationing in the wintertime.   The VehicleProfileRentalPrefType complex type has elements for specific features on rental cars including vehicle type (major category such as car, truck, SUV) and vehicle class (more precise kind of vehicle), air conditioning, transmission, and special equipment. In addition, the specification captures preferences for vendors and loyalty programs, insurance coverage, forms of payment for rental cars, and other special requirements. 
 * 
 * <p>Java class for VehicleProfileRentalPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleProfileRentalPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoveragePref" maxOccurs="30" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleCoveragePrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleSpecialReqPrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VehTypePref" type="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPref" maxOccurs="15" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleProfileRentalPrefType", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "coveragePref",
    "specialReqPref",
    "vehTypePref",
    "specialEquipPref"
})
public class VehicleProfileRentalPrefType_2008A {

    @XmlElement(name = "LoyaltyPref")
    protected List<VehicleProfileRentalPrefType_2008A.LoyaltyPref_2008A> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType_2008A> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<VehicleProfileRentalPrefType_2008A.PaymentFormPref_2008A> paymentFormPref;
    @XmlElement(name = "CoveragePref")
    protected List<VehicleProfileRentalPrefType_2008A.CoveragePref_2008A> coveragePref;
    @XmlElement(name = "SpecialReqPref")
    protected List<VehicleSpecialReqPrefType_2008A> specialReqPref;
    @XmlElement(name = "VehTypePref")
    protected List<VehiclePrefType_2008A> vehTypePref;
    @XmlElement(name = "SpecialEquipPref")
    protected List<VehicleProfileRentalPrefType_2008A.SpecialEquipPref_2008A> specialEquipPref;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType_2008A preferLevel;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType_2008A.LoyaltyPref_2008A }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType_2008A.LoyaltyPref_2008A> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<VehicleProfileRentalPrefType_2008A.LoyaltyPref_2008A>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType_2008A }
     * 
     * 
     */
    public List<CompanyNamePrefType_2008A> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType_2008A>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType_2008A.PaymentFormPref_2008A }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType_2008A.PaymentFormPref_2008A> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<VehicleProfileRentalPrefType_2008A.PaymentFormPref_2008A>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType_2008A.CoveragePref_2008A }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType_2008A.CoveragePref_2008A> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<VehicleProfileRentalPrefType_2008A.CoveragePref_2008A>();
        }
        return this.coveragePref;
    }

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialReqPrefType_2008A }
     * 
     * 
     */
    public List<VehicleSpecialReqPrefType_2008A> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<VehicleSpecialReqPrefType_2008A>();
        }
        return this.specialReqPref;
    }

    /**
     * Gets the value of the vehTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePrefType_2008A }
     * 
     * 
     */
    public List<VehiclePrefType_2008A> getVehTypePref() {
        if (vehTypePref == null) {
            vehTypePref = new ArrayList<VehiclePrefType_2008A>();
        }
        return this.vehTypePref;
    }

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType_2008A.SpecialEquipPref_2008A }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType_2008A.SpecialEquipPref_2008A> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<VehicleProfileRentalPrefType_2008A.SpecialEquipPref_2008A>();
        }
        return this.specialEquipPref;
    }

    /**
     * Gets the value of the gasPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGasPrePay() {
        if (gasPrePay == null) {
            return false;
        } else {
            return gasPrePay;
        }
    }

    /**
     * Sets the value of the gasPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public PreferLevelType_2008A getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType_2008A.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public void setPreferLevel(PreferLevelType_2008A value) {
        this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleCoveragePrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoveragePref_2008A {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2008A preferLevel;
        @XmlAttribute(name = "CoverageType", required = true)
        protected String coverageType;
        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public PreferLevelType_2008A getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType_2008A.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public void setPreferLevel(PreferLevelType_2008A value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the coverageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoverageType() {
            return coverageType;
        }

        /**
         * Sets the value of the coverageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoverageType(String value) {
            this.coverageType = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyPref_2008A {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2008A preferLevel;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public PreferLevelType_2008A getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType_2008A.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public void setPreferLevel(PreferLevelType_2008A value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentFormPref_2008A {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2008A preferLevel;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public PreferLevelType_2008A getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType_2008A.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public void setPreferLevel(PreferLevelType_2008A value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialEquipPref_2008A {

        @XmlAttribute(name = "Action")
        protected ActionType_2008A action;
        @XmlAttribute(name = "EquipType", required = true)
        protected String equipType;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2008A preferLevel;

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType_2008A }
         *     
         */
        public ActionType_2008A getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType_2008A }
         *     
         */
        public void setAction(ActionType_2008A value) {
            this.action = value;
        }

        /**
         * Gets the value of the equipType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipType() {
            return equipType;
        }

        /**
         * Sets the value of the equipType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipType(String value) {
            this.equipType = value;
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
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public PreferLevelType_2008A getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType_2008A.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType_2008A }
         *     
         */
        public void setPreferLevel(PreferLevelType_2008A value) {
            this.preferLevel = value;
        }

    }

}
