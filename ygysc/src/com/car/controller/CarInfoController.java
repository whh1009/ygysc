package com.car.controller;

import java.util.List;

import javax.ws.rs.POST;

import org.apache.log4j.Logger;

import com.car.controller.ab.BaseController;
import com.car.model.MakeModel;
import com.car.service.CarInfoService;
import com.car.tool.StringUtil;
import com.svw.uc.ws.Brand;
import com.svw.uc.ws.Dealer;
import com.svw.uc.ws.Make;
import com.svw.uc.ws.Model;
import com.svw.uc.ws.TtBackhaulPo;

/**
 * <p>车型筛选</p>
 * <p>经销商筛选</p>
 * <p>商机回传</p>
 * @author 王宏慧
 * 
 */
public class CarInfoController extends BaseController {
	private final static CarInfoService cis = new CarInfoService();
	Logger log = Logger.getLogger(CarInfoController.class);

	/**
	 * 车型筛选，客户选择条件后传递给我，我调用第三方接口返回车源信息给前端
	 */
	@POST
	public void queryModel() {
		log.warn("come CarInfoController##queryModel()");
		try {
			List<Model> list = cis.queryModel();
			if (list == null || list.isEmpty()) {
				renderJson("");
			} else {
				renderJson(list);
			}
		} catch (Exception e) {
			log.error("CarInfoController##queryModel()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}

	/**
	 * 经销商筛选
	 */
	@POST
	public void queryDealer() {
		log.warn("come CarInfoController##queryDealer()");
		try {
			List<Dealer> list = cis.queryDealer();
			if (list == null || list.isEmpty()) {
				renderJson("");
			} else {
				renderJson(list);
			}
		} catch (Exception e) {
			log.error("CarInfoController##queryDealer()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
	
	/**
	 * 品牌接口
	 */
	@POST
	public void queryBrand() {
		log.warn("come CarInfoController##queryBrand()");
		try {
			List<Brand> list = cis.queryBrand();
			if (list == null || list.isEmpty()) {
				renderJson("");
			} else {
				renderJson(list);
			}
		} catch (Exception e) {
			log.error("CarInfoController##queryBrand()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
	
	/**
	 * 厂商
	 */
	@POST
	public void queryMake() {
		log.warn("come CarInfoController##queryBrand()");
		try {
			List<Make> list = cis.queryMake();
			if (list == null || list.isEmpty()) {
				renderJson("");
			} else {
				renderJson(list);
			}
		} catch (Exception e) {
			log.error("CarInfoController##queryMake()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
	
	/**
	 * 查询厂商
	 */
	public void wMake() {
		log.warn("come CarInfoController##wMake()");
		try {
			String bids = getPara("bids", "");
			if("".equals(bids)) {
				renderJson("");
				return;
			}
			List<MakeModel> list = cis.wMake(bids);
			if (list == null || list.isEmpty()) {
				renderJson("");
			} else {
				renderJson(list);
			}
		} catch (Exception e) {
			log.error("CarInfoController##wMake()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}

	/**
	 * 商机回传
	 */
	@POST
	public void save() {
		log.warn("come CarInfoController##save()");
		String custName = StringUtil.ObjectToString(getPara("custName"));
		String custSex = StringUtil.ObjectToString(getPara("custSex"));
		String mobile = StringUtil.ObjectToString(getPara("mobile"));
		String province = StringUtil.ObjectToString(getPara("province"));
		String city = StringUtil.ObjectToString(getPara("city"));
		String registId = StringUtil.ObjectToString(getPara("registId"));
		String orderType = StringUtil.ObjectToString(getPara("orderType"));
		String budget = StringUtil.ObjectToString(getPara("budget"));
		String validity = StringUtil.ObjectToString(getPara("validity"));
		String buyModelA = StringUtil.ObjectToString(getPara("buyModelA"));
		String buyOtherA = StringUtil.ObjectToString(getPara("buyOtherA"));
		String buyModelB = StringUtil.ObjectToString(getPara("buyModelB"));
		String buyOtherB = StringUtil.ObjectToString(getPara("buyOtherB"));
		String buyModelC = StringUtil.ObjectToString(getPara("buyModelC"));
		String buyOtherC = StringUtil.ObjectToString(getPara("buyOtherC"));
		String saleModel = StringUtil.ObjectToString(getPara("saleModel"));
		String saleOther = StringUtil.ObjectToString(getPara("saleOther"));
		String regDate = StringUtil.ObjectToString(getPara("regDate"));
		String mileage = StringUtil.ObjectToString(getPara("mileage"));
		String expectShop = StringUtil.ObjectToString(getPara("expectShop"));
		String usreNote = StringUtil.ObjectToString(getPara("usreNote"));
		String sourceSite = StringUtil.ObjectToString(getPara("sourceSite"));
		log.warn("custName="+custName);
		log.warn("custSex="+custSex);
		log.warn("mobile="+mobile);
		log.warn("province="+province);
		log.warn("city="+city);
		log.warn("registId="+registId);
		log.warn("orderType="+orderType);
		log.warn("budget="+budget);
		log.warn("validity="+validity);
		log.warn("buyModelA="+buyModelA);
		log.warn("buyOtherA="+buyOtherA);
		log.warn("buyModelB="+buyModelB);
		log.warn("buyOtherB="+buyOtherB);
		log.warn("buyModelC="+buyModelC);
		log.warn("buyOtherC="+buyOtherC);
		log.warn("saleModel="+saleModel);
		log.warn("saleOther="+saleOther);
		log.warn("regDate="+regDate);
		log.warn("mileage="+mileage);
		log.warn("usreNote="+usreNote);
		log.warn("expectShop="+expectShop);
		log.warn("sourceSite="+sourceSite);
		if ("".equals(custName) || "".equals(custSex) || "".equals(mobile) || 
			"".equals(province) || "".equals(city) || "".equals(orderType) || 
			"".equals(budget) || "".equals(validity) || "".equals(expectShop) || 
			"".equals(sourceSite)) {
			log.warn("CarInfoController##save()##one of the parameters is empty, return empty");
			renderJson("");
			return;
		}
		TtBackhaulPo ttBackhaulPO = new TtBackhaulPo();
		ttBackhaulPO.setCustName(custName);
		ttBackhaulPO.setCustSex(custSex);
		ttBackhaulPO.setMobile(mobile);
		ttBackhaulPO.setProvince(province);
		ttBackhaulPO.setCity(city);
		ttBackhaulPO.setRegistId(registId);
		ttBackhaulPO.setOrderType(orderType);
		ttBackhaulPO.setBudget(budget);
		ttBackhaulPO.setValidity(validity);
		ttBackhaulPO.setBuyModelA(buyModelA);
		ttBackhaulPO.setBuyOtherA(buyOtherA);
		ttBackhaulPO.setBuyModelB(buyModelB);
		ttBackhaulPO.setBuyOtherB(buyOtherB);
		ttBackhaulPO.setBuyModelC(buyModelC);
		ttBackhaulPO.setBuyOtherC(buyOtherC);
		ttBackhaulPO.setSaleModel(saleModel);
		ttBackhaulPO.setSaleOther(saleOther);
		ttBackhaulPO.setRegDate(regDate);
		ttBackhaulPO.setMileage(mileage);
		ttBackhaulPO.setExpectShop(expectShop);
		ttBackhaulPO.setUsreNote(usreNote);
		ttBackhaulPO.setSourceSite(sourceSite);
		try {
			renderJson(cis.save(ttBackhaulPO));
		} catch (Exception e) {
			log.error("CarInfoController##save()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
	
	/**
	 * 查询车系
	 */
	@POST
	public void querySeries() {
		log.warn("come CarInfoController##querySeries()");
		try{
			renderJson(cis.querySeries());
		} catch(Exception e) {
			log.error("CarInfoController##querySeries()##" + StringUtil.getTrace(e));
		}
	}
	
	public void wSeries() {
		log.warn("come CarInfoController##wSeries()");
		try{
			String fid = getPara("fid", "");
			if("".equals(fid)) {
				renderJson("");
				return;
			}
			renderJson(cis.wSeries(fid));
		} catch(Exception e) {
			log.error("CarInfoController##wSeries()##" + StringUtil.getTrace(e));
		}
	}
	
	/**
	 * 查询全部品牌
	 */
	public void wBrand() {
		log.warn("come CarInfoController##wBrand()");
		try{
			renderJson(cis.wBrand());
		} catch(Exception e) {
			log.error("CarInfoController##wBrand()##" + StringUtil.getTrace(e));
		}
	}
	
	/**
	 * 查询合并后的品牌
	 */
	public void wBrandHb() {
		log.warn("come CarInfoController##wBrandHb()");
		try{
			renderJson(cis.wBrandHb());
		} catch(Exception e) {
			log.error("CarInfoController##wBrandHb()##" + StringUtil.getTrace(e));
		}
	}
	
}
