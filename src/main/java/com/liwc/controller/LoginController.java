package com.liwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	
	
	@RequestMapping("/toLogin")
	public String index(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "redirect:layout/index";
	}
	
	
	@RequestMapping("/logout")
	public String logout(){
		return "redirect:toLogin";
	}
	
}
