//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 05:22:45 PM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

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
 * <p>Java class for ReverseRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverseRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relates" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default-columns" type="{http://www.ptc.com/integrity-solution}ColumnsDefinition" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="multivalued" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="trace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseRelationship", propOrder = {
    "relates",
    "defaultColumns",
    "query"
})
public class ReverseRelationship
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String relates;
    @XmlElement(name = "default-columns")
    protected ColumnsDefinition defaultColumns;
    protected String query;
    @XmlAttribute(name = "display")
    protected String display;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "multivalued")
    protected Boolean multivalued;
    @XmlAttribute(name = "trace")
    protected Boolean trace;

    /**
     * Gets the value of the relates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelates() {
        return relates;
    }

    /**
     * Sets the value of the relates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelates(String value) {
        this.relates = value;
    }

    /**
     * Gets the value of the defaultColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnsDefinition }
     *     
     */
    public ColumnsDefinition getDefaultColumns() {
        return defaultColumns;
    }

    /**
     * Sets the value of the defaultColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnsDefinition }
     *     
     */
    public void setDefaultColumns(ColumnsDefinition value) {
        this.defaultColumns = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
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
     * Gets the value of the multivalued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultivalued() {
        return multivalued;
    }

    /**
     * Sets the value of the multivalued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultivalued(Boolean value) {
        this.multivalued = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrace(Boolean value) {
        this.trace = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReverseRelationship)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReverseRelationship that = ((ReverseRelationship) object);
        {
            String lhsRelates;
            lhsRelates = this.getRelates();
            String rhsRelates;
            rhsRelates = that.getRelates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relates", lhsRelates), LocatorUtils.property(thatLocator, "relates", rhsRelates), lhsRelates, rhsRelates)) {
                return false;
            }
        }
        {
            ColumnsDefinition lhsDefaultColumns;
            lhsDefaultColumns = this.getDefaultColumns();
            ColumnsDefinition rhsDefaultColumns;
            rhsDefaultColumns = that.getDefaultColumns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultColumns", lhsDefaultColumns), LocatorUtils.property(thatLocator, "defaultColumns", rhsDefaultColumns), lhsDefaultColumns, rhsDefaultColumns)) {
                return false;
            }
        }
        {
            String lhsQuery;
            lhsQuery = this.getQuery();
            String rhsQuery;
            rhsQuery = that.getQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "query", lhsQuery), LocatorUtils.property(thatLocator, "query", rhsQuery), lhsQuery, rhsQuery)) {
                return false;
            }
        }
        {
            String lhsDisplay;
            lhsDisplay = this.getDisplay();
            String rhsDisplay;
            rhsDisplay = that.getDisplay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsMultivalued;
            lhsMultivalued = this.isMultivalued();
            Boolean rhsMultivalued;
            rhsMultivalued = that.isMultivalued();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multivalued", lhsMultivalued), LocatorUtils.property(thatLocator, "multivalued", rhsMultivalued), lhsMultivalued, rhsMultivalued)) {
                return false;
            }
        }
        {
            Boolean lhsTrace;
            lhsTrace = this.isTrace();
            Boolean rhsTrace;
            rhsTrace = that.isTrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trace", lhsTrace), LocatorUtils.property(thatLocator, "trace", rhsTrace), lhsTrace, rhsTrace)) {
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
            String theRelates;
            theRelates = this.getRelates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relates", theRelates), currentHashCode, theRelates);
        }
        {
            ColumnsDefinition theDefaultColumns;
            theDefaultColumns = this.getDefaultColumns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultColumns", theDefaultColumns), currentHashCode, theDefaultColumns);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "query", theQuery), currentHashCode, theQuery);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean theMultivalued;
            theMultivalued = this.isMultivalued();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multivalued", theMultivalued), currentHashCode, theMultivalued);
        }
        {
            Boolean theTrace;
            theTrace = this.isTrace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trace", theTrace), currentHashCode, theTrace);
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
            String theRelates;
            theRelates = this.getRelates();
            strategy.appendField(locator, this, "relates", buffer, theRelates);
        }
        {
            ColumnsDefinition theDefaultColumns;
            theDefaultColumns = this.getDefaultColumns();
            strategy.appendField(locator, this, "defaultColumns", buffer, theDefaultColumns);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            strategy.appendField(locator, this, "query", buffer, theQuery);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            strategy.appendField(locator, this, "display", buffer, theDisplay);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean theMultivalued;
            theMultivalued = this.isMultivalued();
            strategy.appendField(locator, this, "multivalued", buffer, theMultivalued);
        }
        {
            Boolean theTrace;
            theTrace = this.isTrace();
            strategy.appendField(locator, this, "trace", buffer, theTrace);
        }
        return buffer;
    }

}
