//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_OfferMeasurementSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferMeasurementSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Imperial"/>
 *     &lt;enumeration value="Metric"/>
 *     &lt;enumeration value="US_Customary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferMeasurementSystem")
@XmlEnum
public enum ListOfferMeasurementSystem_2015B {

    @XmlEnumValue("Imperial")
    IMPERIAL("Imperial"),
    @XmlEnumValue("Metric")
    METRIC("Metric"),
    @XmlEnumValue("US_Customary")
    US_CUSTOMARY("US_Customary");
    private final String value;

    ListOfferMeasurementSystem_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferMeasurementSystem_2015B fromValue(String v) {
        for (ListOfferMeasurementSystem_2015B c: ListOfferMeasurementSystem_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
