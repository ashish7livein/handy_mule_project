//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 03:47:41 PM GMT 
//


package com.echostar.model.partialVodAssets.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for mpaaRating.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mpaaRating">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PG-13"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="NC-17"/>
 *     &lt;enumeration value="Unrated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum MpaaRating implements Serializable {

    G("G"),
    @XmlEnumValue("NC-17")
    NC_17("NC-17"),
    PG("PG"),
    @XmlEnumValue("PG-13")
    PG_13("PG-13"),
    R("R"),
    @XmlEnumValue("Unrated")
    UNRATED("Unrated");
    private final String value;

    MpaaRating(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MpaaRating fromValue(String v) {
        for (MpaaRating c: MpaaRating.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
