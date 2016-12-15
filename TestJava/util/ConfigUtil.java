package com.shijie99.TestJava.util;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shijie99.TestJava.service.BusinessService;

public class ConfigUtil {
	private static final Logger logger = LoggerFactory.getLogger(ConfigUtil.class);
	
	private static Properties props = null;
	private static Boolean isJobRunning = false;
	
	private static BusinessService businessService = null;
	
	protected static Properties getProps() {
		return props;
	}

	public static void setProps(Properties props) {
		ConfigUtil.props = props;
	}
	
	/**
	 * 初始化缓存，数据等操作，务必后于setProps()进行调用
	 */
	public static void init() {
		// TODO 初始化操作
		logger.info("初始化操作");
	}
	
	public static String get(String key) {
		if(props != null) {
			return props.getProperty(key);
		} else {
			return null;
		}
	}
	
	public static Boolean getIsJobRunning() {
		return isJobRunning;
	}

	public static void setIsJobRunning(Boolean isJobRunning) {
		ConfigUtil.isJobRunning = isJobRunning;
	}

	public static BusinessService getBusinessService() {
		return businessService;
	}

	public static void setBusinessService(BusinessService businessService) {
		ConfigUtil.businessService = businessService;
	}
}
