//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.md.schema.v2_3;

import com.wb.nextgenlibrary.parser.XmlEnum;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for string-Video-Pic-Progressive-scanOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="string-Video-Pic-Progressive-scanOrder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BFF"/&gt;
 *     &lt;enumeration value="TFF"/&gt;
 *     &lt;enumeration value="PPF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "string-Video-Pic-Progressive-scanOrder")
@XmlEnum
public enum StringVideoPicProgressiveScanOrder {

    BFF,
    TFF,
    PPF;

    public String value() {
        return name();
    }

    public static StringVideoPicProgressiveScanOrder fromValue(String v) {
        return valueOf(v);
    }

}
