//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 11:05:25 AM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TestManagementDefintion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestManagementDefintion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testcase" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="result-fields">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="enableTestSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="testsession" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groups" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="resultModBy" type="{http://www.ptc.com/integrity-solution}TestResultModificationType" />
 *                 &lt;attribute name="fieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="role" type="{http://www.ptc.com/integrity-solution}TestManagementRoleType" />
 *       &lt;attribute name="relateTestResults" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestManagementDefintion", propOrder = {
    "testcase",
    "testsession"
})
public class TestManagementDefintion
    implements Equals, HashCode, ToString
{

    protected TestManagementDefintion.Testcase testcase;
    protected TestManagementDefintion.Testsession testsession;
    @XmlAttribute(name = "role")
    protected TestManagementRoleType role;
    @XmlAttribute(name = "relateTestResults")
    protected Boolean relateTestResults;

    /**
     * Gets the value of the testcase property.
     * 
     * @return
     *     possible object is
     *     {@link TestManagementDefintion.Testcase }
     *     
     */
    public TestManagementDefintion.Testcase getTestcase() {
        return testcase;
    }

    /**
     * Sets the value of the testcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestManagementDefintion.Testcase }
     *     
     */
    public void setTestcase(TestManagementDefintion.Testcase value) {
        this.testcase = value;
    }

    /**
     * Gets the value of the testsession property.
     * 
     * @return
     *     possible object is
     *     {@link TestManagementDefintion.Testsession }
     *     
     */
    public TestManagementDefintion.Testsession getTestsession() {
        return testsession;
    }

    /**
     * Sets the value of the testsession property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestManagementDefintion.Testsession }
     *     
     */
    public void setTestsession(TestManagementDefintion.Testsession value) {
        this.testsession = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TestManagementRoleType }
     *     
     */
    public TestManagementRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestManagementRoleType }
     *     
     */
    public void setRole(TestManagementRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the relateTestResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelateTestResults() {
        return relateTestResults;
    }

    /**
     * Sets the value of the relateTestResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelateTestResults(Boolean value) {
        this.relateTestResults = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TestManagementDefintion)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TestManagementDefintion that = ((TestManagementDefintion) object);
        {
            TestManagementDefintion.Testcase lhsTestcase;
            lhsTestcase = this.getTestcase();
            TestManagementDefintion.Testcase rhsTestcase;
            rhsTestcase = that.getTestcase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testcase", lhsTestcase), LocatorUtils.property(thatLocator, "testcase", rhsTestcase), lhsTestcase, rhsTestcase)) {
                return false;
            }
        }
        {
            TestManagementDefintion.Testsession lhsTestsession;
            lhsTestsession = this.getTestsession();
            TestManagementDefintion.Testsession rhsTestsession;
            rhsTestsession = that.getTestsession();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testsession", lhsTestsession), LocatorUtils.property(thatLocator, "testsession", rhsTestsession), lhsTestsession, rhsTestsession)) {
                return false;
            }
        }
        {
            TestManagementRoleType lhsRole;
            lhsRole = this.getRole();
            TestManagementRoleType rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            Boolean lhsRelateTestResults;
            lhsRelateTestResults = this.isRelateTestResults();
            Boolean rhsRelateTestResults;
            rhsRelateTestResults = that.isRelateTestResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relateTestResults", lhsRelateTestResults), LocatorUtils.property(thatLocator, "relateTestResults", rhsRelateTestResults), lhsRelateTestResults, rhsRelateTestResults)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            TestManagementDefintion.Testcase theTestcase;
            theTestcase = this.getTestcase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testcase", theTestcase), currentHashCode, theTestcase);
        }
        {
            TestManagementDefintion.Testsession theTestsession;
            theTestsession = this.getTestsession();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testsession", theTestsession), currentHashCode, theTestsession);
        }
        {
            TestManagementRoleType theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            Boolean theRelateTestResults;
            theRelateTestResults = this.isRelateTestResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relateTestResults", theRelateTestResults), currentHashCode, theRelateTestResults);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            TestManagementDefintion.Testcase theTestcase;
            theTestcase = this.getTestcase();
            strategy.appendField(locator, this, "testcase", buffer, theTestcase);
        }
        {
            TestManagementDefintion.Testsession theTestsession;
            theTestsession = this.getTestsession();
            strategy.appendField(locator, this, "testsession", buffer, theTestsession);
        }
        {
            TestManagementRoleType theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            Boolean theRelateTestResults;
            theRelateTestResults = this.isRelateTestResults();
            strategy.appendField(locator, this, "relateTestResults", buffer, theRelateTestResults);
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="result-fields">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="enableTestSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resultFields"
    })
    public static class Testcase
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "result-fields", required = true)
        protected TestManagementDefintion.Testcase.ResultFields resultFields;
        @XmlAttribute(name = "enableTestSteps")
        protected Boolean enableTestSteps;

        /**
         * Gets the value of the resultFields property.
         * 
         * @return
         *     possible object is
         *     {@link TestManagementDefintion.Testcase.ResultFields }
         *     
         */
        public TestManagementDefintion.Testcase.ResultFields getResultFields() {
            return resultFields;
        }

        /**
         * Sets the value of the resultFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestManagementDefintion.Testcase.ResultFields }
         *     
         */
        public void setResultFields(TestManagementDefintion.Testcase.ResultFields value) {
            this.resultFields = value;
        }

        /**
         * Gets the value of the enableTestSteps property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnableTestSteps() {
            return enableTestSteps;
        }

        /**
         * Sets the value of the enableTestSteps property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnableTestSteps(Boolean value) {
            this.enableTestSteps = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof TestManagementDefintion.Testcase)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TestManagementDefintion.Testcase that = ((TestManagementDefintion.Testcase) object);
            {
                TestManagementDefintion.Testcase.ResultFields lhsResultFields;
                lhsResultFields = this.getResultFields();
                TestManagementDefintion.Testcase.ResultFields rhsResultFields;
                rhsResultFields = that.getResultFields();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "resultFields", lhsResultFields), LocatorUtils.property(thatLocator, "resultFields", rhsResultFields), lhsResultFields, rhsResultFields)) {
                    return false;
                }
            }
            {
                Boolean lhsEnableTestSteps;
                lhsEnableTestSteps = this.isEnableTestSteps();
                Boolean rhsEnableTestSteps;
                rhsEnableTestSteps = that.isEnableTestSteps();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "enableTestSteps", lhsEnableTestSteps), LocatorUtils.property(thatLocator, "enableTestSteps", rhsEnableTestSteps), lhsEnableTestSteps, rhsEnableTestSteps)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                TestManagementDefintion.Testcase.ResultFields theResultFields;
                theResultFields = this.getResultFields();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultFields", theResultFields), currentHashCode, theResultFields);
            }
            {
                Boolean theEnableTestSteps;
                theEnableTestSteps = this.isEnableTestSteps();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableTestSteps", theEnableTestSteps), currentHashCode, theEnableTestSteps);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                TestManagementDefintion.Testcase.ResultFields theResultFields;
                theResultFields = this.getResultFields();
                strategy.appendField(locator, this, "resultFields", buffer, theResultFields);
            }
            {
                Boolean theEnableTestSteps;
                theEnableTestSteps = this.isEnableTestSteps();
                strategy.appendField(locator, this, "enableTestSteps", buffer, theEnableTestSteps);
            }
            return buffer;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "field"
        })
        public static class ResultFields
            implements Equals, HashCode, ToString
        {

            @XmlElement(required = true)
            protected List<String> field;

            /**
             * Gets the value of the field property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the field property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getField() {
                if (field == null) {
                    field = new ArrayList<String>();
                }
                return this.field;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof TestManagementDefintion.Testcase.ResultFields)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final TestManagementDefintion.Testcase.ResultFields that = ((TestManagementDefintion.Testcase.ResultFields) object);
                {
                    List<String> lhsField;
                    lhsField = this.getField();
                    List<String> rhsField;
                    rhsField = that.getField();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
                int currentHashCode = 1;
                {
                    List<String> theField;
                    theField = this.getField();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public String toString() {
                final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    List<String> theField;
                    theField = this.getField();
                    strategy.appendField(locator, this, "field", buffer, theField);
                }
                return buffer;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="groups" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="resultModBy" type="{http://www.ptc.com/integrity-solution}TestResultModificationType" />
     *       &lt;attribute name="fieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groups"
    })
    public static class Testsession
        implements Equals, HashCode, ToString
    {

        protected TestManagementDefintion.Testsession.Groups groups;
        @XmlAttribute(name = "resultModBy")
        protected TestResultModificationType resultModBy;
        @XmlAttribute(name = "fieldname")
        protected String fieldname;

        /**
         * Gets the value of the groups property.
         * 
         * @return
         *     possible object is
         *     {@link TestManagementDefintion.Testsession.Groups }
         *     
         */
        public TestManagementDefintion.Testsession.Groups getGroups() {
            return groups;
        }

        /**
         * Sets the value of the groups property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestManagementDefintion.Testsession.Groups }
         *     
         */
        public void setGroups(TestManagementDefintion.Testsession.Groups value) {
            this.groups = value;
        }

        /**
         * Gets the value of the resultModBy property.
         * 
         * @return
         *     possible object is
         *     {@link TestResultModificationType }
         *     
         */
        public TestResultModificationType getResultModBy() {
            return resultModBy;
        }

        /**
         * Sets the value of the resultModBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestResultModificationType }
         *     
         */
        public void setResultModBy(TestResultModificationType value) {
            this.resultModBy = value;
        }

        /**
         * Gets the value of the fieldname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFieldname() {
            return fieldname;
        }

        /**
         * Sets the value of the fieldname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFieldname(String value) {
            this.fieldname = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof TestManagementDefintion.Testsession)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TestManagementDefintion.Testsession that = ((TestManagementDefintion.Testsession) object);
            {
                TestManagementDefintion.Testsession.Groups lhsGroups;
                lhsGroups = this.getGroups();
                TestManagementDefintion.Testsession.Groups rhsGroups;
                rhsGroups = that.getGroups();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "groups", lhsGroups), LocatorUtils.property(thatLocator, "groups", rhsGroups), lhsGroups, rhsGroups)) {
                    return false;
                }
            }
            {
                TestResultModificationType lhsResultModBy;
                lhsResultModBy = this.getResultModBy();
                TestResultModificationType rhsResultModBy;
                rhsResultModBy = that.getResultModBy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "resultModBy", lhsResultModBy), LocatorUtils.property(thatLocator, "resultModBy", rhsResultModBy), lhsResultModBy, rhsResultModBy)) {
                    return false;
                }
            }
            {
                String lhsFieldname;
                lhsFieldname = this.getFieldname();
                String rhsFieldname;
                rhsFieldname = that.getFieldname();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldname", lhsFieldname), LocatorUtils.property(thatLocator, "fieldname", rhsFieldname), lhsFieldname, rhsFieldname)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                TestManagementDefintion.Testsession.Groups theGroups;
                theGroups = this.getGroups();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groups", theGroups), currentHashCode, theGroups);
            }
            {
                TestResultModificationType theResultModBy;
                theResultModBy = this.getResultModBy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultModBy", theResultModBy), currentHashCode, theResultModBy);
            }
            {
                String theFieldname;
                theFieldname = this.getFieldname();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldname", theFieldname), currentHashCode, theFieldname);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                TestManagementDefintion.Testsession.Groups theGroups;
                theGroups = this.getGroups();
                strategy.appendField(locator, this, "groups", buffer, theGroups);
            }
            {
                TestResultModificationType theResultModBy;
                theResultModBy = this.getResultModBy();
                strategy.appendField(locator, this, "resultModBy", buffer, theResultModBy);
            }
            {
                String theFieldname;
                theFieldname = this.getFieldname();
                strategy.appendField(locator, this, "fieldname", buffer, theFieldname);
            }
            return buffer;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "group"
        })
        public static class Groups
            implements Equals, HashCode, ToString
        {

            @XmlElement(required = true)
            protected List<String> group;

            /**
             * Gets the value of the group property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the group property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getGroup() {
                if (group == null) {
                    group = new ArrayList<String>();
                }
                return this.group;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof TestManagementDefintion.Testsession.Groups)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final TestManagementDefintion.Testsession.Groups that = ((TestManagementDefintion.Testsession.Groups) object);
                {
                    List<String> lhsGroup;
                    lhsGroup = this.getGroup();
                    List<String> rhsGroup;
                    rhsGroup = that.getGroup();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "group", lhsGroup), LocatorUtils.property(thatLocator, "group", rhsGroup), lhsGroup, rhsGroup)) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
                int currentHashCode = 1;
                {
                    List<String> theGroup;
                    theGroup = this.getGroup();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "group", theGroup), currentHashCode, theGroup);
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public String toString() {
                final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    List<String> theGroup;
                    theGroup = this.getGroup();
                    strategy.appendField(locator, this, "group", buffer, theGroup);
                }
                return buffer;
            }

        }

    }

}
