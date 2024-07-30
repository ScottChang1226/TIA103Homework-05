package Hw4;

import java.util.Scanner;

public class HW_0723_Q4_selftest {
	
	int [][] arr = new int [1][0];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW_0723_Q4_selftest test = new HW_0723_Q4_selftest();

		for(int i = 0; i < 1; i++) {
			System.out.println("請輸入員工編號：");
			int mem = sc.nextInt();
			System.out.println("請輸入該員工所持金額：");
			int mon = sc.nextInt();
			test.importNew(mem, mon);
			
			for(int j = 0; j < 1; j++) {
				System.out.println("還需要輸入資料嗎？(Y/N)");
				String ans = sc.next();
				if (ans == "Y" || ans == "y") {
					i--;
					continue;
				} else if(ans == "N" || ans == "n"){
					break;
				} else {
					j--;
					System.out.println("輸入內容錯誤，請重新輸入");
				}
			}
			
		}
		
//		for(int k = 0; k < arr.length; k++) {
//			for(int l = 0; l < arr[k].length; l++) {
//			System.out.print(arr[k][l] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.print("請輸入小華想借的金額：");
		int rentMoney = sc.nextInt();
		test.calRent(rentMoney);
		

//		System.out.print("請輸入小華想借的金額：");
//		int rentMoney = sc.nextInt();
//		int k = 0;
//		System.out.println("有錢可借的員工編號為：" );
//
//			for(int i = 0; i < arr[0].length; i++) {
//				if (arr[1][i] >= rentMoney) {
//					k++;
//					System.out.print(arr[0][i] + " ");
//				} 
//			}
//			
//		System.out.println("\n總共" + k + "人");
		

	}
	
	public void importNew(int newMember, int newMoney) {
		int [][] oldArr = this.arr;
		int [][] newArr = new int[oldArr.length][oldArr.length+1];
		for(int i = 0; i < oldArr.length; i++) {
			for(int j = 0; j < oldArr[i].length;j++) {
				newArr[i][j] = oldArr[i][j];
			}
		}
		newArr[0][oldArr.length+1] = newMember;
		newArr[1][oldArr.length+1] = newMoney;
		this.arr = newArr;
	}
	
	public void calRent(int rentMoney) {
		int k = 0;
		int [][] arr1 = this.arr;
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


