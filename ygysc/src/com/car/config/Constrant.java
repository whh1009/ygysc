package com.car.config;

import java.util.Date;

/**
 * 常量定义
 * 
 * @author 王宏慧
 * 
 */
public class Constrant {
	/**
	 * <P>
	 * 每页显示5条记录
	 * </P>
	 */
	public static final int PAGE_SIZE = 30;

	/**
	 * 车辆上架/下架校验 accessToken
	 */
	public static final String ACCESSTOKEN = "2J9dfb23ZD";
	
	/**
	 * 定时任务开始时间
	 * 服务启动后10s后开始。。。
	 */
	public static final Date START_TIME = new Date(new Date().getTime() + 10*1000); //开始时间 

	/**
	 * 定时任务频率
	 * 一周更新一次
	 */
	public static final long REPEAT_INTERVAL = 7*24*60*60*1000L; //任务频率
}
