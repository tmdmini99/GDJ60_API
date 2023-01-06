package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명 입력");
		String fileName = sc.next();
		int check = 0;
		for(int i=0; i<names.length;i++) {
			int idx = fileName.indexOf(".");
			
			if(fileName.substring(idx+1).equals(names[i])) {
				check = 1;
				break;
			}
			
		}
		if(check == 1) {
			System.out.println("등록 완료");
		}else
			System.out.println("등록 실패");
		
		

	}

}
