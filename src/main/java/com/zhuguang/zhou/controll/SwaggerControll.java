package com.zhuguang.zhou.controll;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhuguang.zhou.dto.StudentDTO;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class SwaggerControll {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());   
	/**
	 * 在参数调用的时候很重要
	 * paramType="path"(路径上) ,query(?后面), 
	 * body(参数体)
	 * 
	 * 数据类型（dataType）在指定类型的时候要完全和对应的类型一致这样在页面上就会显示
	 * 对应的页面数据结构
	 * dataType="StudentDTO"
	 * 
	 * @param id
	 * @return
	 */
	
	
	@ApiOperation(value = "获得用户信息", notes = "获得用户信息")
	@ApiImplicitParam(name = "id", value = "id", dataType = "String", paramType = "path")
	@RequestMapping(value = "/getSwaggerInfo/{id}", method = RequestMethod.GET)
	public String getSwaggerInfo(@PathVariable("id") String id) {
		System.out.println("==========id：" + id);
		return "success";
	}

	@ApiOperation(value="获取用户信息", notes="根据id来获取用户详细信息")
	@ApiImplicitParam(name="id", value="用户ID", required=true,dataType="String",paramType="path")
	@RequestMapping(value="/getInfo/{id}", method=RequestMethod.GET)
	public Map<String,String> getInfo(@PathVariable("id") String id) {
	       Map<String ,String> map = new HashMap<String, String>();
	       map.put("name", "张三");
	       map.put("age", "34");
	       map.put("id", id);
	       return map;
	}
	
	@ApiOperation(value="保存学生信息",notes="保存学生信息")
	@ApiImplicitParam(name="studentDTO",value="studentDTO",dataType="StudentDTO",paramType="body",required=true)
	@PostMapping("/saveStudentInfo")
	public String saveStudentInfo(@RequestBody StudentDTO studentDTO ) {
		 System.out.println("信息:"+studentDTO);
		 return "OK1";
		
	}
	
	/**
	 * dataType="string" string小写也可以
	 * @param id
	 * @return
	 */
	@ApiOperation(value="获得用户信息",notes="获得用户信息")
	@ApiImplicitParam(name="id",value="id",dataType="string",paramType="query",required=true)
	@GetMapping(value="/getStudentInfo")
	public StudentDTO getStudentInfo(@RequestParam("id")String id) {
		logger.info("======id=====" + id);
		StudentDTO stu = new StudentDTO();
		stu.setAge(28);
		stu.setId("123");
		stu.setName("占山");
		stu.setSex("男");
		return stu;
	} 
	
	
}
