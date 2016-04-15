package com.car.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.car.exception.BaseBussException;
import com.car.model.CarInfo;
import com.car.model.Pic;
import com.car.model.PicModel;
import com.car.model.VhclModel;
import com.car.tool.StringUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

/**
 * 车源检索 service
 * 
 * @author 王宏慧
 * 
 */
public class CarSourceService {
	Logger log = Logger.getLogger(CarInfoService.class);

	/**
	 * 保存车辆信息
	 * 
	 * @param factoryId
	 * @param country
	 * @param factory
	 * @param brandId
	 * @param brandName
	 * @param seriesId
	 * @param seriesName
	 * @param modelId
	 * @param modelName
	 * @param vhclId
	 * @param productYear
	 * @param discharge
	 * @param turbo
	 * @param efflStd
	 * @param vhclColor
	 * @param registerDate
	 * @param vhclRegProv
	 * @param vhclRegCity
	 * @param vhclAddrProv
	 * @param vhclAddrCity
	 * @param useNature
	 * @param tableShowMileage
	 * @param insurancePeriod
	 * @param yearCheckDate
	 * @param vin
	 * @param personality
	 * @param vhclLic
	 * @param authNo
	 * @param displayPrice
	 * @param dlrCode
	 * @param dlrName
	 * @param hotline
	 * @return
	 */
	public boolean saveCar(String factoryId, String country, String factory, String brandId, String brandName, String seriesId, String seriesName, String modelId, String modelName, String vhclId,
			String productYear, String discharge, String turbo, String efflStd, String vhclColor, String registerDate, String vhclRegProv, String vhclRegCity, String vhclAddrProv,
			String vhclAddrCity, String useNature, String tableShowMileage, String insurancePeriod, String yearCheckDate, String vin, String personality, String vhclLic, String authNo,
			double displayPrice, String dlrCode, String dlrName, String hotline, String gearboxMode, String gears) {
		VhclModel v = new VhclModel();
		v.set("factoryId", factoryId).set("country", country).set("factory", factory).set("brandId", brandId).set("brandName", brandName).set("seriesId", seriesId).set("seriesName", seriesName)
				.set("modelId", modelId).set("modelName", modelName).set("vhclId", vhclId).set("productYear", productYear).set("discharge", discharge).set("turbo", turbo).set("efflStd", efflStd)
				.set("vhclColor", vhclColor).set("registerDate", registerDate).set("vhclRegProv", vhclRegProv).set("vhclRegCity", vhclRegCity).set("vhclAddrProv", vhclAddrProv)
				.set("vhclAddrCity", vhclAddrCity).set("useNature", useNature).set("tableShowMileage", tableShowMileage).set("insurancePeriod", insurancePeriod).set("yearCheckDate", yearCheckDate)
				.set("vin", vin).set("personality", personality).set("vhclLic", vhclLic).set("authNo", authNo).set("displayPrice", displayPrice).set("dlrCode", dlrCode).set("dlrName", dlrName)
				.set("hotline", hotline).set("gearboxMode", gearboxMode).set("gears", gears);//.set("picId", picIds);
		return VhclModel.dao.saveCar(v);
	}

	/**
	 * 批量插入图片，并返回主键ID
	 * 
	 * @param list
	 * @return
	 */
//	public Long[] savePic(List<Pic> list) {
//		// list 排序
//		Collections.sort(list, new Comparator<Pic>() {
//			public int compare(Pic p1, Pic p2) {
//				return p1.getPicType().compareTo(p2.getPicType());
//			}
//		});
//		return PicModel.dao.savePic(list);
//	}
	
	/**
	 * 批量保存图片
	 * @param list
	 */
	public void batchSavePic(List<Pic> list) {
		List<String> sqlList = new ArrayList<String>();
		if(list==null||list.isEmpty()) return;
		
		// list 排序
		Collections.sort(list, new Comparator<Pic>() {
			public int compare(Pic p1, Pic p2) {
				return p1.getPicType().compareTo(p2.getPicType());
			}
		});
		for(Pic p : list) {
			String sql = "insert into Pic (vhclId, picType, vhclPic) values ('"+p.getVhclId()+"', '"+p.getPicType()+"', '"+p.getVhclPic()+"')";
			sqlList.add(sql);
		}
		PicModel.dao.batchSavePic(sqlList);
	}

	public String getPicIds(Long[] keys) {
		if (keys == null)
			return "";
		String out = "";
		for (Long key : keys) {
			out += key + ",";
		}
		return StringUtil.ignoreComma(out);
	}

