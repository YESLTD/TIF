//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 05:22:45 PM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultModificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestResultModificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyone"/>
 *     &lt;enumeration value="userField"/>
 *     &lt;enumeration value="groupField"/>
 *     &lt;enumeration value="groups"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestResultModificationType")
@XmlEnum
public enum TestResultModificationType {

    @XmlEnumValue("anyone")
    ANYONE("anyone"),
    @XmlEnumValue("userField")
    USER_FIELD("userField"),
    @XmlEnumValue("groupField")
    GROUP_FIELD("groupField"),
    @XmlEnumValue("groups")
    GROUPS("groups");
    private final String value;

    TestResultModificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestResultModificationType fromValue(String v) {
        for (TestResultModificationType c: TestResultModificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
