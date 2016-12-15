package com.shijie99.TestJava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shijie99.TestJava.dao.policy.PolicyAgentInfoMapper;
import com.shijie99.TestJava.dao.tpf.FlightBookMapper;
import com.shijie99.TestJava.service.BusinessService;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	PolicyAgentInfoMapper policyAgentInfoMapper;
	
	@Autowired
	FlightBookMapper flightBookMapper;
	
	@Override
	public int countPolicyAgent() {
		return policyAgentInfoMapper.countByExample(null);
	}

	@Override
	public int countFlightBook() {
		return flightBookMapper.countByExample(null);
	}

}
