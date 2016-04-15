package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for make complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="make">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "make", propOrder = { "country", "factory", "factoryId" })
public class Make {

	protected String country;
	protected String factory;
	protected String factoryId;

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountry(String value) {
		this.country = value;
	}

	/**
	 * Gets the value of the factory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactory() {
		return factory;
	}

	/**
	 * Sets the value of the factory property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactory(String value) {
		this.factory = value;
	}

	/**
	 * Gets the value of the factoryId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactoryId() {
		return factoryId;
	}

	/**
	 * Sets the value of the factoryId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactoryId(String value) {
		this.factoryId = value;
	}

}
