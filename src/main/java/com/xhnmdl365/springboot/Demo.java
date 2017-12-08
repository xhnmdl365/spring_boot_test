package com.xhnmdl365.springboot;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Description 这是一个测试实体类
 * @Author Anthony
 * @Date 2017/8/31 14:24
 */
public class Demo {

	private int Id;
	private String name;

	@JSONField(format = "yyyy-MM-dd hh:mm")
	private Date createTime;

	// 现在不需要返回此字段
	@JSONField(serialize = false)
	private String remark;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
