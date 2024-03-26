package stringQuestions;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		boolean isCompare = true;

		if (s1.length() != s2.length()) {
			System.out.println("Length of Strings is not equal");
			isCompare = false;
			System.out.println("therefore,Two Strings are equal : " + isCompare);
		}else {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				isCompare = false;
				break;
			}
			isCompare = true;
		}
		System.out.println("Two Strings are equal : " + isCompare);
		}
		

	}
}
