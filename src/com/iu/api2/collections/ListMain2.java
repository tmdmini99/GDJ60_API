package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr= new int[3];
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("1");
		ar.add(new Scanner(System.in));
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
