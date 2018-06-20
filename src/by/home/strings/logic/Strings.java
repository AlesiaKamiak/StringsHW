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

	/*
	 * В тексте после каждого k-го символа вставить заданную подстроку.
	 * StringBuilder
	 */

	public StringBuilder insertSubstringIntoStringStringBuilder(StringBuilder text, String subString, int k) {
		StringBuilder newText = null;
		int j = k;
		while (j <= text.length()) {
			StringBuilder str3 = text.insert(j, subString);
			newText = str3;
			j = j + k + subString.length();
		}
		System.out.println(newText);

		return text;

	}

	/*
	 * Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
	 * последовательностями подряд идущих букв оставить хотя бы один пробел
	 */

	public String DeleteSymbolsFromText(String text) {

		String[] a = text.split("[^a-zA-Z]+");
		String str = "";
		for (int i = 0; i < a.length; i++) {
			str = str + a[i] + " ";
		}
		return str;
	}

	/*
	 * После каждого слова текста, заканчивающегося заданной подстрокой, вставить
	 * указанное слово.
	 */
	public StringBuilder InsertWordAfterSubString(StringBuilder text, String substring, String word) {
		
		for (int i = 0; i <= text.length() - substring.length(); i++) {
			if (text.substring(i, i + substring.length()).equals(substring)) {
				if (i + substring.length() == text.length() || text.charAt(i + substring.length()) == ' ') {
					text = text.insert(i + substring.length()," "+ word);
				}
			}
		}
		return text;
		
	}
}
