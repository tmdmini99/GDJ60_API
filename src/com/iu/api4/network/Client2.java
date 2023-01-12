package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1.점심 2.저녁 3.종료
		//3. 1,2,3, 고르기
		//1번 : 서버에서 점심메뉴중 하나를 보내줌, 출력
		//2번 : 서버에서 저녁메뉴중 하나를 보내줌, 출력
		//3번 : 종료
		
		Socket s = null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter or = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
			s = new Socket("192.168.1.31",8282);
			System.out.println("Server 연결성공");
			while(true) {
			os=s.getOutputStream();
			or = new OutputStreamWriter(os);
			bw = new BufferedWriter(or);
			System.out.println("1번 점심메뉴 추천");
			System.out.println("2번 저녁메뉴 추천");
			System.out.println("3번 종료");
			String msg = sc.next();
			bw.write(msg+"\r\n");
			bw.flush();
			
			if(msg.equals("3")) {
				break;
			}
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			msg = br.readLine();
			System.out.println(msg);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				or.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				s.close();
				sc.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
