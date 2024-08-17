package Hw10;

public class HW_0816_Q1 {

	public static void main(String[] args) {
		HW_0816_Q1 cal = new HW_0816_Q1();
		int [] arr = new int [5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = cal.numCreate();
			cal.numAns(arr[i], cal.numCal(arr[i]));
		}
				

	}
	
	public int numCreate() {
		int num = (int)(Math.random()*100+1);		
		return num;
	}
	
	public int numCal(int num) {
		int ans = 0;
						
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				ans = 1 ;
				break;
			}
		}							
		return ans;
	}
	
	public void numAns(int num, int calAns) {
		if(calAns == 1) {
			System.out.println(num + "不是質數。");
		} else {
			System.out.println(num + "是質數。");
		};
	}
	

}
