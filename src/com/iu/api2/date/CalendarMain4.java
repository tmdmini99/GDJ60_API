package com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2023년 1월 11일 =>format
		SimpleDateFormat sd=new SimpleDateFormat();
		sd.applyPattern("yyyy년 MM월 dd일 E요일");//new SimpleDateFormat()안에 넣어도 되고 이렇게 ApplyPatten안에 넣어도됨
		String p =sd.format(ca.getTime());
		
		System.out.println(p);
		
		
		
		

	}

}
