package Hw8;

import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class HW_0808_Q3 {

	public static void main(String[] args) {
		Train train1 = new Train();
		List<Train> trainList = train1.getAllTrains();
		
		trainList.sort(Comparator.comparing(Train::getNumber).reversed());
				
		System.out.println("以班次編號大到小印出");
		System.out.println("使用iterator：");
		
		Iterator<Train> trainIterator = trainList.iterator();
		while(trainIterator.hasNext()) {
			Train itemTrain = trainIterator.next();
			System.out.println(itemTrain);
		}
		
		System.out.println("====================");
		System.out.println("使用for迴圈：");
		
		for(int i = 0; i < trainList.size(); i++) {
			System.out.println(trainList.get(i));
		}
		
		System.out.println("====================");
		System.out.println("使用foreach迴圈：");
		
		for(Train j : trainList) {
			System.out.println(j);
		}
		

	}

}
