//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;
import com.wb.nextgenlibrary.parser.md.schema.v2_3.DigitalAssetAncillaryDataType;


/**
 * <p>Java class for InventoryAncillary-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAncillary-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetAncillaryData-type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerReference" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}ContainerReference-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AncillaryTrackID" use="required" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}AncillaryTrackID-type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAncillary-type", propOrder = {
    "containerReference"
})
public class InventoryAncillaryType
    extends DigitalAssetAncillaryDataType
{

    @XmlElement(name = "ContainerReference")
    protected ContainerReferenceType containerReference;
    @XmlAttribute(name = "AncillaryTrackID", required = true)
    protected String ancillaryTrackID;

    /**
     * Gets the value of the containerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerReferenceType }
     *     
     */
    public ContainerReferenceType getContainerReference() {
        return containerReference;
    }

    /**
     * Sets the value of the containerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerReferenceType }
     *     
     */
    public void setContainerReference(ContainerReferenceType value) {
        this.containerReference = value;
    }

    /**
     * Gets the value of the ancillaryTrackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryTrackID() {
        return ancillaryTrackID;
    }

    /**
     * Sets the value of the ancillaryTrackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryTrackID(String value) {
        this.ancillaryTrackID = value;
    }

}
