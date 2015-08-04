//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 01:34:17 PM CEST 
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
 * <p>Java class for QueryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default-columns" type="{http://www.ptc.com/integrity-solution}ColumnsDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="admin" type="{http://www.ptc.com/integrity-solution}YesNo" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="share-groups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDefinition", propOrder = {
    "definition",
    "description",
    "defaultColumns"
})
public class QueryDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "default-columns")
    protected ColumnsDefinition defaultColumns;
    @XmlAttribute(name = "admin")
    protected YesNo admin;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "share-groups")
    protected String shareGroups;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAdmin(YesNo value) {
        this.admin = value;
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
     * Gets the value of the shareGroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareGroups() {
        return shareGroups;
    }

    /**
     * Sets the value of the shareGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareGroups(String value) {
        this.shareGroups = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QueryDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QueryDefinition that = ((QueryDefinition) object);
        {
            String lhsDefinition;
            lhsDefinition = this.getDefinition();
            String rhsDefinition;
            rhsDefinition = that.getDefinition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "definition", lhsDefinition), LocatorUtils.property(thatLocator, "definition", rhsDefinition), lhsDefinition, rhsDefinition)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
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
            YesNo lhsAdmin;
            lhsAdmin = this.getAdmin();
            YesNo rhsAdmin;
            rhsAdmin = that.getAdmin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "admin", lhsAdmin), LocatorUtils.property(thatLocator, "admin", rhsAdmin), lhsAdmin, rhsAdmin)) {
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
            String lhsShareGroups;
            lhsShareGroups = this.getShareGroups();
            String rhsShareGroups;
            rhsShareGroups = that.getShareGroups();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareGroups", lhsShareGroups), LocatorUtils.property(thatLocator, "shareGroups", rhsShareGroups), lhsShareGroups, rhsShareGroups)) {
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
            String theDefinition;
            theDefinition = this.getDefinition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "definition", theDefinition), currentHashCode, theDefinition);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            ColumnsDefinition theDefaultColumns;
            theDefaultColumns = this.getDefaultColumns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultColumns", theDefaultColumns), currentHashCode, theDefaultColumns);
        }
        {
            YesNo theAdmin;
            theAdmin = this.getAdmin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "admin", theAdmin), currentHashCode, theAdmin);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theShareGroups;
            theShareGroups = this.getShareGroups();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareGroups", theShareGroups), currentHashCode, theShareGroups);
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
            String theDefinition;
            theDefinition = this.getDefinition();
            strategy.appendField(locator, this, "definition", buffer, theDefinition);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ColumnsDefinition theDefaultColumns;
            theDefaultColumns = this.getDefaultColumns();
            strategy.appendField(locator, this, "defaultColumns", buffer, theDefaultColumns);
        }
        {
            YesNo theAdmin;
            theAdmin = this.getAdmin();
            strategy.appendField(locator, this, "admin", buffer, theAdmin);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theShareGroups;
            theShareGroups = this.getShareGroups();
            strategy.appendField(locator, this, "shareGroups", buffer, theShareGroups);
        }
        return buffer;
    }

}
