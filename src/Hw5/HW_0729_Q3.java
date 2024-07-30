package Hw5;

public class HW_0729_Q3 {

	public static void main(String[] args) {
		int [][] intArry = {
				{1,6,3},
				{9,5,2}
		};
		
		double [][] doubleArry = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		HW_0729_Q3 w = new HW_0729_Q3();
		System.out.println(w.maxElement(intArry));
		System.out.println(w.maxElement(doubleArry));
		
		

	}
	public int maxElement(int arr [][]) {
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > x) {
					x = arr[i][j];
				}
			}
		}
		return x;
	}
	
	public double maxElement(double arr [][]) {
		double x = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > x) {
					x = arr[i][j];
				}
			}
		}
		return x;
	}

}
