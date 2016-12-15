/**
 * 日期处理工具类
 */
package com.shijie99.TestJava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author
 *
 */
public class DateUtil {
	public static final SimpleDateFormat FORMATER_1 = new SimpleDateFormat("yyyyMMdd");
	public static final SimpleDateFormat FORMATER_2 = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat FORMATER_3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final SimpleDateFormat FORMATER_4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
	public static final SimpleDateFormat FORMATER_5 = new SimpleDateFormat("HH");
	public static final SimpleDateFormat FORMATER_6 = new SimpleDateFormat("yyyyMMddHHmm");
	public static final SimpleDateFormat FORMATER_7 = new SimpleDateFormat("yyMMdd");
	public static final SimpleDateFormat FORMATER_8 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static final SimpleDateFormat FORMATER_9 = new SimpleDateFormat("yyyyMMddHHmmss");
	public static final SimpleDateFormat FORMATER_10 = new SimpleDateFormat("ddMMMyy",Locale.ENGLISH);
	public static final SimpleDateFormat FORMATER_11 = new SimpleDateFormat("ddMMMyyyy",Locale.ENGLISH);
	public static final SimpleDateFormat FORMATER_12 = new SimpleDateFormat("MM/yyyy");
	
	public static String getCurrentDateStr(String form){
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat(form);
		String today = sdf.format(new Date(time));
		
		return today;
	}
	
	public static Date getCurrentDate(String form){
		
		Date today = null;
		try {
			long time = System.currentTimeMillis();
			SimpleDateFormat sdf = new SimpleDateFormat(form);
			String todayStr = sdf.format(new Date(time));
			today = sdf.parse(todayStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return today;
	}

	/**
	*  获取日期相差天数
	* @param 
	* @return 日期类型时间
	* @throws ParseException 
	*/
	public static int getDiffDay(String beginDate, String endDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		// 开始结束相差天数
		int days = 0;
		try {
			long diff = (formatter.parse(endDate).getTime() - formatter.parse(beginDate).getTime())
				/ (1000 * 24 * 60 * 60);
			days = (int)diff;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return days;
	}
	
	public static String addDayDate(String startDate,int dc, String form){
		String endDate = "";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(form);
			Date date = sdf.parse(startDate);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, 1);
			endDate = sdf.format(cal.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		return endDate;
	}
	/**
	*  获取日期相差天数
	* @param 
	* @return 日期类型时间
	* @throws ParseException 
	*/
	public static int getDiffDay(Date beginDate, Date endDate) {
		// 开始结束相差天数
		int days = 0;
		long diff = (endDate.getTime() - beginDate.getTime())
			/ (1000 * 24 * 60 * 60);
		days = (int)diff;
		return days;
	}
	
	public static Date addDayDate(Date startDate,int dc, String form){
		Date endDate = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(form);
			Calendar cal = Calendar.getInstance();
			cal.setTime(startDate);
			cal.add(Calendar.DATE, 1);
			String endDateStr = sdf.format(cal.getTime());
			endDate = sdf.parse(endDateStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return endDate;
	}
	
	/**
	 * 转换日期格式,从20140717转为2014-07-17的格式
	 * @param str
	 * @return
	 */
	public static synchronized String convertDateFormat1To2(String str){
		try{
			return FORMATER_2.format(FORMATER_1.parse(str));
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Date a = getCurrentDate("yyyy-MM-dd hh:mm:ss");
		System.out.println(a);
		String b = getCurrentDateStr("yyyy-MM-dd HH:mm:ss");
		System.out.println(b);
	}
	
	public static synchronized boolean validTime(String starttime,String endtime){
		
		boolean flag = false;
		try {
			Date date1 = FORMATER_2.parse(starttime);
			Date date2 = FORMATER_2.parse(endtime);
			Date targetDate = FORMATER_2.parse(FORMATER_2.format(new Date())) ;
			if((targetDate.after(date1)||targetDate.equals(date1))&&(targetDate.before(date2)||targetDate.equals(date2))){
				flag = true;
			}
		} catch (ParseException e) {
			Util.err(e);
		}
		return flag;
	}
	public static synchronized boolean validTime(String starttime,String endtime,String target){
		
		boolean flag = false;
		try {
			Date date1 = FORMATER_2.parse(starttime);
			Date date2 = FORMATER_2.parse(endtime);
			Date targetDate = FORMATER_2.parse(target);
			if((targetDate.after(date1)||targetDate.equals(date1))&&(targetDate.before(date2)||targetDate.equals(date2))){
				flag = true;
			}
		} catch (ParseException e) {
			Util.err(e);
		}
		return flag;
	}
	
	/**
	 * 将毫秒转换为日期格式 
	 * formatType:
	 * 1 yyyyMMdd
	 * 2 yyyy-MM-dd
	 * 3 yyyy-MM-dd HH:mm:ss
	 * 4 yyyy-MM-dd HH:mm:ss:SSS
	 * 5 HH
	 * @param str
	 * @return
	 */
	public static synchronized String format(int formatType,long mills){
		try{
			switch(formatType){
			case 1:
				return FORMATER_1.format(mills);//yyyyMMdd
			case 2:
				return FORMATER_2.format(mills);//yyyy-MM-dd
			case 3:
				return FORMATER_3.format(mills);//yyyy-MM-dd HH:mm:ss
			case 4:
				return FORMATER_4.format(mills);//yyyy-MM-dd HH:mm:ss:SSS
			case 5:
				return FORMATER_5.format(mills);//HH
			case 6:
				return FORMATER_6.format(mills);//yyyyMMddHHmm
			case 7:
				return FORMATER_7.format(mills);//yyyyMMddHHmm
			case 8:
				return FORMATER_8.format(mills);//yyyy-MM-dd HH:mm
			default:
				return FORMATER_3.format(mills);		
			}
		}catch(Exception e){	
			Util.err(e);
		}
		return null;
	}	
	
	/**
	 * 将日期转换为日期格式
	 * formatType:
	 * 1 yyyyMMdd
	 * 2 yyyy-MM-dd
	 * 3 yyyy-MM-dd HH:mm:ss
	 * 4 yyyy-MM-dd HH:mm:ss:SSS
	 * 5 HH 
	 * @param str
	 * @return
	 */
	public static synchronized String format(int formatType,Date timeDate){
		return format(formatType,timeDate.getTime());
	}
	
	/**
	 * 转换日期格式，把旧的日期oldStr从格式formatOld转换成新的格式formatNew
	 * @param oldStr
	 * @param formatOld
	 * @param formatNew
	 * @return   
	 * @author wangcf
	 * @date 2016-6-2 下午3:40:48
	 */
	public static String cvonverDateFormat(String oldStr,SimpleDateFormat formatOld,SimpleDateFormat formatNew){
		try{
			return formatNew.format(formatOld.parse(oldStr));		
		}catch(Exception e){	
			Util.err(e);
		}
		return null;
	}
	
}
