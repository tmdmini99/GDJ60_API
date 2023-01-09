package com.iu.api1.token;

import java.util.StringTokenizer;

public class SringToken1 {

	public static void main(String[] args) {
		String nations="Korea,서울,USA,워싱턴,UK,런던,Japen,도쿄";
		String [] n=nations.split(",");
		
		for(int i=0;i<n.length-1;i++) {
			NationDTO dto = new NationDTO();
			dto.setName(n[i]);
			dto.setCity(n[++i]);
		}
		
		StringTokenizer st =new StringTokenizer(nations,",");
		while(st.hasMoreTokens()) {//다음 토큰이 있을 경우 True 다음토큰이 없을 경우 false
			NationDTO dto = new NationDTO();
			String t1 =st.nextToken();
			dto.setName(t1);
			System.out.println(t1);
			String t2=st.nextToken();//두개씩 자름
			dto.setCity(t2);
			System.out.println(t2);//원하는만큼 자를수 있음
		}
	}

}
