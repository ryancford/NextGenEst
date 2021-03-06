//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.16 at 04:10:08 PM PDT 
//


package com.wb.nextgenlibrary.parser.appdata;

import java.util.ArrayList;
import java.util.List;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for AppDataFeedGeneric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppDataFeedGeneric"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeedImageLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="FeedImageID" type="{http://www.movielabs.com/schema/manifest/v1.5/manifest}ImageID-type" minOccurs="0"/&gt;
 *         &lt;element name="PostingImageLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="PostingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WhenPosted" type="{http://www.movielabs.com/schema/md/v2.4/md}YearDateOrTime-type" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BodyImageLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppDataFeedGeneric", propOrder = {
    "feedImageLocation",
    "feedImageID",
    "postingImageLocation",
    "postingName",
    "whenPosted",
    "title",
    "body",
    "bodyImageLocation"
})
public class AppDataFeedGeneric {

    @XmlElement(name = "FeedImageLocation")
    @XmlSchemaType(name = "anyURI")
    protected String feedImageLocation;
    @XmlElement(name = "FeedImageID")
    @XmlSchemaType(name = "anyURI")
    protected String feedImageID;
    @XmlElement(name = "PostingImageLocation")
    @XmlSchemaType(name = "anyURI")
    protected String postingImageLocation;
    @XmlElement(name = "PostingName")
    protected String postingName;
    @XmlElement(name = "WhenPosted")
    @XmlSchemaType(name = "anySimpleType")
    protected String whenPosted;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Body", required = true)
    protected String body;
    @XmlElement(name = "BodyImageLocation")
    @XmlSchemaType(name = "anyURI")
    protected List<String> bodyImageLocation;

    /**
     * Gets the value of the feedImageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedImageLocation() {
        return feedImageLocation;
    }

    /**
     * Sets the value of the feedImageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedImageLocation(String value) {
        this.feedImageLocation = value;
    }

    /**
     * Gets the value of the feedImageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedImageID() {
        return feedImageID;
    }

    /**
     * Sets the value of the feedImageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedImageID(String value) {
        this.feedImageID = value;
    }

    /**
     * Gets the value of the postingImageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingImageLocation() {
        return postingImageLocation;
    }

    /**
     * Sets the value of the postingImageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingImageLocation(String value) {
        this.postingImageLocation = value;
    }

    /**
     * Gets the value of the postingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingName() {
        return postingName;
    }

    /**
     * Sets the value of the postingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingName(String value) {
        this.postingName = value;
    }

    /**
     * Gets the value of the whenPosted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenPosted() {
        return whenPosted;
    }

    /**
     * Sets the value of the whenPosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenPosted(String value) {
        this.whenPosted = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the bodyImageLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyImageLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyImageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBodyImageLocation() {
        if (bodyImageLocation == null) {
            bodyImageLocation = new ArrayList<String>();
        }
        return this.bodyImageLocation;
    }

}
