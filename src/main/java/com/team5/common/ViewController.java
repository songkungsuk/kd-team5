package com.team5.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	
	@RequestMapping(value = "/views/**", method = RequestMethod.GET)
	public void test() {
		
	}
	
	@GetMapping("/test/**")
	@ResponseBody
	public String viewString() {
		return "move_forward";
	}
}
