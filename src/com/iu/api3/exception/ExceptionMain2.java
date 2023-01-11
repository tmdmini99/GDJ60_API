package com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
		try {
		e1.ex2();
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}//왠만하면 throws를 쓰는게 좋다
		System.out.println("종료");
		
	}

}
