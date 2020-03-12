package com.example.bean;
import org.junit.Assert;
import org.junit.Test;

import com.example.service.DemoService;
public class TestDemoService {

	@Test
	public void test() {
		DemoService ds = new DemoService();
		Assert.assertEquals("hello", ds.sayHello());
		
	}

}
