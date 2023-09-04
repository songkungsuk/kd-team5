package com.team5.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller 가있어야 비로소 컨트롤러역할을 할수있다  종류 Controller Service Repository Component Configuration RestController
@Controller
@CrossOrigin("*")
public class TestController {
	
	@RequestMapping(value = "/str/**", method = RequestMethod.GET) //Request mapping
	public String test() {
		return "str";
	}
	
	@RequestMapping(value = "api/list", method = RequestMethod.GET)
	@ResponseBody //자동으로 json형태로 반환해준다
	public List<String> getList(){
		List<String> list = new ArrayList<String>();
		list.add("song");
		list.add("kung");
		list.add("suk");
		
		return list;
	}
	
	@RequestMapping(value = "api/user")
	@ResponseBody
	public List<Map<String, String>> getUser(){
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		for(int i=0; i<10; i++) {
			Map<String, String> user = new HashMap<String, String>();
			user.put("name", "name"+(i+1));
			user.put("age", ""+(i+1));
			list.add(user);
		}
		return list;
	}
}
