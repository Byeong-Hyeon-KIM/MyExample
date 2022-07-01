package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.service.TestService;
import com.test.rest.vo.TestVo;

@RestController
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json" )
	public List<TestVo> test() {
		List<TestVo> test = testService.getList();
		
		String test2 = "새로 추가한 사항";
		
		return test;
	}
}