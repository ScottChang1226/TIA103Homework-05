package Hw3;

import java.util.Scanner;

public class HW_0717_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW_0717_Q3 test = new HW_0717_Q3();
		int arr1 [] = new int [49];
		test.fillArray(arr1);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("阿文...請輸入你討厭哪個數字？");
			int data1 = sc.nextInt();
			if (data1 > arr1.length || data1 < 0) {
				System.out.println("數字輸入錯誤，請重新輸入：");
				--i;
				continue;
			} else {
                System.out.println("以下是你可以選擇的數字：");
				test.checkArray(data1, arr1);					
              }
			System.out.println("還有討厭的數字嗎？(Y/N)");
			String word1 = sc.next();
			if (word1.equals("Y")) {
				--i;
				continue;
			} else {
				System.out.println("恭喜，請從中自由選擇號碼吧！");
                break;
			}
		}

	}
	
	public int[] fillArray(int arr []) {
		for(int i = 0; i < 49; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
	
	public void checkArray(int data, int arr []) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == data || ((int)(arr[i] / 10) == data)) {
				arr[i] = 0;
				continue;
			}else if (arr[i] == 0) {
				continue;
			}else {
              System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	


//確認矩陣元素用
/*	public void printArray(int data []) {		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");		
		}
		
	}
*/
}
