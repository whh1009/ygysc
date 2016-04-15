package com.car.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

public class RegionModel extends Model<RegionModel> {
	public final static RegionModel dao = new RegionModel();
	
	public List<RegionModel> getRegion() {
		return find("select * from tm_region");
	}
}
