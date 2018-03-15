package com.liwc.service;

import java.util.List;

import com.liwc.message.AjaxMessage;
import com.liwc.model.SysRole;

public interface SysRoleService {

	
	AjaxMessage deleteByPrimaryKey(Integer id);

	AjaxMessage insert(SysRole record);

	AjaxMessage insertSelective(SysRole record);

	SysRole selectByPrimaryKey(Integer id);

	AjaxMessage updateByPrimaryKeySelective(SysRole record);

	AjaxMessage updateByPrimaryKey(SysRole record);

	List<SysRole> findAll();
	
}
