package com.xhnmdl365.springboot.demo.service;

import com.xhnmdl365.springboot.demo.bean.Cat;
import com.xhnmdl365.springboot.demo.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description save, delete, update 需要绑定事物
 * @Author Anthony
 * @Date 2017/8/31 21:20
 */

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;

	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}

	@Transactional
	public void update(Cat cat) {
		catRepository.save(cat);
	}

	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}

}
