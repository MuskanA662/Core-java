package com.xworkz.encapsulationnapp.encapsulationclassfiles;

public class HotelDTO {
	private String name;
	private int gstNo;
	private String foodType;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setGstNo(int gstNo) {
		this.gstNo=gstNo;
	}
	public int getGstNo() {
		return gstNo;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodType() {
		return foodType;
	}

}
