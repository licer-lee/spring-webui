package com.liwc.service;

import java.util.List;

import com.liwc.message.AjaxMessage;
import com.liwc.model.SysUser;

public interface SysUserService {

	
	AjaxMessage deleteByPrimaryKey(Integer id);

	AjaxMessage insert(SysUser record);

	AjaxMessage insertSelective(SysUser record);

	SysUser selectByPrimaryKey(Integer id);

	AjaxMessage updateByPrimaryKeySelective(SysUser record);

	AjaxMessage updateByPrimaryKey(SysUser record);

	List<SysUser> findAll();
	
}
