package com.iu.api3.io;

import java.io.*;

public class FileMain3 {

	public static void main(String[] args) {
		File file = new File("C:\\fileTest","test.txt");
		
		
		try {
			FileReader fr = new FileReader(file);
			//보조스트림이 필요
			BufferedReader br = new BufferedReader(fr);
			//파일을 읽어주는 클래스
			while(true) {
				String name = br.readLine();
				if(name == null) {
					break;
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
