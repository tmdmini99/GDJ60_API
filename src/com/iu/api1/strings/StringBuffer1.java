package com.iu.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer는 String이 아님
		StringBuffer sb = new StringBuffer("Hello");//hello
		
		//hello + world
		sb.append("world");
		System.out.println(sb);
		
		
		sb.reverse();//역순으로 나타냄
		//참조 변수를 출력하면 toString()메서드가 자동으로 호출 -> 클래스명@객체 주소
		//toString을 오버라이딩 했다..
		//변수에는 같은 데이터타입반 대입 가능
		String str=sb.substring(0);
		str = sb.toString(); //이미 오버라이딩을 했기 때문에 사용가능
		System.out.println(str);
		
		System.out.println(str.valueOf(3.14));
		
		str = String.valueOf(123);
		System.out.println(str);
		str = 123+"";
		
		
		
		
		
	}

}
