package com.zhuguang.zhou.controll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhuguang.zhou.service.UserInfoService;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Value("${id}")
	private int id;
	
	@RequestMapping("getInfo")
	public String getUserInfo() {
		System.out.println("用户ID:" + id);
		System.out.println("用户信息获得成功...");
		String name = userInfoService.getUserInfo();
		logger.info("掉用完成了...name：" + name);
		return "success";
	}

}
