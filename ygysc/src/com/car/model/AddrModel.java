package com.car.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

/**
 * 地址坐标
 * @author wanghonghui
 *
 */
public class AddrModel extends Model<AddrModel> {
	public final static AddrModel dao = new AddrModel();
	
	public List<AddrModel> getAddr() {
		return find("select * from address");
	}
}
