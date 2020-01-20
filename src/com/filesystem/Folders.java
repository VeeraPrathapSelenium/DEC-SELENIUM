package com.filesystem;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Folders {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("DD-MMM-YYYY");
		Date d=new Date();
		
		String crntDate=sdf.format(d);	
		
		int Counter=0;
	
		File f=new File("C:\\Users\\tm\\Desktop\\FileSystem");
		
		File[] listfiles=f.listFiles();
		
		
		System.out.println("Total numbwer of files "+listfiles.length);
		
		for (File file : listfiles) {
			System.out.println(file);
			
			System.out.println(file.getName());
		}
		
	}

}
