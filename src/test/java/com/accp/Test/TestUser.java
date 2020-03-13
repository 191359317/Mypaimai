package com.accp.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.UserBiz;

@SpringBootTest
public class TestUser {
	
	@Autowired
	private UserBiz biz;
	
	@Test
	public void name() {
		
	}
}
