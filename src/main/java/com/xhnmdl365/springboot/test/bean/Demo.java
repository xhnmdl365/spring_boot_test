package com.xhnmdl365.springboot.test.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Description 使用@Entity 进行实体类的持久化操作，当JPA检测到我们的实体类当中有@Entity的时候
 * 				，会在数据库里生成相应的表结构
 * @Author Anthony
 * @Date 2017/8/31 21:10
 */

public class Demo {

	/*
	 * @Id 指定主键
	 * @@GeneratedValue(strategy = GenerationType.AUTO) 自增长
	 *
	 */
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{id = "+ this.getId() + ", name = "+ this.getName() + "}";
	}
}
