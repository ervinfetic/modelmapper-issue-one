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
 * <p>Java class for AgeQualifyingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeQualifyingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Additional occupant with adult"/>
 *     &lt;enumeration value="Additional occupant without adult"/>
 *     &lt;enumeration value="Adult"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Free adult"/>
 *     &lt;enumeration value="Free child"/>
 *     &lt;enumeration value="Infant"/>
 *     &lt;enumeration value="Over 21"/>
 *     &lt;enumeration value="Over 65"/>
 *     &lt;enumeration value="Senior "/>
 *     &lt;enumeration value="Teenager"/>
 *     &lt;enumeration value="Under 10"/>
 *     &lt;enumeration value="Under 12"/>
 *     &lt;enumeration value="Under 17"/>
 *     &lt;enumeration value="Under 2"/>
 *     &lt;enumeration value="Under 21"/>
 *     &lt;enumeration value="Young driver"/>
 *     &lt;enumeration value="Younger driver"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeQualifyingEnum")
@XmlEnum
public enum AgeQualifyingEnum_2015B {

    @XmlEnumValue("Additional occupant with adult")
    ADDITIONAL_OCCUPANT_WITH_ADULT("Additional occupant with adult"),
    @XmlEnumValue("Additional occupant without adult")
    ADDITIONAL_OCCUPANT_WITHOUT_ADULT("Additional occupant without adult"),
    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Free adult")
    FREE_ADULT("Free adult"),
    @XmlEnumValue("Free child")
    FREE_CHILD("Free child"),
    @XmlEnumValue("Infant")
    INFANT("Infant"),
    @XmlEnumValue("Over 21")
    OVER_21("Over 21"),
    @XmlEnumValue("Over 65")
    OVER_65("Over 65"),
    @XmlEnumValue("Senior ")
    SENIOR("Senior "),
    @XmlEnumValue("Teenager")
    TEENAGER("Teenager"),
    @XmlEnumValue("Under 10")
    UNDER_10("Under 10"),
    @XmlEnumValue("Under 12")
    UNDER_12("Under 12"),
    @XmlEnumValue("Under 17")
    UNDER_17("Under 17"),
    @XmlEnumValue("Under 2")
    UNDER_2("Under 2"),
    @XmlEnumValue("Under 21")
    UNDER_21("Under 21"),
    @XmlEnumValue("Young driver")
    YOUNG_DRIVER("Young driver"),
    @XmlEnumValue("Younger driver")
    YOUNGER_DRIVER("Younger driver"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    AgeQualifyingEnum_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeQualifyingEnum_2015B fromValue(String v) {
        for (AgeQualifyingEnum_2015B c: AgeQualifyingEnum_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}