package com.car.tool;

import java.util.List;

import com.svw.uc.ws.BackHaukResult;
import com.svw.uc.ws.Brand;
import com.svw.uc.ws.Make;
import com.svw.uc.ws.Series;
import com.svw.uc.ws.TtBackhaulPo;
import com.svw.uc.ws.impl.BackhaulService;
import com.svw.uc.ws.impl.BaseService;
import com.svw.uc.ws.impl.IBackhaul;
import com.svw.uc.ws.impl.IBase;

public class Test2 {

	public static void main(String[] args) throws Exception {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
//		List<Make> list = ib.queryMake();
//		for(Make m : list) {
//			System.out.println("insert into make values ("+m.getFactoryId()+",'"+m.getFactory()+"','"+m.getCountry()+"');");
//		}
//		List<Brand> list = ib.queryBrand();
//		for(Brand m : list) {
//			System.out.println("insert into brand values ("+m.getFactoryId()+",'"+m.getFactoryId()+"','"+m.getSeriesName()+"','"+m.getBrandCode()+"', '"+m.getIsShsvwBrand()+"', '"+m.getBrandName()+"', '"+m.getBrandId()+"');");
//		}
		List<Series> list = ib.querySeries();
		for(Series s : list) {
			System.out.println("insert into series values ('"+s.getSeriesName()+"', '"+s.getSeriesCode()+"', '"+s.getBrandId()+"', '"+s.getSeriesId()+"');");
		}
	}

}
