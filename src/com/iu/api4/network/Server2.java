package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		//Client접속 대기
		//1. 점심메뉴중에서 하나를 랜덤하게 골라서 전송
		//2. 저녁메뉴중에서 하나를 랜덤하게 골라서 전송
		//3. 종료
		ServerSocket sc = null;
		Socket s = null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter or = null;
		BufferedWriter bw = null;
		ArrayList<String> ar = new ArrayList<>();
		ar.add("삼각김밥");
		ar.add("그냥 김밥");
		ar.add("**꽝**");
		ar.add("주먹밥");
		ar.add("밥");
		
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("죽");
		ar1.add("승늉");
		ar1.add("**꽝**");
		ar1.add("누룽지");
		ar1.add("탄 밥");
		try {
			sc = new ServerSocket(8282);
			
			System.out.println("Client 연결 대기중");
			s = sc.accept();
			System.out.println("연결 성공");
			
			while(true) {
			is = s.getInputStream();
			ir=new InputStreamReader(is);
			br = new BufferedReader(ir);
			String msg =br.readLine();
			Random random = new Random();
			int num = random.nextInt(5);
			
			
			if(msg.equals("1")) {
				msg ="오늘의 점심메뉴 :"+ar.get(num);
				
			}else if(msg.equals("2")) {
				msg ="오늘의 저녁메뉴 :"+ar1.get(num);
			}else
				break;
			
			os= s.getOutputStream();
			or = new OutputStreamWriter(os);
			bw = new BufferedWriter(or);
			bw.write(msg+"\r\n");
			bw.flush();
			
			
			}
		} catch (IOException e) {
			
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
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
