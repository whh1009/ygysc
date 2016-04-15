package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for authProduct complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="authProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="milleage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sstCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authProduct", propOrder = { "milleage", "mobile", "name", "productCode", "receiptDate", "saleDate", "sstCode", "vin" })
public class AuthProduct {

	protected Integer milleage;
	protected String mobile;
	protected String name;
	protected String productCode;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar receiptDate;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar saleDate;
	protected String sstCode;
	protected String vin;

	/**
	 * Gets the value of the milleage property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMilleage() {
		return milleage;
	}

	/**
	 * Sets the value of the milleage property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMilleage(Integer value) {
		this.milleage = value;
	}

	/**
	 * Gets the value of the mobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the value of the mobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobile(String value) {
		this.mobile = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the productCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Sets the value of the productCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductCode(String value) {
		this.productCode = value;
	}

	/**
	 * Gets the value of the receiptDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getReceiptDate() {
		return receiptDate;
	}

	/**
	 * Sets the value of the receiptDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setReceiptDate(XMLGregorianCalendar value) {
		this.receiptDate = value;
	}

	/**
	 * Gets the value of the saleDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSaleDate() {
		return saleDate;
	}

	/**
	 * Sets the value of the saleDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSaleDate(XMLGregorianCalendar value) {
		this.saleDate = value;
	}

	/**
	 * Gets the value of the sstCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSstCode() {
		return sstCode;
	}

	/**
	 * Sets the value of the sstCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSstCode(String value) {
		this.sstCode = value;
	}

	/**
	 * Gets the value of the vin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * Sets the value of the vin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVin(String value) {
		this.vin = value;
	}

}
