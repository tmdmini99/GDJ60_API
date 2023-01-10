package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		int num =random.nextInt(45)+1;//nextInt안에 값을 넣으면 범위 지정0부터 8까지이지만 뒤에 +1을 붙여 1부터 9까지
		System.out.println(num);
		//1000원 로또 구매 1-45
		//번호 6개 랜덤하게 추출
		//중복은 제거
		
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer>ar = new ArrayList<>();
		
			while(true) {
			
			hs.add(random.nextInt(45)+1);
			if(hs.size()==6) {
				break;
			}
		}
			
			
			for(int i=1; i<7; i++) {
				int num1 = random.nextInt(45)+1;
				ar.add(num1);
				for(int k=0; k<i-1;k++) {
					
					if(num1 == ar.get(k)) {
						ar.remove(k);
						i--;
						break;
					}
				}
			}
			
			
			
			
			System.out.println("번호는 "+ar);
			System.out.println("번호는"+hs);
			}
	
		
			
			
		
	}


