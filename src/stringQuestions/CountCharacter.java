package stringQuestions;

//find number of character in each word in a String 
public class CountCharacter {

	public static void main(String[] args) {
		String str = "Welcome to java world";
		count(str);
	}

	static void count(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			String s = "";

			while (i < ch.length && ch[i] != ' ') {

				s = s + ch[i];
				i++;
			}
			if (s.length() > 0) {
				System.out.println(s + " -> " + s.length());
			}
		}

	}

}
