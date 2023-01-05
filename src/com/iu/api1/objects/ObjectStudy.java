package com.iu.api1.objects;

public class ObjectStudy {//클래스 뒤에 extends 가 없으면 자동으로 extends Object를 상속받음

	public static void main(String[] args) {
		//객체 생성 공식
		Object object = new Object();
		
		//멤버  사용(접근)
		//참조변수명.변수명, 참조변수명.메서드명()
		//object는 참조변수
		int result = object.hashCode();
		System.out.println(result);
		String s =object.toString();
		System.out.println(s);
		System.out.println(object);// ==object.toString()
		
		Child child = new Child();
		child.toString();
		
		Object obj = new Object();
		System.out.println(obj  == object);
		boolean check = obj.equals(object);
		System.out.println(check);
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		Object o = child;//다형성
		
	}

}
