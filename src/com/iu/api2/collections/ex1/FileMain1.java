package com.iu.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain1 {

	public static void main(String[] args) {
		File file = new File("C:\\fileTest","test.txt");//","는 그 파일 밑이라는 뜻
		//fileTest밑에 test.txt를 선택
		System.out.println(file.exists());
		
		//파일의 내용을 작성
		String name="Suji";
		
		try {
			FileWriter fw = new FileWriter(file,true);//뒤에 있는 true는 append를 true로 하자는 것 뒤에를 false로 바꾸면 append를 false로 바꿈
			//아무것도 안넣으면 false
			fw.write(name+"\r\n");//다시 땡기기
			fw.flush();//강제버퍼를 비우기
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

