package com.car.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.car.config.Constrant;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

/**
 * 车辆信息
 * 
 * @author 王宏慧
 * 
 */
public class VhclModel extends Model<VhclModel> {
	Logger log = Logger.getLogger(VhclModel.class);
	public final static VhclModel dao = new VhclModel();

	/**
	 * 保存车辆信息
	 * 
	 * @param v
	 * @return
	 */
	public boolean saveCar(VhclModel v) {
		return v.save();
	}

	/**
	 * 根据车辆ID，获取图片ids
	 * 
	 * @param vhclId
	 * @return
	 */
	public String getPicIdsByVhclId(String vhclId) {
		VhclModel vm = findFirst("select picId from Vhcl where vhclId = '" + vhclId + "'");
		if (vm == null)
			return "";
		else
			return vm.getStr("picId");
	}

	/**
	 * 删除车辆信息
	 * 
	 * @param vhclId
	 * @return
	 */
	public boolean deleteCar(String vhclId) {
		return deleteById(vhclId);
	}

	/**
	 * 明星车源 列表
	 * @param pageNumber
	 * @return
	 */
	public Page<Record> getStarCarList(int pageNumber, String sqlCondition) {
		log.warn("明星车源列表sql：select v.vhclId, v.modelName, v.displayPrice, v.productYear, v.tableShowMileage, v.vhclRegProv, v.vhclAddrProv, p.picType,p.vhclPic from Vhcl v, Pic p where v.vhclId=p.vhclId  and p.picType = (select min(picType) from Pic sp where sp.vhclId = v.vhclId)"+sqlCondition+" order by v.vhclId ");
		return Db.paginate(pageNumber, Constrant.PAGE_SIZE, "select v.vhclId, v.modelName, v.displayPrice, v.productYear, v.tableShowMileage, v.vhclRegProv, v.vhclAddrProv, p.picType,p.vhclPic ", " from Vhcl v, Pic p where v.vhclId=p.vhclId  and p.picType = (select min(picType) from Pic sp where sp.vhclId = v.vhclId)"+sqlCondition+" order by v.vhclId ");
	}
	
	/**
	 * 明星车源
	 * @param vhclId
	 * @return
	 */
	public VhclModel getCarInfoByVhclId(String vhclId) {
		return findFirst("select * from Vhcl where vhclId = ?", vhclId);
	}
	
	/**
	 * 根据经销商获取车源信息
	 * @param dlrCode
	 * @return
	 */
	public List<Record> getCarInfoByCode(String dlrCode) {
		return Db.find("select * from Vhcl v , Pic p where dlrCode = ? and v.vhclId=p.vhclId group by v.vhclId order by v.vhclId", dlrCode);
	}

	/**
	 * 车型检索
	 * 
	 * @param pageNumber
	 *            页码
	 * @param sCode
	 *            检索条件
	 */
	public Page<Record> getCarByModelName(int pageNumber, String sCode) {
		return Db.paginate(pageNumber, Constrant.PAGE_SIZE, "select * ", "from Vhcl where modelName = '" + sCode + "'");
	}

	/**
	 * 经销商检索
	 * 
	 * @param pageNumber
	 * @param sCode
	 * @return
	 */
//	public Page<Record> getCarByDlrCode(int pageNumber, String sCode) {
//		return null;
//	}

}
