package com.xhnmdl365.springboot.test.controller;

import com.sun.org.apache.xpath.internal.functions.FuncQname;
import com.xhnmdl365.springboot.test.bean.Demo;
import com.xhnmdl365.springboot.test.service.TestService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author Anthony
 * @Date 2017/9/10 10:18
 */

@RestController
public class TestController {

	@Autowired

	private TestService testService;

	@RequestMapping("/save")
	public Demo save(Demo demo) {
		int rs = testService.save(demo);
		return demo;
	}

	@RequestMapping("/update")
	public Demo update(Demo demo) {
		int rs = testService.update(demo);
		return demo;
	}

	@RequestMapping("/delete")
	public int delete(int id) {
		int rs = testService.delete(id);
		return rs;
	}

	@RequestMapping("/selectAll")
	public List<Demo> selectAll() {
		List<Demo> rs = testService.selectAll();
		return rs;
	}
	@RequestMapping("/selectById")
	public Map selectById(int id) {
		Map rs = testService.selectById(id);
		return rs;
	}

}
