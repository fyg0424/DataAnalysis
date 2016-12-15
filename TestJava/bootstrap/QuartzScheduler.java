package com.shijie99.TestJava.bootstrap;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.shijie99.TestJava.quartz.DemoJob;
import com.shijie99.TestJava.util.ConfigUtil;

public class QuartzScheduler {
	public static void schedule() {
		// 通过schedulerFactory获取一个调度器
		SchedulerFactory schedulerfactory = new StdSchedulerFactory();
		Scheduler scheduler = null;
		try {
			// 通过schedulerFactory获取一个调度器
			scheduler = schedulerfactory.getScheduler();

			// 创建jobDetail实例，绑定Job实现类
			// 指明job的名称，所在组的名称，以及绑定job类
			JobDetail job = JobBuilder.newJob(DemoJob.class).withIdentity("scannerJob", "scannerJobGroup")
					.build();

			// 定义调度触发规则
			// 使用simpleTrigger规则
			// Trigger
			// trigger=TriggerBuilder.newTrigger().withIdentity("simpleTrigger",
			// "triggerGroup")
			// .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(1).withRepeatCount(8))
			// .startNow().build();
			// 使用cornTrigger规则 每天10点42分
			Trigger trigger = TriggerBuilder
					.newTrigger()
					.withIdentity("scannerTrigger", "scannerTriggerGroup")
					.withSchedule(
							CronScheduleBuilder.cronSchedule(ConfigUtil.get("cron")))
					.startNow().build();

			// 把作业和触发器注册到任务调度中
			scheduler.scheduleJob(job, trigger);

			// 启动调度
			scheduler.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
