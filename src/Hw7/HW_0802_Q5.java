package Hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class HW_0802_Q5 {

	public static void main(String[] args) {
		String filePath = "C:/data/Object.ser";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj;
            try {
                while (true) {
                        obj = ois.readObject();
                        if (obj instanceof Cat) {
                            ((Cat) obj).speak();
                        } else if (obj instanceof Dog) {
                            ((Dog) obj).speak();
                        } else {
                            System.out.println("讀取錯誤，未界定之內容。");
                        }
                }
            } catch (IOException e1) {
                System.out.println(filePath + "檔案內容已讀取完成。");
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }

	}

}
