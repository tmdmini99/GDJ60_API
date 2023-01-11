package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		//현재 날짜와 시간으로 객체가 만들어짐
		ca =Calendar.getInstance();
		System.out.println(ca);
		
		
		//변경 가능
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		
		
		//year
		int year =ca.get(Calendar.YEAR);//static변수 사용법 클래스명.변수
		System.out.println("Year :"+year);
		//월은 0부터 시작
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month :"+(month+1));
		//일
		int date = ca.get(Calendar.DATE);
		System.out.println("Date:"+date);
		//일 월 화 수 목 금 토 
		int day = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day :"+day);
		//시 분 초
		int hour = ca.get(Calendar.HOUR);
		System.out.println("Hour :"+hour);
		int minute = ca.get(Calendar.MINUTE);
		System.out.println("Minute :"+minute);
		int second = ca.get(Calendar.SECOND);
		System.out.println("Second :"+second);
		
		
		
		
	}

}
