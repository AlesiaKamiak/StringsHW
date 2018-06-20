package by.home.strings.run;

import by.home.strings.logic.Strings;

public class Main {

	public static void main(String[] args) {
		
		Strings s = new Strings();
		s.insertSubstringIntoString("AAABBBCCCD", "da", 3);
		System.out.println(s.insertSubstringIntoString("AAABBBCCCD", "da", 3));

		StringBuilder a = new StringBuilder("aaaabbbbddddeeeeff");
		s.insertSubstringIntoStringStringBuilder(a, "DA", 4);
		s.insertSubstringIntoStringStringBuilder(a, "DA", 4);
		
		s.DeleteSymbolsFromText("abc! rmk+: fmd,r gjkre  mklw.Dkflw");
		System.out.println(s.DeleteSymbolsFromText("abc! rmk+: fmd,r gjkre  mklw.Dkflw"));
		
		StringBuilder b = new StringBuilder("de abcde abcdeabcde de gfde");
		System.out.println(s.InsertWordAfterSubString(b, "de", "DA"));
		System.out.println(s.InsertWordAfterSubString(b, "de", "DA"));
		System.out.println(s.InsertWordAfterSubString(b, "de", "DA"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
