package com.xhnmdl365.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description 在这里使用RestController 等价于@Controller和@ RequestBody
 * @Author Anthony
 * @Date 2017/8/30 20:29
 *
 */

@RestController
public class HelloController {

	/**
	 * 在这里我们使用@RequestMapping 建立请求映射
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}


	@RequestMapping("/getDemo")
	public Demo getDemo() {

		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		demo.setCreateTime(new Date());
		demo.setRemark("我是备注信息");
		return demo;
	}
}
