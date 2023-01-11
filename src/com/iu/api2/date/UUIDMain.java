package com.iu.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {

	public static void main(String[] args) {
		String name=UUID.randomUUID().toString();
		System.out.println(name);
		//random은 가짜 난수라 부름
		Calendar calendar =Calendar.getInstance();
		name =calendar.getTimeInMillis()+"abc";
		Random random =new Random(calendar.getTimeInMillis());
		
	}

}
