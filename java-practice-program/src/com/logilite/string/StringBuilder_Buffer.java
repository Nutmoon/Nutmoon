package com.logilite.string;

import java.lang.*;

public class StringBuilder_Buffer {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		System.out.println("....String Buffer....\n");
		
		sb.append("Logilite ").append("Technology ");
		System.out.println("sb append() = " + sb.toString());
		sb.append("Company ");
		System.out.println("sb append()= " + sb.toString());
		sb.delete(20, 28);
		System.out.println("sb delete() = " + sb.toString());
		sb.insert(20, "Ahemdabad");
		System.out.println("sb = " + sb.toString());
		
		System.out.println("\n....String Builder....\n");
		
		
		StringBuilder sc = new StringBuilder();
		sc.append("Darshan ");
		sc.append("Devani");
		System.out.println("sc = " + sc.toString());
		int index = sc.indexOf("vani");
		System.out.println("index :-  " + index);
	}

}
