package stringQuestions;

import java.util.Arrays;

public class SortStringCharacter {

   public static void main(String[] args) {
	String str = "Aniket";
	str = str.toLowerCase();
	char ch[]= str.toCharArray();		
	Arrays.sort(ch);
	String s = new String (ch);
	
	System.out.println(s);
	
	
}
}
