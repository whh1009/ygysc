package com.car.model;

import java.util.List;

import com.car.tool.StringUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.svw.uc.ws.Make;

/**
 * 生产厂商
 * @author wanghonghui
 *
 */
public class MakeModel extends Model<MakeModel> {
	public static final MakeModel dao = new MakeModel();
	
	
	public List<MakeModel> wMake(String brandIds) {
		return find("select * from make where factoryid in (select factoryid from brand where brandId in ("+brandIds+"))");
	}
	
	
	public void saveMake(List<String> sqlList) {
		Db.batch(sqlList, 200);
	}
	
	public boolean deleteMake() {
		return StringUtil.intToBoolean(Db.update("delete from make"));
	}
}
