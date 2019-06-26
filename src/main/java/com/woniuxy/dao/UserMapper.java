package com.woniuxy.dao;

import java.util.List;

public interface UserMapper {
	void save(User user);
	void delete(Integer id);
	void update(User user);
	User findOne(Integer id);
	List<User> findAll();
}
