package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is =null;
		InputStreamReader ir =null;
		BufferedReader br =null;
		
		OutputStream os = null;
		OutputStreamWriter ow =null;
		BufferedWriter bw =null;
		
		
		
		
		
		try {
			ss=new ServerSocket(8282);
			socket= ss.accept();
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			StudentControl sc = new StudentControl(br, bw);
			sc.start();

				
				
			
					
} catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
}	

}
