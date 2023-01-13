package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentControl {
	BufferedWriter bw =null;
	BufferedReader br =null;
	public StudentControl(BufferedReader br,BufferedWriter bw) {
		this.bw = bw;
		this.br= br;
	}
	
	
	public void start() {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentDAO dao= new StudentDAO(br,bw);
		StudentView sv = new StudentView();
		StudentDTO dto = new StudentDTO();
		Scanner scc = new Scanner(System.in);
		

		ar = dao.init();
		

		boolean check = true;
		
		
		try {
		
		while(check) {
			//System.out.println("1 2 3 4 5");
			//int num3 =scc.nextInt();
			String num = br.readLine();
			int num1 = Integer.parseInt(num);
			
			String num2 = null;
			
			
			
			if(num1 == 1) {
				num2 = sv.view(ar);
				}
				
			else if(num1 ==2) {
				
				
				dto =dao.search(ar);
				
				if(dto != null) {
					num2 =sv.view(dto);
					}
				else {
					num2 ="찾으시는 분이 없습니다";
					}
			}
			else if(num1 == 3) {
//				
				dao.add(ar);
				
				
				num2 ="추가가 완료되었습니다";
			
			
			}
			else if(num1 ==4) {
				
				dao.remove(ar);
				num2 ="삭제가 완료되었습니다";}
			else
				check = false;
				
			
			bw.write(num2+"\r\n");
			bw.flush();
			
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
