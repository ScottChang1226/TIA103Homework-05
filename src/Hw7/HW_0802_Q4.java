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
		
	
		

		
		System.out.println("請輸入狗的名字：");
		String dogName = sc.next();
		Dog dog = new Dog(dogName);
		System.out.println("請輸入貓的名字：");
		String catName = sc.next();
		Cat cat = new Cat(catName);
		
		try {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(cat);
		oos.writeObject(dog);
		
		fos.close();
		oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animals) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException | ClassNotFoundException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		

	}
	
	

}
