//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines train segment summary information, including departure and arrival stations, departure and arrival dates/times, and train identification information.
 * 
 * <p>Java class for TrainSegmentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainSegmentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType"/>
 *         &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType"/>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSegmentSummaryType", propOrder = {
    "departureStation",
    "arrivalStation",
    "departureDateTime",
    "arrivalDateTime",
    "trainIdentification"
})
public class TrainSegmentSummaryType_2015B {

    @XmlElement(name = "DepartureStation", required = true)
    protected StationDetailsType_2015B departureStation;
    @XmlElement(name = "ArrivalStation", required = true)
    protected StationDetailsType_2015B arrivalStation;
    @XmlElement(name = "DepartureDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "TrainIdentification", required = true)
    protected TrainIdentificationType_2015B trainIdentification;

    /**
     * Gets the value of the departureStation property.
     * 
     * @return
     *     possible object is
     *     {@link StationDetailsType_2015B }
     *     
     */
    public StationDetailsType_2015B getDepartureStation() {
        return departureStation;
    }

    /**
     * Sets the value of the departureStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationDetailsType_2015B }
     *     
     */
    public void setDepartureStation(StationDetailsType_2015B value) {
        this.departureStation = value;
    }

    /**
     * Gets the value of the arrivalStation property.
     * 
     * @return
     *     possible object is
     *     {@link StationDetailsType_2015B }
     *     
     */
    public StationDetailsType_2015B getArrivalStation() {
        return arrivalStation;
    }

    /**
     * Sets the value of the arrivalStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationDetailsType_2015B }
     *     
     */
    public void setArrivalStation(StationDetailsType_2015B value) {
        this.arrivalStation = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the trainIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TrainIdentificationType_2015B }
     *     
     */
    public TrainIdentificationType_2015B getTrainIdentification() {
        return trainIdentification;
    }

    /**
     * Sets the value of the trainIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIdentificationType_2015B }
     *     
     */
    public void setTrainIdentification(TrainIdentificationType_2015B value) {
        this.trainIdentification = value;
    }

}
