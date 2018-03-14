package com.liwc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liwc.message.AjaxMessage;
import com.liwc.model.SysMenu;
import com.liwc.service.SysMenuService;

@Controller
@RequestMapping("system/menu")
public class SysMenuController {

	private static final String PERFIX  = "system/menu/";
	
	@Autowired
	private SysMenuService service;


	@RequestMapping("/index")
	public String index(Model model){
		
		model.addAttribute("menus", service.findAll());
		return PERFIX+"index";
	}
	
	
	@RequestMapping("info/{id}")
	public String info(@PathVariable("id") int id, Model model){
		
		SysMenu t = service.selectByPrimaryKey(id);
		model.addAttribute("t", t);
		return "menu/info";
	}
	
	
	@ResponseBody
	@RequestMapping("list")
	public List<SysMenu> list(){
		return service.findAll();
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public SysMenu get(@PathVariable("id") int id){
		return service.selectByPrimaryKey(id);
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public AjaxMessage add(SysMenu t){
		
		return service.insert(t);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	public SysMenu update(SysMenu t){
		
		service.updateByPrimaryKey(t);
		return t;
	}
	
	
	@RequestMapping("delete/{id}")
	@ResponseBody
	public AjaxMessage delete(@PathVariable("id") int id){
		return service.deleteByPrimaryKey(id);
	}

	

}
