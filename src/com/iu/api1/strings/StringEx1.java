package com.iu.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone="010-4659-7462";
		boolean check=true;
		int idx=0;
		while(check) {
			idx = phone.indexOf('-',idx);
			if(idx != -1) {
				System.out.println("IDX : "+idx);
				idx =phone.indexOf('-', idx)+1;
				
			}else
				check =false;
		}


	}
}
