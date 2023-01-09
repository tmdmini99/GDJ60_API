package com.iu.api1.Wrappers.ex1;

public class JuminCheck2 {
	//check
	//주민번호를 받아서
	//991224-1234657
	//맨끝 자리는 체크용 번호로 뺌
	//9  9  1 2 2 4  -  1 2 3 4 5 6
	//2  3  4 5 6 7     8 9 2 3 4 5
	//18 24 0 35 12 28	  8 18 6 12 20 30
	//합이 122 합을 11로 나누어서 나머지 구함
	//122/11 = 몫 11, 나머지 1
	//나머지 값을 11로 뺀 결과값 하고 체크용 번호랑 같은지 확인
	//11-1 10
	//11로 뺀 결과값이 두자리라면 
	//결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	public void check(String num) {
		int checkNum =Integer.parseInt(num.substring(13));
		num =num.replace(num.substring(13),"");
		
		num =num.replace(num.substring(6,7),"");
		
		String []num2 =num.split("");
		int k=2;
		int total=0;
		int []intnum = new int[num2.length];
		for(int i=0; i<num2.length; i++) {
			intnum[i] =Integer.parseInt(num2[i]);
			total=total+intnum[i]*k;
			k++;
			if(k >9) {
				k=2;
			}
		}
		
		
		for(int i=0; i<intnum.length;i++) {
			
			
		}
		System.out.println(total);
		total =total%11;
		total =11-total;
		if(total>9) {
			total =total%10;
		}
		
		
		
		if(total == checkNum) {
			System.out.println("체크용 번호가 같습니다");
			System.out.println("나머지 :"+total);
			System.out.println("체크용 번호"+checkNum);
			
		}else {
			System.out.println("체크용 번호가 다릅니다");
			System.out.println("나머지 :"+total);
			System.out.println("체크용 번호"+checkNum);
		}
		
		
		
	}
	

}
