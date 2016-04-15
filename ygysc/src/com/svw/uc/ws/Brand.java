package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for brand complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="brand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShsvwBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brand", propOrder = { "brandCode", "brandId", "brandName", "factoryId", "firstLetter", "isShsvwBrand", "seriesName" })
public class Brand {

	protected String brandCode;
	protected String brandId;
	protected String brandName;
	protected String factoryId;
	protected String firstLetter;
	protected String isShsvwBrand;
	protected String seriesName;

	/**
	 * Gets the value of the brandCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBrandCode() {
		return brandCode;
	}

	/**
	 * Sets the value of the brandCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBrandCode(String value) {
		this.brandCode = value;
	}

	/**
	 * Gets the value of the brandId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * Sets the value of the brandId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBrandId(String value) {
		this.brandId = value;
	}

	/**
	 * Gets the value of the brandName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the value of the brandName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBrandName(String value) {
		this.brandName = value;
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

	/**
	 * Gets the value of the firstLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstLetter() {
		return firstLetter;
	}

	/**
	 * Sets the value of the firstLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstLetter(String value) {
		this.firstLetter = value;
	}

	/**
	 * Gets the value of the isShsvwBrand property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsShsvwBrand() {
		return isShsvwBrand;
	}

	/**
	 * Sets the value of the isShsvwBrand property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsShsvwBrand(String value) {
		this.isShsvwBrand = value;
	}

	/**
	 * Gets the value of the seriesName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesName() {
		return seriesName;
	}

	/**
	 * Sets the value of the seriesName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesName(String value) {
		this.seriesName = value;
	}

}
