package com.assignment.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.bean.Item;

import com.assignment.service.WeatherService;
//import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@RequestMapping("/")
	public ModelAndView getMainPage() {
		return new ModelAndView("index");
	}

	
	@RequestMapping(value = "/searchByZipCode", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody JSONObject postEmployeeData() throws ParseException {
 
		    String item = weatherService.getAllProducts("94040");
			JSONParser parse = new JSONParser();
			JSONObject data_obj = (JSONObject) parse.parse(item);


		    return data_obj;

	}
}
