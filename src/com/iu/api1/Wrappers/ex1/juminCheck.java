package com.iu.api1.Wrappers.ex1;

public class juminCheck {
	
	
	//check1
	//주민등록번호를 받아서
	//남자인지 여자인지 출력
//	public void check1(String num) {
//		
//		int idx = num.indexOf("-");
//		
//		boolean check = false;
//		String  num2 = num.substring(idx+1);
//		
//		String [] num3 = num2.split("");
//		
//			if(num3[0].equals("1")||num3[0].equals("3")) {
//				check = true;
//			}
//		
//		
//		if(check) {
//			System.out.println("남자");
//		}else
//			System.out.println("여자");
//		
//		
//		
//		
//	}
	public void check1(String jumin) {
		//jumin.charAt(7); 한글자만 뽑아옴
		String check =jumin.substring(7,8);
		int c = Integer.parseInt(check);
		if(c%2==1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		
//		if(check.equals("1")||check.equals("3")) {
//			System.out.println("남자");
//		}else {
//			System.out.println("남자");
//		}
	}

	
	
	//check2
	//주민등록 번호를 받아서
	//나이를 계산
	//3-5 : 봄
	//6-8 : 여름
	//9-11: 가을
	//12-2: 겨울
	public void check2(String num) {
		//나이 계산
		String y =num.substring(0,2);
		//int year =Integer.parseInt(y);
		String check =num.substring(7,8);
		int year = 1900;
		
		if(check.equals("3")||check.equals("5")) {
			year =2000;
		}
		year = year+Integer.parseInt(y);
		int age = 2023-year;
		System.out.println("Age :"+age);
		
		
		
		String m =num.substring(2,4);
		int month =Integer.parseInt(m);
		
		if(month/3 == 0 || month/3 == 4) {
			System.out.println("겨울");
		}else if(month/3 == 1) {
			System.out.println("봄");
		}else if(month/3 == 2) {
			System.out.println("여름");
		}else
			System.out.println("가을");
		
//		if(month>=3  && month<=6) {
//			System.out.println("봄");
//		}else if(month>=6  && month<=8) {
//			System.out.println("여름");
//		}else if(month>=9  && month<=11) {
//			System.out.println("가을");
//		}else
//			System.out.println("겨울");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int idx = num.indexOf("-");
//		String  num2 = num.substring(0,idx);
//		String [] num3 = num2.split("");
//		String  num4 = num.substring(idx+1);
//		
//		String [] num5 = num4.split("");
//		if(num5[0].equals("1")||num5[0].equals("2")) {
//			String a = "19"+num3[0]+num3[1];
//			int bi = Integer.parseInt(a);
//			System.out.println("나이는"+(2023-bi));
//		}else {
//			String a = "20"+num3[0]+num3[1];
//			int bi = Integer.parseInt(a);
//			System.out.println("나이는"+(2023-bi));
//		}
//		
//		if(num3[3].equals("3")||num3[3].equals("4")||num3[3].equals("5")) {
//			System.out.println("봄");
//		}else if(num3[3].equals("6")||num3[3].equals("7")||num3[3].equals("8")) {
//			System.out.println("여름");
//		}else if(num3[3].equals("9")||num3[3].equals("0")||num3[3].equals("1")) {
//			
//		}else if(num3[3].equals("12")||num3[3].equals("1")||num3[3].equals("2")) {
//			
//		}
			
		
		
		
	}
	
	
	
	
}
