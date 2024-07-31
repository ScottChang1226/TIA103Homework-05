package Hw6;

import java.util.*;

public class CalTest {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		int x, y;
		System.out.println("本程式可計算x的y次方");
		for(int i = 0; i < 1; i++) {
			try {
				System.out.println("請輸入x的值：");
				x = sc.nextInt();
				System.out.println("請輸入y的值：");
				y = sc.nextInt();
				int ans = cal.powerXY(x, y);
				System.out.println(x + "的" + y +"次方等於" + ans + "。");
			} catch (CalException e) {
				System.out.println(e.getMessage());
				i--;
			} catch (InputMismatchException e1) {
				System.out.println("輸入格式錯誤，請重新輸入。");
				i--;
			}
		}
			

	}

}
