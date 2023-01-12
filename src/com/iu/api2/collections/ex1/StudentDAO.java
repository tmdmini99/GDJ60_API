package com.iu.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private long times;
	Scanner sc =new Scanner(System.in);
	public StudentDAO() { 
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji-3-23-53-23-");
		sb.append("choa,4,71,25,99");
		this.times = 0;

	}
	//학생정보 초기화
	public ArrayList<StudentDTO> init() {
		
		File file = null;
		if(times == 0) {
			file = new File("C:\\fileTest","backup.txt");
		}else
			file = new File("C:\\fileTest",times+".txt");
			
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		try {
			 fr = new FileReader(file);
			 br = new BufferedReader(fr);
			 String data = null;
			 while((data = br.readLine()) != null) {
				 //while문 안에 (data = br.readLine()) != null을 넣으면
				 //data = br.readLine()이렇게 한줄을 읽어 오고 이 값이 널인지 확인하고
				 //null이 아니면 읽어온  데이터 가지고 while문 실행
				 data =data.replace(",", "-");
				 StringTokenizer st = new StringTokenizer(data,"-");
				 StudentDTO dto = new StudentDTO();
				 dto.setName(st.nextToken());
				 dto.setNum(Integer.parseInt(st.nextToken()));
				 dto.setKor(Integer.parseInt(st.nextToken()));
				 dto.setMath(Integer.parseInt(st.nextToken()));
				 dto.setEng(Integer.parseInt(st.nextToken()));
				 dto.setTotal(dto.getKor()+dto.getMath()+dto.getEng());
				 dto.setAvg(dto.getTotal()/3.0);
				 ar.add(dto);
			}
			 
			 
			 
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();//close는 역순으로 끊어야함
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		

		
		return ar;

	}
	public StudentDTO search(ArrayList<StudentDTO> dto) {
		System.out.println("찾을 사람 이름을 입력하세요");
		String name = sc.next();
		StudentDTO dto2 = new StudentDTO();
		for(int i=0; i<dto.size(); i++) {
			if(name.equals(dto.get(i).getName())){
				dto2 = dto.get(i);
				break;

			}
		}
		return dto2;
	}

	public void  add(ArrayList<StudentDTO> ar) {
		StudentDTO dto =new StudentDTO();


		System.out.println("이름 입력");
		dto.setName(sc.next());
		System.out.println("번호 입력");
		dto.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		dto.setKor(sc.nextInt());
		System.out.println("수학점수 입력");
		dto.setMath(sc.nextInt());
		System.out.println("영어점수 입력");
		dto.setEng(sc.nextInt());
		dto.setTotal(dto.getKor()+dto.getMath()+dto.getEng());
		dto.setAvg(dto.getTotal()/3.0);

		ar.add(dto);


	}
	public void remove(ArrayList<StudentDTO> dto){
		System.out.println("지우려는 이름을 입력하세요");
		String name = sc.next();
		int result = 0; //0이면 삭제 시리패, 1이면 삭제 성공
		//for(int i=0; i<dto.size(); i++) {
		//			
		//			if(dto.get(i).getName().equals(name)) {
		//				dto.remove(i);
		//				result = 1;
		//			}
		//		}
		for(StudentDTO studentDTO:dto) {//dto에서 studentDTO를 돌린다 
			//즉 dto 배열에서 DTO클래스를 돌려서 하나씩 대입
			if(name.equals(studentDTO.getName())){
				dto.remove(studentDTO);
				result = 1;
			}
		}
		if(result ==1) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}


	}
	//학생정보 백업
	//현재시간을 파일명으로 해서 파일 작성
	public void backup(ArrayList<StudentDTO> dto) {
		
		Calendar ca =Calendar.getInstance();
		long time =ca.getTimeInMillis();
		times = time;
		File file = new File("C:\\fileTest",time+".txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(StudentDTO studentDTO : dto) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("\r\n");
				
				
				fw.write(sb.toString());
				fw.flush();
			}
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
//		String ss="";
//		ArrayList<String> s = new ArrayList<>();
//		for(int i=0;i<dto.size();i++) {
//			StringBuffer sbs = new StringBuffer();
//			sbs.append(dto.get(i).getName()+"-");
//			sbs.append(dto.get(i).getNum()+"-");
//			sbs.append(dto.get(i).getKor()+"-");
//			sbs.append(dto.get(i).getMath()+"-");
//			sbs.append(dto.get(i).getEng()+"-");
//			sbs.append(dto.get(i).getTotal()+"-");
//			sbs.append(dto.get(i).getAvg()+"-\n");
//			
//			ss = ss+sbs.toString();
//			
//			
//
//
//
//
//		}
		
		
	}
}