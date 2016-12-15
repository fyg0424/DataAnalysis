package com.shijie99.TestJava.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shijie99.TestJava.bootstrap.config.SpringConfiguration;
import com.shijie99.TestJava.service.BusinessService;
import com.shijie99.TestJava.util.ConfigUtil;

public class Daemon {
	private static final Logger logger = LoggerFactory.getLogger(Daemon.class);
	
	private static final Daemon daemon = new Daemon();

	private Daemon() {}
	
	public static Daemon getInstance() {
		return daemon;
	}

	private ApplicationContext context = null;
	
	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public void init() {
		initContext();
		
		initRegister();
	}

	private void initContext() {
		logger.info("初始化上下文环境开始...");
		setContext(new AnnotationConfigApplicationContext(SpringConfiguration.class));
		logger.info("初始化上下文环境完成!!!");
	}
	
	//注入Service
	private void initRegister() {
		ConfigUtil.setBusinessService((BusinessService)context.getBean("businessService"));
	}
	
	public void start() {
		logger.info("服务启动开始...");
		
		//配置初始化
		ConfigUtil.init();
		
		//启动定时任务
		QuartzScheduler.schedule();
		
		logger.info("服务启动完成!!!");
	}
	
	public void restart() {}

	public void stop() {}
}
