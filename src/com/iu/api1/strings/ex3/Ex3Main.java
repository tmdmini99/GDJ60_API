package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");
		WeatherData data = new WeatherData();
		WeatherView view=new WeatherView();
		WeatherDTO [] total = data.init();
		WeatherControl control= new WeatherControl();
		control.start();
		
		
		
		System.out.println("Finish");
		

	}

}
