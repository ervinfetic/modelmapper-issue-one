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
 * Review question categories
 * 
 * <p>Java class for List_QuestionCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_QuestionCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List" type="{http://www.opentravel.org/OTA/2003/05}List_QuestionCategory_Base"/>
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
@XmlType(name = "List_QuestionCategory", propOrder = {
    "list",
    "extension"
})
public class ListQuestionCategory_2015B {

    @XmlElement(name = "List", required = true)
    @XmlSchemaType(name = "string")
    protected ListQuestionCategoryBase_2015B list;
    @XmlElement(name = "Extension")
    protected CodeListSummaryExtension_2015B extension;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListQuestionCategoryBase_2015B }
     *     
     */
    public ListQuestionCategoryBase_2015B getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListQuestionCategoryBase_2015B }
     *     
     */
    public void setList(ListQuestionCategoryBase_2015B value) {
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