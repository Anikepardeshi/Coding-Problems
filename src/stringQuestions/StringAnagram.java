package stringQuestions;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "avaj";
		
		System.out.println("String is anagram : "+checkAnagram(s1,s2));
	}

	public static boolean checkAnagram(String s1, String s2) {
		
		char[]c1 = s1.toCharArray();
		char[]c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
}
