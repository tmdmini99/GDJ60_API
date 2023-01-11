package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		birth.set(1999, 7, 26);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		//현재시간을 millis로 바꾼 것 1000분의 1초로 바꾼것
		long n = now.getTimeInMillis();
		long s = birth.getTimeInMillis();
		
		n=n-s;
		n=n/(1000*60*60*24);
		n=n/365;
		System.out.println(n);
		
		
		System.out.println(now.getTime());
		
		System.out.println(sample.getTime());
		
		System.out.println(birth.getTime());
		
		
		
		
	}

}
