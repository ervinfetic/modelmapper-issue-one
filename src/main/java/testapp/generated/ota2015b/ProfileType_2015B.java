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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Root element for profile content.
 * 
 * <p>Java class for ProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accesses" type="{http://www.opentravel.org/OTA/2003/05}AccessesType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerType" minOccurs="0"/>
 *         &lt;element name="UserID" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="PinNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrefCollections" type="{http://www.opentravel.org/OTA/2003/05}PreferencesType" minOccurs="0"/>
 *         &lt;element name="CompanyInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyInfoType" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://www.opentravel.org/OTA/2003/05}AffiliationsType" minOccurs="0"/>
 *         &lt;element name="Agreements" type="{http://www.opentravel.org/OTA/2003/05}AgreementsType" minOccurs="0"/>
 *         &lt;element name="Comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;sequence>
 *                             &lt;element name="AuthorizedViewer" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                           &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShareAllGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="StatusCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileType", propOrder = {
    "accesses",
    "customer",
    "userID",
    "prefCollections",
    "companyInfo",
    "affiliations",
    "agreements",
    "comments",
    "tpaExtensions"
})
public class ProfileType_2015B {

    @XmlElement(name = "Accesses")
    protected AccessesType_2015B accesses;
    @XmlElement(name = "Customer")
    protected CustomerType_2015B customer;
    @XmlElement(name = "UserID")
    protected List<ProfileType_2015B.UserID_2015B> userID;
    @XmlElement(name = "PrefCollections")
    protected PreferencesType_2015B prefCollections;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfoType_2015B companyInfo;
    @XmlElement(name = "Affiliations")
    protected AffiliationsType_2015B affiliations;
    @XmlElement(name = "Agreements")
    protected AgreementsType_2015B agreements;
    @XmlElement(name = "Comments")
    protected ProfileType_2015B.Comments_2015B comments;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "StatusCode")
    protected List<String> statusCode;
    @XmlAttribute(name = "ShareAllSynchInd")
    protected YesNoType_2015B shareAllSynchInd;
    @XmlAttribute(name = "ShareAllMarketInd")
    protected YesNoType_2015B shareAllMarketInd;
    @XmlAttribute(name = "ShareAllOptOutInd")
    protected YesNoType_2015B shareAllOptOutInd;
    @XmlAttribute(name = "OptInStatus")
    protected String optInStatus;
    @XmlAttribute(name = "OptInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar optInDate;
    @XmlAttribute(name = "OptOutDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar optOutDate;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;

    /**
     * Gets the value of the accesses property.
     * 
     * @return
     *     possible object is
     *     {@link AccessesType_2015B }
     *     
     */
    public AccessesType_2015B getAccesses() {
        return accesses;
    }

    /**
     * Sets the value of the accesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesType_2015B }
     *     
     */
    public void setAccesses(AccessesType_2015B value) {
        this.accesses = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType_2015B }
     *     
     */
    public CustomerType_2015B getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType_2015B }
     *     
     */
    public void setCustomer(CustomerType_2015B value) {
        this.customer = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileType_2015B.UserID_2015B }
     * 
     * 
     */
    public List<ProfileType_2015B.UserID_2015B> getUserID() {
        if (userID == null) {
            userID = new ArrayList<ProfileType_2015B.UserID_2015B>();
        }
        return this.userID;
    }

    /**
     * Gets the value of the prefCollections property.
     * 
     * @return
     *     possible object is
     *     {@link PreferencesType_2015B }
     *     
     */
    public PreferencesType_2015B getPrefCollections() {
        return prefCollections;
    }

    /**
     * Sets the value of the prefCollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferencesType_2015B }
     *     
     */
    public void setPrefCollections(PreferencesType_2015B value) {
        this.prefCollections = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoType_2015B }
     *     
     */
    public CompanyInfoType_2015B getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoType_2015B }
     *     
     */
    public void setCompanyInfo(CompanyInfoType_2015B value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationsType_2015B }
     *     
     */
    public AffiliationsType_2015B getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationsType_2015B }
     *     
     */
    public void setAffiliations(AffiliationsType_2015B value) {
        this.affiliations = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementsType_2015B }
     *     
     */
    public AgreementsType_2015B getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementsType_2015B }
     *     
     */
    public void setAgreements(AgreementsType_2015B value) {
        this.agreements = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType_2015B.Comments_2015B }
     *     
     */
    public ProfileType_2015B.Comments_2015B getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType_2015B.Comments_2015B }
     *     
     */
    public void setComments(ProfileType_2015B.Comments_2015B value) {
        this.comments = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public TPAExtensionsType_2015B getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType_2015B value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusCode() {
        if (statusCode == null) {
            statusCode = new ArrayList<String>();
        }
        return this.statusCode;
    }

    /**
     * Gets the value of the shareAllSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType_2015B }
     *     
     */
    public YesNoType_2015B getShareAllSynchInd() {
        return shareAllSynchInd;
    }

    /**
     * Sets the value of the shareAllSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType_2015B }
     *     
     */
    public void setShareAllSynchInd(YesNoType_2015B value) {
        this.shareAllSynchInd = value;
    }

    /**
     * Gets the value of the shareAllMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType_2015B }
     *     
     */
    public YesNoType_2015B getShareAllMarketInd() {
        return shareAllMarketInd;
    }

    /**
     * Sets the value of the shareAllMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType_2015B }
     *     
     */
    public void setShareAllMarketInd(YesNoType_2015B value) {
        this.shareAllMarketInd = value;
    }

    /**
     * Gets the value of the shareAllOptOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType_2015B }
     *     
     */
    public YesNoType_2015B getShareAllOptOutInd() {
        return shareAllOptOutInd;
    }

    /**
     * Sets the value of the shareAllOptOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType_2015B }
     *     
     */
    public void setShareAllOptOutInd(YesNoType_2015B value) {
        this.shareAllOptOutInd = value;
    }

    /**
     * Gets the value of the optInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInStatus() {
        return optInStatus;
    }

    /**
     * Sets the value of the optInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInStatus(String value) {
        this.optInStatus = value;
    }

    /**
     * Gets the value of the optInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOptInDate() {
        return optInDate;
    }

    /**
     * Sets the value of the optInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOptInDate(XMLGregorianCalendar value) {
        this.optInDate = value;
    }

    /**
     * Gets the value of the optOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOptOutDate() {
        return optOutDate;
    }

    /**
     * Sets the value of the optOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOptOutDate(XMLGregorianCalendar value) {
        this.optOutDate = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
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
     *         &lt;element name="Comment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;sequence>
     *                   &lt;element name="AuthorizedViewer" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *                 &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class Comments_2015B {

        @XmlElement(name = "Comment", required = true)
        protected List<ProfileType_2015B.Comments_2015B.Comment_2015B> comment;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProfileType_2015B.Comments_2015B.Comment_2015B }
         * 
         * 
         */
        public List<ProfileType_2015B.Comments_2015B.Comment_2015B> getComment() {
            if (comment == null) {
                comment = new ArrayList<ProfileType_2015B.Comments_2015B.Comment_2015B>();
            }
            return this.comment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;sequence>
         *         &lt;element name="AuthorizedViewer" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
         *       &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "authorizedViewer"
        })
        public static class Comment_2015B
            extends ParagraphType_2015B
        {

            @XmlElement(name = "AuthorizedViewer")
            protected List<ProfileType_2015B.Comments_2015B.Comment_2015B.AuthorizedViewer_2015B> authorizedViewer;
            @XmlAttribute(name = "CommentOriginatorCode")
            protected String commentOriginatorCode;
            @XmlAttribute(name = "GuestViewable")
            protected Boolean guestViewable;
            @XmlAttribute(name = "Category")
            protected String category;
            @XmlAttribute(name = "AirlineVendorPrefRPH")
            protected String airlineVendorPrefRPH;
            @XmlAttribute(name = "TransferAction")
            protected TransferActionType_2015B transferAction;
            @XmlAttribute(name = "ActionDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar actionDate;

            /**
             * Gets the value of the authorizedViewer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the authorizedViewer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthorizedViewer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProfileType_2015B.Comments_2015B.Comment_2015B.AuthorizedViewer_2015B }
             * 
             * 
             */
            public List<ProfileType_2015B.Comments_2015B.Comment_2015B.AuthorizedViewer_2015B> getAuthorizedViewer() {
                if (authorizedViewer == null) {
                    authorizedViewer = new ArrayList<ProfileType_2015B.Comments_2015B.Comment_2015B.AuthorizedViewer_2015B>();
                }
                return this.authorizedViewer;
            }

            /**
             * Gets the value of the commentOriginatorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommentOriginatorCode() {
                return commentOriginatorCode;
            }

            /**
             * Sets the value of the commentOriginatorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommentOriginatorCode(String value) {
                this.commentOriginatorCode = value;
            }

            /**
             * Gets the value of the guestViewable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGuestViewable() {
                return guestViewable;
            }

            /**
             * Sets the value of the guestViewable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGuestViewable(Boolean value) {
                this.guestViewable = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Gets the value of the airlineVendorPrefRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirlineVendorPrefRPH() {
                return airlineVendorPrefRPH;
            }

            /**
             * Sets the value of the airlineVendorPrefRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirlineVendorPrefRPH(String value) {
                this.airlineVendorPrefRPH = value;
            }

            /**
             * Gets the value of the transferAction property.
             * 
             * @return
             *     possible object is
             *     {@link TransferActionType_2015B }
             *     
             */
            public TransferActionType_2015B getTransferAction() {
                return transferAction;
            }

            /**
             * Sets the value of the transferAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransferActionType_2015B }
             *     
             */
            public void setTransferAction(TransferActionType_2015B value) {
                this.transferAction = value;
            }

            /**
             * Gets the value of the actionDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getActionDate() {
                return actionDate;
            }

            /**
             * Sets the value of the actionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setActionDate(XMLGregorianCalendar value) {
                this.actionDate = value;
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
             *       &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AuthorizedViewer_2015B {

                @XmlAttribute(name = "ViewerCode")
                protected String viewerCode;

                /**
                 * Gets the value of the viewerCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getViewerCode() {
                    return viewerCode;
                }

                /**
                 * Sets the value of the viewerCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setViewerCode(String value) {
                    this.viewerCode = value;
                }

            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="PinNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UserID_2015B
        extends UniqueIDType_2015B
    {

        @XmlAttribute(name = "PinNumber")
        protected String pinNumber;

        /**
         * Gets the value of the pinNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinNumber() {
            return pinNumber;
        }

        /**
         * Sets the value of the pinNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinNumber(String value) {
            this.pinNumber = value;
        }

    }

}
