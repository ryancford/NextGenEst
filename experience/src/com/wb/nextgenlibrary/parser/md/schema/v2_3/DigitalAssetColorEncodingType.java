//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for DigitalAssetColorEncoding-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetColorEncoding-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Primaries" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Video-Pic-Primaries"/&gt;
 *         &lt;element name="TransferFunction" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Video-Pic-OETF"/&gt;
 *         &lt;element name="ColorDifferencing" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Video-Pic-ColorDifferencing"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetColorEncoding-type", propOrder = {
    "primaries",
    "transferFunction",
    "colorDifferencing"
})
public class DigitalAssetColorEncodingType {

    @XmlElement(name = "Primaries", required = true)
    protected String primaries;
    @XmlElement(name = "TransferFunction", required = true)
    protected String transferFunction;
    @XmlElement(name = "ColorDifferencing", required = true)
    protected String colorDifferencing;

    /**
     * Gets the value of the primaries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaries() {
        return primaries;
    }

    /**
     * Sets the value of the primaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaries(String value) {
        this.primaries = value;
    }

    /**
     * Gets the value of the transferFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFunction() {
        return transferFunction;
    }

    /**
     * Sets the value of the transferFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFunction(String value) {
        this.transferFunction = value;
    }

    /**
     * Gets the value of the colorDifferencing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDifferencing() {
        return colorDifferencing;
    }

    /**
     * Sets the value of the colorDifferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDifferencing(String value) {
        this.colorDifferencing = value;
    }

}
