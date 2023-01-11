package com.iu.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1Main {

	public static void main(String[] args) {
		//학생은 이름 번호 국어 영어 수학 총점 평군으로 이루어짐
		//1. 학생정보 초기화
		//2.학생 정보 전체 조회
		//3.학생정보검색조회(이름)
		//4.학생정보추가
		//5.학생정보삭제(이름)
		//6.학생정보 
		//6.프로그램 종료
		StudentControl st = new StudentControl();
		st.start();
		
		File file = new File("C:\\fileTest", "a.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("test\r\n");
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
