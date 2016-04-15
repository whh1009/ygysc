package com.car.config;

import com.car.controller.AddrController;
import com.car.controller.CarInfoController;
import com.car.controller.CarSourceController;
import com.car.controller.IndexController;
import com.car.controller.RegionController;
import com.car.model.AddrModel;
import com.car.model.BrandModel;
import com.car.model.MakeModel;
import com.car.model.PicModel;
import com.car.model.RegionModel;
import com.car.model.SeriesModel;
import com.car.model.VhclModel;
import com.car.plugin.QuartzPlugin;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class JfConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		PropKit.use("db_config.txt");
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes me) {
		// 直达号
		me.add("/", IndexController.class);
		// 车辆上架/下架
		me.add("/api", CarSourceController.class);
		// 第三方接口调用
		me.add("/car", CarInfoController.class);
		// 地区
		me.add("region", RegionController.class);
		// 坐标
		me.add("addr", AddrController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
//		C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
//		me.add(c3p0Plugin);
//		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUrl(PropKit.get("jdbcUrl"));
		ds.setUser(PropKit.get("user"));
		ds.setPassword(PropKit.get("password").trim());
		ActiveRecordPlugin arp = new ActiveRecordPlugin(ds);
		
		me.add(arp);
		arp.addMapping("Vhcl", "vhclId", VhclModel.class);
		arp.addMapping("Pic", PicModel.class);
		arp.addMapping("tm_region", RegionModel.class);
		arp.addMapping("address", AddrModel.class);
		
		arp.addMapping("make", MakeModel.class);
		arp.addMapping("brand", BrandModel.class);
		arp.addMapping("series", SeriesModel.class);
		arp.setShowSql(true);
		
		me.add(new QuartzPlugin());
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// me.add(new ExceptionAndLogInterceptor());

	}

	@Override
	public void configHandler(Handlers me) {
		me.add(new ContextPathHandler());
	}

}
