package com.xhnmdl365.springboot.demo.controller;

import com.xhnmdl365.springboot.demo.bean.Cat;
import com.xhnmdl365.springboot.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author Anthony
 * @Date 2017/9/3 14:24
 */

@RestController
@RequestMapping("/cat")
public class CatController {

	@Resource
	private CatService catService;

	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setCatName("jack");
		cat.setCatAge(3);
		catService.save(cat);
		return "save ok";
	}

	@RequestMapping("/delete")
	public String delete() {
		catService.delete(1);
		return "delete ok";
	}
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll() {
		return catService.getAll();
	}
}