	/**
	 * 删除车辆信息 且批量删除图片
	 * 
	 * @param vhclId
	 * @return
	 */
	public boolean deleteCar(String vhclId) {
		try { // 批量删除图片
			if (PicModel.dao.batchDeletePic(vhclId)) {
				log.warn("CarSourceService##deleteCar()##batch delete pic count > 0");
			} else {
				log.warn("CarSourceService##deleteCar()##batch delete pic count = 0");
			}
		} catch (Exception e) {
			log.error("CarSourceService##deleteCar()##[vhclId='" + vhclId + "']" + StringUtil.getTrace(e));
		}
		return VhclModel.dao.deleteCar(vhclId);
	}

	/**
	 * 明星车源 列表
	 * @param pageNumber 页码
	 * @param seriesId 车系
	 * @param displayPrice 价格
	 * @param carAge 车龄
	 * @param city 城市 vhclAddrProv
	 * @return
	 */
	public Page<Record> getStarCarList(int pageNumber, String seriesId, String displayPrice, String carAge, String city) {
		// 获取全部车源By page
		if (pageNumber == 0)
			pageNumber = 1;
		String sqlCondition = " and 1=1 ";
		if(!"".equals(seriesId)) {
			if(seriesId.contains("_")) {
				sqlCondition+=" and seriesId in ('"+seriesId.replace("_", "','")+"')";
			} else {
				sqlCondition+=" and seriesId = '"+seriesId+"'";
			}
		}
		if(!"".equals(displayPrice)) {
			sqlCondition+=formatPrice(displayPrice);
		}
		if(!"".equals(StringUtil.ObjectToString(carAge))) {
			sqlCondition+=formatCarAge(carAge);
		}
		if(!"".equals(StringUtil.ObjectToString(city))) {
			sqlCondition+=" and vhclAddrProv = '"+city+"'";
		}
		return VhclModel.dao.getStarCarList(pageNumber, sqlCondition);
	}
	
	/**
	 * 格式化价格
	 * @param displayPrice
	 * @return
	 */
	private String formatPrice(String displayPrice) {
		switch(displayPrice){
		case "28480001": return " and displayPrice <= 50000 ";
		case "28480002": return " and displayPrice > 50000 and displayPrice <= 80000 ";
		case "28480003": return " and displayPrice > 80000 and displayPrice <= 120000 ";
		case "28480004": return " and displayPrice > 120000 and displayPrice <= 160000 ";
		case "28480005": return " and displayPrice > 160000 and displayPrice <= 200000 ";
		case "28480006": return " and displayPrice > 200000 and displayPrice <= 250000 ";
		case "28480007": return " and displayPrice > 250000 and displayPrice <= 300000 ";
		case "28480008": return " and displayPrice > 300000";
		default: return "";
		}
	}
	
	private String formatCarAge(String carAge) {
		String MMdd = "-"+StringUtil.getNowMonth()+"-"+StringUtil.getNowDay();
		switch(carAge) {
		case "1001" : return " and productYear >= '"+(Integer.parseInt(StringUtil.getNowYear())-1)+MMdd+"'";
		case "1002" : return " and productYear >= '" + (Integer.parseInt(StringUtil.getNowYear())-2)+MMdd+"'";
		case "1003" : return " and productYear >= '" + (Integer.parseInt(StringUtil.getNowYear())-3)+MMdd+"'";
		case "1004" : return " and productYear >= '" + (Integer.parseInt(StringUtil.getNowYear())-5)+MMdd+"'" + " and productYear < '" + (Integer.parseInt(StringUtil.getNowYear())-3)+MMdd+"'";
		case "1005" : return " and productYear >= '" + (Integer.parseInt(StringUtil.getNowYear())-8)+MMdd+"'" + " and productYear < '" + (Integer.parseInt(StringUtil.getNowYear())-5)+MMdd+"'";
		case "1006" : return " and productYear <= '" + (Integer.parseInt(StringUtil.getNowYear())-8)+MMdd+"'";
		default : return "";
		}
	}
	
	
	
	/**
	 * 根据vhclId获取明星车源
	 * @param vhclId
	 * @return
	 */
	public CarInfo getCarInfoByVhclId(String vhclId) {
		CarInfo ci = new CarInfo();
		VhclModel vhcl = VhclModel.dao.getCarInfoByVhclId(vhclId);
		List<PicModel> picList = PicModel.dao.getPicList(vhclId);
		ci.setVm(vhcl);
		ci.setpL(picList);
		return ci;
	}
	
	public List<Record> getCarInfoByCode(String dlrCode) {
		return VhclModel.dao.getCarInfoByCode(dlrCode);
	}
	

	/**
	 * 车型名称检索
	 * 
	 * @param pageNumber
	 * @param sCode
	 * @return
	 */
	public Page<Record> getCarByModelName(int pageNumber, String sCode) {
		if (pageNumber == 0)
			pageNumber = 1;
		return VhclModel.dao.getCarByModelName(pageNumber, sCode);
	}

}
