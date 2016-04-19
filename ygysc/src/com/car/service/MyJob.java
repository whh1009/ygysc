package com.car.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.jfinal.aop.Enhancer;
import com.svw.uc.ws.Brand;
import com.svw.uc.ws.Make;
import com.svw.uc.ws.Series;

/**
 * 我的定时任务
 * 
 * @author wanghonghui
 * 
 */
public class MyJob implements Job {
	Logger log = Logger.getLogger(MyJob.class);
	CarInfoService cis = Enhancer.enhance(CarInfoService.class);

	@Override
	public void execute(JobExecutionContext jobCtx) throws JobExecutionException {
		log.warn("==========start job========");
		List<Brand> brandList = null;
		List<Make> makeList = null;
		List<Series> seriesList = null;
		try {
			//调接口
			brandList = cis.queryBrand(); // 品牌
			makeList = cis.queryMake(); // 厂商
			seriesList = cis.querySeries(); // 车系
			//1. 删除原始表
			List<String> brandSqlList = new ArrayList<String>();
			List<String> makeSqlList = new ArrayList<String>();
			List<String> seriesSqlList = new ArrayList<String>();
			if (brandList != null && !brandList.isEmpty()) {
				log.warn("delete brand");
				cis.deleteBrand();
				for(Brand brand : brandList) {
					brandSqlList.add("insert into brand(factoryId, firstLetter, seriesName, brandCode, isShsvwBrand, brandName, brandId) values ('"+brand.getFactoryId()+"', '"+brand.getFirstLetter()+"', '"+brand.getSeriesName()+"', '"+brand.getBrandCode()+"', '"+brand.getIsShsvwBrand()+"', '"+brand.getBrandName()+"', '"+brand.getBrandId()+"');");
				}
			}
			if (makeList != null && !makeList.isEmpty()) {
				log.warn("delete make");
				cis.deleteMake();
				for(Make make : makeList) {
					makeSqlList.add("insert into make(factoryid, factory, country) values('"+make.getFactoryId()+"', '"+make.getFactory()+"', '"+make.getCountry()+"');");
				}
			}
			if (seriesList != null && !seriesList.isEmpty()) {
				log.warn("delete series");
				cis.deleteSeries();
				for(Series series : seriesList) {
					seriesSqlList.add("insert into series(seriesName, seriesCode, brandId, seriesId) values('"+series.getSeriesName()+"', '"+series.getSeriesCode()+"', '"+series.getBrandId()+"', '"+series.getSeriesId()+"');");
				}
			}
			cis.saveBrand(brandSqlList);
			cis.saveBrand(makeSqlList);
			cis.saveBrand(seriesSqlList);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		log.warn("==========end job========");
	}

	public static void main(String[] args) {

	}
}
