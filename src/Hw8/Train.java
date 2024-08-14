package Hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Train implements Comparable<Train> {
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Train() {

	}
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	
	public List<Train> getAllTrains(){
		List<Train> array1 = new ArrayList<Train>();
		
		Train data1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train data2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train data3 = new Train(118, "自強", "高雄", "台北", 500);
		Train data4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train data5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train data6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train data7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		array1.add(data1);
		array1.add(data2);
		array1.add(data3);
		array1.add(data4);
		array1.add(data5);
		array1.add(data6);
		array1.add(data7);
				
		return array1;
	}

	
}
