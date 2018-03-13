package com.liwc.mapper;

import java.util.List;

import com.liwc.model.SysMenu;

public interface SysMenuMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(SysMenu record);

	int insertSelective(SysMenu record);

	SysMenu selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysMenu record);

	int updateByPrimaryKey(SysMenu record);

	List<SysMenu> findAll();
	
	
}