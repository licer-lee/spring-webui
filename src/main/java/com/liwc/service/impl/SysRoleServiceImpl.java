package com.liwc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.SysRoleMapper;
import com.liwc.message.AjaxMessage;
import com.liwc.model.SysRole;
import com.liwc.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapper mapper;

	@Override
	public AjaxMessage deleteByPrimaryKey(Integer id) {

		int effectCount = mapper.deleteByPrimaryKey(id);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("deleted!");
		am.setContent(effectCount);

		return am;
	}

	@Override
	public AjaxMessage insert(SysRole record) {

		int effectCount = mapper.insert(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public AjaxMessage insertSelective(SysRole record) {

		int effectCount = mapper.insertSelective(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public SysRole selectByPrimaryKey(Integer id) {

		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public AjaxMessage updateByPrimaryKeySelective(SysRole record) {

		int effectCount = mapper.updateByPrimaryKeySelective(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public AjaxMessage updateByPrimaryKey(SysRole record) {

		int effectCount = mapper.updateByPrimaryKey(record);

		AjaxMessage am = new AjaxMessage();
		am.setMsg("操作成功");
		am.setContent(record);

		return am;
	}

	@Override
	public List<SysRole> findAll() {

		return mapper.selectAll();
	}

}
