package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainT {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		ClientView cv = new ClientView();
		try {
			
			socket = new Socket("192.168.1.114",8282);
			is = socket.getInputStream();
			ir=new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os= socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
		
			while(true){//번호?data
				System.out.println("1,2,3,4,5");
				String num = sc.next();
				bw.write(num+":\r\n");
				bw.flush();
			
			String str =br.readLine();
			cv.view(str);
			System.out.println(str);
			if(num.equals("5")) {
				break;
			}
			}
			
		}catch (Exception e) {
			
		}
	}

}
