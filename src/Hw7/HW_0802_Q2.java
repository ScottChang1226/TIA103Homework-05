package Hw7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class HW_0802_Q2 {

	public static void main(String[] args) throws IOException {
		try {
			File file = new File("C:\\TIA103_Workspace\\Homework-05\\src\\Hw7\\Data.txt");
			if(file.createNewFile()) {
				System.out.println("文件創建成功。");
			} else {
				System.out.println("該文件已經存在，已覆寫其內容。");
			}
			FileWriter fwr = new FileWriter(file);
			String ans = getNum();
			System.out.println(ans);
			fwr.write(ans);
			
			fwr.flush();
			fwr.close();
			
		} catch (IOException e) {
			System.out.println("出現IOException。");
			e.printStackTrace();
		}
		

	}
	
	public static String getNum() {
		int [] arr = new int [10];
		String ans;
		for (int i = 0; i < arr.length; i++) {
			int x = (int)((Math.random()*1000)+1);
			arr[i] = x;
		}
		ans = Arrays.toString(arr);
		return ans;
	}

}
