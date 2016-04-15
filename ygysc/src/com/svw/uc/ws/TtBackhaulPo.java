package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ttBackhaulPo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ttBackhaulPo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appointment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auditPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="backhaulId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bussnessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyModelA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyModelB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyModelC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyOtherA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyOtherB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyOtherC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributeShop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectShop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ulockTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usreNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ttBackhaulPo", propOrder = { "appointment", "auditPerson", "auditReason", "auditResult", "auditTime", "backhaulId", "budget", "bussnessId", "buyModelA", "buyModelB", "buyModelC", "buyOtherA", "buyOtherB", "buyOtherC", "callNumber", "city", "createBy", "createDate", "custName",
		"custSex", "distributeShop", "dlrName", "expectShop", "lockPerson", "lockTime", "mileage", "mobile", "orderType", "orderTypeDesc", "province", "readable", "regDate", "registId", "rn", "saleModel", "saleOther", "serviceNote", "sourceSite", "status", "statusDesc", "ulockTime", "updateBy",
		"updateDate", "usreNote", "validity" })
public class TtBackhaulPo {

	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar appointment;
	protected String auditPerson;
	protected String auditReason;
	protected String auditResult;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar auditTime;
	protected String backhaulId;
	protected String budget;
	protected String bussnessId;
	protected String buyModelA;
	protected String buyModelB;
	protected String buyModelC;
	protected String buyOtherA;
	protected String buyOtherB;
	protected String buyOtherC;
	protected String callNumber;
	protected String city;
	protected String createBy;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createDate;
	protected String custName;
	protected String custSex;
	protected String distributeShop;
	protected String dlrName;
	protected String expectShop;
	protected String lockPerson;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar lockTime;
	protected String mileage;
	protected String mobile;
	protected String orderType;
	protected String orderTypeDesc;
	protected String province;
	protected String readable;
	protected String regDate;
	protected String registId;
	protected String rn;
	protected String saleModel;
	protected String saleOther;
	protected String serviceNote;
	protected String sourceSite;
	protected String status;
	protected String statusDesc;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar ulockTime;
	protected String updateBy;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar updateDate;
	protected String usreNote;
	protected String validity;

