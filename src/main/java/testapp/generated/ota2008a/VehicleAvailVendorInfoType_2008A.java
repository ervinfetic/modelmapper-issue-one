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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleAvailVendorInfoType complex type identifies the data that describes supplemental information relevant to a vendor and made available at the time that availability and rates are checked.
 * 
 * <p>Java class for VehicleAvailVendorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailVendorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
 *         &lt;element name="OffLocServices" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType" minOccurs="0"/>
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailVendorInfoType", propOrder = {
    "vendorMessages",
    "offLocServices",
    "paymentRules",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
public class VehicleAvailVendorInfoType_2008A {

    @XmlElement(name = "VendorMessages")
    protected VendorMessagesType_2008A vendorMessages;
    @XmlElement(name = "OffLocServices")
    protected List<OffLocationServicePricedType_2008A> offLocServices;
    @XmlElement(name = "PaymentRules")
    protected PaymentRulesType_2008A paymentRules;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType_2008A> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType_2008A tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2008A tpaExtensions;

    /**
     * Gets the value of the vendorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link VendorMessagesType_2008A }
     *     
     */
    public VendorMessagesType_2008A getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Sets the value of the vendorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorMessagesType_2008A }
     *     
     */
    public void setVendorMessages(VendorMessagesType_2008A value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the offLocServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType_2008A }
     * 
     * 
     */
    public List<OffLocationServicePricedType_2008A> getOffLocServices() {
        if (offLocServices == null) {
            offLocServices = new ArrayList<OffLocationServicePricedType_2008A>();
        }
        return this.offLocServices;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesType_2008A }
     *     
     */
    public PaymentRulesType_2008A getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesType_2008A }
     *     
     */
    public void setPaymentRules(PaymentRulesType_2008A value) {
        this.paymentRules = value;
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

}
