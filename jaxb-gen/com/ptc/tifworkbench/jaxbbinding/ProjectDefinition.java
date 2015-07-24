//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 04:21:50 PM BST 
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
 * <p>Java class for ProjectDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="openImage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="closedImage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="permittedGroups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectDefinition")
public class ProjectDefinition
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "parent")
    protected String parent;
    @XmlAttribute(name = "openImage")
    protected String openImage;
    @XmlAttribute(name = "closedImage")
    protected String closedImage;
    @XmlAttribute(name = "permittedGroups")
    protected String permittedGroups;
    @XmlAttribute(name = "description")
    protected String description;

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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the openImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenImage() {
        return openImage;
    }

    /**
     * Sets the value of the openImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenImage(String value) {
        this.openImage = value;
    }

    /**
     * Gets the value of the closedImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedImage() {
        return closedImage;
    }

    /**
     * Sets the value of the closedImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedImage(String value) {
        this.closedImage = value;
    }

    /**
     * Gets the value of the permittedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermittedGroups() {
        return permittedGroups;
    }

    /**
     * Sets the value of the permittedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermittedGroups(String value) {
        this.permittedGroups = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProjectDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProjectDefinition that = ((ProjectDefinition) object);
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
            String lhsParent;
            lhsParent = this.getParent();
            String rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent)) {
                return false;
            }
        }
        {
            String lhsOpenImage;
            lhsOpenImage = this.getOpenImage();
            String rhsOpenImage;
            rhsOpenImage = that.getOpenImage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openImage", lhsOpenImage), LocatorUtils.property(thatLocator, "openImage", rhsOpenImage), lhsOpenImage, rhsOpenImage)) {
                return false;
            }
        }
        {
            String lhsClosedImage;
            lhsClosedImage = this.getClosedImage();
            String rhsClosedImage;
            rhsClosedImage = that.getClosedImage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "closedImage", lhsClosedImage), LocatorUtils.property(thatLocator, "closedImage", rhsClosedImage), lhsClosedImage, rhsClosedImage)) {
                return false;
            }
        }
        {
            String lhsPermittedGroups;
            lhsPermittedGroups = this.getPermittedGroups();
            String rhsPermittedGroups;
            rhsPermittedGroups = that.getPermittedGroups();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permittedGroups", lhsPermittedGroups), LocatorUtils.property(thatLocator, "permittedGroups", rhsPermittedGroups), lhsPermittedGroups, rhsPermittedGroups)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parent", theParent), currentHashCode, theParent);
        }
        {
            String theOpenImage;
            theOpenImage = this.getOpenImage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openImage", theOpenImage), currentHashCode, theOpenImage);
        }
        {
            String theClosedImage;
            theClosedImage = this.getClosedImage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "closedImage", theClosedImage), currentHashCode, theClosedImage);
        }
        {
            String thePermittedGroups;
            thePermittedGroups = this.getPermittedGroups();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permittedGroups", thePermittedGroups), currentHashCode, thePermittedGroups);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent);
        }
        {
            String theOpenImage;
            theOpenImage = this.getOpenImage();
            strategy.appendField(locator, this, "openImage", buffer, theOpenImage);
        }
        {
            String theClosedImage;
            theClosedImage = this.getClosedImage();
            strategy.appendField(locator, this, "closedImage", buffer, theClosedImage);
        }
        {
            String thePermittedGroups;
            thePermittedGroups = this.getPermittedGroups();
            strategy.appendField(locator, this, "permittedGroups", buffer, thePermittedGroups);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        return buffer;
    }

}
