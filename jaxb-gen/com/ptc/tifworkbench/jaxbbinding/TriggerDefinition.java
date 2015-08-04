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
 * <p>Java class for TriggerDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="script" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="run-as" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="script-timing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.ptc.com/integrity-solution}TriggerType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerDefinition", propOrder = {
    "description",
    "script",
    "rule",
    "query",
    "runAs",
    "frequency",
    "scriptTiming",
    "params"
})
public class TriggerDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String script;
    @XmlElement(required = true)
    protected String rule;
    @XmlElement(required = true)
    protected String query;
    @XmlElement(name = "run-as", required = true)
    protected String runAs;
    @XmlElement(required = true)
    protected String frequency;
    @XmlElement(name = "script-timing", required = true)
    protected String scriptTiming;
    @XmlElement(required = true)
    protected String params;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type")
    protected TriggerType type;

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
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
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
     * Gets the value of the runAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunAs() {
        return runAs;
    }

    /**
     * Sets the value of the runAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunAs(String value) {
        this.runAs = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the scriptTiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptTiming() {
        return scriptTiming;
    }

    /**
     * Sets the value of the scriptTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptTiming(String value) {
        this.scriptTiming = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerType }
     *     
     */
    public TriggerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerType }
     *     
     */
    public void setType(TriggerType value) {
        this.type = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TriggerDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TriggerDefinition that = ((TriggerDefinition) object);
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
            String lhsScript;
            lhsScript = this.getScript();
            String rhsScript;
            rhsScript = that.getScript();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "script", lhsScript), LocatorUtils.property(thatLocator, "script", rhsScript), lhsScript, rhsScript)) {
                return false;
            }
        }
        {
            String lhsRule;
            lhsRule = this.getRule();
            String rhsRule;
            rhsRule = that.getRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rule", lhsRule), LocatorUtils.property(thatLocator, "rule", rhsRule), lhsRule, rhsRule)) {
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
            String lhsRunAs;
            lhsRunAs = this.getRunAs();
            String rhsRunAs;
            rhsRunAs = that.getRunAs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runAs", lhsRunAs), LocatorUtils.property(thatLocator, "runAs", rhsRunAs), lhsRunAs, rhsRunAs)) {
                return false;
            }
        }
        {
            String lhsFrequency;
            lhsFrequency = this.getFrequency();
            String rhsFrequency;
            rhsFrequency = that.getFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency)) {
                return false;
            }
        }
        {
            String lhsScriptTiming;
            lhsScriptTiming = this.getScriptTiming();
            String rhsScriptTiming;
            rhsScriptTiming = that.getScriptTiming();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scriptTiming", lhsScriptTiming), LocatorUtils.property(thatLocator, "scriptTiming", rhsScriptTiming), lhsScriptTiming, rhsScriptTiming)) {
                return false;
            }
        }
        {
            String lhsParams;
            lhsParams = this.getParams();
            String rhsParams;
            rhsParams = that.getParams();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "params", lhsParams), LocatorUtils.property(thatLocator, "params", rhsParams), lhsParams, rhsParams)) {
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
            TriggerType lhsType;
            lhsType = this.getType();
            TriggerType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theScript;
            theScript = this.getScript();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "script", theScript), currentHashCode, theScript);
        }
        {
            String theRule;
            theRule = this.getRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rule", theRule), currentHashCode, theRule);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "query", theQuery), currentHashCode, theQuery);
        }
        {
            String theRunAs;
            theRunAs = this.getRunAs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runAs", theRunAs), currentHashCode, theRunAs);
        }
        {
            String theFrequency;
            theFrequency = this.getFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency);
        }
        {
            String theScriptTiming;
            theScriptTiming = this.getScriptTiming();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scriptTiming", theScriptTiming), currentHashCode, theScriptTiming);
        }
        {
            String theParams;
            theParams = this.getParams();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "params", theParams), currentHashCode, theParams);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            TriggerType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theScript;
            theScript = this.getScript();
            strategy.appendField(locator, this, "script", buffer, theScript);
        }
        {
            String theRule;
            theRule = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theRule);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            strategy.appendField(locator, this, "query", buffer, theQuery);
        }
        {
            String theRunAs;
            theRunAs = this.getRunAs();
            strategy.appendField(locator, this, "runAs", buffer, theRunAs);
        }
        {
            String theFrequency;
            theFrequency = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theFrequency);
        }
        {
            String theScriptTiming;
            theScriptTiming = this.getScriptTiming();
            strategy.appendField(locator, this, "scriptTiming", buffer, theScriptTiming);
        }
        {
            String theParams;
            theParams = this.getParams();
            strategy.appendField(locator, this, "params", buffer, theParams);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            TriggerType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
