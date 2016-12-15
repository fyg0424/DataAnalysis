package com.shijie99.TestJava.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shijie99.TestJava.service.BusinessService;
import com.shijie99.TestJava.util.ConfigUtil;

/**
 * 具体执行工作类
 * @author zhoucl
 *
 */
public class DemoJob implements Job {
	private static final Logger logger = LoggerFactory.getLogger(DemoJob.class);
	
	@Override
	public void execute(JobExecutionContext context)
		throws JobExecutionException {
		BusinessService businessService = ConfigUtil.getBusinessService();
		
		try{
			logger.info("tpf.flight_book记录数:" + businessService.countFlightBook());
			
			logger.info("policy.policy_agent_info记录数:" + businessService.countPolicyAgent());
			
			logger.debug("DemoJob executed.");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
