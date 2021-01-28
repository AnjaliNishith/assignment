package com.assignment.bean;

public class Item {
	//private int itemId;
	private Object  main;
	
	
	public Item(){
		
	}

	public Item(String main) {
		super();
		this.main = main;
		
		
	}

	public Object getMain() {
		return main;
	}

	public void setMain(Object main) {
		this.main = main;
	}
	
	/*
	 * { "coord": { "lon": -122.088, "lat": 37.3855 }, "weather": [ { "id": 501,
	 * "main": "Rain", "description": "moderate rain", "icon": "10n" }, { "id": 701,
	 * "main": "Mist", "description": "mist", "icon": "50n" } ], "base": "stations",
	 * "main": { "temp": 282.89, "feels_like": 279.7, "temp_min": 282.04,
	 * "temp_max": 283.71, "pressure": 1005, "humidity": 93 }, "visibility": 9656,
	 * "wind": { "speed": 4.12, "deg": 130, "gust": 7.72 }, "rain": { "1h": 1.15 },
	 * "clouds": { "all": 90 }, "dt": 1611825522, "sys": { "type": 1, "id": 5122,
	 * "country": "US", "sunrise": 1611846866, "sunset": 1611883687 }, "timezone":
	 * -28800, "id": 0, "name": "Mountain View", "cod": 200 }
	 */


	
	

}
