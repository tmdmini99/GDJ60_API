package com.iu.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "abc123@gmail.com";
		int idx =email.lastIndexOf('@');
		System.out.println(idx);
		
		System.out.println(email.length());
		for(int i=0; i<email.length();i++) {
			char c= email.charAt(i);
			System.out.println(c);
		}
		String str=" "; //빈칸이라는 객체가 만들어짐
		String str2=null; //객체가 만들어지지 않음
		System.out.println(str.length());//str2.lengh()넣으면 에러 발생
		System.out.println("Before Email :"+ email);
		String email2 = email.replace("@", "_");
		System.out.println("After Email :"+ email2);
	}

}
