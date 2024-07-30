package Hw5;

public class HW_0729_Q2 {
	private int [] arr = new int [10];
	public static void main(String[] args) {
		HW_0729_Q2 test = new HW_0729_Q2();
		test.randAvg();
		

	}
	
	public void randAvg() {
		int [] arr = this.arr;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
		}
		
		int sum = 0;
		System.out.println("本次亂數結果如下：");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
			sum += arr[j];
		}
		System.out.println("\n平均值為：" + (sum/10));
		
		}
		
	}
	


