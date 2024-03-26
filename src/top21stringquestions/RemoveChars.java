package top21stringquestions;

//Write an efficient Java function that takes two strings as arguments and
//removes the characters from the first string, which are present in the second string. 
//For example, if the first String "India is great" and the second String is "in" then the output should be "da s great"

public class RemoveChars {

	public static String removeChars(String str1, String str2) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			boolean found = false;
			for (int j = 0; j < str2.length(); j++) {
				if (ch == str2.charAt(j)) {
					found = true;
					break;
				}
			}
			if (found == false) {
				result.append(ch);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String str1 = "India is great";
		String str2 = "in";
		String result = removeChars(str1, str2);
		System.out.println(result);
	}
}
