package com.svw.uc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ttBackhaulPO" type="{http://ws.uc.svw.com/}ttBackhaulPo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "ttBackhaulPO" })
public class Save {

	protected TtBackhaulPo ttBackhaulPO;

	/**
	 * Gets the value of the ttBackhaulPO property.
	 * 
	 * @return possible object is {@link TtBackhaulPo }
	 * 
	 */
	public TtBackhaulPo getTtBackhaulPO() {
		return ttBackhaulPO;
	}

	/**
	 * Sets the value of the ttBackhaulPO property.
	 * 
	 * @param value
	 *            allowed object is {@link TtBackhaulPo }
	 * 
	 */
	public void setTtBackhaulPO(TtBackhaulPo value) {
		this.ttBackhaulPO = value;
	}

}
