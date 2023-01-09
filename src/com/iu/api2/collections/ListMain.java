package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//순서유지, 값의 중복 허용, 배열 기반
		int [] arr = new int[3];
		ArrayList ar =new ArrayList();
		//다형성 개념 형태가 다양함
		
		
		arr[0]=1; //Auto-Boxing
		arr[1]=2;
		arr[2]=3;
		//add는 새로운 데이터를 추가하는 메소드
		
		ar.add(1);//Integer로 선언해도 들어가는건 Object로 들어감 
		//둘어갈때는 object 타입으로 들어감
				   
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------------");
		
		ar.add(1,8);//1번 index에 8을 대입 앞이 대입할 위치 뒤가 대입할 숫자
		ar.remove(0);//0번째 index를 지움
		ar.set(2, 9);//2번째 index에 9로 수정 
		
		//ar.clear(); //index의 개수가 0개가 됨 null이 들어가지 않음
		
		int n1 =(Integer)ar.get(0);//그래서 나올 때 타입이 Integer인지 Double인지 모르기 때문에 앞에 붙여서 타입을 정해줘야함
		double n2=(Double)ar.get(1);
		
		
		for(int i=0; i<ar.size();i++) {//length대신 size 사용
			System.out.println(ar.get(i));//get (index 필요)꺼내온다
		}
		
		
		

	}

}
