//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.wb.nextgenlibrary.parser.LocalizableMetaDataInterface;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;
import com.wb.nextgenlibrary.parser.XmlValue;
import com.wb.nextgenlibrary.parser.adapters.CollapsedStringAdapter;
import com.wb.nextgenlibrary.parser.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BasicMetadataInfo-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicMetadataInfo-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TitleDisplay19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleDisplay60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleDisplayUnlimited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleSort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArtReference" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                 &lt;attribute name="resolution" type="{http://www.movielabs.com/schema/md/v2.3/md}string-ArtReference_resolution" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Summary190"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Summary400" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Summary4000" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisplayIndicators" type="{http://www.movielabs.com/schema/md/v2.3/md}string-DisplayIndicators" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Genre" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;attribute name="id" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Genre_id" /&gt;
 *                 &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Keyword" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Keyword" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.movielabs.com/schema/md/v2.3/md}Region-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CopyrightLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeopleLocal" type="{http://www.movielabs.com/schema/md/v2.3/md}BasicMetadataPeople-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TitleAlternate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" type="{http://www.movielabs.com/schema/md/v2.3/md}string-TitleAlternate_type" /&gt;
 *                 &lt;attribute name="language" type="{http://www.movielabs.com/schema/md/v2.3/md}language-redefine" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="language" use="required" type="{http://www.movielabs.com/schema/md/v2.3/md}language-redefine" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicMetadataInfo-type", propOrder = {
    "titleDisplay19",
    "titleDisplay60",
    "titleDisplayUnlimited",
    "titleSort",
    "artReference",
    "summary190",
    "summary400",
    "summary4000",
    "displayIndicators",
    "genre",
    "keyword",
    "versionNotes",
    "region",
    "originalTitle",
    "copyrightLine",
    "peopleLocal",
    "titleAlternate"
})
public class BasicMetadataInfoType implements LocalizableMetaDataInterface {

