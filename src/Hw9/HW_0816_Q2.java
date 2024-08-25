package Hw9;

public class HW_0816_Q2 {

	public static void main(String[] args) {
		moneyInAccount moneyInAccount = new moneyInAccount();
		mom mom = new mom(moneyInAccount);
		son son = new son(moneyInAccount);
		mom.start();
		son.start();
	}

}

class moneyInAccount {
	private int account = 0;
	
	synchronized public void momIncome(int money) {
		while(account > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			System.out.println("熊大被老媽告知帳戶已經有錢！");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		account += money;
		System.out.println("媽媽存了" + money + "帳戶共有：" + account);
		notify();
	}
	
	synchronized public void sonOutcome(int money) {
		while(account < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		account -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + account);
		if(account < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
	
}

class mom extends Thread{
	moneyInAccount moneyInAccount;
	public mom(moneyInAccount moneyInAccount) {
		this.moneyInAccount = moneyInAccount;
	}
	public void run() {
		for(int i = 1; i < 10; i++) {
			moneyInAccount.momIncome(2000);
		}
	}
}

class son extends Thread{
	moneyInAccount moneyInAccount;
	public son(moneyInAccount moneyInAccount) {
		this.moneyInAccount = moneyInAccount;
	}
	public void run() {
		for(int i = 1; i < 10; i++) {
			moneyInAccount.sonOutcome(1000);
		}
	}
}
