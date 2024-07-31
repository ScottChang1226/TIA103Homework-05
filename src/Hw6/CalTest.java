package Hw6;

import java.util.*;

public class CalTest {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		int x, y;
	try {
		System.out.println("本程式可計算x的y次方");
		System.out.println("請輸入x的值：");
		x = sc.nextInt();
		System.out.println("請輸入y的值：");
		y = sc.nextInt();
		int ans = cal.powerXY(x, y);
		System.out.println(x + "的" + y +"次方等於" + ans + "。");
	} catch (CalException e) {
		System.out.println(e.getMessage());
	} catch (InputMismatchException e1) {
		System.out.println("輸入類別錯誤！");
	}

		

	}

}
