package com.liwc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.SysMenuMapper;
import com.liwc.message.AjaxMessage;
import com.liwc.model.SysMenu;
import com.liwc.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper mapper;
	
	

	@Override
	public AjaxMessage deleteByPrimaryKey(Integer id) {
		
		int effectCount = mapper.deleteByPrimaryKey(id);;
		
		AjaxMessage am = new AjaxMessage();
		am.setMsg("deleted!");
		am.setContent(effectCount);
		
		return am;
	}

	@Override
	public AjaxMessage insert(SysMenu record) {

		int effectCount = mapper.insert(record);;
		
		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);
		
		return am;
	}

	@Override
	public AjaxMessage insertSelective(SysMenu record) {

		int effectCount = mapper.insertSelective(record);;
		
		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);
		
		return am;
	}

	@Override
	public SysMenu selectByPrimaryKey(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public AjaxMessage updateByPrimaryKeySelective(SysMenu record) {

		int effectCount = mapper.updateByPrimaryKeySelective(record);;
		
		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);
		
		return am;
	}

	@Override
	public AjaxMessage updateByPrimaryKey(SysMenu record) {

		int effectCount = mapper.updateByPrimaryKey(record);;
		
		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);
		
		return am;
	}

	@Override
	public List<SysMenu> findAll() {
		
		return mapper.findAll();
	}





}
