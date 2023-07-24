
package com.cibeg.esb.financial.objects.v5_0.correspondence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.cibeg.esb.common.v5_0.enums.DeliveryMethodEnumType;


/**
 * Mobile Number or Email Address etc
 * 			
 * 
 * <p>Java class for CrospendanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrospendanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorrespondenceIdent" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_36Type" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_100Type" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_15Type" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_100Type" minOccurs="0"/&gt;
 *         &lt;element name="MessageBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorrespondenceType" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_36Type" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryMethod" type="{http://www.cibeg.com/esb/common/v5.0/enums}DeliveryMethodEnumType"/&gt;
 *         &lt;element name="DeliveryData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeliveryDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CampaignIdent" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_36Type" minOccurs="0"/&gt;
 *         &lt;element name="FormImgLoc" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_255Type" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://www.cibeg.com/esb/common/v5.0/simpletypes}NC_36Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrospendanceType", propOrder = {
    "partyName",
    "correspondenceIdent",
    "desc",
    "version",
    "subject",
    "messageBody",
    "correspondenceType",
    "deliveryMethod",
    "deliveryData",
    "deliveryDtTm",
    "campaignIdent",
    "formImgLoc",
    "batchNum"
})
public class CrospendanceType {

    @XmlElement(name = "PartyName", required = true)
    protected String partyName;
    @XmlElement(name = "CorrespondenceIdent")
    protected String correspondenceIdent;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "MessageBody", required = true)
    protected String messageBody;
    @XmlElement(name = "CorrespondenceType")
    protected String correspondenceType;
    @XmlElement(name = "DeliveryMethod", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryMethodEnumType deliveryMethod;
    @XmlElement(name = "DeliveryData", required = true)
    protected String deliveryData;
    @XmlElement(name = "DeliveryDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDtTm;
    @XmlElement(name = "CampaignIdent")
    protected String campaignIdent;
    @XmlElement(name = "FormImgLoc")
    protected String formImgLoc;
    @XmlElement(name = "BatchNum")
    protected String batchNum;

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the correspondenceIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceIdent() {
        return correspondenceIdent;
    }

    /**
     * Sets the value of the correspondenceIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceIdent(String value) {
        this.correspondenceIdent = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the messageBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of the messageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageBody(String value) {
        this.messageBody = value;
    }

    /**
     * Gets the value of the correspondenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceType() {
        return correspondenceType;
    }

    /**
     * Sets the value of the correspondenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceType(String value) {
        this.correspondenceType = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumType }
     *     
     */
    public DeliveryMethodEnumType getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumType }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumType value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryData() {
        return deliveryData;
    }

    /**
     * Sets the value of the deliveryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryData(String value) {
        this.deliveryData = value;
    }

    /**
     * Gets the value of the deliveryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDtTm() {
        return deliveryDtTm;
    }

    /**
     * Sets the value of the deliveryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDtTm(XMLGregorianCalendar value) {
        this.deliveryDtTm = value;
    }

    /**
     * Gets the value of the campaignIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignIdent() {
        return campaignIdent;
    }

    /**
     * Sets the value of the campaignIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignIdent(String value) {
        this.campaignIdent = value;
    }

    /**
     * Gets the value of the formImgLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormImgLoc() {
        return formImgLoc;
    }

    /**
     * Sets the value of the formImgLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormImgLoc(String value) {
        this.formImgLoc = value;
    }

    /**
     * Gets the value of the batchNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * Sets the value of the batchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNum(String value) {
        this.batchNum = value;
    }

}
