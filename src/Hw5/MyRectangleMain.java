package Hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle test1 = new MyRectangle();
		test1.setWidth(10);
		test1.setDepth(20);
		System.out.println("Q1：Width為10，且depth為20之長方形結果為：" + test1.getArea());
		
		MyRectangle test2 = new MyRectangle(10, 20);
		System.out.println("Q2：同上題，利用新建構子建立物件的長方形結果為：" + test2.getArea());
	}

}
