package com.xhnmdl365.springboot;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import java.util.ArrayList;
import java.util.List;

/**
 * 在这里我们使用@SpringBootApplication 指定这是一个spring boot 的应用程序
 */
@SpringBootApplication()
@MapperScan("com.xhnmdl365.springboot.*.mapper")
public class SpringbootApplication extends WebMvcConfigurerAdapter {


//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		super.configureMessageConverters(converters);
//
//		/*
//		 * 1、需要定义一个 convert 转换消息的对象
//		 * 2、添加fastJson 的配置信息，比如：是否要格式化返回json数据
//		 * 3、在convert中添加配置信息
//		 * 4、将convert添加到converters当中
//		 */
//		// 1、需要定义一个 convert 转换消息的对象
//		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//		// 2、添加fastJson 的配置信息，比如：是否要格式化返回json数据
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(
//				SerializerFeature.PrettyFormat
//		);
//		//处理中文乱码问题
//		List<MediaType> fastMediaTypes = new ArrayList<>();
//		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//		fastConverter.setSupportedMediaTypes(fastMediaTypes);
//		// 3、在convert中添加配置信息
//		fastConverter.setFastJsonConfig(fastJsonConfig);
//		// 4、将convert添加到converters当中
//		converters.add(fastConverter);
//	}

	@Bean
	public HttpMessageConverters FastJsonHttpMessageConverters() {
		// 1、需要定义一个 convert 转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		// 2、添加fastJson 的配置信息，比如：是否要格式化返回json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(
			SerializerFeature.PrettyFormat
		);
		//处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);

		// 3、在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}


	public static void main(String[] args) {
		// 在mian方法里面进行启动我们的应用程序
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
