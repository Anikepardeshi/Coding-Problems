package stringQuestions;

import java.util.Scanner;

//public final class PalindromeDemo {
//
//	public static void main(String[] args) {
//		
//		String str = "paapp";
//		checkPalindrome(str);
//	}
//
//	public static void checkPalindrome(String str) {
//		String reverse ="";
//		for(int i =str.length()-1;i>=0;i--) {
//			reverse = reverse +str.charAt(i);
//		}
//		
//		if(str.equals(reverse)) {
//			System.out.println("String is palindrome");
//		}else {
//			System.out.println("String is not palindrome");
//		}
//		
//		return;
//		}
//}

//Paap => 0->p 1->a 2->a 3->p
public class PalindromeDemo {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();

        checkPalindrome(original);
    }

    private static void checkPalindrome(String original) {
        boolean isPalindrome = true;
        char[] ch = original.toCharArray();

        int min = 0;
        int max = original.length() - 1;

        while (min < max) {
            if (ch[min] != ch[max]) {
                isPalindrome = false;
                break;
            }
            min++;
            max--;
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}