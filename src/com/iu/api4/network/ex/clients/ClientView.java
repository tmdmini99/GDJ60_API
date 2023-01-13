package com.iu.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.StringTokenizer;



public class ClientView {
	public void view(String name) {
		
		StringTokenizer st = new StringTokenizer(name,"-");
		while(st.hasMoreTokens()) {
			System.out.println("Name :"+st.nextToken());
			System.out.println("Num :"+st.nextToken());
			System.out.println("Kor :"+st.nextToken());
			System.out.println("Math :"+st.nextToken());
			System.out.println("Eng :"+st.nextToken());
			System.out.println("Total :"+st.nextToken());
			System.out.println("Avg :"+st.nextToken());
		}
		
		
	}
	

}
