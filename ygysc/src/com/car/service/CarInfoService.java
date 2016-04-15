package com.car.service;

import java.util.List;

import com.car.model.BrandModel;
import com.car.model.MakeModel;
import com.car.model.SeriesModel;
import com.svw.uc.ws.BackHaukResult;
import com.svw.uc.ws.Brand;
import com.svw.uc.ws.Dealer;
import com.svw.uc.ws.Make;
import com.svw.uc.ws.Model;
import com.svw.uc.ws.Series;
import com.svw.uc.ws.TtBackhaulPo;
import com.svw.uc.ws.impl.BackhaulService;
import com.svw.uc.ws.impl.BaseService;
import com.svw.uc.ws.impl.IBackhaul;
import com.svw.uc.ws.impl.IBase;

public class CarInfoService {

	/**
	 * 车型筛选
	 * @return
	 */
	public List<Model> queryModel() {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
		return ib.queryModel();
	}

	/**
	 * 经销商筛选
	 * @return
	 */
	public List<Dealer> queryDealer() {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
		return ib.queryDealer();
	}
	
	/**
	 * 商机回传
	 * @param ttBackhaulPO
	 * @return
	 */
	public BackHaukResult save(TtBackhaulPo ttBackhaulPO) {
		BackhaulService bs = new BackhaulService();
		IBackhaul ib = bs.getBackhaulPort();
		return ib.save(ttBackhaulPO);
	}
	
	/**
	 * 车系
	 * @return
	 */
	public List<Series> querySeries() {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
		return ib.querySeries();
	}
	
	public List<SeriesModel> wSeries(String fid) {
		return SeriesModel.dao.getSeriesByBrandId(fid);
	}
	
	/**
	 * 厂商
	 * @return
	 */
	public List<Make> queryMake() {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
		return ib.queryMake();
	}
	
	public List<MakeModel> wMake(String factoryId) {
		factoryId = "'"+factoryId.replace(",", "','")+"'";
		return MakeModel.dao.wMake(factoryId);
	}
	
	public List<BrandModel> wBrand() {
		return BrandModel.dao.wBrand();
	}
	
	public List<BrandModel> wBrandHb() {
		return BrandModel.dao.wBrandHb();
	}
	
	/**
	 * 品牌
	 */
	public List<Brand> queryBrand() {
		BaseService bs = new BaseService();
		IBase ib = bs.getBasePort();
		return ib.queryBrand();
	}
	public void saveBrand(List<String> sqlList) {
		BrandModel.dao.saveBrand(sqlList);
	}
	public boolean deleteBrand() {
		return BrandModel.dao.deleteBrand();
	}
	public void saveMake(List<String> sqlList) {
		MakeModel.dao.saveMake(sqlList);
	}
	public boolean deleteMake() {
		return MakeModel.dao.deleteMake();
	}
	public void saveSeries(List<String> sqlList) {
		SeriesModel.dao.saveSeries(sqlList);
	}
	public boolean deleteSeries() {
		return SeriesModel.dao.deleteSeries();
	}
}
