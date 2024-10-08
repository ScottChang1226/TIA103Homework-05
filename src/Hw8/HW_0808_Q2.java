package Hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

public class HW_0808_Q2 {

	public static void main(String[] args) {
		Train train1 = new Train();
		List<Train> trainList = train1.getAllTrains();
//		System.out.println(trainList);
		
		HashSet<Train> trainHashTest = new HashSet<Train>(trainList);
		List<Train> trainFinish = new ArrayList<>(trainHashTest);
		
		System.out.println("列印出不重複的train物件");
		System.out.println("使用iterator：");
		
		Iterator<Train> trainIterator = trainFinish.iterator();
		while(trainIterator.hasNext()) {
			Train itemTrain = trainIterator.next();
			System.out.println(itemTrain);
		}
		
		System.out.println("====================");
		System.out.println("使用for迴圈：");
		
		for(int i = 0; i < trainFinish.size(); i++) {
			System.out.println(trainFinish.get(i));
		}
		
		System.out.println("====================");
		System.out.println("使用foreach迴圈：");
		
		for(Train j : trainFinish) {
			System.out.println(j);
		}
		

	}

}
