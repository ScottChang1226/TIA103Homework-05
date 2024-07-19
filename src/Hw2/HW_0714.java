package Hw2;

import java.util.Iterator;

public class HW_0714 {

	public static void main(String[] args) {
		
//Q1
		int num1 = 0;
		for(int a = 1; a <= 1000;a++) {
			if ((a % 2) == 0) {
				num1 += a;
			}
			else {
				continue;
			}
		}
		
//Q2
		int num2 = 1;
		for(int b = 1; b <= 10; b++) {
			num2 *= b;
		}
		
//Q3
		int num3 = 1,c = 1;
		while (c <=10) {
			num3 *= c;
			c++;
		}
		
//Q4 列於答題區		
//Q4 another solve(using array)
/*		double num4;
		int e = 0;
		int arr1 [] = new int [10];
		for(double d = 1; d <= 10; d++) {
			num4 = Math.pow(d, 2);
			arr1[e] = (int)num4;
			e++;
					
		}
*/

//Q5 列於答題區
//Q5 another solve(using array)		
/*		int g = 0;
		int arr2 [] = new int [49];
		for(double h = 1;h <= 49;h++) {
		   if (h % 10 == 4) {
			continue;
        } else if ((int)(h / 10) == 4) {
			continue; 
		} else {
            arr2[g] = (int)h;
            g++;
		}
		   
	}
*/
		
//Q6 列於答題區
//Q7
		//char k1 = 'A', k2 = 'B', k3 = 'C', k4 = 'D', k5 = 'E';
		//System.out.println(Integer.toHexString(k1));
		String arr3 [] = {"A","B","C","D","E"};
//Q7 another solve(using unicode)		
//		char uni = 65;
		

        System.out.println("JAVA_Homework1_0714");
        System.out.println("===================");
        System.out.println("Q1：");
		System.out.println("1~1000的偶數和為" + num1 + "。");
        System.out.println("===================");
        System.out.println("Q2：");
        System.out.println("1~10的連乘積為" + num2 + "(使用for迴圈)。");
        System.out.println("===================");
        System.out.println("Q3：");
        System.out.println("1~10的連乘積為" + num3 + "(使用while迴圈)。");
        System.out.println("===================");
        System.out.println("Q4：");
       	System.out.println("如題目之輸出結果如下：");
//Q4 另解
/*       	for (int f : arr1) {
       		System.out.print(f + " ");
       	}
*/
       	
       	for(double y = 1; y <= 10; y++) {
       		System.out.print((int)Math.pow(y, 2) + " ");
       	}
       	System.out.println("\n===================");
        System.out.println("Q5：");
        System.out.println("大樂透數字1~49中，阿文可以選擇的數字如下：");
//Q5 另解
/*        for(int i : arr2) {
        	if (i == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
        }
*/
        for(int x = 1; x <= 49; x++) {
        	if ((x % 10 == 4) || ((int)(x / 10) == 4)) {
        		continue;
        	} else {
				System.out.print(x + " ");
			}
        }
        
        System.out.println("\n===================");
        System.out.println("Q6：(詳細過程請見程式碼)");
        for(int num6_1 = 10; num6_1 >=1; --num6_1) {
        	for(int num6_2 = 1; num6_2 <= num6_1; ++num6_2) {
        		System.out.print(num6_2 + " ");
        	}
        	System.out.println();
        }
        System.out.println("===================");
        System.out.println("Q7：(詳細過程請見程式碼)");
        for(int num7_1 = 1; num7_1 <= 5; ++num7_1) {
        	for(int num7_2 = 1; num7_2 <= num7_1; ++num7_2) {
        		System.out.print(arr3[(num7_1-1)] + " ");
        	}
        	System.out.println();
        }
//Q7 另解
/*        for(int num7_3 = 1; num7_3 <=5; ++num7_3) {
        	for(int num7_4 = 1;num7_4 <= num7_3; ++num7_4) {
        		System.out.print(uni + " ");        		
        	}
        	uni++;
        	System.out.println();
        }
*/
        
        System.out.println("===================");
        
        
	}

}
