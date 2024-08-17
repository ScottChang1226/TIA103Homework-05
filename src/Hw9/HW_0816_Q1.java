package Hw9;

import java.util.Scanner;

public class HW_0816_Q1 implements Runnable{
	int counter = 1;
	String name;
	
	public HW_0816_Q1() {
		
	}
	
	public void run() {
		
		while(counter <= 10) {
			System.out.println(Thread.currentThread().getName() + "吃第" + counter + "碗飯。");
			counter++;
			try {
				int time = (int)(Math.random()*3000 + 500);
				Thread.sleep(time);
			} catch (Exception e) {
			}
			while(counter == 11) {
				System.out.println(Thread.currentThread().getName() + "吃完了！");
				counter++;
			}
		}		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入參賽者1號的名字：");
		String name1 = sc.next();
		System.out.println("請輸入參賽者2號的名字：");
		String name2 = sc.next();
		
		HW_0816_Q1 player1 = new HW_0816_Q1();
		Thread p1 = new Thread(player1);
		p1.setName(name1);
		HW_0816_Q1 player2 = new HW_0816_Q1();
		Thread p2 = new Thread(player2);
		p2.setName(name2);
		
		System.out.println("========大胃王比賽開始！========");
		try {
			p1.start();
			p2.start();
			p1.join();
			p2.join();
			System.out.println("========大胃王比賽結束！========");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}


	}

}

//可使用.setName(String "xxxx")替thread設定名稱
//使用Thread.currentThread().getName()來獲取當前執行緒的名稱(String)
