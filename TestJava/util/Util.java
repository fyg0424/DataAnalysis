/**
 * 其他工具类
 */
package com.shijie99.TestJava.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * 通用工具类
 * @author Think
 *
 */
public class Util {
	
	private static int debug = 1;
	
	/**
	 * 请求转发并返回结果
	 * 
	 * @param response
	 * @param json
	 */
	public static String transfer(String data,String serverUrl) {
		// 服务地址
		URL url;
		try {
			url = new URL(serverUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			Util.err(e1);
			return "fail";
		}
		// 设定连接的相关参数
		HttpURLConnection connection = null;
		String strResponse = "";
		BufferedReader reader = null;
		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(50 * 1000);// 10秒
			connection.setReadTimeout(50 * 1000);// 10秒
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type",
					"text/html; charset=utf-8");
			connection.setRequestProperty("Connection", "close");
			// 输出
			OutputStreamWriter output = new OutputStreamWriter(connection
					.getOutputStream(),"UTF-8");
			output.write(data);
			output.flush();
			output.close();

			// 获取服务端的反馈
			String strLine = "";
			InputStream in = connection.getInputStream();

			reader = new BufferedReader(
					new InputStreamReader(in,"UTF-8"));

			while ((strLine = reader.readLine()) != null) {
				strResponse += strLine ;
			}
		} catch (ProtocolException e) {
			Util.err(e);
		} catch (IOException e) {
			Util.err(e);
		} finally{
			try{
				if(reader != null){
					reader.close();
				}
			}catch(Exception e){}
			try{
				connection.disconnect();
			}catch(Exception e){
				Util.err(e);
			}
		}
		if(strResponse == null || strResponse.equals(""))
			return "fail";
		return strResponse;
	}
	
	/**
	 * 打印信息的简便方法，用于一些异常信息的输出
	 * @param str
	 * @return
	 */
	public static void err(Exception e){
		System.err.println("异常:"+e.getMessage());
		if(debug == 1){
			e.printStackTrace();
		}
		//写异常流水
	}
	/**
	 * 打印信息的简便方法，用于一些正常的提示性的输出
	 * @param str
	 * @return
	 */
	public static void info(String str){
		System.err.println(str);
	}
}
