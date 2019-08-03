package com.zensar.entities;

import org.springframework.stereotype.Component;

/*
Author: Trigun Rai
Creation Date: 26th Jul 2019 10:00AM
Modification Date: 30th Jul 2019 15:13AM
Version:3.0
Copyright:Zensar Technnologies. All rights reserved
Description: Represents busines entity product.
It is value object of application,
value object of application,
domain or application object,
it is also POJO.
*/
@Component
public class Product {
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int productid, String name, String brand, float price) {
		super();
		this.productid = productid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}


private int productid;
private String name;
private String brand;
private float price;
}
