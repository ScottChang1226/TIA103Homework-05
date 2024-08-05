package Hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_0802_Q1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Google Drive\\Tibame_Java\\Java\\作業\\Sample.txt");
		FileInputStream fs = new FileInputStream("D:\\Google Drive\\Tibame_Java\\Java\\作業\\Sample.txt");
		InputStreamReader isr = new InputStreamReader(fs);
		BufferedReader br = new BufferedReader(isr);
		
		String msg;
		int countChar = 0;
		int countLine = 0;
		
		while(br.read() != -1) {
			msg = br.readLine();
			countChar += msg.length();
			countLine++;
		}
		
		br.close();
		isr.close();
		
		p("Sample.txt檔案共有：\n" + file.length() + "個位元組；");
		p(countChar + "個字元；");
		p(countLine + "列資料。");

	}
	
	static void p(String data) {
		System.out.println(data);
	}

}
