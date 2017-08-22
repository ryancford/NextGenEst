//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.16 at 03:29:52 PM PDT 
//


package com.wb.nextgenlibrary.parser.cpestyle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for CPEStyleSet-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPEStyleSet-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExperienceStyleMap" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}ExperienceMenuMap-type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NodeStyle" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}NodeStyle-type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Theme" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}Theme-type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CPEStyleSetID" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}CPEStyleSetID-type" /&gt;
 *       &lt;attribute name="updateNum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="specVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPEStyleSet-type", propOrder = {
    "experienceStyleMap",
    "nodeStyle",
    "theme"
})
public class CPEStyleSetType {

    @XmlElement(name = "ExperienceStyleMap", required = true)
    protected List<ExperienceMenuMapType> experienceStyleMap;
    @XmlElement(name = "NodeStyle", required = true)
    protected List<NodeStyleType> nodeStyle;
    @XmlElement(name = "Theme", required = true)
    protected List<ThemeType> theme;
    @XmlAttribute(name = "CPEStyleSetID")
    protected String cpeStyleSetID;
    @XmlAttribute(name = "updateNum")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger updateNum;
    @XmlAttribute(name = "specVersion")
    protected String specVersion;

    /**
     * Gets the value of the experienceStyleMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experienceStyleMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperienceStyleMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperienceMenuMapType }
     * 
     * 
     */
    public List<ExperienceMenuMapType> getExperienceStyleMap() {
        if (experienceStyleMap == null) {
            experienceStyleMap = new ArrayList<ExperienceMenuMapType>();
        }
        return this.experienceStyleMap;
    }

    /**
     * Gets the value of the nodeStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeStyleType }
     * 
     * 
     */
    public List<NodeStyleType> getNodeStyle() {
        if (nodeStyle == null) {
            nodeStyle = new ArrayList<NodeStyleType>();
        }
        return this.nodeStyle;
    }

    /**
     * Gets the value of the theme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeType }
     * 
     * 
     */
    public List<ThemeType> getTheme() {
        if (theme == null) {
            theme = new ArrayList<ThemeType>();
        }
        return this.theme;
    }

    /**
     * Gets the value of the cpeStyleSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPEStyleSetID() {
        return cpeStyleSetID;
    }

    /**
     * Sets the value of the cpeStyleSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPEStyleSetID(String value) {
        this.cpeStyleSetID = value;
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
     * Gets the value of the specVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * Sets the value of the specVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecVersion(String value) {
        this.specVersion = value;
    }

}