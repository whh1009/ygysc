package com.car.model;

import java.util.List;

public class CarInfo {
	private VhclModel vhcl;
	private List<PicModel> picList;
	public VhclModel getVm() {
		return vhcl;
	}
	public void setVm(VhclModel vm) {
		this.vhcl = vm;
	}
	public List<PicModel> getpL() {
		return picList;
	}
	public void setpL(List<PicModel> pL) {
		this.picList = pL;
	}
	
	
}
