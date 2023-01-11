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
		ArrayList<Integer>ar1 = new ArrayList<>();
		
			while(hs.size()<6) {
			hs.add(random.nextInt(45)+1);
		}
			
			
			for(int i=0; i<6; i++) {
				int num1 = random.nextInt(45)+1;
				ar.add(num1);
				for(int k=0; k<i;k++) {
					if(num1 == ar.get(k)) {
						ar.remove(k);
						i--;
						break;
					}
				}
			}
			
			int []nums = new int[6];
			for(int i=0;i<nums.length;i++) {
				nums[i] = random.nextInt(45)+1;
				for(int j=0;j<i;j++) {
					if(nums[i] == nums[j]) {
						i--;
						break;
					}
				}
			}
			while(ar1.size()<6) {
				int n= random.nextInt(45)+1;
				boolean check=true;
				for(int i=0;i<ar1.size();i++) {
					if(n ==ar1.get(i)) {
						check=false;
						break;
					}
				
				}
				if(check) {
					ar1.add(n);
				}
			}
			
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
				
			}
			
			System.out.println(ar1);
			System.out.println("번호는 "+ar);
			System.out.println("번호는"+hs);
			}
	
		
			
			
		
	}


