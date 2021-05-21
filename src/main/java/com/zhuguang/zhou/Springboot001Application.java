package com.zhuguang.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zhuguang.zhou.service.UserInfoService;
import com.zhuguang.zhou.service.impl.UserInfoServiceImpl;


@SpringBootApplication
/*@EnableAutoConfiguration
@ComponentScan(basePackages={"com.zhuguang.zhou"})
@Configuration*/
public class Springboot001Application {
    /**
     * 
     * @SpringBootApplication ==
     * 等价于  @EnableAutoConfiguration和@ComponentScan 
     * 
     * 
     * 
     * @param args
     */
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot001Application.class, args);
	}
	
	@Bean("userInfoService")
	public UserInfoService getUserInfoService() {
		return new UserInfoServiceImpl();
	}
}
