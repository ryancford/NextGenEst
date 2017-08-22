//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;

import java.util.ArrayList;
import java.util.List;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for TextGroup-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextGroup-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextObjectID" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}TextObjectID-type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TextGroupID" use="required" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}AppGroupID-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextGroup-type", propOrder = {
    "textObjectID"
})
public class TextGroupType {

    @XmlElement(name = "TextObjectID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> textObjectID;
    @XmlAttribute(name = "TextGroupID", required = true)
    protected String textGroupID;

    /**
     * Gets the value of the textObjectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textObjectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextObjectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextObjectID() {
        if (textObjectID == null) {
            textObjectID = new ArrayList<String>();
        }
        return this.textObjectID;
    }

    /**
     * Gets the value of the textGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextGroupID() {
        return textGroupID;
    }

    /**
     * Sets the value of the textGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextGroupID(String value) {
        this.textGroupID = value;
    }

}
