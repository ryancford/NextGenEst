//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;

import java.math.BigInteger;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for MediaManifestEdit-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaManifestEdit-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteObjects" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}MediaManifestEditDelete-type" minOccurs="0"/&gt;
 *         &lt;element name="AddObjects" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}MediaManifestEditAdd-type" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ManifestID" type="{http://www.movielabs.com/schema/md/v2.3/md}id-type" /&gt;
 *       &lt;attribute name="updateDeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="updateNum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ExtraVersionReference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaManifestEdit-type", propOrder = {
    "deleteObjects",
    "addObjects",
    "description",
    "instructions"
})
public class MediaManifestEditType {

    @XmlElement(name = "DeleteObjects")
    protected MediaManifestEditDeleteType deleteObjects;
    @XmlElement(name = "AddObjects")
    protected MediaManifestEditAddType addObjects;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Instructions")
    protected String instructions;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "reference")
    protected String reference;
    @XmlAttribute(name = "ManifestID")
    protected String manifestID;
    @XmlAttribute(name = "updateDeliveryType")
    protected String updateDeliveryType;
    @XmlAttribute(name = "updateNum")
    protected BigInteger updateNum;
    @XmlAttribute(name = "ExtraVersionReference")
    protected String extraVersionReference;

    /**
     * Gets the value of the deleteObjects property.
     * 
     * @return
     *     possible object is
     *     {@link MediaManifestEditDeleteType }
     *     
     */
    public MediaManifestEditDeleteType getDeleteObjects() {
        return deleteObjects;
    }

    /**
     * Sets the value of the deleteObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaManifestEditDeleteType }
     *     
     */
    public void setDeleteObjects(MediaManifestEditDeleteType value) {
        this.deleteObjects = value;
    }

    /**
     * Gets the value of the addObjects property.
     * 
     * @return
     *     possible object is
     *     {@link MediaManifestEditAddType }
     *     
     */
    public MediaManifestEditAddType getAddObjects() {
        return addObjects;
    }

    /**
     * Sets the value of the addObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaManifestEditAddType }
     *     
     */
    public void setAddObjects(MediaManifestEditAddType value) {
        this.addObjects = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the manifestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestID() {
        return manifestID;
    }

    /**
     * Sets the value of the manifestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestID(String value) {
        this.manifestID = value;
    }

    /**
     * Gets the value of the updateDeliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDeliveryType() {
        return updateDeliveryType;
    }

    /**
     * Sets the value of the updateDeliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDeliveryType(String value) {
        this.updateDeliveryType = value;
    }

    /**
     * Gets the value of the updateNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdateNum() {
        return updateNum;
    }

    /**
     * Sets the value of the updateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdateNum(BigInteger value) {
        this.updateNum = value;
    }

    /**
     * Gets the value of the extraVersionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraVersionReference() {
        return extraVersionReference;
    }

    /**
     * Sets the value of the extraVersionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraVersionReference(String value) {
        this.extraVersionReference = value;
    }

}