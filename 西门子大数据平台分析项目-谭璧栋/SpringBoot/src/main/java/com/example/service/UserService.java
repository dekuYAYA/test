package com.example.service;

/**
 * service：服务
 * @Service：注解表示该类是业务层 ，方便注入到其他需要用到的类中
 */

import com.example.entity.User;
import com.example.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	// 实例化UserMapper
	@Autowired
	UserMapper userMapper;

	public List<User> Sel() {
		return userMapper.Sel();
	}
}