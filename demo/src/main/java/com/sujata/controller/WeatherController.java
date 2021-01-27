package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Item;
import com.sujata.bean.ItemList;
import com.sujata.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("/")
	public ModelAndView getMainPage(){
		return new ModelAndView("index");
	}
	
	
	
	@RequestMapping("/getResult")
	public ModelAndView searchProduct(@RequestParam("name")String na){
		ItemList item=weatherService.getAllProducts();
		ModelAndView mv=new ModelAndView();
		mv.addObject("product", item);
		mv.setViewName("show");
		return mv;
	}
}
