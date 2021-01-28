package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.bean.Item;
import com.assignment.service.WeatherService;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private WeatherService weatherService;

	@Test
	void contextLoads() {
		
		String item=weatherService.getAllProducts("94040");
		System.out.println(item);
	}

}
