//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for EventLocation-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLocation-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="fictional" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EarthCoordinate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}EventLocationEarthCoordinate-type"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherCoordinates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}EventLocationOtherCoordinate-type"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLocation-type", propOrder = {
    "type",
    "name",
    "address",
    "earthCoordinate",
    "otherCoordinates"
})
public class EventLocationType {

    @XmlElement(name = "Type", required = true)
    protected EventLocationType.Type type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected Object address;
    @XmlElement(name = "EarthCoordinate")
    protected EventLocationType.EarthCoordinate earthCoordinate;
    @XmlElement(name = "OtherCoordinates")
    protected EventLocationType.OtherCoordinates otherCoordinates;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddress(Object value) {
        this.address = value;
    }

    /**
     * Gets the value of the earthCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link EarthCoordinate }
     *     
     */
    public EarthCoordinate getEarthCoordinate() {
        return earthCoordinate;
    }

    /**
     * Sets the value of the earthCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarthCoordinate }
     *     
     */
    public void setEarthCoordinate(EarthCoordinate value) {
        this.earthCoordinate = value;
    }

    /**
     * Gets the value of the otherCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCoordinates }
     *     
     */
    public OtherCoordinates getOtherCoordinates() {
        return otherCoordinates;
    }

    /**
     * Sets the value of the otherCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCoordinates }
     *     
     */
    public void setOtherCoordinates(OtherCoordinates value) {
        this.otherCoordinates = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}EventLocationEarthCoordinate-type"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EarthCoordinate
        extends EventLocationEarthCoordinateType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}EventLocationOtherCoordinate-type"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OtherCoordinates
        extends EventLocationOtherCoordinateType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="fictional" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Type {

        @XmlAttribute(name = "fictional")
        protected Boolean fictional;

        /**
         * Gets the value of the fictional property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFictional() {
            return fictional;
        }

        /**
         * Sets the value of the fictional property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFictional(Boolean value) {
            this.fictional = value;
        }

    }

}
