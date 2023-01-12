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
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		Scanner scc = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader iw =null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow= null;
		BufferedWriter bw= null;
		boolean check = true;
		
		
		try {
			ss= new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중입니다");
			sc = ss.accept();
			
			System.out.println("Client와 연결 성공");
			
			while(true) {

			is =sc.getInputStream();
			iw = new InputStreamReader(is);
			br = new BufferedReader(iw);
			String msg = br.readLine();
			System.out.println("Client :"+msg);
			
			System.out.println("클라이언트에게 보낼 메세지");
			String ms = scc.next();
			os = sc.getOutputStream();
			//char
			ow = new OutputStreamWriter(os);
			//Stream
			bw = new BufferedWriter(ow);
			bw.write(ms+"\r\n");
			bw.flush();
			
			if(msg.equals("끝") || ms.equals("끝")){
				break;
			}
				}
				
			
			
			 

		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				sc.close();
				bw.close();
				ow.close();
				os.close();
				br.close();
				iw.close();
				is.close();
				sc.close();
				ss.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

	}

}
