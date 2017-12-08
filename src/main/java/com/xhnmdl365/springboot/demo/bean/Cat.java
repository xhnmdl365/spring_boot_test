package com.xhnmdl365.springboot.demo.bean;

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

@Entity
public class Cat {

	/*
	 * @Id 指定主键
	 * @@GeneratedValue(strategy = GenerationType.AUTO) 自增长
	 *
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String catName;   // 数据库默认对应 cat_name
	private int catAge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
}
