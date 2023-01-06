package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc =new Scanner(System.in);
	//도시 하나의 정보
	//search 메서드
	//weather 배열
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
	//찾은 DTO 리턴, 없으면 null;
	public WeatherDTO search(WeatherDTO[] dto) {
		System.out.println("검색할 도시명을 입력하세요");
		String name =sc.next().toLowerCase();
		for(int i=0; i<dto.length;i++) {
			if(name.equals(dto[i].getCity().toLowerCase())) {
				return dto[i];
			}
		}
		
		return null;
	}
	
	
	//add
	//배열을 받고 ,키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열을 리턴
	
	public WeatherDTO[] add(WeatherDTO[] dto) {
		WeatherDTO[] dto1 = new WeatherDTO[dto.length+1];
		WeatherDTO dto2=new WeatherDTO();
		for(int i=0; i<dto.length;i++) {
			dto1[i]=dto[i];
		}
		System.out.println("추가할 지역을 입력해주세요 ");
		dto2.setCity(sc.next());
		System.out.println("온도 입력");
		dto2.setGion(sc.next());
		System.out.println("날씨 입력");
		dto2.setStatus(sc.next());
		System.out.println("미세먼지 농도입력");
		dto2.setMise(sc.next());
		
		dto1[dto.length]=dto2;
		
		
		return dto1;
	}
	
	//remove
	//기존 배열에서 배열 받고 키보드로부터 삭제할 도시명을입력 받음
	//해당 도시를 배열에서 삭제하고 배열 리턴
	//
	
	public WeatherDTO[] remove(WeatherDTO[] dto) {
		WeatherDTO[] dto1 =new WeatherDTO[dto.length-1];
		System.out.println("삭제할 도시명을 입력하세요");
		String name = sc.next();
		
		int k=0;
		for(int i=0; i<dto1.length;i++) {
			if(name.toLowerCase().equals(dto[i].getCity().toLowerCase())) {
				continue;
			}
			k++;
		}
		
		
		
		
		
		return dto1;
	}
}
