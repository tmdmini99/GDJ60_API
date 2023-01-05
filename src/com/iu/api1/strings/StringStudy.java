package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str =new String("abc");
		String str2 ="abc"; //객체가 만들어짐
		
		
		boolean check =str.equals(str2);
		
		System.out.println(str2.equals(str));
		String s = "문abcdefghijklmnop";
		
		//a
		
		Scanner sc =new Scanner(System.in);
//		c = sc.next().charAt(0); 한글자만 받아오기
		int i =s.indexOf('a');//charAt의 반대 a가 문 다음에 있기 때뭉네 1로 나옴
		System.out.println(i);
		
	}

}
