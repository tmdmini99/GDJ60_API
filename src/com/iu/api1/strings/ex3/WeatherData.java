package com.iu.api1.strings.ex3;

public class WeatherData {
	private String data;
	
	public WeatherData() {
		this.data ="SEOUL,12,맑음,60,Daegu,68,비,10,"
				  +"Jeju,-56,눈,12,junju,32,흐림,5";//+ 연결 연산자
	}
	//init 
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
	public WeatherDTO[] init() {
		String [] result = data.split(",");
		WeatherDTO [] dto = new WeatherDTO[result.length/4];
		int k=0;
	for(int i=0; i<result.length;i++) {
		WeatherDTO dto2 = new WeatherDTO();
		dto2.setCity(result[i]);
		dto2.setGion(Integer.parseInt(result[++i]));
		dto2.setStatus(result[++i]);
		dto2.setMise(Integer.parseInt(result[++i]));
		dto[k]=dto2;
		k++;
	}
		
		
		
		
		
//		WeatherDTO dto2 = new WeatherDTO();
//		for(int i =0; i<result.length;i++) {
//			
//			
//			if(i%4 == 0) {
//				dto2.setCity(result[i]);
//				dto[k]=dto2;
//				
//				
//			}else if(i%4 == 1) {
//				dto2.setGion(result[i]);
//				dto[k]=dto2;
//				
//			}else if(i%4 == 2) {
//				dto2.setStatus(result[i]);
//				dto[k]=dto2;
//			}else if(i%4 == 3) {
//				dto2.setMise(result[i]);
//				dto[k]=dto2;
//				k++;
//				
//			}
//			
//		}
			
			
		
		return dto;
	}
}
