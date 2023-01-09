package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다
		//Generic : Type의 안정성 <>안에 들어가는걸 말함
		//E : 변수명
		//Object 레퍼런스 타입만 모을수 있음
		//E = Integer
		//같은 변수이기 때문에 생략 가능
		
		//dto = 데이터를 말함
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		
		
		int num = ar.get(0);
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO dto  = new WeatherDTO();
		dto.setCity("Seoul");
		ar2.add(dto);
		dto= new WeatherDTO();
		dto.setCity("Jeju");
		ar2.add(dto);
//		dto= new WeatherDTO();
//		dto.setCity("Jeju");
		ar2.remove(dto);
		for(int i=0; i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());//ar2.get(i)는 주소값을 가리키기 때문에 뒤에 getCity()를 붙여줘야 함
		}
		
		
	}

}