	/**
	 * Gets the value of the appointment property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getAppointment() {
		return appointment;
	}

	/**
	 * Sets the value of the appointment property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setAppointment(XMLGregorianCalendar value) {
		this.appointment = value;
	}

	/**
	 * Gets the value of the auditPerson property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuditPerson() {
		return auditPerson;
	}

	/**
	 * Sets the value of the auditPerson property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuditPerson(String value) {
		this.auditPerson = value;
	}

	/**
	 * Gets the value of the auditReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuditReason() {
		return auditReason;
	}

	/**
	 * Sets the value of the auditReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuditReason(String value) {
		this.auditReason = value;
	}

	/**
	 * Gets the value of the auditResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuditResult() {
		return auditResult;
	}

	/**
	 * Sets the value of the auditResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuditResult(String value) {
		this.auditResult = value;
	}

	/**
	 * Gets the value of the auditTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getAuditTime() {
		return auditTime;
	}

	/**
	 * Sets the value of the auditTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setAuditTime(XMLGregorianCalendar value) {
		this.auditTime = value;
	}

	/**
	 * Gets the value of the backhaulId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBackhaulId() {
		return backhaulId;
	}

	/**
	 * Sets the value of the backhaulId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBackhaulId(String value) {
		this.backhaulId = value;
	}

	/**
	 * Gets the value of the budget property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBudget() {
		return budget;
	}

	/**
	 * Sets the value of the budget property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBudget(String value) {
		this.budget = value;
	}

	/**
	 * Gets the value of the bussnessId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBussnessId() {
		return bussnessId;
	}

	/**
	 * Sets the value of the bussnessId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBussnessId(String value) {
		this.bussnessId = value;
	}

	/**
	 * Gets the value of the buyModelA property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyModelA() {
		return buyModelA;
	}

	/**
	 * Sets the value of the buyModelA property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyModelA(String value) {
		this.buyModelA = value;
	}

	/**
	 * Gets the value of the buyModelB property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyModelB() {
		return buyModelB;
	}

	/**
	 * Sets the value of the buyModelB property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyModelB(String value) {
		this.buyModelB = value;
	}

	/**
	 * Gets the value of the buyModelC property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyModelC() {
		return buyModelC;
	}

	/**
	 * Sets the value of the buyModelC property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyModelC(String value) {
		this.buyModelC = value;
	}

	/**
	 * Gets the value of the buyOtherA property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyOtherA() {
		return buyOtherA;
	}

	/**
	 * Sets the value of the buyOtherA property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyOtherA(String value) {
		this.buyOtherA = value;
	}

	/**
	 * Gets the value of the buyOtherB property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyOtherB() {
		return buyOtherB;
	}

	/**
	 * Sets the value of the buyOtherB property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyOtherB(String value) {
		this.buyOtherB = value;
	}

	/**
	 * Gets the value of the buyOtherC property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyOtherC() {
		return buyOtherC;
	}

	/**
	 * Sets the value of the buyOtherC property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyOtherC(String value) {
		this.buyOtherC = value;
	}

	/**
	 * Gets the value of the callNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * Sets the value of the callNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCallNumber(String value) {
		this.callNumber = value;
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
	 * Gets the value of the createBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * Sets the value of the createBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreateBy(String value) {
		this.createBy = value;
	}

	/**
	 * Gets the value of the createDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the value of the createDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreateDate(XMLGregorianCalendar value) {
		this.createDate = value;
	}

	/**
	 * Gets the value of the custName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * Sets the value of the custName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustName(String value) {
		this.custName = value;
	}

	/**
	 * Gets the value of the custSex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustSex() {
		return custSex;
	}

	/**
	 * Sets the value of the custSex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustSex(String value) {
		this.custSex = value;
	}

	/**
	 * Gets the value of the distributeShop property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDistributeShop() {
		return distributeShop;
	}

	/**
	 * Sets the value of the distributeShop property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDistributeShop(String value) {
		this.distributeShop = value;
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
	 * Gets the value of the expectShop property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpectShop() {
		return expectShop;
	}

	/**
	 * Sets the value of the expectShop property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpectShop(String value) {
		this.expectShop = value;
	}

	/**
	 * Gets the value of the lockPerson property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLockPerson() {
		return lockPerson;
	}

	/**
	 * Sets the value of the lockPerson property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLockPerson(String value) {
		this.lockPerson = value;
	}

	/**
	 * Gets the value of the lockTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLockTime() {
		return lockTime;
	}

	/**
	 * Sets the value of the lockTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLockTime(XMLGregorianCalendar value) {
		this.lockTime = value;
	}

	/**
	 * Gets the value of the mileage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMileage() {
		return mileage;
	}

	/**
	 * Sets the value of the mileage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMileage(String value) {
		this.mileage = value;
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
	 * Gets the value of the orderType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * Sets the value of the orderType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderType(String value) {
		this.orderType = value;
	}

	/**
	 * Gets the value of the orderTypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderTypeDesc() {
		return orderTypeDesc;
	}

	/**
	 * Sets the value of the orderTypeDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderTypeDesc(String value) {
		this.orderTypeDesc = value;
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
	 * Gets the value of the readable property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReadable() {
		return readable;
	}

	/**
	 * Sets the value of the readable property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReadable(String value) {
		this.readable = value;
	}

	/**
	 * Gets the value of the regDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegDate() {
		return regDate;
	}

	/**
	 * Sets the value of the regDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegDate(String value) {
		this.regDate = value;
	}

	/**
	 * Gets the value of the registId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegistId() {
		return registId;
	}

	/**
	 * Sets the value of the registId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegistId(String value) {
		this.registId = value;
	}

	/**
	 * Gets the value of the rn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRn() {
		return rn;
	}

	/**
	 * Sets the value of the rn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRn(String value) {
		this.rn = value;
	}

	/**
	 * Gets the value of the saleModel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSaleModel() {
		return saleModel;
	}

	/**
	 * Sets the value of the saleModel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSaleModel(String value) {
		this.saleModel = value;
	}

	/**
	 * Gets the value of the saleOther property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSaleOther() {
		return saleOther;
	}

	/**
	 * Sets the value of the saleOther property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSaleOther(String value) {
		this.saleOther = value;
	}

	/**
	 * Gets the value of the serviceNote property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceNote() {
		return serviceNote;
	}

	/**
	 * Sets the value of the serviceNote property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceNote(String value) {
		this.serviceNote = value;
	}

	/**
	 * Gets the value of the sourceSite property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSourceSite() {
		return sourceSite;
	}

	/**
	 * Sets the value of the sourceSite property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSourceSite(String value) {
		this.sourceSite = value;
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
	 * Gets the value of the statusDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * Sets the value of the statusDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatusDesc(String value) {
		this.statusDesc = value;
	}

	/**
	 * Gets the value of the ulockTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUlockTime() {
		return ulockTime;
	}

	/**
	 * Sets the value of the ulockTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUlockTime(XMLGregorianCalendar value) {
		this.ulockTime = value;
	}

	/**
	 * Gets the value of the updateBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * Sets the value of the updateBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUpdateBy(String value) {
		this.updateBy = value;
	}

	/**
	 * Gets the value of the updateDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * Sets the value of the updateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUpdateDate(XMLGregorianCalendar value) {
		this.updateDate = value;
	}

	/**
	 * Gets the value of the usreNote property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsreNote() {
		return usreNote;
	}

	/**
	 * Sets the value of the usreNote property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsreNote(String value) {
		this.usreNote = value;
	}

	/**
	 * Gets the value of the validity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidity() {
		return validity;
	}

	/**
	 * Sets the value of the validity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidity(String value) {
		this.validity = value;
	}

}
