//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines charges that are included in this rate plan.
 * 
 * <p>Java class for RatePlanInclusionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanInclusionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanInclusionsType", propOrder = {
    "ratePlanInclusionDesciption"
})
public class RatePlanInclusionsType_2015B {

    @XmlElement(name = "RatePlanInclusionDesciption")
    protected ParagraphType_2015B ratePlanInclusionDesciption;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "ServiceFeeInclusive")
    protected Boolean serviceFeeInclusive;

    /**
     * Gets the value of the ratePlanInclusionDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType_2015B }
     *     
     */
    public ParagraphType_2015B getRatePlanInclusionDesciption() {
        return ratePlanInclusionDesciption;
    }

    /**
     * Sets the value of the ratePlanInclusionDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType_2015B }
     *     
     */
    public void setRatePlanInclusionDesciption(ParagraphType_2015B value) {
        this.ratePlanInclusionDesciption = value;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the serviceFeeInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceFeeInclusive() {
        return serviceFeeInclusive;
    }

    /**
     * Sets the value of the serviceFeeInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceFeeInclusive(Boolean value) {
        this.serviceFeeInclusive = value;
    }

}