package Hw4;

import java.util.Scanner;

public class HW_0723_Q5 {

	int [] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW_0723_Q5 cal = new HW_0723_Q5();
		
		for(int i = 0; i < 1; i++) {
			
			System.out.println("請依序輸入年、月、日：");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int date = sc.nextInt();
			
			if (date >= 32 ||date <= 0|| month >= 13 || month <= 0 ) {
				System.out.println("輸入日期格式錯誤，請重新輸入。");
				--i;
				continue;
			} else if(month == 4 ||month == 6 ||month == 9 ||month == 11) {
				if (date >= 31) {
					System.out.println("輸入日期格式錯誤，請重新輸入。");
					--i;
					continue;
				} 
			}else if(month == 2) {
				if(date >= 30) {
					System.out.println("輸入日期格式錯誤，請重新輸入。");
					--i;
					continue;
				}else if(date == 29 && year%4 != 0) {
					System.out.println("輸入日期格式錯誤，請重新輸入。");
					--i;
					continue;
				}
			}
			cal.getDate(year, month, date);
			for(int j = 0; j < 1; j++) {
				System.out.println("需要重新輸入新的日期嗎？(Y/N)");
				String ans = sc.next();
				if (ans.equals("Y") || ans.equals("y")) {
					i--;
					break;
				} else if(ans.equals("N") || ans.equals("n")){
					System.out.println("感謝使用！程式已結束。");
					break;
				} else {
					System.out.println("輸入錯誤");
					j--;
				}
			}
		}

	}
	
	public void getDate(int year, int month, int date) {
		int [] monthArr1 = this.monthArr;
		int sumMonth = 0;
		for(int i = 0; i < (month-1);i++) {
			if (year % 4 == 0 && month > 2) {
				monthArr1[1] = 29;
				sumMonth += monthArr1[i];
			} else {
				sumMonth += monthArr1[i];
			}
			
		}
		int sum = sumMonth + date;
		System.out.println("輸入的日期為" + year + "年的第" + sum + "天。");
	}

}
