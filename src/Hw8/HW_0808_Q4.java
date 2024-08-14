package Hw8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

public class HW_0808_Q4 {

	public static void main(String[] args) {
		Train train1 = new Train();
		List<Train> trainList = train1.getAllTrains();
		HashSet<Train> trainHashTest = new HashSet<Train>(trainList);
		List<Train> trainFinish = new ArrayList<>(trainHashTest);
		
		trainFinish.sort(Comparator.comparing(Train::getNumber).reversed());
		
		System.out.println("列印出不重複的train物件(依照班次由大到小排列)");
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
