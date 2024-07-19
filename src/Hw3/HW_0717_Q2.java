package Hw3;

import java.util.Scanner;

public class HW_0717_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請猜測一個0~9的整數數字：");
		HW_0717_Q2 test = new HW_0717_Q2();
		
		int arr1 [] = new int [1];
		test.trueNumble(arr1);

				
		for(int i = 1; i < 2; i++) {
			int data1 = sc.nextInt();
			if (data1 == arr1[0]) {
				System.out.println("恭喜！你猜中了！正確數字是" + arr1[0]);
			    break;
			}else if (data1 > 9 || data1 < 0) {
				System.out.println("你輸入的數字超出範圍，請重新輸入：");
				i--;
			}else {
	            System.out.println("可惜，猜錯了，再選一個吧：");
	            i--;
			}
		}
		
		
		


	}
	
	public int [] trueNumble(int arry []) {
		arry[0] = (int)(Math.random() * 10);
		return arry;
	}
	


	
//確認陣列元素用	
/*	public void printArray(int data []) {		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");		
		}
		
	}
*/	
}
