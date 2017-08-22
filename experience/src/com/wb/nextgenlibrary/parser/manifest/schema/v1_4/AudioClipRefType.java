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
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for AudioClipRef-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioClipRef-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AudioTrackID" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}AudioTrackID-type"/&gt;
 *         &lt;element name="EntryPointTimecode" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}Timecode-type" minOccurs="0"/&gt;
 *         &lt;element name="ExitPointTimecode" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}Timecode-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="seamless" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioClipRef-type", propOrder = {
    "audioTrackID",
    "entryPointTimecode",
    "exitPointTimecode"
})
public class AudioClipRefType {

    @XmlElement(name = "AudioTrackID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audioTrackID;
    @XmlElement(name = "EntryPointTimecode")
    protected TimecodeType entryPointTimecode;
    @XmlElement(name = "ExitPointTimecode")
    protected TimecodeType exitPointTimecode;
    @XmlAttribute(name = "sequence")
    protected BigInteger sequence;
    @XmlAttribute(name = "seamless")
    protected Boolean seamless;

    /**
     * Gets the value of the audioTrackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioTrackID() {
        return audioTrackID;
    }

    /**
     * Sets the value of the audioTrackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioTrackID(String value) {
        this.audioTrackID = value;
    }

    /**
     * Gets the value of the entryPointTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link TimecodeType }
     *     
     */
    public TimecodeType getEntryPointTimecode() {
        return entryPointTimecode;
    }

    /**
     * Sets the value of the entryPointTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimecodeType }
     *     
     */
    public void setEntryPointTimecode(TimecodeType value) {
        this.entryPointTimecode = value;
    }

    /**
     * Gets the value of the exitPointTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link TimecodeType }
     *     
     */
    public TimecodeType getExitPointTimecode() {
        return exitPointTimecode;
    }

    /**
     * Sets the value of the exitPointTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimecodeType }
     *     
     */
    public void setExitPointTimecode(TimecodeType value) {
        this.exitPointTimecode = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the seamless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeamless() {
        return seamless;
    }

    /**
     * Sets the value of the seamless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeamless(Boolean value) {
        this.seamless = value;
    }

}
