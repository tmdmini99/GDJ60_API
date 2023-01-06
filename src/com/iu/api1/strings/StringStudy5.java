package com.iu.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		String str="apple# Apple, aPPle# appLE";//전처리 작업 데이터를 보기 쉽게 하는것
		str =str.replace(",", "#");
		//str =str.replace(" ", "");
		String[] result =str.split("#");//파싱(parsing) 하나의 문자열을 여러개로 나누는 작업
		
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i].trim().toLowerCase());//자르고 나서 사용 trim은 앞뒤 공백을 제거
		}

	}

}
