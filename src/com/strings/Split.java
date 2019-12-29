package com.strings;

public class Split {

	public static void main(String[] args) {
		String str="india,japan,pakistan";
		
		String[] arr=str.split("@");
		
		for (String string : arr) {
			System.out.println(string);
		}
		

	}

}
