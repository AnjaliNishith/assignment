package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Item;
import com.sujata.bean.ItemList;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ItemList getAllProducts() {
		ItemList items=restTemplate.getForObject("api.openweathermap.org/data/2.5/weather?zip=94040,us&appid={API key}", ItemList.class);
		return items;
	}

	

}
