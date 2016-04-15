package com.car.controller;

import org.apache.log4j.Logger;

import com.car.controller.ab.BaseController;
import com.car.model.RegionModel;
import com.car.tool.StringUtil;

/**
 * 省市联动
 * 
 * @author 王宏慧
 * 
 */
public class RegionController extends BaseController {
	Logger log = Logger.getLogger(RegionController.class);

	public void index() {
		log.warn("come RegionController##index()");
		try {
			renderJson(RegionModel.dao.getRegion());
		} catch (Exception e) {
			log.error("RegionController##index()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
}
