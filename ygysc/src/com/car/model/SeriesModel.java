package com.car.model;

import java.util.List;

import com.car.tool.StringUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;

/**
 * 车系
 * @author wanghonghui
 *
 */
public class SeriesModel extends Model<SeriesModel> {
	public static final SeriesModel dao = new SeriesModel();
	
	public List<SeriesModel> getSeriesByBrandId(String fid) {
		return find("select * from series where brandId = (select brandId from brand where factoryId = ?)", fid);
	}
	
	public void saveSeries(List<String> sqlList) {
		Db.batch(sqlList, 200);
	}
	
	public boolean deleteSeries() {
		return StringUtil.intToBoolean(Db.update("delete from series"));
	}
}
