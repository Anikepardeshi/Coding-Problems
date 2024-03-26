
//Input:   str = “a,b$c”
//Output:  str = “c,b$a”
//Explanation: Note that $ and , are not moved anywhere.  Only subsequence “abc” is reversed
//
//Input:   str = “Ab,c,de!$;”
//Output:  str = “ed,c,bA!$”

package top21stringquestions;

public class ReverseStringSC {

	private static String reverseAlphabetic(String str) {
		char[] ch = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (!Character.isAlphabetic(ch[left])) {
				left++;
			} else if (!Character.isAlphabetic(ch[right])) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "Ab,c,de!$";
		String result = reverseAlphabetic(str);
		System.out.println("Original String : " + str);
		System.out.println("Result String : " + result);
	}

}
