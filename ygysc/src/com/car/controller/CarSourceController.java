package com.car.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.ws.rs.POST;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.car.config.Constrant;
import com.car.controller.ab.BaseController;
import com.car.model.CarInfo;
import com.car.model.Pic;
import com.car.model.Result;
import com.car.service.CarSourceService;
import com.car.tool.StringUtil;
import com.jfinal.kit.JsonKit;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

/**
 * 车源检索
 * <p>
 * i. 上架下架功能，我提供接口，上架就记录到本地数据库中，下架就从本地数据库中删除；
 * </p>
 * <p>
 * ii. 条件筛选，客户选择条件后传递给我，我调用本地数据库返回车源信息给前端
 * </p>
 * 
 * @author 王宏慧
 * 
 */
public class CarSourceController extends BaseController {
	private final static CarSourceService css = new CarSourceService();
	Logger log = Logger.getLogger(CarSourceController.class);

	/**
	 * 上架接口
	 */
	@POST
	public void saveCar() {
		log.warn("come CarSourceController##saveCar()");
		Result r = new Result();
		String accessToken = StringUtil.ObjectToString(getPara("accessToken"));
		if ("".equals(accessToken)) {
			log.warn("CarSourceController##saveCar()##Could not get accessToken");
			r.setStatus(false);
			r.setMessage("未获取到accessToken");
			renderJson(r);
			return;
		} else if (!Constrant.ACCESSTOKEN.equals(accessToken)) {
			log.warn("CarSourceController##saveCar()##accessToken is not correct");
			r.setStatus(false);
			r.setMessage("accessToken验证失败");
			renderJson(r);
			return;
		}
		String data = StringUtil.ObjectToString(getPara("data"));
		if ("".equals(data)) {
			log.warn("CarSourceController##saveCar()##could not get data");
			r.setStatus(false);
			r.setMessage("未获取到data");
			renderJson(r);
			return;
		}
		JSONObject obj = null;
		JSONArray arr = null;
		try {
			obj = JSON.parseObject(data);
			arr = obj.getJSONArray("picList");
		} catch (Exception e) {
			log.error("CarSourceController##saveCar()##" + StringUtil.getTrace(e));
			r.setStatus(false);
			r.setMessage(e.getMessage());
			renderJson(r);
			return;
		}
		
		String factoryId = StringUtil.ObjectToString(obj.get("factoryId"));
		String country = StringUtil.ObjectToString(obj.get("country"));
		String factory = StringUtil.ObjectToString(obj.get("factory"));
		String brandId = StringUtil.ObjectToString(obj.get("brandId"));
		String brandName = StringUtil.ObjectToString(obj.get("brandName"));
		String seriesId = StringUtil.ObjectToString(obj.get("seriesId"));
		String seriesName = StringUtil.ObjectToString(obj.get("seriesName"));
		String modelId = StringUtil.ObjectToString(obj.get("modelId"));
		String modelName = StringUtil.ObjectToString(obj.get("modelName"));
		String vhclId = StringUtil.ObjectToString(obj.get("vhclId"));
		String productYear = StringUtil.ObjectToString(obj.get("productYear"));
		String discharge = StringUtil.ObjectToString(obj.get("discharge"));
		String turbo = StringUtil.ObjectToString(obj.get("turbo"));
		String efflStd = StringUtil.ObjectToString(obj.get("efflStd"));
		String vhclColor = StringUtil.ObjectToString(obj.get("vhclColor"));
		String registerDate = StringUtil.ObjectToString(obj.get("registerDate"));
		String vhclRegProv = StringUtil.ObjectToString(obj.get("vhclRegProv"));
		String vhclRegCity = StringUtil.ObjectToString(obj.get("vhclRegCity"));
		String vhclAddrProv = StringUtil.ObjectToString(obj.get("vhclAddrProv"));
		String vhclAddrCity = StringUtil.ObjectToString(obj.get("vhclAddrCity"));
		String useNature = StringUtil.ObjectToString(obj.get("useNature"));
		String tableShowMileage = StringUtil.ObjectToString(obj.get("tableShowMileage"));
		String insurancePeriod = StringUtil.ObjectToString(obj.get("insurancePeriod"));
		String yearCheckDate = StringUtil.ObjectToString(obj.get("yearCheckDate"));
		String vin = StringUtil.ObjectToString(obj.get("vin"));
		String personality = StringUtil.ObjectToString(obj.get("personality"));
		String vhclLic = StringUtil.ObjectToString(obj.get("vhclLic"));
		String authNo = StringUtil.ObjectToString(obj.get("authNo"));
		double displayPrice = StringUtil.StringToDouble(obj.get("displayPrice"));
		String dlrCode = StringUtil.ObjectToString(obj.get("dlrCode"));
		String dlrName = StringUtil.ObjectToString(obj.get("dlrName"));
		String hotline = StringUtil.ObjectToString(obj.get("hotline"));
		String gearboxMode = StringUtil.ObjectToString(obj.get("gearboxMode"));
		String gears = StringUtil.ObjectToString(obj.get("gears"));
		ListIterator list = arr.listIterator();
		List<Pic> picList = new ArrayList<Pic>();
		while (list.hasNext()) {
			JSONObject p = (JSONObject) list.next();
			Pic pic = new Pic();
			pic.setVhclId(vhclId);
			pic.setPicType(StringUtil.ObjectToString(p.get("picType")));
			pic.setVhclPic(StringUtil.ObjectToString(p.get("vhclPic")));
			picList.add(pic);
		}
		try {
			boolean flag = css.saveCar(factoryId, country, factory, brandId, brandName, seriesId, seriesName, modelId, modelName, vhclId, productYear, discharge, turbo, efflStd,
					vhclColor, registerDate, vhclRegProv, vhclRegCity, vhclAddrProv, vhclAddrCity, useNature, tableShowMileage, insurancePeriod, yearCheckDate, vin, personality, vhclLic, authNo,
					displayPrice, dlrCode, dlrName, hotline, gearboxMode, gears);
			if (flag) {
				r.setStatus(true); // 成功
				r.setMessage("");
				css.batchSavePic(picList);
			} else {
				r.setStatus(false);
				r.setMessage("上架失败!");
			}
		} catch (Exception e) {
			log.error("CarSourceController##saveCar()##" + StringUtil.getTrace(e));
			r.setStatus(false);
			r.setMessage(e.getMessage());
		}
		renderJson(r);
	}

