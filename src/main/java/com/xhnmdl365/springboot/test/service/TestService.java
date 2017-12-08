package com.xhnmdl365.springboot.test.service;

import com.xhnmdl365.springboot.test.bean.Demo;
import com.xhnmdl365.springboot.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author Anthony
 * @Date 2017/9/10 10:13
 */
@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;

	@Transactional
	public int save(Demo demo) {
		return testMapper.save(demo);
	}

	@Transactional
	public int update(Demo demo) {
		return testMapper.update(demo);
	}

	@Transactional
	public int delete(int id) {
		return testMapper.delete(id);
	}

	public List<Demo> selectAll() {
		return testMapper.selectAll();
	}

	public Map selectById(int id) {
		return testMapper.selectById(id);
	}
}
