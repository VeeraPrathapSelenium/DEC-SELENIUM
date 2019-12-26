package com.testgenericmethods;

import com.genericmethods.GenericMethods;

public class Tc_01 {

	public static void main(String[] args) {
		
		GenericMethods genericMethods=new GenericMethods();
		
		genericMethods.launchBrowser("Chrome");
		
		genericMethods.waitTill_Element_Displayed();
		
		genericMethods.closeBrowser();

	}

}
