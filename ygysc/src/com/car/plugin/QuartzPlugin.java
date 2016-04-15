package com.car.plugin;

import java.util.Date;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import com.car.config.Constrant;
import com.car.service.MyJob;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.IPlugin;

public class QuartzPlugin implements IPlugin {
	private String JOB_NAME = "myJob";
	private String TRIGGER_NAME = "myTrigger";
	
	@Override
	public boolean start() {
		try {
			SchedulerFactory sf = new StdSchedulerFactory();
			Scheduler sched = sf.getScheduler();
			sched.start();
			JobDetailImpl jobDetail = new JobDetailImpl();
			jobDetail.setName(JOB_NAME);
			jobDetail.setJobClass(MyJob.class);
			SimpleTriggerImpl trigger = new SimpleTriggerImpl();
			trigger.setName(TRIGGER_NAME);
			trigger.setStartTime(Constrant.START_TIME);
			trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
			trigger.setRepeatInterval(Constrant.REPEAT_INTERVAL);
			sched.scheduleJob(jobDetail, trigger);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean stop() {
        return false;
	}

}
