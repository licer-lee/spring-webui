package com.liwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("{pages}")
public class PageController {
	
	@RequestMapping("layout/fixed")
	public String fixed(){
		return "pages/layout/fixed";
	}
	
	
	
}
