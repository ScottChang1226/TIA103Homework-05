package Hw3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW_0717_Q3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW_0717_Q3_2 test = new HW_0717_Q3_2();
		int arr1 [] = new int [49];
		test.fillArray(arr1);
	for(int j = 0; j < 2; j++) {
	 try {
		out:
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
//			System.out.println("還有討厭的數字嗎？(Y/N)");
//			String word1 = sc.next();
		         for(int k = 0; k < 2; k++)	{
			         System.out.println("還有討厭的數字嗎？(Y/N)");
			         String word1 = sc.next();
			
			        if (word1.equals("Y") || word1.equals("y")) {
				       --i;
				       continue;
			         }else if (word1.equals("N") || word1.equals("n")) {
				       System.out.println("好的，以下為電腦為您抽選的號碼：");
				       test.choiceNum(arr1);
                       break out;
			         }else {
				       System.out.println("輸入有誤，請重新回答。");
				       --k;
                       continue;
			         }
		          }
		    }
	        break;
	      }catch(InputMismatchException ex) {
		    System.out.println("輸入型別有誤(" + sc.next() + ")，請輸入整數。");
		    --j;
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
	
	public void choiceNum(int arr []) {
	  for(int j = 0; j < 6 ; j++) {
		int num = (int)(Math.random()*49 + 1);
		  for(int i = 0; i < arr.length;i++) {
				if (arr[i] == num) {
					System.out.print(arr[i] + " ");
					arr[i] = 0;
					break;
				} else if (i == (arr.length - 1)) {
					--j;
//				}else {
//					continue;
				}
				
			}
			
		}
	}
	
	


//確認矩陣元素用
/*	public void printArray(int data []) {		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");		
		}
		
	}
*/
}
