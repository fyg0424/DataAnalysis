package com.shijie99.TestJava.bootstrap;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shijie99.TestJava.util.ConfigUtil;

/**
 * 应用启动入口类
 * 
 * @author zhoucl
 */
public class Bootstrap {
	private static final Logger logger = LoggerFactory
			.getLogger(Bootstrap.class);

	private static final Daemon daemon = Daemon.getInstance();

	private static Boolean DEBUG = true;

	public static void main(String[] args) {
		try {
			String command = "start";

			DEBUG = Boolean.valueOf(System.getProperty("debug", "true"));

			if (DEBUG) {
				loadProps(DEBUG);
				daemon.init();
				daemon.start();
			} else {
				if (args.length > 0) {
					command = args[args.length - 1];

					if (command.equals("start")) {
						loadProps(DEBUG);

						daemon.init();
						daemon.start();
					} else if (command.equals("stop")) {
						// 暂不实现
						daemon.stop();
					} else {
						logger.warn("Bootstrap: command \"" + command
								+ "\" does not exist.");
					}
				} else {
					logger.error("Bootstrap command error!\n"
							+ "eg: java -jar ***.jar start");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

			logger.error("server start fail!", e);
			System.exit(-1);
		}
	}

	private static void loadProps(Boolean isDebug) {
		String filePath = "";
		FileInputStream fis = null;

		try {
			if (DEBUG) {
				filePath = Bootstrap.class.getClass().getResource("/")
						.getPath()
						+ "config.properties";
			} else {
				String jarPath = Bootstrap.class.getProtectionDomain()
						.getCodeSource().getLocation().getFile();
				jarPath = jarPath.substring(0, jarPath.lastIndexOf('/'));
				jarPath = jarPath.substring(0, jarPath.lastIndexOf('/') + 1)
						+ "conf";
				filePath = jarPath + "/config.properties";
			}

			logger.info("加载配置文件[" + filePath + "]成功!");
			fis = new FileInputStream(new File(filePath));

			Properties p = new Properties();
			p.load(fis);

			ConfigUtil.setProps(p);

			logger.info("读取配置参数[cron]:[" + ConfigUtil.get("cron") + "]");
		} catch (Exception e) {
			logger.error("加载配置文件[" + filePath + "]异常:\n" + e.getMessage());
		}
	}
}
