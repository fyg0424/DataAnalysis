package com.shijie99.TestJava.util;

import java.text.DecimalFormat;

/**
 * 解析工具类
 * @author zhoucl
 *
 */
public class ParseUtil {	
	public static boolean isNotEmpty(String str){
		if(str==null||str.trim().equals(""))
			return false;
		else
			return true;
	}
	
	public static boolean isEmpty(String str){
		if(str==null||str.trim().equals(""))
			return true;
		else
			return false;
	}
	

	/**
	 * 保留两位小数
	 */
	public static double reserve2Bit(double val) {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.valueOf(df.format(val));
	}
}
