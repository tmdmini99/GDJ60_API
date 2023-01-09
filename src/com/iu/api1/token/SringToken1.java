package com.iu.api1.token;

import java.util.StringTokenizer;

public class SringToken1 {

	public static void main(String[] args) {
		String nations="Korea,서울,USA,워싱턴,UK,런던,Japen,도쿄";
		String [] n=nations.split(",");
		
		for(int i=0;i<n.length-1;i++) {//독립적인 데이터를 다룰때는 split이 편하고 복합적인데이터를 다룰때는 token이 편함
			NationDTO dto = new NationDTO();//독립적인 데이터 : korea usa uk japan
			dto.setName(n[i]);
			dto.setCity(n[++i]);
		}
		
		StringTokenizer st =new StringTokenizer(nations,",");//복합적인 데이터 : korea 서울 , usa  워싱턴, uk 런던, japan 도쿄
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
