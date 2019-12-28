package com.stringexamples;

public class CountVowelsandConsonants {

	public static void main(String[] args) {

		int vowels = 0;
		int cons = 0;

		String s = "welcome to java training";

		for (int i = 0; i <= s.length() - 1; i++) {

			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vowels++;

			} else {
				cons++;
			}
		}

		System.out.println("The total vowels are : "+vowels);
		System.out.println("The total consonants are : "+cons);
		
	}

}
