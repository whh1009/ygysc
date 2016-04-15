package com.car.controller;

import org.apache.log4j.Logger;

import com.car.controller.ab.BaseController;
import com.car.model.AddrModel;
import com.car.tool.StringUtil;
import com.jfinal.kit.JsonKit;

/**
 * 坐标
 * @author wanghonghui
 *
 */
public class AddrController extends BaseController {
	Logger log = Logger.getLogger(AddrController.class);
	public void getAddr(){
		log.warn("come AddrController##getAddr()");
		try {
			renderJson(AddrModel.dao.getAddr());
		} catch (Exception e) {
			log.error("AddrController##getAddr()##" + StringUtil.getTrace(e));
			renderJson("");
		}
	}
}
