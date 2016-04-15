package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for series complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="series">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "series", propOrder = { "brandId", "seriesCode", "seriesId", "seriesName" })
public class Series {

	protected String brandId;
	protected String seriesCode;
	protected String seriesId;
	protected String seriesName;

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
	 * Gets the value of the seriesCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesCode() {
		return seriesCode;
	}

	/**
	 * Sets the value of the seriesCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesCode(String value) {
		this.seriesCode = value;
	}

	/**
	 * Gets the value of the seriesId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesId() {
		return seriesId;
	}

	/**
	 * Sets the value of the seriesId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesId(String value) {
		this.seriesId = value;
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
