package  com.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.bean.Item;



@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String getAllProducts(String zip) {
		String items =restTemplate.getForObject( "http://"+"api.openweathermap.org/data/2.5/weather?zip="+zip+",us&appid=d9a7b0dccfd4d085de31f0c7ce381bee", String.class);
		/*
		 * json.getAsJsonObject() .get("collection").getAsJsonObject()
		 * .get("items").getAsJsonArray() .forEach(item -> item.getAsJsonObject()
		 * .get("links").getAsJsonArray() .forEach(link -> { JsonObject linkObject =
		 * link.getAsJsonObject(); String relString =
		 * linkObject.get("rel").getAsString(); if ("preview".equals(relString)) {
		 * hrefs.add(linkObject.get("href").getAsString()); }));
		 */
		
		return items;
	}

	

}
