package Streams;

public class Car {
	private String brand;
	private int price;
	private int model;
	private String color;
	private String regNo;
	public Car(String brand,int price,int model,String color,String regNo) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
		this.regNo=regNo;
	}
	public String toString() {
		return brand+" "+price+" "+model+" "+color+" "+regNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
}
