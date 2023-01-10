package com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
			//   key값   value값
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2re");//같은 키가 있으면 수정이 됨
		
		//데이터 조회 키값을 가져오면 value가 나옴
		String v = map.get("k3");
		//삭제
		v = map.remove("k2");
		
		boolean check = map.containsKey("k1");//해당 키가 있는지 물어봄 있으면 true 없으면 false
		boolean check2= map.containsValue("v7");//해당 밸류가 있는지 물어봄 있으면 true 없으면 false
		System.out.println(check);
		
		//반복
		//1. Key들의 정보를 알아야 함
		//Key들을 Set으로 변환
		//Set을 Iterator로 변환
		Iterator<String> it = map.keySet().iterator();
		//key값이 String으로 선언하였기 때문에 Iterator도 String으로 선언
		
		while(it.hasNext()) {//it.hasNext() Iterator의 다음 값이 있는지 확인 있으면 true 없으면 false
			String key = it.next();//키값을 하나씩 뽑아옴
			System.out.println("Key :"+key);
			String value = map.get(key);//뽑아온 키값을 value에 대입
			System.out.println("Value :"+value);
			
		}
		
		
		
		//전체 삭제
		map.clear();
		
		//
		System.out.println(v);//삭제를 하면 안에 값이 사라져서 null이 아닌 값 자체가 안나옴
		System.out.println(map);

	}

}
