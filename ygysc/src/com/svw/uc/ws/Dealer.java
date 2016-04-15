package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dealer complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dealer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkmanPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sstCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucMngMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealer", propOrder = { "address", "area", "city", "companyType", "dlrBrand", "dlrCode", "dlrId", "dlrName", "dlrShortName", "fax", "hotline", "linkman", "linkmanPhone", "phone",
		"principal", "province", "sstCode", "status", "telephone", "ucManager", "ucMngMobile", "zip", "eMail" })
public class Dealer {

	protected String address;
	protected String area;
	protected String city;
	protected String companyType;
	protected String dlrBrand;
	protected String dlrCode;
	protected String dlrId;
	protected String dlrName;
	protected String dlrShortName;
	protected String fax;
	protected String hotline;
	protected String linkman;
	protected String linkmanPhone;
	protected String phone;
	protected String principal;
	protected String province;
	protected String sstCode;
	protected String status;
	protected String telephone;
	protected String ucManager;
	protected String ucMngMobile;
	protected String zip;
	protected String eMail;

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * Gets the value of the area property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Sets the value of the area property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArea(String value) {
		this.area = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the companyType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyType() {
		return companyType;
	}

	/**
	 * Sets the value of the companyType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyType(String value) {
		this.companyType = value;
	}

	/**
	 * Gets the value of the dlrBrand property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDlrBrand() {
		return dlrBrand;
	}

	/**
	 * Sets the value of the dlrBrand property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDlrBrand(String value) {
		this.dlrBrand = value;
	}

	/**
	 * Gets the value of the dlrCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDlrCode() {
		return dlrCode;
	}

	/**
	 * Sets the value of the dlrCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDlrCode(String value) {
		this.dlrCode = value;
	}

	/**
	 * Gets the value of the dlrId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDlrId() {
		return dlrId;
	}

	/**
	 * Sets the value of the dlrId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDlrId(String value) {
		this.dlrId = value;
	}

	/**
	 * Gets the value of the dlrName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDlrName() {
		return dlrName;
	}

	/**
	 * Sets the value of the dlrName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDlrName(String value) {
		this.dlrName = value;
	}

	/**
	 * Gets the value of the dlrShortName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDlrShortName() {
		return dlrShortName;
	}

	/**
	 * Sets the value of the dlrShortName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDlrShortName(String value) {
		this.dlrShortName = value;
	}

	/**
	 * Gets the value of the fax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the value of the fax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFax(String value) {
		this.fax = value;
	}

	/**
	 * Gets the value of the hotline property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHotline() {
		return hotline;
	}

	/**
	 * Sets the value of the hotline property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHotline(String value) {
		this.hotline = value;
	}

	/**
	 * Gets the value of the linkman property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkman() {
		return linkman;
	}

	/**
	 * Sets the value of the linkman property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkman(String value) {
		this.linkman = value;
	}

	/**
	 * Gets the value of the linkmanPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkmanPhone() {
		return linkmanPhone;
	}

	/**
	 * Sets the value of the linkmanPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkmanPhone(String value) {
		this.linkmanPhone = value;
	}

	/**
	 * Gets the value of the phone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the value of the phone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhone(String value) {
		this.phone = value;
	}

	/**
	 * Gets the value of the principal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrincipal() {
		return principal;
	}

	/**
	 * Sets the value of the principal property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrincipal(String value) {
		this.principal = value;
	}

	/**
	 * Gets the value of the province property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the value of the province property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProvince(String value) {
		this.province = value;
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
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the telephone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets the value of the telephone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTelephone(String value) {
		this.telephone = value;
	}

	/**
	 * Gets the value of the ucManager property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUcManager() {
		return ucManager;
	}

	/**
	 * Sets the value of the ucManager property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUcManager(String value) {
		this.ucManager = value;
	}

	/**
	 * Gets the value of the ucMngMobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUcMngMobile() {
		return ucMngMobile;
	}

	/**
	 * Sets the value of the ucMngMobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUcMngMobile(String value) {
		this.ucMngMobile = value;
	}

	/**
	 * Gets the value of the zip property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the value of the zip property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZip(String value) {
		this.zip = value;
	}

	/**
	 * Gets the value of the eMail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEMail() {
		return eMail;
	}

	/**
	 * Sets the value of the eMail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEMail(String value) {
		this.eMail = value;
	}

}
