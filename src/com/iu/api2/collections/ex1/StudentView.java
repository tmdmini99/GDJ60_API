package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class StudentView {
	
	
	
	public void view(ArrayList<StudentDTO> dao) {
		
		for(int i=0; i<dao.size();i++) {
			this.view(dao.get(i));
		}
		
	}
	public void view(StudentDTO dao) {
		System.out.println("Name :"+dao.getName());
		System.out.println("Num :"+dao.getNum());
		System.out.println("Kor :"+dao.getKor());
		System.out.println("Math :"+dao.getMath());
		System.out.println("Eng :"+dao.getEng());
		System.out.println("Total :"+dao.getTotal());
		System.out.println("Avg :"+dao.getAvg());
		
	}
}
