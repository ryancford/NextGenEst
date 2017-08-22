//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import java.util.ArrayList;
import java.util.List;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;
import com.wb.nextgenlibrary.parser.XmlValue;


/**
 * <p>Java class for ReleaseHistory-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseHistory-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReleaseType"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;string-Release-ReleaseType"&gt;
 *                 &lt;attribute name="wide" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DistrTerritory" type="{http://www.movielabs.com/schema/md/v2.3/md}Region-type" minOccurs="0"/&gt;
 *         &lt;element name="Date"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;YearDateOrTime-type"&gt;
 *                 &lt;attribute name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseOrg" type="{http://www.movielabs.com/schema/md/v2.3/md}OrgName-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseHistory-type", propOrder = {
    "releaseType",
    "distrTerritory",
    "date",
    "description",
    "releaseOrg"
})
public class ReleaseHistoryType {

    @XmlElement(name = "ReleaseType", required = true)
    protected ReleaseHistoryType.ReleaseType releaseType;
    @XmlElement(name = "DistrTerritory")
    protected RegionType distrTerritory;
    @XmlElement(name = "Date", required = true)
    protected ReleaseHistoryType.Date date;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ReleaseOrg")
    protected List<OrgNameType> releaseOrg;

    /**
     * Gets the value of the releaseType property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseType }
     *     
     */
    public ReleaseType getReleaseType() {
        return releaseType;
    }

    /**
     * Sets the value of the releaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseType }
     *     
     */
    public void setReleaseType(ReleaseType value) {
        this.releaseType = value;
    }

    /**
     * Gets the value of the distrTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getDistrTerritory() {
        return distrTerritory;
    }

    /**
     * Sets the value of the distrTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setDistrTerritory(RegionType value) {
        this.distrTerritory = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
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
     * Gets the value of the releaseOrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseOrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseOrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgNameType }
     * 
     * 
     */
    public List<OrgNameType> getReleaseOrg() {
        if (releaseOrg == null) {
            releaseOrg = new ArrayList<OrgNameType>();
        }
        return this.releaseOrg;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;YearDateOrTime-type"&gt;
     *       &lt;attribute name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Date {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "scheduled")
        protected Boolean scheduled;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the scheduled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isScheduled() {
            return scheduled;
        }

        /**
         * Sets the value of the scheduled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setScheduled(Boolean value) {
            this.scheduled = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;string-Release-ReleaseType"&gt;
     *       &lt;attribute name="wide" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ReleaseType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "wide")
        protected Boolean wide;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the wide property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWide() {
            return wide;
        }

        /**
         * Sets the value of the wide property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWide(Boolean value) {
            this.wide = value;
        }

    }

}