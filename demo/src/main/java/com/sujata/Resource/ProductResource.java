package com.sujata.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.ItemList;
import com.sujata.service.WeatherService;

@RestController
public class ProductResource {

	@Autowired
	private WeatherService productService;
	
	@RequestMapping("/products")
	public ItemList getAllProducts(){
		return productService.getAllProducts();
	}
}