	/**
	 * 下架接口
	 */
	@POST
	public void deleteCar() {
		log.warn("come CarSourceController##deleteCar()");
		Result r = new Result();
		String accessToken = StringUtil.ObjectToString(getPara("accessToken"));
		if ("".equals(accessToken)) {
			log.warn("CarSourceController##deleteCar()##Could not get accessToken");
			r.setStatus(false);
			r.setMessage("未获取到accessToken");
			renderJson(r);
			return;
		} else if (!Constrant.ACCESSTOKEN.equals(accessToken)) {
			log.warn("CarSourceController##deleteCar()##accessToken is not correct");
			r.setStatus(false);
			r.setMessage("accessToken验证失败");
			renderJson(r);
			return;
		}
		String data = StringUtil.ObjectToString(getPara("data"));
		if ("".equals(data)) {
			log.warn("CarSourceController##deleteCar()##Could not get data");
			r.setStatus(false);
			r.setMessage("未获取到data");
			renderJson(r);
			return;
		}
		JSONObject obj = null;
		try {
			obj = JSON.parseObject(data);
		} catch (Exception e) {
			log.error("CarSourceController##deleteCar()##" + StringUtil.getTrace(e));
			r.setStatus(false);
			r.setMessage(e.getMessage());
			renderJson(r);
			return;
		}
		String vhclId = StringUtil.ObjectToString(obj.get("vhclId"));
//		String vhclId = StringUtil.ObjectToString(getPara("vhclId"));
		if ("".equals(vhclId)) { // 没有获取到id，则返回
			log.warn("CarSourceController##deleteCar()##Could not get vhclId");
			r.setStatus(false);
			r.setMessage("未获取到车辆ID");
		} else {
			boolean flag = false;
			try {
				flag = css.deleteCar(vhclId);
				if (flag) {
					r.setStatus(true); // 成功
					r.setMessage("");
				} else {
					r.setStatus(false);
					r.setMessage("删除失败!");
				}
			} catch (Exception e) {
				log.error("CarSourceController##deleteCar()##" + StringUtil.getTrace(e));
				r.setStatus(false);
				r.setMessage(e.getMessage());
			}
		}
		renderJson(r);
	}

	/**
	 * 根据 车型 检索
	 */
	@POST
	public void getCarByModelName() {
		log.warn("come CarSourceController##getCarByModelName()");
		String sCode = StringUtil.ObjectToString(getPara("sCode"));
		int pageNumber = StringUtil.StringToInt(getPara("pageNumber"));
		if ("".equals(sCode)) {
			log.warn("CarSourceController##getCarByModelName()##sCode is empty");
			renderJson("");
			return;
		}
		try {
			Page<Record> page = css.getCarByModelName(pageNumber, sCode);
			renderJson(page);
		} catch (Exception e) {
			log.error("CarSourceController##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}

	/**
	 * 获取明星车源列表
	 */
	public void getStarCarList() {
		log.warn("come CarSourceController##getStarCarList()");
		int pageNumber = StringUtil.StringToInt(getPara("pageNumber"));
		String seriesId = StringUtil.ObjectToString(getPara("seriesId"));
		String displayPrice = StringUtil.ObjectToString(getPara("displayPrice"));
		String carAge = StringUtil.ObjectToString(getPara("carAge"));
		String city = StringUtil.ObjectToString(getPara("city"));
		try {
			Page<Record> page = css.getStarCarList(pageNumber, seriesId, displayPrice, carAge, city);
			renderJson(page);
		} catch (Exception e) {
			log.error("CarSourceController##getStarCarList()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}

	/**
	 * 明星车源详情
	 */
	public void getCarInfo() {
		log.warn("come CarSourceController##getCarInfo()");
		String vhclId = getPara("vhclId", "");
		if("".equals(vhclId)) {
			setAttr("car", "");
		} else {
			CarInfo ci = new CarInfo();
			try{
				ci = css.getCarInfoByVhclId(vhclId);
				setAttr("car", JsonKit.toJson(ci));
			} catch(Exception e) {
				log.error("CarSourceController##getCarInfo()##" + StringUtil.getTrace(e));
				setAttr("car", "");
			}
		}
		render("/zdh/details.jsp");
	}
	
	/**
	 * 根据经销商code获取该经销商所有车辆信息
	 */
	public void getCarInfoByAddr() {
		log.warn("come CarSourceController##getCarInfoByAddr()");
		String code = getPara("dlrCode", "");
		if("".equals(code)) {
			setAttr("list", "");
		} else {
			try {
				setAttr("list", JsonKit.toJson(css.getCarInfoByCode(code)));
			} catch(Exception e) {
				log.error("CarSourceController##getCarInfoByAddr##"+StringUtil.getTrace(e));
				setAttr("list", "");
			}
		}
		render("/zdh/distributor.jsp");
	}

}
