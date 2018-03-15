package com.liwc.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.google.gson.Gson;
import com.liwc.model.SysMenu;


public class SysMenuServiceTest extends BaseTest{

	
	@Autowired
	private SysMenuService service;
	
	
	@Test
	public void testFind() {
		
		SysMenu m = service.selectByPrimaryKey(1);
		Gson gson = new Gson();
		logger.info("---->sysMenu:"+gson.toJson(m));
		Assert.assertNotNull(m);
	}

	@Test
	public void testFindAll() {
		
		List<SysMenu> list = service.findAll();
		
		Gson gson = new Gson();
		logger.info("---->sysMenuList:"+gson.toJson(list));
		
//		Assert.assertEquals(list.size(), 15);
	}

	@Test
	@Rollback() // 默认回滚
	public void testSave() {
		
		SysMenu sm = new SysMenu();
		sm.setmName("Echarts");
		sm.setmLevel(2);
		sm.setmParent(4);
		sm.setmOrder(3);
		service.insert(sm);
	}

	@Test
	@Rollback(true)
	public void testDelete() {
		service.deleteByPrimaryKey(1);
	}

	@Test
	@Rollback(true)
	public void testUpdateById() {
		
		SysMenu sm =service.selectByPrimaryKey(1);
		sm.setmName("bad cat!!!");
		
		service.updateByPrimaryKey(sm);
	}

	
	
}
