package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

String inputdata="Turbinellus floccosus, the shaggy chanterelle, is a cantharelloid mushroom of the fungus family Gomphaceae My Transaction id :  1089 native to Asia and North America. It was known as Gomphus floccosus until 2011, when it was found to be only distantly related to the genus's type species, G. clavatus, and transferred to Turbinellus. The orange-capped vase- or trumpet-shaped";

//pan number
//String pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}";

//date of birth
//String pattern="[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}";

//email
//String pattern="[a-z]*\\.[a-z]*\\@[a-z]*\\.com";

//String pattern="My.*\\:\\s*[0-9]*";
String pattern="\\d";		
boolean result=getPatternData(inputdata, pattern);		
		
if(result) {System.out.println("Pattern Exist");}else
{
	System.out.println("No Pattern Exist");
}

	}
	
	
	
	public static boolean getPatternData(String inputdata,String pattern)
	{
		boolean status=false;
		// Step 1: 
		
		Pattern p=Pattern.compile(pattern);
		
		//step 2: verify
		
		Matcher match=p.matcher(inputdata);
		
		while(match.find())
		{
			status=true;
			System.out.println(match.group());
			
			
		}
		
		return status;
		
		
	}
	
	
	
	
	

}
