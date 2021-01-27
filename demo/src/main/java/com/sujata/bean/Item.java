package com.sujata.bean;

public class Item {
	private int itemId;
	private String temperature;
	
	
	public Item(){
		
	}

	public Item(int itemId, String temperature, int quantity, int price) {
		super();
		this.itemId = itemId;
		this.temperature = temperature;
		
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String gettemperature() {
		return temperature;
	}

	public void settemperature(String temperature) {
		this.temperature = temperature;
	}

	
	

}
