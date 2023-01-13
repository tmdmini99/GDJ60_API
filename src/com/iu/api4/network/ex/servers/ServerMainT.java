package com.iu.api4.network.ex.servers;

import java.util.ArrayList;

public class ServerMainT {

	public static void main(String[] args) {
		//프로그램 시작,Test
		
		
		try {
			new StudentControlT().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
