package com.car.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.car.tool.StringUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;

/**
 * 图片信息Pic
 * @author 王宏慧
 *
 */
public class PicModel extends Model<PicModel> {
	Logger log = Logger.getLogger(PicModel.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 3618269888393128694L;
	
	/**
	 * 
	 */
	public final static PicModel dao = new PicModel();
	
	/**
	 * 保存图片信息
	 * @param picType
	 * @param vhclPic
	 * @return
	 */
	public boolean savePic(String vhclId, String picType, String vhclPic) {
		PicModel picModel = new PicModel();
		picModel.set("vhclId", vhclId);
		picModel.set("picType", picType);
		picModel.set("vhclPic", vhclPic);
		return picModel.save();
	}
	
	/**
	 * 删除图片信息
	 * @param picId
	 * @return
	 */
	public boolean deletePic(int picId) {
		return deleteById(picId);
	}
	
	/**
	 * 批量删除图片信息
	 * 
	 * @param picIds
	 * @return true 删除记录大于1条  false 未删除数据
	 */
	public boolean batchDeletePic(String vhclId) {
		int result = Db.update("delete from Pic where vhclId = '"+vhclId+"'");
		if(result>0) return true;
		else return false;
	}
	
	/**
	 * 批量保存图片
	 * @param sqlList
	 * @return
	 */
	public boolean batchSavePic(List<String> sqlList) {
		try{
			Db.batch(sqlList, 100);
			return true;
		} catch(Exception e) {
			log.error("PicModel###batchSavePic()###"+StringUtil.getTrace(e));
			return false;
		}
	}
	
	/**
	 * 已废除，不用
	 * 批量保存图片
	 * @param list
	 * @return
	 */
//	public Long[] savePic(List<Pic> list) {
//		if(list==null||list.isEmpty()) return null;
//		Long [] keys = new Long[list.size()];
//		for(int i = 0; i<list.size(); i++) {
//			PicModel p = new PicModel().set("picType", list.get(i).getPicType()).set("vhclPic", list.get(i).getVhclPic());
//			p.save();
//			keys[i] = p.getLong("picId");
//		}
//		return keys;
//	}
	
	/**
	 * 根据vhclId获取图片列表
	 * @param vhclId
	 * @return
	 */
	public List<PicModel> getPicList(String vhclId) {
		return find("select * from Pic where vhclId = ?", vhclId);
	}
	
}
