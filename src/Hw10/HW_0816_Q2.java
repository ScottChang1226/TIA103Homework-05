package Hw10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;
import java.util.regex.*;

public class HW_0816_Q2 {

	public static void main(String[] args) {
//		HW_0816_Q2 test = new HW_0816_Q2();
		Scanner sc = new Scanner(System.in);
		double [] numInCome = new double [1];
		
		for(int i = 0; i < 1; i++) {
			System.out.println("請輸入數字：");
			String inCome = sc.next();
			try {
				numInCome[0] = Double.parseDouble(inCome);				
			} catch (NumberFormatException ne) {
				System.out.println("輸入錯誤，請重新輸入。");
				i--;
			}
		}
		
		for(int j = 0; j < 1; j++) {
			System.out.println("欲將格式化成(1)千分位(2)百分比(3)科學記號：");
			String regex1 = "^[1]$";
			String regex2 = "^[2]$";
			String regex3 = "^[3]$";
			
			String choice = sc.next();
			if(choice.matches(regex1)){
				System.out.printf("千分位：" + "%,.0f%n", numInCome[0]);
			} else if(choice.matches(regex2)) {
				System.out.println("百分比：" + numInCome[0] * 100 + "%");
			} else if(choice.matches(regex3)) {
				System.out.printf("科學記號：" + "%6.2e\n", numInCome[0]);
			} else {
				System.out.println("輸入錯誤，請重新選擇格式。");
				j--;
			}

		}
		
//		System.out.println("欲將格式化成(1)千分位(2)百分比(3)科學記號：");
//		String regex1 = "^[1]$";
//		String regex2 = "^[2]$";
//		String regex3 = "^[3]$";
//		
//		String choice = sc.next();
//		if(choice.matches(regex1)){
//			System.out.printf("千分位：" + "%,2f%n", numInCome[0]);
//		} else if(choice.matches(regex2)) {
//			System.out.println("百分比：" + numInCome[0] * 100 + "%");
//		} else if(choice.matches(regex3)) {
//			System.out.printf("科學記號：" + "%6.2e\n", numInCome[0]);
//		}
//				

	}

}
