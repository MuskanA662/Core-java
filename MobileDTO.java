package com.xworkz.encapsulationnapp.encapsulationclassfiles;

public class MobileDTO {
	private int imeiNumber;
	private String brand;
	private String shopName;
	
	public void setImeiNumber(int imeiNumber) {
		this.imeiNumber=imeiNumber;
	}
	public int getImeiNumber() {
		return imeiNumber;
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
