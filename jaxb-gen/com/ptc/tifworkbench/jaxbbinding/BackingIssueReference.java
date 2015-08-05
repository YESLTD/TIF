//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 03:54:57 PM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for BackingIssueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackingIssueReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="filter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="states" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="field" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backingTextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackingIssueReference")
public class BackingIssueReference
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "filter", required = true)
    protected String filter;
    @XmlAttribute(name = "states", required = true)
    protected String states;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "field")
    protected String field;
    @XmlAttribute(name = "backingTextFormat")
    protected String backingTextFormat;
    @XmlAttribute(name = "relationship")
    protected String relationship;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStates(String value) {
        this.states = value;
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
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the backingTextFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingTextFormat() {
        return backingTextFormat;
    }

    /**
     * Sets the value of the backingTextFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingTextFormat(String value) {
        this.backingTextFormat = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BackingIssueReference)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BackingIssueReference that = ((BackingIssueReference) object);
        {
            String lhsFilter;
            lhsFilter = this.getFilter();
            String rhsFilter;
            rhsFilter = that.getFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filter", lhsFilter), LocatorUtils.property(thatLocator, "filter", rhsFilter), lhsFilter, rhsFilter)) {
                return false;
            }
        }
        {
            String lhsStates;
            lhsStates = this.getStates();
            String rhsStates;
            rhsStates = that.getStates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "states", lhsStates), LocatorUtils.property(thatLocator, "states", rhsStates), lhsStates, rhsStates)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsField;
            lhsField = this.getField();
            String rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            String lhsBackingTextFormat;
            lhsBackingTextFormat = this.getBackingTextFormat();
            String rhsBackingTextFormat;
            rhsBackingTextFormat = that.getBackingTextFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backingTextFormat", lhsBackingTextFormat), LocatorUtils.property(thatLocator, "backingTextFormat", rhsBackingTextFormat), lhsBackingTextFormat, rhsBackingTextFormat)) {
                return false;
            }
        }
        {
            String lhsRelationship;
            lhsRelationship = this.getRelationship();
            String rhsRelationship;
            rhsRelationship = that.getRelationship();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationship", lhsRelationship), LocatorUtils.property(thatLocator, "relationship", rhsRelationship), lhsRelationship, rhsRelationship)) {
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
            String theFilter;
            theFilter = this.getFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filter", theFilter), currentHashCode, theFilter);
        }
        {
            String theStates;
            theStates = this.getStates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "states", theStates), currentHashCode, theStates);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            String theBackingTextFormat;
            theBackingTextFormat = this.getBackingTextFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backingTextFormat", theBackingTextFormat), currentHashCode, theBackingTextFormat);
        }
        {
            String theRelationship;
            theRelationship = this.getRelationship();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationship", theRelationship), currentHashCode, theRelationship);
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
            String theFilter;
            theFilter = this.getFilter();
            strategy.appendField(locator, this, "filter", buffer, theFilter);
        }
        {
            String theStates;
            theStates = this.getStates();
            strategy.appendField(locator, this, "states", buffer, theStates);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            String theBackingTextFormat;
            theBackingTextFormat = this.getBackingTextFormat();
            strategy.appendField(locator, this, "backingTextFormat", buffer, theBackingTextFormat);
        }
        {
            String theRelationship;
            theRelationship = this.getRelationship();
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        return buffer;
    }

}
