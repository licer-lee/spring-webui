package com.liwc.service;

import java.util.List;

import com.liwc.message.AjaxMessage;
import com.liwc.model.SysMenu;

public interface SysMenuService {

	
	AjaxMessage deleteByPrimaryKey(Integer id);

	AjaxMessage insert(SysMenu record);

	AjaxMessage insertSelective(SysMenu record);

	SysMenu selectByPrimaryKey(Integer id);

	AjaxMessage updateByPrimaryKeySelective(SysMenu record);

	AjaxMessage updateByPrimaryKey(SysMenu record);

	List<SysMenu> findAll();
	
}
