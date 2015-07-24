//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 04:21:50 PM BST 
//


package com.ptc.tifworkbench.jaxbbinding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstraintType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="fieldRelationship"/>
 *     &lt;enumeration value="rule"/>
 *     &lt;enumeration value="ibpl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstraintType")
@XmlEnum
public enum ConstraintType {

    @XmlEnumValue("basic")
    BASIC("basic"),
    @XmlEnumValue("fieldRelationship")
    FIELD_RELATIONSHIP("fieldRelationship"),
    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("ibpl")
    IBPL("ibpl");
    private final String value;

    ConstraintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstraintType fromValue(String v) {
        for (ConstraintType c: ConstraintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
