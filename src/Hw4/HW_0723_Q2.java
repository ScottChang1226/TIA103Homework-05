package Hw4;

import java.util.Scanner;

public class HW_0723_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入字串：");
		String insertText = sc.next();
		
		StringBuilder outputTextReverse = new StringBuilder(insertText);
		insertText = outputTextReverse.reverse().toString();
		
		System.out.println("字串反轉後為：\n" + outputTextReverse);

	}

}
