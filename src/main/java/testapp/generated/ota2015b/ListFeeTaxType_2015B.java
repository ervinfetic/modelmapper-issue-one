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


/**
 * Use: This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" enumeration in combination with the Code Extension fields to exchange a value that is not in the list and is known to your trading partners.
 * 
 * <p>Java class for List_FeeTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_FeeTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List" type="{http://www.opentravel.org/OTA/2003/05}List_FeeTaxType_Base"/>
 *         &lt;element name="Extension" type="{http://www.opentravel.org/OTA/2003/05}CodeListSummaryExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_FeeTaxType", propOrder = {
    "list",
    "extension"
})
public class ListFeeTaxType_2015B {

    @XmlElement(name = "List", required = true)
    @XmlSchemaType(name = "string")
    protected ListFeeTaxTypeBase_2015B list;
    @XmlElement(name = "Extension")
    protected CodeListSummaryExtension_2015B extension;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListFeeTaxTypeBase_2015B }
     *     
     */
    public ListFeeTaxTypeBase_2015B getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFeeTaxTypeBase_2015B }
     *     
     */
    public void setList(ListFeeTaxTypeBase_2015B value) {
        this.list = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListSummaryExtension_2015B }
     *     
     */
    public CodeListSummaryExtension_2015B getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListSummaryExtension_2015B }
     *     
     */
    public void setExtension(CodeListSummaryExtension_2015B value) {
        this.extension = value;
    }

}
