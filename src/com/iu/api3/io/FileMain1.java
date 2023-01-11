package com.iu.api3.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		//1.java.io.File 클래스
		//HDD 파이과 폴더의 정보를 담을려고하는클래스
		File file =new File("C:\\");//부모 폴더가 있어야지 폴더를 생성할수 있음
		//이 경우 file.mkdirs();를 사용
		System.out.println(file.isDirectory());//이게 폴더냐?
		System.out.println(file.isFile());//이게 파일이냐?
		System.out.println("C:\\fileTest");
		System.out.println(file.length());
		System.out.println(file.exists());//경로가 존재하냐?
		if(!file.exists()) {//파일이 존재하냐 
			file.mkdirs();
		}
		//file.delete();//파일 안에있는 모든 폴더가 지워야지 지우기 가능
		String [] s =file.list();
		for(String name:s) {
			System.out.println(name);
			File f =new File(file+name);//절대경로 root로 시작하는 경로
			System.out.println(f.isDirectory());
		}
		File[] files =file.listFiles();
		
		
	}

}
