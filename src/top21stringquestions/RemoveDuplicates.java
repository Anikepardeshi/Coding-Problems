package top21stringquestions;

//Write a program to remove all the duplicate characters from a given input String, like, 
//if the given String is "Java" then the output should be "Java". 
//The second or further occurrence of duplicates should be removed.


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeDuplicates(String str) {
		Set<Character> set = new LinkedHashSet<>();

		// Add each character of the string to a LinkedHashSet
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}

		// Build the string from the characters in the set
		StringBuilder result = new StringBuilder();
		for (char ch : set) {
			result.append(ch);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String input = "Java";
		String result = removeDuplicates(input);
		System.out.println("Input string: " + input);
		System.out.println("String after removing duplicates: " + result);
	}
}


//without using collection
/*
	public static String removeDuplicates(String str) {
		if (str == null || str.isEmpty()) {
			return str; // Return the input string if it's null or empty
		}

		char[] chars = str.toCharArray();
		boolean[] seen = new boolean[256]; // Assuming ASCII characters

		int newIndex = 0;
		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (!seen[ch]) {
				chars[newIndex++] = ch;
				seen[ch] = true;
			}
		}

		return new String(chars, 0, newIndex);
	}

	public static void main(String[] args) {
		String input = "Java";
		String result = removeDuplicates(input);
		System.out.println("Input string: " + input);
		System.out.println("String after removing duplicates: " + result);
	}
}
*/
