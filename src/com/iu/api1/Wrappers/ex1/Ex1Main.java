package com.iu.api1.Wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("주민등록 번호 입력");//991212-1234657
		String num =sc.next();
		JuminCheck2 check = new JuminCheck2();
		check.check(num);
		
		

	}

}
