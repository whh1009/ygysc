package com.car.model;

import java.util.List;

import com.car.tool.StringUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.svw.uc.ws.Brand;

/**
 * 品牌
 * @author wanghonghui
 *
 */
public class BrandModel extends Model<BrandModel> {
	public static final BrandModel dao = new BrandModel();
	
	public List<BrandModel> wBrand() {
		return find("select * from brand");
	}
	
	public List<BrandModel> wBrand(String brandId) {
		return find("select * from brand where brandId in ("+brandId+")");
	}
	
	/**
	 * 合并品牌 
	 * @return
	 */
	public List<BrandModel> wBrandHb() {
		return find("select GROUP_CONCAT(brandid  SEPARATOR ',') bids, brandName bname from brand group by brandName order by factoryId");
	}
	
	/**
	 * 保存brand
	 * @return
	 */
	public void saveBrand(List<String> sqlList) {
		Db.batch(sqlList, 200);
	}
	
	public boolean deleteBrand() {
		return StringUtil.intToBoolean(Db.update("delete from brand"));
	}
}
