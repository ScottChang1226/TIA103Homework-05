package Hw5;

import java.util.*;

public class HW_0729_Q5_seltest {

	String [] arr = new String[62];
	
	public static void main(String[] args) {
		HW_0729_Q5_seltest test = new HW_0729_Q5_seltest();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			System.out.println("已生成隨機驗證碼：");
			String authNum = test.genAuthCode();
			System.out.println(authNum);
			System.out.print("請輸入驗證：");
			String authInput = sc.next();
			if (authInput.equals(authNum)) {
				System.out.println("驗證成功！");
				break;
			} else {
				System.out.println("驗證失敗。");
				i--;
			}
		}
		
		
		

	}
	public HW_0729_Q5_seltest() {
		String [] arr = this.arr;
		char x = 'A';
		char y = 'a';
		char z = '0';
		
		for(int i = 0; i < 26; i++) {
			arr[i] = String.valueOf(x);
			x++;
		}
		for(int j = 0; j < 26; j++) {
			arr[26+j] = String.valueOf(y);
			y++;
		}
		for(int k = 0; k < 10; k++) {
			arr[52+k] = String.valueOf(z);
			z++;
		}
		this.arr = arr;
	}
	
	public String genAuthCode() {
			
		String [] arrOutput = new String[8];
		
		for(int l = 0; l < 8; l++) {
			arrOutput[l] = arr[(int)(Math.random()*62)];
		}
		
		String authOutput = String.join("",arrOutput);
		return authOutput;
		
	}

}
