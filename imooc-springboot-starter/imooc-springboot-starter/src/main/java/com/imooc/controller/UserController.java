package com.imooc.controller;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.ImoocApplication;
import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

/*@Controller*/
@RequestMapping("user")
@RestController //=@Controller + @ResponseBody
public class UserController {

	@RequestMapping("/getUser")
	/*@ResponseBody*/
	public User getUser(){
		User u = new User();
		u.setUserNo("003");
		u.setName("cassiel");
		u.setPassword("123123");
		u.setBirthday(new Date());
		u.setAge(12);
		u.setDescription("hello imooc");
		return u;
	}
	
	
	@RequestMapping("/getUserJson")
	/*@ResponseBody*/
	public IMoocJSONResult getUserJson(){
		User u = new User();
		u.setUserNo("001");
		u.setName("cassiel");
		u.setPassword("123123");
		u.setBirthday(new Date());
		u.setAge(12);
		return IMoocJSONResult.ok(u);
	}
	
}
