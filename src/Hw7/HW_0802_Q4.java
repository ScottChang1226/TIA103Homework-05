package Hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.Serializable;
import java.util.Scanner;


public class HW_0802_Q4 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = "C:\\data\\Object.ser";
		Path path = Paths.get(fileName);
		if (!Files.exists(path)) {
		      Files.createDirectory(path.getParent());
		      System.out.println("已創建新的資料夾" + fileName);
		    } else {
		      System.out.println("目標路徑已經存在。");
		    }		
		
		File file = new File(fileName);
					
		if(file.createNewFile()) {
			System.out.println("文件創建成功。");
		} else {
			System.out.println("該文件已經存在，已覆寫其內容。");
		}
	
		System.out.println("請輸入第一隻狗的名字：");
		String dogName1 = sc.next();
		Dog dog1 = new Dog(dogName1);
		System.out.println("請輸入第二隻狗的名字：");
		String dogName2 = sc.next();
		Dog dog2 = new Dog(dogName2);
		System.out.println("請輸入第一隻貓的名字：");
		String catName1 = sc.next();
		Cat cat1 = new Cat(catName1);
		System.out.println("請輸入第二隻貓的名字：");
		String catName2 = sc.next();
		Cat cat2 = new Cat(catName2);
		
		try {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		
		System.out.println("物件已經成功寫入。");
		
		fos.flush();
		fos.close();
		oos.flush();
		oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	

}
