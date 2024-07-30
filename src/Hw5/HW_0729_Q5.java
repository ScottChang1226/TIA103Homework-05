package Hw5;

import java.util.*;

public class HW_0729_Q5 {

	public static void main(String[] args) {
		HW_0729_Q5 test = new HW_0729_Q5();
		System.out.println("生成隨機驗證碼");
		test.genAuthCode();

	}
	
	public void genAuthCode() {
		String [] arr = new String [62];
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
		
		String [] arrOutput = new String[8];
		
		for(int l = 0; l < 8; l++) {
			arrOutput[l] = arr[(int)(Math.random()*62)];
		}
		
		String authOutput = String.join("",arrOutput);
		System.out.println(authOutput);
		
	

	}

}
