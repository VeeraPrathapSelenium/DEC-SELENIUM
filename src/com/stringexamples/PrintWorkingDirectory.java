package com.stringexamples;

public class PrintWorkingDirectory {

	public static void main(String[] args) {
		String str="E:\\Mani Evng\\Testing";
		
		
		int pos=str.lastIndexOf("\\")+1;
		
		System.out.println(str.substring(pos));
		
		
		
		
	}

}
