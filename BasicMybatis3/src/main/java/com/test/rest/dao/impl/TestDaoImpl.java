package com.test.rest.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.rest.dao.TestDao;
import com.test.rest.vo.TestVo;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<TestVo> getList() {
		List<TestVo> test = sqlSession.selectList("test.test");
		
		return test;
	}
}