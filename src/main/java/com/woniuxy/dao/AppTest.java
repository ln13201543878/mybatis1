package com.woniuxy.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest {
	@Test
	public void test() throws Exception {
		SqlSession ss = MybatisUtils.getSqlSession();
		User user=new User();
		user.setId(118);
		user.setName("as");
		user.setBirthday(new Date());
		user.setMoney(1111d);
		UserMapper mapper = ss.getMapper(UserMapper.class);
		//mapper.save(user);
		//mapper.delete(109);
//		mapper.update(user);
	User one = mapper.findOne(1);
	System.out.println(one);
	List<User> list = mapper.findAll();
	for (User u : list) {
		System.out.println(u);
	}
	}
}
