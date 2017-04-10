//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a seat map for a particular aircraft
 * 
 * <p>Java class for SeatMapDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinClass" maxOccurs="5">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinClassDetailType">
 *                 &lt;attribute name="StartingRow" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="EndingRow" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TravelerRefNumberRPHs" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapDetailsType", propOrder = {
    "cabinClass"
})
public class SeatMapDetailsType_2015B {

    @XmlElement(name = "CabinClass", required = true)
    protected List<SeatMapDetailsType_2015B.CabinClass_2015B> cabinClass;
    @XmlAttribute(name = "TravelerRefNumberRPHs")
    protected List<String> travelerRefNumberRPHs;

    /**
     * Gets the value of the cabinClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapDetailsType_2015B.CabinClass_2015B }
     * 
     * 
     */
    public List<SeatMapDetailsType_2015B.CabinClass_2015B> getCabinClass() {
        if (cabinClass == null) {
            cabinClass = new ArrayList<SeatMapDetailsType_2015B.CabinClass_2015B>();
        }
        return this.cabinClass;
    }

    /**
     * Gets the value of the travelerRefNumberRPHs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumberRPHs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumberRPHs() {
        if (travelerRefNumberRPHs == null) {
            travelerRefNumberRPHs = new ArrayList<String>();
        }
        return this.travelerRefNumberRPHs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinClassDetailType">
     *       &lt;attribute name="StartingRow" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="EndingRow" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinClass_2015B
        extends CabinClassDetailType_2015B
    {

        @XmlAttribute(name = "StartingRow")
        protected String startingRow;
        @XmlAttribute(name = "EndingRow")
        protected String endingRow;

        /**
         * Gets the value of the startingRow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartingRow() {
            return startingRow;
        }

        /**
         * Sets the value of the startingRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartingRow(String value) {
            this.startingRow = value;
        }

        /**
         * Gets the value of the endingRow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndingRow() {
            return endingRow;
        }

        /**
         * Sets the value of the endingRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndingRow(String value) {
            this.endingRow = value;
        }

    }

}