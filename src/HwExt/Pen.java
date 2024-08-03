package HwExt;

import java.lang.*;

public class Pen {
	private String brand;
	private double price;
	
	public Pen() {}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Pen(String brand) {
		this(brand, 0);
	}
	
	public Pen(double price) {
		this("-", price);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void write(){
		System.out.println("品牌是：" + brand + "。");
	}
}
