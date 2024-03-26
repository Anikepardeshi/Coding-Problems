package stringQuestions;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Welcome to java world";
		System.out.println("Original String : " + str);
		String s[] = str.split(" ");

		for (int i = s.length - 1; i >=0; i--) {

			System.out.println("After reversing words in a String : " + s[i]);
		}
	}
}
