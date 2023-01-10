package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(11);//hsSet은 순서가 없기 때문에 Index번호가 없음
		//hs = hs.toString;
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		//Set의 Data를 Iterator 형식으로 변경
		//변수선언
		Iterator<Integer>is = hs.iterator();
		
		while(is.hasNext()) {
			Integer num =is.next();
			System.out.println(num);
		}
	}

}
