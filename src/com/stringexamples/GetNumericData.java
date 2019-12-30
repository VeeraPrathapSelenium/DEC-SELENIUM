package com.stringexamples;

public class GetNumericData {

	public static void main(String[] args) {

String str="My Transaction id (1089) is generated sucessfully";

int pos1=str.indexOf("(")+1;

int pos2=str.indexOf(")");


System.out.println(str.substring(pos1,pos2));



		
		
		
		

	}

}
