package com.car.controller;

import com.car.controller.ab.BaseController;

/**
 * 直达号首页
 * @author 王宏慧
 *
 */
public class IndexController extends BaseController {
	/**
	 * 默认首页
	 */
	public void index() {
		render("/zdh/index.jsp");
	}
	
	/**
	 * 重定向首页
	 * 解决前段静态资源引用错乱
	 */
	public void home() {
		redirect("/zdh/index.jsp");
	}
}
