package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentControl {
	private ArrayList<StudentDTO> ar;
	private StudentView sv;
	private StudentDTO dto;
	private StudentDAO dao;
	
	public StudentControl() {
		this.sv = new StudentView();
		this.dto = new StudentDTO();
		this.dao = new StudentDAO();
	}
	public void start() {
		Scanner sc =new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1번 학생정보초기화");
			System.out.println("2번 학생정보 전체 조회");
			System.out.println("3번 학생정보 검색조회");
			System.out.println("4번 학생정보 추가");
			System.out.println("5번 학생정보 삭제");
			System.out.println("6번 학생정보 백업");
			System.out.println("7번 종료");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				this.ar = dao.init();
				break;
			case 2:
				sv.view(ar);
				break;
			case 3:
				dto = dao.search(ar);
				if(dto !=null) {
					sv.view(dto);
				}else {
					System.out.println("찾는 사람이 없습니다");}
				break;
			case 4:
				dao.add(ar);
				break;
			case 5:
				dao.remove(ar);
				break;
			case 6:
				dao.backup(ar);
				break;
			
			default:
				check = false;
				break;
			}
		}
	}
}
