package Hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class HW_0802_Q3_selfTest {


	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲複製的檔案：");
		String firstFile = sc.next();
		System.out.println("請輸入要覆蓋的檔案：");
		String secondFile = sc.next();
		
		File input = new File(firstFile);
		if(input.createNewFile()) {
			System.out.println("新檔案創建成功，將使用其進行複製。");
		} else {
			System.out.println("欲複製之檔案已經存在，將使用其進行複製。");
		}
		File output = new File(secondFile);
		if(output.createNewFile()) {
			System.out.println("全新欲覆蓋檔案創建成功。");
		} else {
			System.out.println("目標欲覆蓋檔案為既存檔案。");
		}
		
		HW_0802_Q3_selfTest test = new HW_0802_Q3_selfTest();
		
		test.copyFile(input, output);
		sc.close();
		
	}
	
	public void copyFile(File inputFile, File outputFile) throws IOException {
		try {
			InputStream ips = new FileInputStream(inputFile);
			BufferedInputStream bis = new BufferedInputStream(ips);
			OutputStream ops = new FileOutputStream(outputFile);
			BufferedOutputStream bos = new BufferedOutputStream(ops);
			byte [] byAr = new byte [1024];
			int readInside;
			while ((readInside = bis.read(byAr)) > 0) {
				bos.write(byAr, 0, readInside);
			}
			System.out.println("=============");
			System.out.println("複製檔案成功！");
			
			bis.close();
			bos.close();
			
		} catch (IOException e) {
			System.out.println("出現錯誤！");
			e.printStackTrace();
		} 
	}


}
