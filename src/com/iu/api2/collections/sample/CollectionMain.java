package com.iu.api2.collections.sample;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
//		HashMap<Child1, Child2> hs= new HashMap<>();
//		hs.put(child1, child2);
//		
//		System.out.println(hs);
		ArrayList<Parent> ar = new ArrayList<>();
		ar.add(child1);
		ar.add(child2);
		
		Child1 ch1 =(Child1)ar.get(0);
		
		System.out.println(ar.get(0) instanceof Child1);
		//ar의 0번째가 Child1타입인지 물어보는 연산자
		
		
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		ArrayList<? super Parent> ar3 = new ArrayList<>();
		//?가 Parent를 상속받는지 물어봄
		//Parent를 상속받는 타입을 집어 넣을수 있음 ?에는 Child1 하고 Child2 집어 넣을수 있음
		//ar2.add(child1);
		ar3.add(child2);
	
	}

}
