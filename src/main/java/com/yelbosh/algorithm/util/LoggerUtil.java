package com.yelbosh.algorithm.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Log4j 的简单封装使用，用于记录运行日志
 * @author Yelbosh
 *
 */
public class LoggerUtil {
	
	public static Logger getLogger(Class className){
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
    	Logger logger = Logger.getLogger(className);
    	return logger;
	}
	
}
