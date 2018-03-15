package com.liwc.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.liwc.model.SysUser;


public class SysUserServiceTest extends BaseTest{

	
	@Autowired
	private SysUserService service;
	
	
	@Test
	public void testFind() {
		
		SysUser m = service.selectByPrimaryKey(18);
		Assert.assertNotNull(m);
	}

	@Test
	public void testFindAll() {
		
		List<SysUser> list = service.findAll();
//		Assert.assertEquals(list.size(), 15);
		
		logger.debug("------>list size:"+list.size());
	}

	@Test
	@Rollback() // 默认回滚
	public void testSave() {
		
		SysUser sm = new SysUser();
		sm.setuLoginId("admin");
		sm.setuRole(18);
		service.insert(sm);
	}

	@Test
	@Rollback(true)
	public void testUpdateById() {
		
		SysUser sm =service.selectByPrimaryKey(18);
		sm.setuName("bad cat!!!");
		
		service.updateByPrimaryKey(sm);
	}

	@Test
	@Rollback(true)
	public void testDelete() {
		service.deleteByPrimaryKey(18);
	}
	
}
