package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		
		//현재시간
		Calendar ca = Calendar.getInstance();
		
		//3일 후
		Calendar ca2 = Calendar.getInstance();
		
		ca2.set(Calendar.DATE,30);
		//ca2.set(Calendar.DATE, ca.get(Calendar.DATE)+3);
		
		long d=1000*60*60*24*3;
		ca2.setTimeInMillis(ca2.getTimeInMillis()+d);
		//add는 월이 바뀜
		//ca2.add(Calendar.DATE, 3);
		
		//roll은 달은 안바뀌고 요일만 바뀜
		ca2.roll(Calendar.DATE, 3);
		
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
	}

}
