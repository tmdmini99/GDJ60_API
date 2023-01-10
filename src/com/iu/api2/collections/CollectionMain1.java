package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		
		ArrayList<ArrayList<Integer>> ar3 = new ArrayList<>();
		
		ar3.add(ar1);
		ar3.add(ar2);
		System.out.println(ar3);
		ar3.get(0).get(0);
		 
		HashMap<ArrayList<Integer>, ArrayList<Integer>> hm =new HashMap<>();
		
		hm.put(ar1, ar2);
		
	
	
	}

}
