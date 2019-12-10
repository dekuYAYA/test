package com.example.service;

/**
 * service：服务
 * @Service：注解表示该类是业务层 ，方便注入到其他需要用到的类中
 */

import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	// 实例化UserMapper
	@Autowired
	OrderMapper orderMapper;

	public List<Order> Sel2() {
		return orderMapper.Sel2();

	}
}
