package com.iu.api1.strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str ="StarWars";
		String result = str.substring(4); //끝번호를 넣지 않으면 끝까지 출력 끝번호를 넣으면 그 번호까지만 출력
		System.out.println(result);
		result = str.substring(4, 6);//4번부터 6번 미만까지 6번은 포함하지 않음
		System.out.println(result);

		str = "testdsafsad@naver.com";

		result=str.substring(5);
		System.out.println(result);


		//int index =str.indexOf("@");
		result=str.substring(str.indexOf("@")+1).toString();//=result.toString
		result.toString();
		System.out.println(str.substring(str.indexOf("@")+1));




	}

}
