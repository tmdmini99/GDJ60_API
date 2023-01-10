package com.iu.api2.collections.ex1;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() { 
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji-3-23-53-23");
		String s = sb.toString();
	}
}
