package com.xworkz.encapsulationnapp.encapsulationclassfiles;

public class PenDTO {
	private int price;
	private String brand;
	private String shopName;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setShopName(String shopName) {
		this.shopName=shopName;
	}
	public String getShopName() {
		return shopName;
	
	}

}
