package Hw4;

import java.util.*;

public class HW_0723_Q6 {

	public static void main(String[] args) {
		HW_0723_Q6 cal = new HW_0723_Q6();
		int arrScore [][] = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
		};
		int arrSeats [] = cal.getBest(arrScore);
		ArrayList<Integer> seatList = new ArrayList<Integer>(arrSeats.length);

	    for (int i : arrSeats) {
	      seatList.add(i);
	    }
	    //檢查列表用
//	    System.out.println(seatList);
	    
	    for(int i = 0; i < arrScore[0].length; i++) {
	    	System.out.println((i+1) + "號同學考最高分的次數為" + Collections.frequency(seatList, i+1) + "次。");
	    }
		
		
		
//		for(int i = 0; i < arrScore.length; i++) {
//			for(int j = 0; j < arrScore[i].length; j++) {
//				int re = 0;
//				if (arrScore[i][j] > re) {
//					re = arrScore[i][j];
//					int seats = j+1;
//					arrSeats[i] = seats;
//				} else {
//					continue;
//				}
//			}
//		}

	}
	
	public int[] getBest(int[][] arr) {
		int arrSeats [] = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			int re = 0;
			for(int j = 0; j < arr[i].length; j++) {				
				if (arr[i][j] > re) {
					re = arr[i][j];
					int seats = j+1;
					arrSeats[i] = seats;
				} else {
					continue;
				}
			}
		}
		return arrSeats;
	}
	

}
