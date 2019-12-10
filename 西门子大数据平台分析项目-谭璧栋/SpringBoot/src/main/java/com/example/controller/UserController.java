package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller:控制器
 * 
 * @RequestMapping:可以用来注释一个控制器,告诉Spring这是一个用来处理请求地址映射的注解。
 * @RestController:告诉控制器返回对象会被自动序列化成JSON，直接返回给调用者，并且传回HttpResponse这个对象。
 * @CrossOrigin:处理跨域请求
 */

@RestController
@RequestMapping("/get_My_Info_User")
public class UserController {
	/**
	 * 在容器中查找名称为UserService的实例，并自动装配给该参数。
	 */
	@Autowired
	private UserService userService;

	@CrossOrigin(origins = "*")
	@RequestMapping("getUser")
	public Object User() {
		return userService.Sel();
	}
}