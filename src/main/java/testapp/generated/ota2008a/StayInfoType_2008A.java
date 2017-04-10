//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The StayInfo class contains the guest revenue and stay data to be sent to the central server.
 * 
 * <p>Java class for StayInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPointsAccruals" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPointsAccrualsType" minOccurs="0"/>
 *         &lt;element name="RevenueCategories" type="{http://www.opentravel.org/OTA/2003/05}RevenueCategoriesType" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RoomStayRPH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayInfoType", propOrder = {
    "loyaltyPointsAccruals",
    "revenueCategories",
    "reservationID",
    "hotelReservation"
})
public class StayInfoType_2008A {

    @XmlElement(name = "LoyaltyPointsAccruals")
    protected LoyaltyPointsAccrualsType_2008A loyaltyPointsAccruals;
    @XmlElement(name = "RevenueCategories")
    protected RevenueCategoriesType_2008A revenueCategories;
    @XmlElement(name = "ReservationID")
    protected UniqueIDType_2008A reservationID;
    @XmlElement(name = "HotelReservation")
    protected HotelReservationType_2008A hotelReservation;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "RoomStayRPH")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger roomStayRPH;

    /**
     * Gets the value of the loyaltyPointsAccruals property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPointsAccrualsType_2008A }
     *     
     */
    public LoyaltyPointsAccrualsType_2008A getLoyaltyPointsAccruals() {
        return loyaltyPointsAccruals;
    }

    /**
     * Sets the value of the loyaltyPointsAccruals property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPointsAccrualsType_2008A }
     *     
     */
    public void setLoyaltyPointsAccruals(LoyaltyPointsAccrualsType_2008A value) {
        this.loyaltyPointsAccruals = value;
    }

    /**
     * Gets the value of the revenueCategories property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueCategoriesType_2008A }
     *     
     */
    public RevenueCategoriesType_2008A getRevenueCategories() {
        return revenueCategories;
    }

    /**
     * Sets the value of the revenueCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueCategoriesType_2008A }
     *     
     */
    public void setRevenueCategories(RevenueCategoriesType_2008A value) {
        this.revenueCategories = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType_2008A }
     *     
     */
    public UniqueIDType_2008A getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType_2008A }
     *     
     */
    public void setReservationID(UniqueIDType_2008A value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the hotelReservation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType_2008A }
     *     
     */
    public HotelReservationType_2008A getHotelReservation() {
        return hotelReservation;
    }

    /**
     * Sets the value of the hotelReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType_2008A }
     *     
     */
    public void setHotelReservation(HotelReservationType_2008A value) {
        this.hotelReservation = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the roomStayRPH property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomStayRPH() {
        return roomStayRPH;
    }

    /**
     * Sets the value of the roomStayRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomStayRPH(BigInteger value) {
        this.roomStayRPH = value;
    }

}