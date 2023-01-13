package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StudentDTO dto;
	private ArrayList<StudentDTO> ar;
	private Scanner sc;

	private BufferedReader br =null;
	private StudentView sv = null;
	private BufferedWriter bw =null;
	
	ServerMain main = new ServerMain();
	
	
	
	
	
	public StudentDAO(BufferedReader br,BufferedWriter bw) {
		this.dto = new StudentDTO();
		this.sc = new Scanner(System.in);
		this.sv= new StudentView();
			
			this.br = br;
			this.bw = bw;
			
			
			
			this.ar = this.init();
			
			

			
		}
	
	
	public ArrayList<StudentDTO> init(){
		File file =new File("C:\\fileTest");
		
		String [] name = file.list();
		long max = 0;
		for(String names: name) {
			names=names.substring(0, names.lastIndexOf("."));
			long lo = Long.parseLong(names);
			if(lo > max) {
				max = lo;
			}
		}
			file =new File(file,max+".txt");
			FileReader fr =null;
			BufferedReader br1 = null;
			ArrayList<StudentDTO> ar = new ArrayList<>();
			try {
				fr = new FileReader(file);
				br1 = new BufferedReader(fr);
				String data = null;
				while((data =br1.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(data, "-");
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(studentDTO.getKor()+studentDTO.getMath()+studentDTO.getEng());
					studentDTO.setAvg(studentDTO.getTotal()/3.0);
					
					ar.add(studentDTO);
				
				
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		return ar;
	}
	
	
	public StudentDTO search(ArrayList<StudentDTO> dto) {
		StudentDTO dto1 = new StudentDTO();
		try {
			bw.write("찾으시는 이름을 입력하세요"+"\r\n");
			bw.flush();
			String name = br.readLine();
			System.out.println("ae size : "+ ar);
			//System.out.println("찾으시는 이름을 입력하세요");
				for(int i=0;i<dto.size();i++) {
					if(name.toLowerCase().equals(dto.get(i).getName().toLowerCase())) {
						dto1 = dto.get(i);
						return dto1;
					}
				}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	public void add(ArrayList<StudentDTO> dto) {
		StudentDTO dto1 = new StudentDTO();
		
		try {
			
			
			bw.write("추가할 이름 번호 점수를 입력하세요"+"\r\n");
			bw.flush();
			String name =br.readLine();
			
			StringTokenizer st = new StringTokenizer(name,"-");
			
			dto1.setName(st.nextToken());
			
			
			dto1.setNum(Integer.parseInt(st.nextToken()));
			//dto1.setNum(sc.nextInt());
			//System.out.println("국어");
			
			dto1.setKor(Integer.parseInt(st.nextToken()));
			//dto1.setKor(sc.nextInt());
			
		
			dto1.setMath(Integer.parseInt(st.nextToken()));
			//dto1.setMath(sc.nextInt());
			
			
			dto1.setEng(Integer.parseInt(st.nextToken()));
			//dto1.setEng(sc.nextInt());
			
			dto1.setTotal(dto1.getKor()+dto1.getMath()+dto1.getEng());
			dto1.setAvg(dto1.getTotal()/3.0);
			
			
			dto.add(dto1);
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void remove(ArrayList<StudentDTO> dto) {
		
		try {
			bw.write("지울사람"+"\r\n");
			bw.flush();
			String name= br.readLine();
			
		
			
			
			
			for(int i=0;i<dto.size();i++) {
				if(name.toLowerCase().equals(dto.get(i).getName().toLowerCase())) {
					dto.remove(i);
					
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
