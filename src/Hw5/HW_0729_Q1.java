package Hw5;

import java.util.Scanner;

public class HW_0729_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW_0729_Q1 test = new HW_0729_Q1();
		
		System.out.println("請依序輸入寬與高：");
		int width = sc.nextInt();
		int height = sc.nextInt();
		test.starSquare(width, height);
	}
	
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
