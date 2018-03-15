package com.liwc.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.liwc.model.SysRole;


public class SysRoleServiceTest extends BaseTest{

	
	@Autowired
	private SysRoleService service;
	
	
	@Test
	public void testFind() {
		
		SysRole m = service.selectByPrimaryKey(18);
		Assert.assertNotNull(m);
	}

	@Test
	public void testFindAll() {
		
		List<SysRole> list = service.findAll();
//		Assert.assertEquals(list.size(), 15);
		
		logger.debug("------>list size:"+list.size());
	}

	@Test
	@Rollback() // 默认回滚
	public void testSave() {
		
		SysRole sm = new SysRole();
		sm.setrCode("100");
		sm.setrName("客服");
		service.insert(sm);
	}

	@Test
	@Rollback(true)
	public void testUpdateById() {
		
		SysRole sm =service.selectByPrimaryKey(18);
		sm.setrName("bad cat!!!");
		
		service.updateByPrimaryKey(sm);
	}

	@Test
	@Rollback(true)
	public void testDelete() {
		service.deleteByPrimaryKey(18);
	}
	
}
