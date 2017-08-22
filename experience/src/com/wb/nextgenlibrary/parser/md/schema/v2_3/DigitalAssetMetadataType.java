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
 * <p>Java class for DigitalAssetMetadata-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetMetadata-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Audio" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetAudioData-type"/&gt;
 *         &lt;element name="Video" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetVideoData-type"/&gt;
 *         &lt;element name="Subtitle" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetSubtitleData-type"/&gt;
 *         &lt;element name="Image" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetImageData-type"/&gt;
 *         &lt;element name="Interactive" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetInteractiveData-type"/&gt;
 *         &lt;element name="Ancillary" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetAncillaryData-type"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetMetadata-type", propOrder = {
    "audio",
    "video",
    "subtitle",
    "image",
    "interactive",
    "ancillary"
})
public class DigitalAssetMetadataType {

    @XmlElement(name = "Audio")
    protected DigitalAssetAudioDataType audio;
    @XmlElement(name = "Video")
    protected DigitalAssetVideoDataType video;
    @XmlElement(name = "Subtitle")
    protected DigitalAssetSubtitleDataType subtitle;
    @XmlElement(name = "Image")
    protected DigitalAssetImageDataType image;
    @XmlElement(name = "Interactive")
    protected DigitalAssetInteractiveDataType interactive;
    @XmlElement(name = "Ancillary")
    protected DigitalAssetAncillaryDataType ancillary;

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetAudioDataType }
     *     
     */
    public DigitalAssetAudioDataType getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetAudioDataType }
     *     
     */
    public void setAudio(DigitalAssetAudioDataType value) {
        this.audio = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetVideoDataType }
     *     
     */
    public DigitalAssetVideoDataType getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetVideoDataType }
     *     
     */
    public void setVideo(DigitalAssetVideoDataType value) {
        this.video = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetSubtitleDataType }
     *     
     */
    public DigitalAssetSubtitleDataType getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetSubtitleDataType }
     *     
     */
    public void setSubtitle(DigitalAssetSubtitleDataType value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetImageDataType }
     *     
     */
    public DigitalAssetImageDataType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetImageDataType }
     *     
     */
    public void setImage(DigitalAssetImageDataType value) {
        this.image = value;
    }

    /**
     * Gets the value of the interactive property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetInteractiveDataType }
     *     
     */
    public DigitalAssetInteractiveDataType getInteractive() {
        return interactive;
    }

    /**
     * Sets the value of the interactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetInteractiveDataType }
     *     
     */
    public void setInteractive(DigitalAssetInteractiveDataType value) {
        this.interactive = value;
    }

    /**
     * Gets the value of the ancillary property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetAncillaryDataType }
     *     
     */
    public DigitalAssetAncillaryDataType getAncillary() {
        return ancillary;
    }

    /**
     * Sets the value of the ancillary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetAncillaryDataType }
     *     
     */
    public void setAncillary(DigitalAssetAncillaryDataType value) {
        this.ancillary = value;
    }

}
