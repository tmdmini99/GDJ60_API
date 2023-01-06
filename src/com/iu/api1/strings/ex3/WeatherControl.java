package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherControl {
	//start
	//1.날씨 정보 초기화
	// 초기화가 완료되었습니다
	//2.전국 날씨 정보
	//3.지역 날씨 검색
	//날씨정보 찍어주고 업으면 도시정보가 없습니다
	//4.지역 날씨 추가
	//기존에 있는 정보에다가 새로운 정보를 추가 input으로
	//5.지역 날씨 삭제
	//배열에서 삭제
	//6.종료
	
	private Scanner sc;
	private boolean check = true;
	private WeatherData data ;
	private WeatherDTO dto;
	private WeatherView view ;
	private WeatherInput input;
	private WeatherDTO [] dtolist;
	
	public WeatherControl() {
		this.sc=new Scanner(System.in);
		this.data=new WeatherData();
		this.dto =new WeatherDTO();
		this.view= new WeatherView();
		this.input = new WeatherInput();
		this.dtolist=data.init();
		
	}
	
	public void start() {
		
		while(check) {
			
			System.out.println("1번 날씨정보 초기화");
			System.out.println("2번 전국 날씨 정보");
			System.out.println("3번 지역 날씨 검색");
			System.out.println("4번 지역 날씨 추가");
			System.out.println("5번 지역 날씨 삭제");
			System.out.println("6번 종료");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("날씨가 초기화 되었습니다");
			}else if(num ==2) {
				view.viewList(dtolist);
				
			}else if(num==3) {
				dto=input.search(dtolist);
				if(dto==null) {
					System.out.println("찾으시는 지역이 없습니다");
				}else {
					view.viewOne(dto);
				}
					
				
			}else if(num==4) {
				dtolist =input.add(dtolist);
				
				
				
			}else if(num==5) {
				
				dtolist=input.remove(dtolist);
				
			}else
				break;
			
		}
	}
	
	
	
	
	
	
}
