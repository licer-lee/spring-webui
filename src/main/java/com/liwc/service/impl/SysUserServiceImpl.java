package com.liwc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.SysUserMapper;
import com.liwc.message.AjaxMessage;
import com.liwc.model.SysUser;
import com.liwc.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper mapper;

	
	
	
	
	@Override
	public AjaxMessage deleteByPrimaryKey(Integer id) {

		int effectCount = mapper.deleteByPrimaryKey(id);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("deleted!");
		am.setContent(effectCount);

		return am;
	}

	@Override
	public AjaxMessage insert(SysUser record) {

		int effectCount = mapper.insert(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public AjaxMessage insertSelective(SysUser record) {

		int effectCount = mapper.insertSelective(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public SysUser selectByPrimaryKey(Integer id) {

		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public AjaxMessage updateByPrimaryKeySelective(SysUser record) {

		int effectCount = mapper.updateByPrimaryKeySelective(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public AjaxMessage updateByPrimaryKey(SysUser record) {

		int effectCount = mapper.updateByPrimaryKey(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public List<SysUser> findAll() {

		return mapper.selectAll();
	}

}
