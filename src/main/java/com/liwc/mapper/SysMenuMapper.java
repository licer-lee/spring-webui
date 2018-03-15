package com.liwc.mapper;

import java.util.List;

import com.liwc.model.SysMenu;

/**
 * 
 * 功能：系统菜单mapper接口
 * 描述：
 * 创建时间：2018年3月15日 上午9:22:29
 * @author liwc
 * @version v1.0
 * 文件： SysMenuMapper
 */
public interface SysMenuMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(SysMenu record);

	int insertSelective(SysMenu record);

	SysMenu selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysMenu record);

	int updateByPrimaryKey(SysMenu record);

	List<SysMenu> findAll();
	
	
}