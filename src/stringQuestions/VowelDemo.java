package stringQuestions;

import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		System.out.println("Enter some String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase(); 
		char[] chars = str.toCharArray();

		int count = 0;

		for (char c : chars) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}

		}
		System.out.println("Number of vowels in String is : " + count);

	}

}
