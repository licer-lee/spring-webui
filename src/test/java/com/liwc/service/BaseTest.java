package com.liwc.service;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 功能：测试用例基类
 * 描述：
 * 创建时间：2018年3月15日 上午9:26:04
 * @author liwc
 * @version v1.0
 * 文件： BaseTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-*.xml")
@Transactional
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
public class BaseTest {

	protected static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
	
	long start = 0;
			
	@Before
	public void before() {
		
		start = System.currentTimeMillis();
		logger.debug("--->测试开始");
	}
	
	

	@After
	public void after() {
		
		long end = System.currentTimeMillis();
		
		logger.debug("--->测试完成，时间"+ (end - start) +" ms" );
	}
	
	
}
