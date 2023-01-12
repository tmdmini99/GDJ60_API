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

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow= null;
		BufferedWriter bw= null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader iw =null;
		BufferedReader br = null;
		
		
		
		try {
			
			
			socket = new Socket("localhost",8282);
			
			
			//객체 생성시 서버 접속 시도
				while(true) {
				System.out.println("Server 접속 성공");
			
				System.out.println("서버로 보낼 메세지를 입력하세요");
			
				String msg = sc.next();
			
			
			//0,1
			os = socket.getOutputStream();
			//char
			ow = new OutputStreamWriter(os);
			//Stream
			bw = new BufferedWriter(ow);
			bw.write(msg+"\r\n");
			bw.flush();
			if(msg.toUpperCase().equals("Q")) {
				break;
			}
			
			
			
			is =socket.getInputStream();
			iw = new InputStreamReader(is);
			br = new BufferedReader(iw);
			msg =br.readLine();
			System.out.println("Server :"+msg);
			if(msg.toUpperCase().equals("Q")) {
				break;
			}
			
				}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				sc.close();
				br.close();
				iw.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

}
