package com.iu.api1.strings.ex3;

public class WeatherView {
	//2개 메서드 생성
	//1.모든 날씨 정보를 출력하는 메서드
	public void viewList(WeatherDTO [] total) {
		for(int i=0; i<total.length;i++) {
			this.viewOne(total[i]);
		}
	}


	//2. DTO 하나의 정보를 출력하는 메서드
	public void viewOne(WeatherDTO dto) {
		System.out.println("-----------");
		System.out.println("City :"+dto.getCity());
		System.out.println("Gion :"+dto.getGion());
		System.out.println("Status :"+dto.getStatus());
		System.out.println("Mise :"+dto.getMise());
		
		
		
	}

}
