package Hw4;

import java.util.Scanner;

public class HW_0723_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr1 = {
				{25,32,8,19,27},
				{2500,800,500,1000,1200}
		};

		System.out.print("請輸入小華想借的金額：");
		int rentMoney = sc.nextInt();
		int k = 0;
		System.out.println("有錢可借的員工編號為：" );

			for(int i = 0; i < arr1[0].length; i++) {
				if (arr1[1][i] >= rentMoney) {
					k++;
					System.out.print(arr1[0][i] + " ");
				} 
			}
			
		System.out.println("\n總共" + k + "人");
		

	}

}
