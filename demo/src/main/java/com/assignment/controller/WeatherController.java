package com.assignment.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/searchByZipCode")
	public ModelAndView searchProduct(@RequestParam("zip") String zip) throws ParseException {

		String regex = "^[0-9]{5}(?:-[0-9]{4})?$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(zip);
		ModelAndView mv = new ModelAndView();
		if (matcher.matches()) {
			String item = weatherService.getAllProducts(zip);
			JSONParser parse = new JSONParser();
			JSONObject data_obj = (JSONObject) parse.parse(item);

			mv.addObject("weather", data_obj);
			mv.setViewName("show");

		}

		else

			mv.setViewName("error");

		return mv;

	}
}
