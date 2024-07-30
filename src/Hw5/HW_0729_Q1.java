package Hw5;

public class HW_0729_Q1 {

	public static void main(String[] args) {
		int sum = 0;
		int even;
		int [] arr1 = {29,100,39,41,50,8,66,77,95,15};
		for(int i = 0; i < arr1.length;i++) {
			sum += arr1[i];
		}
		even = sum/10;
		
		System.out.println("陣列{29,100,39,41,50,8,66,77,95,15}中大於平均值者為：");
		
		for(int j = 0; j < arr1.length;j++) {
			if (arr1[j] > even) {
				System.out.print(arr1[j] + " ");
			}else {
			continue;
			}
		}

	}

}
