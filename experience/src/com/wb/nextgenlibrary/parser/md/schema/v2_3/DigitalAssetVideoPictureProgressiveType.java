//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlType;
import com.wb.nextgenlibrary.parser.XmlValue;


/**
 * <p>Java class for DigitalAssetVideoPictureProgressive-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetVideoPictureProgressive-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *       &lt;attribute name="scanOrder" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Video-Pic-Progressive-scanOrder" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetVideoPictureProgressive-type", propOrder = {
    "value"
})
public class DigitalAssetVideoPictureProgressiveType {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "scanOrder")
    protected StringVideoPicProgressiveScanOrder scanOrder;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the scanOrder property.
     * 
     * @return
     *     possible object is
     *     {@link StringVideoPicProgressiveScanOrder }
     *     
     */
    public StringVideoPicProgressiveScanOrder getScanOrder() {
        return scanOrder;
    }

    /**
     * Sets the value of the scanOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringVideoPicProgressiveScanOrder }
     *     
     */
    public void setScanOrder(StringVideoPicProgressiveScanOrder value) {
        this.scanOrder = value;
    }

}
