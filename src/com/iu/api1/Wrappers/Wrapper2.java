package com.iu.api1.Wrappers;

public class Wrapper2 {

	public static void main(String[] args) {
		int num=10;
		
		
		//Integer num2 = new Integer(num);
		//Auto-Boxing
		//Primitive -> Reference
		Integer num2 = num;
		
		//Auto-UnBoxing
		//num=num2.intValue();
		//Reference ->Primitive
		num =num2;
		
		
		
		
	}

}
