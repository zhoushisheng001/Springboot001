package com.zhuguang.zhou.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private int age;
	
	private String name;
	
	private String sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
}
