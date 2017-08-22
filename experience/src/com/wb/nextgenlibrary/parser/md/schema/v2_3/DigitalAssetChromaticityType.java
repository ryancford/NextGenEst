//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import java.math.BigDecimal;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for DigitalAssetChromaticity-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetChromaticity-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChromaticityCIEx" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ChromaticityCIEy" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetChromaticity-type", propOrder = {
    "chromaticityCIEx",
    "chromaticityCIEy"
})
public class DigitalAssetChromaticityType {

    @XmlElement(name = "ChromaticityCIEx", required = true)
    protected BigDecimal chromaticityCIEx;
    @XmlElement(name = "ChromaticityCIEy", required = true)
    protected BigDecimal chromaticityCIEy;

    /**
     * Gets the value of the chromaticityCIEx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChromaticityCIEx() {
        return chromaticityCIEx;
    }

    /**
     * Sets the value of the chromaticityCIEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChromaticityCIEx(BigDecimal value) {
        this.chromaticityCIEx = value;
    }

    /**
     * Gets the value of the chromaticityCIEy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChromaticityCIEy() {
        return chromaticityCIEy;
    }

    /**
     * Sets the value of the chromaticityCIEy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChromaticityCIEy(BigDecimal value) {
        this.chromaticityCIEy = value;
    }

}
