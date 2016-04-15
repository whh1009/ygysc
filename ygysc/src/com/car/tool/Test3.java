package com.car.tool;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import com.car.service.MyJob;

public class Test3 {

	public Test3() throws Exception {

		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler sched = sf.getScheduler();
		sched.start();
		JobDetailImpl jobDetail = new JobDetailImpl();
		jobDetail.setName("myJob");
		jobDetail.setJobClass(MyJob.class);
		SimpleTriggerImpl trigger = new SimpleTriggerImpl();
		trigger.setName("myTrigger");
		trigger.setStartTime(new Date());
		trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
		trigger.setRepeatInterval(1L * 1000L);
		sched.scheduleJob(jobDetail, trigger);
	}

	public static void main(String args[]) {
		System.out.println(new Date().getYear());
		System.out.println(new Date().getMonth());
		System.out.println(new Date().getDay());
		System.out.println(new Date().getHours());
		System.out.println(new Date().getMinutes());
		System.out.println(new Date().getSeconds());
	}

}
