package com.liwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("layout")
public class LayoutController {
	
	
	
	
	@RequestMapping("/index")
	public String index(Model model){
		
		
		
		return "index";
	}
	
	
	@RequestMapping("/index2")
	public String index2(){
		return "index2";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(){
		return "dashboard";
	}
	
	
	@RequestMapping("/dashboard2")
	public String dashboard2(){
		return "dashboard2";
	}
	
}
