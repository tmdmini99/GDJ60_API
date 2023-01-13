package com.iu.api4.network.ex.servers;

import java.util.ArrayList;

public class StudentView {
	public String view(ArrayList<StudentDTO> dto) {
		String name ="";
		for(int i=0; i<dto.size();i++) {
			name = name+this.view(dto.get(i));
		}
		
		return name;
	}
	
public String view(StudentDTO dto) {
		String name = "";
		name = name+dto.getName()+"-";
		name = name+dto.getNum()+"-";
		name = name+dto.getKor()+"-";
		name = name+dto.getMath()+"-";
		name = name+dto.getEng()+"-";
		name = name+dto.getTotal()+"-";
		name = name+dto.getAvg()+"-";
		return name;
}
}
