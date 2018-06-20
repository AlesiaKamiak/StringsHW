package by.home.strings.logic;

public class Strings {

	/*
	 * В тексте после каждого k-го символа вставить заданную подстроку. Класс String
	 */

	public String insertSubstringIntoString(String text, String subString, int k) {
		int i = 0;
		int j = k;
		int l = text.length() / k;// количество раз вставляется подстрока

		for (int r = 0; r < l; r++)

		{
			String str1 = text.substring(i, j).concat(subString);
			String str2 = str1 + text.substring(j, text.length());
			j = j + k + subString.length();
			text = str2;
		}
		return text;
	}

}
