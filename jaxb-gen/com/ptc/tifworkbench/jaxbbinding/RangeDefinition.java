//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 11:05:25 AM CEST 
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
 * <p>Java class for RangeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="upper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lower" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeDefinition", propOrder = {
    "value"
})
public class RangeDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String value;
    @XmlAttribute(name = "upper")
    protected String upper;
    @XmlAttribute(name = "lower")
    protected String lower;
    @XmlAttribute(name = "icon")
    protected String icon;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpper(String value) {
        this.upper = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLower(String value) {
        this.lower = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RangeDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RangeDefinition that = ((RangeDefinition) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsUpper;
            lhsUpper = this.getUpper();
            String rhsUpper;
            rhsUpper = that.getUpper();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upper", lhsUpper), LocatorUtils.property(thatLocator, "upper", rhsUpper), lhsUpper, rhsUpper)) {
                return false;
            }
        }
        {
            String lhsLower;
            lhsLower = this.getLower();
            String rhsLower;
            rhsLower = that.getLower();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lower", lhsLower), LocatorUtils.property(thatLocator, "lower", rhsLower), lhsLower, rhsLower)) {
                return false;
            }
        }
        {
            String lhsIcon;
            lhsIcon = this.getIcon();
            String rhsIcon;
            rhsIcon = that.getIcon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icon", lhsIcon), LocatorUtils.property(thatLocator, "icon", rhsIcon), lhsIcon, rhsIcon)) {
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
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theUpper;
            theUpper = this.getUpper();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upper", theUpper), currentHashCode, theUpper);
        }
        {
            String theLower;
            theLower = this.getLower();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lower", theLower), currentHashCode, theLower);
        }
        {
            String theIcon;
            theIcon = this.getIcon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icon", theIcon), currentHashCode, theIcon);
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theUpper;
            theUpper = this.getUpper();
            strategy.appendField(locator, this, "upper", buffer, theUpper);
        }
        {
            String theLower;
            theLower = this.getLower();
            strategy.appendField(locator, this, "lower", buffer, theLower);
        }
        {
            String theIcon;
            theIcon = this.getIcon();
            strategy.appendField(locator, this, "icon", buffer, theIcon);
        }
        return buffer;
    }

}
