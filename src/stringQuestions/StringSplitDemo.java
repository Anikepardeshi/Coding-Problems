package stringQuestions;

public class StringSplitDemo {

	public static void main(String[] args) {
		String s = "+91-9834985338";
		String str[] = s.split("-");

		for (String string : str) {
			System.out.println("String after splitting : " + string);
			System.out.println(" ");
		}
	}

}
