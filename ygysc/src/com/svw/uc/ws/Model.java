package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for model complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="model">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noticeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "model", propOrder = { "modelCode", "modelId", "modelMonth", "modelName", "modelYear", "noticeCode", "seriesId" })
public class Model {

	protected String modelCode;
	protected String modelId;
	protected String modelMonth;
	protected String modelName;
	protected String modelYear;
	protected String noticeCode;
	protected String seriesId;

	/**
	 * Gets the value of the modelCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelCode() {
		return modelCode;
	}

	/**
	 * Sets the value of the modelCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelCode(String value) {
		this.modelCode = value;
	}

	/**
	 * Gets the value of the modelId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelId() {
		return modelId;
	}

	/**
	 * Sets the value of the modelId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelId(String value) {
		this.modelId = value;
	}

	/**
	 * Gets the value of the modelMonth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelMonth() {
		return modelMonth;
	}

	/**
	 * Sets the value of the modelMonth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelMonth(String value) {
		this.modelMonth = value;
	}

	/**
	 * Gets the value of the modelName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Sets the value of the modelName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelName(String value) {
		this.modelName = value;
	}

	/**
	 * Gets the value of the modelYear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelYear() {
		return modelYear;
	}

	/**
	 * Sets the value of the modelYear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelYear(String value) {
		this.modelYear = value;
	}

	/**
	 * Gets the value of the noticeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNoticeCode() {
		return noticeCode;
	}

	/**
	 * Sets the value of the noticeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNoticeCode(String value) {
		this.noticeCode = value;
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

}