    @XmlElement(name = "TitleDisplay19")
    protected String titleDisplay19;
    @XmlElement(name = "TitleDisplay60")
    protected String titleDisplay60;
    @XmlElement(name = "TitleDisplayUnlimited")
    protected String titleDisplayUnlimited;
    @XmlElement(name = "TitleSort", required = true)
    protected String titleSort;
    @XmlElement(name = "ArtReference")
    protected List<ArtReference> artReference;
    @XmlElement(name = "Summary190", required = true)
    protected BasicMetadataInfoType.Summary190 summary190;
    @XmlElement(name = "Summary400")
    protected BasicMetadataInfoType.Summary400 summary400;
    @XmlElement(name = "Summary4000")
    protected BasicMetadataInfoType.Summary4000 summary4000;
    @XmlElement(name = "DisplayIndicators")
    @XmlSchemaType(name = "string")
    protected List<StringDisplayIndicators> displayIndicators;
    @XmlElement(name = "Genre")
    protected List<Genre> genre;
    @XmlElement(name = "Keyword")
    protected List<String> keyword;
    @XmlElement(name = "VersionNotes")
    protected String versionNotes;
    @XmlElement(name = "Region")
    protected List<RegionType> region;
    @XmlElement(name = "OriginalTitle")
    protected String originalTitle;
    @XmlElement(name = "CopyrightLine")
    protected String copyrightLine;
    @XmlElement(name = "PeopleLocal")
    protected List<BasicMetadataPeopleType> peopleLocal;
    @XmlElement(name = "TitleAlternate")
    protected List<TitleAlternate> titleAlternate;
    @XmlAttribute(name = "language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "default")
    protected Boolean _default;

    /**
     * Gets the value of the titleDisplay19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisplay19() {
        return titleDisplay19;
    }

    /**
     * Sets the value of the titleDisplay19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisplay19(String value) {
        this.titleDisplay19 = value;
    }

    /**
     * Gets the value of the titleDisplay60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisplay60() {
        return titleDisplay60;
    }

    /**
     * Sets the value of the titleDisplay60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisplay60(String value) {
        this.titleDisplay60 = value;
    }

    /**
     * Gets the value of the titleDisplayUnlimited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisplayUnlimited() {
        return titleDisplayUnlimited;
    }

    /**
     * Sets the value of the titleDisplayUnlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisplayUnlimited(String value) {
        this.titleDisplayUnlimited = value;
    }

    /**
     * Gets the value of the titleSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleSort() {
        return titleSort;
    }

    /**
     * Sets the value of the titleSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleSort(String value) {
        this.titleSort = value;
    }

    /**
     * Gets the value of the artReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtReference }
     * 
     * 
     */
    public List<ArtReference> getArtReference() {
        if (artReference == null) {
            artReference = new ArrayList<ArtReference>();
        }
        return this.artReference;
    }

    /**
     * Gets the value of the summary190 property.
     * 
     * @return
     *     possible object is
     *     {@link Summary190 }
     *     
     */
    public Summary190 getSummary190() {
        return summary190;
    }

    /**
     * Sets the value of the summary190 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary190 }
     *     
     */
    public void setSummary190(Summary190 value) {
        this.summary190 = value;
    }

    /**
     * Gets the value of the summary400 property.
     * 
     * @return
     *     possible object is
     *     {@link Summary400 }
     *     
     */
    public Summary400 getSummary400() {
        return summary400;
    }

    /**
     * Sets the value of the summary400 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary400 }
     *     
     */
    public void setSummary400(Summary400 value) {
        this.summary400 = value;
    }

    /**
     * Gets the value of the summary4000 property.
     * 
     * @return
     *     possible object is
     *     {@link Summary4000 }
     *     
     */
    public Summary4000 getSummary4000() {
        return summary4000;
    }

    /**
     * Sets the value of the summary4000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary4000 }
     *     
     */
    public void setSummary4000(Summary4000 value) {
        this.summary4000 = value;
    }

    /**
     * Gets the value of the displayIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDisplayIndicators }
     * 
     * 
     */
    public List<StringDisplayIndicators> getDisplayIndicators() {
        if (displayIndicators == null) {
            displayIndicators = new ArrayList<StringDisplayIndicators>();
        }
        return this.displayIndicators;
    }

    /**
     * Gets the value of the genre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Genre }
     * 
     * 
     */
    public List<Genre> getGenre() {
        if (genre == null) {
            genre = new ArrayList<Genre>();
        }
        return this.genre;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the versionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNotes() {
        return versionNotes;
    }

    /**
     * Sets the value of the versionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNotes(String value) {
        this.versionNotes = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRegion() {
        if (region == null) {
            region = new ArrayList<RegionType>();
        }
        return this.region;
    }

    /**
     * Gets the value of the originalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * Sets the value of the originalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTitle(String value) {
        this.originalTitle = value;
    }

    /**
     * Gets the value of the copyrightLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightLine() {
        return copyrightLine;
    }

    /**
     * Sets the value of the copyrightLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightLine(String value) {
        this.copyrightLine = value;
    }

    /**
     * Gets the value of the peopleLocal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peopleLocal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeopleLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicMetadataPeopleType }
     * 
     * 
     */
    public List<BasicMetadataPeopleType> getPeopleLocal() {
        if (peopleLocal == null) {
            peopleLocal = new ArrayList<BasicMetadataPeopleType>();
        }
        return this.peopleLocal;
    }

    /**
     * Gets the value of the titleAlternate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleAlternate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleAlternate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleAlternate }
     * 
     * 
     */
    public List<TitleAlternate> getTitleAlternate() {
        if (titleAlternate == null) {
            titleAlternate = new ArrayList<TitleAlternate>();
        }
        return this.titleAlternate;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *       &lt;attribute name="resolution" type="{http://www.movielabs.com/schema/md/v2.3/md}string-ArtReference_resolution" /&gt;
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
    public static class ArtReference {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "resolution")
        protected String resolution;

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
         * Gets the value of the resolution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResolution() {
            return resolution;
        }

        /**
         * Sets the value of the resolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResolution(String value) {
            this.resolution = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;attribute name="id" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Genre_id" /&gt;
     *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
    public static class Genre {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        @XmlSchemaType(name = "anyURI")
        protected String source;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "level")
        protected BigInteger level;

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
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    public static class Summary190 {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "cast")
        protected Boolean cast;

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
         * Gets the value of the cast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCast() {
            return cast;
        }

        /**
         * Sets the value of the cast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCast(Boolean value) {
            this.cast = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    public static class Summary400 {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "cast")
        protected Boolean cast;

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
         * Gets the value of the cast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCast() {
            return cast;
        }

        /**
         * Sets the value of the cast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCast(Boolean value) {
            this.cast = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="cast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    public static class Summary4000 {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "cast")
        protected Boolean cast;

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
         * Gets the value of the cast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCast() {
            return cast;
        }

        /**
         * Sets the value of the cast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCast(Boolean value) {
            this.cast = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="type" type="{http://www.movielabs.com/schema/md/v2.3/md}string-TitleAlternate_type" /&gt;
     *       &lt;attribute name="language" type="{http://www.movielabs.com/schema/md/v2.3/md}language-redefine" /&gt;
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
    public static class TitleAlternate {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String language;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

    }

}
