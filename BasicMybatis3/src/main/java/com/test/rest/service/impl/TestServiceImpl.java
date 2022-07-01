package com.test.rest.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.dao.TestDao;
import com.test.rest.service.TestService;
import com.test.rest.vo.TestVo;

@Service
public class TestServiceImpl implements TestService{
	Map<String, TestVo> testVo;
	
	@Autowired
	private TestDao testDao;
	
	public List<TestVo> getList() {		
		return testDao.getList();
	}
}
