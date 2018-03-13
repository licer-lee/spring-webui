package com.liwc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liwc.model.SysMenu;
import com.liwc.service.SysMenuService;

@Controller
//@RequestMapping("layout")
public class LayoutController {
	
	
	
	
	@Autowired
	private SysMenuService service; 
	
	
	
	
	@RequestMapping("/index")
	public String index(Model model){
		
		List<SysMenu> menus = service.findAll();
		model.addAttribute("menus", menus);
		
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
