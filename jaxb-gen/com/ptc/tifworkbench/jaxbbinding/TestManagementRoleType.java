//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 11:05:25 AM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestManagementRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestManagementRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="testSuite"/>
 *     &lt;enumeration value="testCase"/>
 *     &lt;enumeration value="testStep"/>
 *     &lt;enumeration value="testSession"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestManagementRoleType")
@XmlEnum
public enum TestManagementRoleType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("testSuite")
    TEST_SUITE("testSuite"),
    @XmlEnumValue("testCase")
    TEST_CASE("testCase"),
    @XmlEnumValue("testStep")
    TEST_STEP("testStep"),
    @XmlEnumValue("testSession")
    TEST_SESSION("testSession");
    private final String value;

    TestManagementRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestManagementRoleType fromValue(String v) {
        for (TestManagementRoleType c: TestManagementRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
