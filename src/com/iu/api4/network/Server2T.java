package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2T {

	public static void main(String[] args) {
		//Client접속 대기
		//1. 점심메뉴중에서 하나를 랜덤하게 골라서 전송
		//2. 저녁메뉴중에서 하나를 랜덤하게 골라서 전송
		//3. 종료

		String [] lunch = {"라면","햄버거","짬짜면"};
		String [] dinner = {"삼","갈","순"};
		String menu = null;
		ServerSocket ss = null;
		Socket socket =null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		
		try {
			ss= new ServerSocket(8282);
			socket =ss.accept();//접속한 클라이언트의 정보를 new socket해서 리턴해줌
			is= socket.getInputStream();
			ir =new InputStreamReader(is);
			br=new BufferedReader(ir);
			
			os= socket.getOutputStream();//선언할 준비르 하는거기 때문에 미리 선언해도 상관 x
			ow=new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			Calendar ca = Calendar.getInstance();
			Random random = new Random(ca.getTimeInMillis());
			
			//네트워크로 받으면 전부 String
			while(check) {
				String data =br.readLine();
				int select = Integer.parseInt(data);
				
				
				switch (select) {
				case 1: 
					select = random.nextInt(100)%3;
					menu = lunch[select];
					break;
				case 2:
					select = random.nextInt(100)%3;
					menu = dinner[select];
					break;
				default:
					System.out.println("서버 프로그램을 종료합니다");
					check = false;
					break;
				}
				
				if(check) {
					bw.write(menu+"\r\n");
					bw.flush();
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		

		
	}

}
