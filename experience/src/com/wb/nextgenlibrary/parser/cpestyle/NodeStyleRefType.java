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
import com.wb.nextgenlibrary.parser.XmlSeeAlso;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for NodeStyleRef-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeStyleRef-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orientation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Landscape"/&gt;
 *               &lt;enumeration value="Portrait"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WidthPixelsMax" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="DeviceTarget" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}CompatibilityDevice-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NodeStyleID" use="required" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}NodeStyleID-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeStyleRef-type", propOrder = {
    "orientation",
    "widthPixelsMax",
    "deviceTarget"
})
@XmlSeeAlso({
    com.wb.nextgenlibrary.parser.cpestyle.ExperienceMenuMapType.NodeStyleRef.class
})
public class NodeStyleRefType {

    @XmlElement(name = "Orientation")
    protected String orientation;
    @XmlElement(name = "WidthPixelsMax")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger widthPixelsMax;
    @XmlElement(name = "DeviceTarget")
    protected List<CompatibilityDeviceType> deviceTarget;
    @XmlAttribute(name = "NodeStyleID", required = true)
    protected String nodeStyleID;

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the widthPixelsMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidthPixelsMax() {
        return widthPixelsMax;
    }

    /**
     * Sets the value of the widthPixelsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidthPixelsMax(BigInteger value) {
        this.widthPixelsMax = value;
    }

    /**
     * Gets the value of the deviceTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompatibilityDeviceType }
     * 
     * 
     */
    public List<CompatibilityDeviceType> getDeviceTarget() {
        if (deviceTarget == null) {
            deviceTarget = new ArrayList<CompatibilityDeviceType>();
        }
        return this.deviceTarget;
    }

    /**
     * Gets the value of the nodeStyleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeStyleID() {
        return nodeStyleID;
    }

    /**
     * Sets the value of the nodeStyleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeStyleID(String value) {
        this.nodeStyleID = value;
    }

}
