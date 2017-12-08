package com.xhnmdl365.springboot.test.mapper;

import com.xhnmdl365.springboot.test.bean.Demo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author Anthony
 * @Date 2017/9/10 10:09
 */
public interface TestMapper {

	@Insert("insert into Demo(name) values(#{name})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int save(Demo demo);

	@Update("update demo set name=#{name} where id=#{id}")
	public int update(Demo demo);

	@Delete("delete from demo where id=#{id}")
	public int delete(int id);

	@Select("select * from demo where id=#{id}")
	public Map selectById(int id);

	@Select("select * from demo")
	public List<Demo> selectAll();
}
