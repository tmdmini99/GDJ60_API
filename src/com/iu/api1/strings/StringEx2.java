package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명 입력");
		String fileName = sc.next();
		int idx =fileName.lastIndexOf(".");
		String result =fileName.substring(idx+1);
		boolean flag = true;
		
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상");
				flag =! flag;
				break;
			}
				
		}
		if(flag) {
			System.out.println("비정상");
		}
		
	
		
	}
}
