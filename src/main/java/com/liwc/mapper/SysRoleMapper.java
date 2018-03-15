package com.liwc.mapper;

import java.util.List;

import com.liwc.model.SysRole;

/**
 * 
 * 功能：角色
 * 描述：
 * 创建时间：2018年3月15日 上午9:51:18
 * @author liwc
 * @version v1.0
 * 文件： SysRoleMapper
 */
public interface SysRoleMapper {
	
	
	int deleteByPrimaryKey(Integer id);

	int insert(SysRole record);

	int insertSelective(SysRole record);

	SysRole selectByPrimaryKey(Integer id);
	
	List<SysRole> selectAll();

	int updateByPrimaryKeySelective(SysRole record);

	int updateByPrimaryKey(SysRole record);
}