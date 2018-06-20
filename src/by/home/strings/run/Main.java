package by.home.strings.run;

import by.home.strings.logic.Strings;

public class Main {

	public static void main(String[] args) {
		
		Strings s = new Strings();
		s.insertSubstringIntoString("AAABBBCCCD", "da", 3);
		System.out.println(s.insertSubstringIntoString("AAABBBCCCD", "da", 3));

	}

}
