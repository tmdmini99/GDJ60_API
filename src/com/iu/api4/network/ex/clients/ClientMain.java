package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
try {
			
			socket = new Socket("192.168.1.114",8282);
			is = socket.getInputStream();
			ir=new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os= socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			boolean check = true;
			while(check) {
				System.out.println("1,2,3,4,5");
				String num = sc.next();
				bw.write(num+"\r\n");
				bw.flush();
				String name;
				ClientView cv= new ClientView();
				
				if(num.equals("1")) {
					name = br.readLine();
					System.out.println(name);
					cv.view(name);
					
				}
				else if(num.equals("2")) {
					name = br.readLine();
					System.out.println(name);
					num=sc.next();
					bw.write(num+"\r\n");
					bw.flush();
					name = br.readLine();
					cv.view(name);
					
				}else if(num.equals("3")) {
					name = br.readLine();
					System.out.println(name);
					num=sc.next();
					bw.write(num+"\r\n");
					bw.flush();
					name = br.readLine();
					System.out.println(name);
				}else if(num.equals("4")) {
					name = br.readLine();
					System.out.println(name);
					num=sc.next();
					bw.write(num+"\r\n");
					bw.flush();
					name = br.readLine();
					System.out.println(name);
				}else {
					break;
				}
				
				
			}
}catch (Exception e) {
	e.getStackTrace();
}

	}

}
