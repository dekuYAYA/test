package com.example.controller;

/**
 * controller：控制器
 */
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RequestMapping:可以用来注释一个控制器,告诉Spring这是一个用来处理请求地址映射的注解。
 * @RestController:告诉控制器返回对象会被自动序列化成JSON，直接返回给调用者，并且传回HttpResponse这个对象。
 * @CrossOrigin:处理跨域请求
 */

@RestController
@RequestMapping("/get_My_Info_Order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@CrossOrigin(origins = "*")
	@RequestMapping("getOrder")
	public Object User2() {
		return orderService.Sel2();
	}
}