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
import javax.xml.bind.annotation.XmlType;


/**
 * Summary version of the RoomStayType, initially created for the Travel Itinerary Message set.
 * 
 * <p>Java class for RoomStayLiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStayLiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomType" type="{http://www.opentravel.org/OTA/2003/05}RoomTypeLiteType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatePlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}RatePlanLiteType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomRate" type="{http://www.opentravel.org/OTA/2003/05}RoomRateLiteType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DepositPayment" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentLiteType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="BasicPropertyInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
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
@XmlType(name = "RoomStayLiteType", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "depositPayment",
    "basicPropertyInfo"
})
public class RoomStayLiteType_2015B {

    @XmlElement(name = "RoomTypes")
    protected RoomStayLiteType_2015B.RoomTypes_2015B roomTypes;
    @XmlElement(name = "RatePlans")
    protected RoomStayLiteType_2015B.RatePlans_2015B ratePlans;
    @XmlElement(name = "RoomRates")
    protected RoomStayLiteType_2015B.RoomRates_2015B roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType_2015B guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType_2015B timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType_2015B> guarantee;
    @XmlElement(name = "DepositPayment")
    protected List<RequiredPaymentLiteType_2015B> depositPayment;
    @XmlElement(name = "BasicPropertyInfo")
    protected RoomStayLiteType_2015B.BasicPropertyInfo_2015B basicPropertyInfo;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayLiteType_2015B.RoomTypes_2015B }
     *     
     */
    public RoomStayLiteType_2015B.RoomTypes_2015B getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayLiteType_2015B.RoomTypes_2015B }
     *     
     */
    public void setRoomTypes(RoomStayLiteType_2015B.RoomTypes_2015B value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayLiteType_2015B.RatePlans_2015B }
     *     
     */
    public RoomStayLiteType_2015B.RatePlans_2015B getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayLiteType_2015B.RatePlans_2015B }
     *     
     */
    public void setRatePlans(RoomStayLiteType_2015B.RatePlans_2015B value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayLiteType_2015B.RoomRates_2015B }
     *     
     */
    public RoomStayLiteType_2015B.RoomRates_2015B getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayLiteType_2015B.RoomRates_2015B }
     *     
     */
    public void setRoomRates(RoomStayLiteType_2015B.RoomRates_2015B value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType_2015B }
     *     
     */
    public GuestCountType_2015B getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType_2015B }
     *     
     */
    public void setGuestCounts(GuestCountType_2015B value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType_2015B }
     *     
     */
    public DateTimeSpanType_2015B getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType_2015B }
     *     
     */
    public void setTimeSpan(DateTimeSpanType_2015B value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType_2015B }
     * 
     * 
     */
    public List<GuaranteeType_2015B> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType_2015B>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the depositPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredPaymentLiteType_2015B }
     * 
     * 
     */
    public List<RequiredPaymentLiteType_2015B> getDepositPayment() {
        if (depositPayment == null) {
            depositPayment = new ArrayList<RequiredPaymentLiteType_2015B>();
        }
        return this.depositPayment;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayLiteType_2015B.BasicPropertyInfo_2015B }
     *     
     */
    public RoomStayLiteType_2015B.BasicPropertyInfo_2015B getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayLiteType_2015B.BasicPropertyInfo_2015B }
     *     
     */
    public void setBasicPropertyInfo(RoomStayLiteType_2015B.BasicPropertyInfo_2015B value) {
        this.basicPropertyInfo = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BasicPropertyInfo_2015B {

        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "AreaID")
        protected String areaID;
        @XmlAttribute(name = "TTIcode")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger ttIcode;

        /**
         * Gets the value of the chainCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Sets the value of the chainCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Gets the value of the brandCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * Sets the value of the brandCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * Gets the value of the hotelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Sets the value of the hotelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Gets the value of the hotelCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Sets the value of the hotelCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Gets the value of the hotelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Sets the value of the hotelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * Gets the value of the hotelCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * Sets the value of the hotelCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * Gets the value of the chainName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * Sets the value of the chainName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * Gets the value of the brandName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * Sets the value of the brandName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * Gets the value of the areaID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * Sets the value of the areaID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
        }

        /**
         * Gets the value of the ttIcode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTTIcode() {
            return ttIcode;
        }

        /**
         * Sets the value of the ttIcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTTIcode(BigInteger value) {
            this.ttIcode = value;
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
     *         &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}RatePlanLiteType" maxOccurs="9"/>
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
        "ratePlan"
    })
    public static class RatePlans_2015B {

        @XmlElement(name = "RatePlan", required = true)
        protected List<RatePlanLiteType_2015B> ratePlan;

        /**
         * Gets the value of the ratePlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanLiteType_2015B }
         * 
         * 
         */
        public List<RatePlanLiteType_2015B> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new ArrayList<RatePlanLiteType_2015B>();
            }
            return this.ratePlan;
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
     *         &lt;element name="RoomRate" type="{http://www.opentravel.org/OTA/2003/05}RoomRateLiteType" maxOccurs="9"/>
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
        "roomRate"
    })
    public static class RoomRates_2015B {

        @XmlElement(name = "RoomRate", required = true)
        protected List<RoomRateLiteType_2015B> roomRate;

        /**
         * Gets the value of the roomRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomRateLiteType_2015B }
         * 
         * 
         */
        public List<RoomRateLiteType_2015B> getRoomRate() {
            if (roomRate == null) {
                roomRate = new ArrayList<RoomRateLiteType_2015B>();
            }
            return this.roomRate;
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
     *         &lt;element name="RoomType" type="{http://www.opentravel.org/OTA/2003/05}RoomTypeLiteType" maxOccurs="9"/>
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
        "roomType"
    })
    public static class RoomTypes_2015B {

        @XmlElement(name = "RoomType", required = true)
        protected List<RoomTypeLiteType_2015B> roomType;

        /**
         * Gets the value of the roomType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomTypeLiteType_2015B }
         * 
         * 
         */
        public List<RoomTypeLiteType_2015B> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<RoomTypeLiteType_2015B>();
            }
            return this.roomType;
        }

    }

}