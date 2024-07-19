package Hw1;

public class HW_0712 {

	public static void main(String[] args) {
	int num1 = 12, num2 = 6,num3 = 200,num4 = 256559,num5 = 1500000;
	
	int num1_1 = num1 + num2, num1_2 = num1 * num2;
	
	int num2_1 = num3 / 12, num2_2 = num3 % 12;
	
	int num3_1 = num4 / (60 * 60 * 24), num3_2 = (num4 / (60 * 60)) % 24, num3_3 = (num4 / 60) % 60, num3_4 = num4 % 60;
		
	final double pi = 3.1415;
	double q4 = Math.pow(5,2);
	
	double num5_1 = num5 * Math.pow(1.02, 10);
	
	System.out.println("JAVA班Homework_20240712\n");
	System.out.println("============");
	System.out.println("Q1：");
	System.out.println("12與6之和為" + num1_1);
	System.out.println("12與6之積為" + num1_2);
	System.out.println("============");
	System.out.println("Q2：");
	System.out.println("200顆蛋為" + num2_1 + "打" + num2_2 + "顆");
	System.out.println("============");
	System.out.println("Q3：");
	System.out.println("256559秒等於"+num3_1+"天"+num3_2+"小時"+num3_3+"分"+num3_4+"秒");
	System.out.println("============");
	System.out.println("Q4：");
	System.out.printf("半徑為5的圓面積為" + "%.2f\n", (q4 * pi));
	System.out.printf("半徑為5的圓周長為" + "%.2f\n", (5 * 2 * pi) );
	System.out.println("============");
	System.out.println("Q5：");
	System.out.println("本金150萬元，年利率2%，10年後本金利息為" + (int)Math.round(num5_1) + "元");
	System.out.println("============");
	System.out.println("Q6：");
	System.out.println(5 + 5);
	//單純計算數字5+數字5的計算結果
	System.out.println(5 + '5');
	//列出數字5+Unicode 5的對應數字[53]的結果
	System.out.println(5 + "5");
	//列出數字5+字串5(非數字不可計算)
	System.out.println("(詳見註解)");
	System.out.println("============");


	}

}
