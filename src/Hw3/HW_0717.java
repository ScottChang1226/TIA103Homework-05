package Hw3;

import java.util.Scanner;

public class HW_0717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數: ");
		HW_0717 test = new HW_0717();
		
		int arr1 [] = new int [3];
		
		for(int a = 0; a < 3; a++) {
			arr1[a] =sc.nextInt();
		}	
				
		test.tri(arr1);

	}

	public void tri(int data []) {
		if (data[0] <= 0 || data[1] <= 0 || data[2] <= 0) {
			System.out.println("不是三角形。");
		}else if ((data[0]+data[1])<=data[2] || (data[0]+data[2])<=data[1] || (data[2]+data[1])<=data[0]) {
			System.out.println("不是三角形。");
		}else if ((data[0] == data[1]) && (data[0] == data[2])) {
			System.out.println("正三角形。");
		}else if((data[0] == data[1]) || (data[0] == data[2])) {
            System.out.println("等腰三角形。");
		}else if (data[0]*data[0]==(data[1]*data[1]+data[2]*data[2]) || data[1]*data[1]==(data[0]*data[0]+data[2]*data[2]) || data[2]*data[2]==(data[1]*data[1]+data[0]*data[0])) {
			System.out.println("直角三角形。");
		}else {
			System.out.println("其他三角形。");
		}
	}

//確認array元素用	
/*	public void printArray(int data []) {		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");		
		}
		
	}
*/
	


}
