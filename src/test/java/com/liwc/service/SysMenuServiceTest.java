package com.liwc.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.liwc.mapper.SysMenuMapper;
import com.liwc.model.SysMenu;

//
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring-*.xml")

// 注入事物管理器
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class SysMenuServiceTest {

	
	@Autowired
	private SysMenuMapper mapper;
	
	
	@Test
	public void testFind() {
		
		SysMenu m = mapper.selectByPrimaryKey(1);
		
		Assert.assertNotNull(m);
		
	}

	@Test
	public void testFindAll() {
		
		List<SysMenu> list = mapper.findAll();
		
		Assert.assertEquals(list.size(), 15);
	}

	@Test
	@Rollback() // 默认回滚
	public void testSave() {
		
		SysMenu sm = new SysMenu();
		sm.setmName("Echarts");
		sm.setmLevel(2);
		sm.setmParent(4);
		sm.setmOrder(3);
		
		mapper.insert(sm);
		
		
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testUpdateById() {
	}

}
