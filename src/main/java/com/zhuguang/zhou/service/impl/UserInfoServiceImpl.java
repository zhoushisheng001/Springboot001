package com.zhuguang.zhou.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhuguang.zhou.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {
	
	private final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

	@Override
	public String getUserInfo() {
		logger.info("service获得用户信息getUserInfo");
		return "OK";
	}

}
