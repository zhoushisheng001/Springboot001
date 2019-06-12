package com.zhuguang.zhou;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhuguang.zhou.controll.UserInfoController;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes=Springboot001Application.class)
@SpringBootTest
public class Springboot001ApplicationTests {
    
	@Autowired
	private UserInfoController userInfoController;
	
	@Test
	public void contextLoads() {
		//TestCase.assertEquals(expected, actual);
		String name = userInfoController.getUserInfo();
		System.out.println(name);
	}

}
