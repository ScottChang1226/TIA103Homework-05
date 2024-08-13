package Hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class HW_0808_Q1 {

	public static void main(String[] args) {
		Collection<Object> collectionArray = new ArrayList<>();
		collectionArray.add(100);
		collectionArray.add(3.14);
		collectionArray.add(21L);
		collectionArray.add(100);
		collectionArray.add(5.1);
		collectionArray.add("Kitty");
		collectionArray.add(100);
		collectionArray.add(new Object());
		collectionArray.add("Snoopy");
		collectionArray.add(1000);
		
		Iterator<Object> iterator = collectionArray.iterator();
		
		//多種型別的List轉String
//		String listString = collectionArray.stream().map(Object::toString).collect(Collectors.joining(", "));
//		System.out.println(listString);		
		

		
		
		
		System.out.println("使用傳統for方法");
		Object [] array1 = collectionArray.toArray();
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("使用foreach方法");
		for(Object obj:collectionArray) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		System.out.println("移除不是java.lang.Number相關的物件");
		
		while(iterator.hasNext()) {
			Object obj2 = iterator.next();
			if(!(obj2 instanceof Number)) {
				iterator.remove();
			}
		}
		
		System.out.println("移除後之集合的所有元素");
		for(Object obj3:collectionArray) {
			System.out.print(obj3 + " ");
		}
		System.out.println();
	}

}
