package swabahavTechLab;

import java.util.*;

public class FirstUniqueCharacterInString {
	
	public int firstUniqueChar(String s) {
		Map<Character,Integer> charCount = new HashMap<>();
		
		for(int i =0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
		}
		
		for(int i = 0; i< s.length(); i++) {
			if(charCount.get(s.charAt(i)) ==  1) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString ();
		
		System.out.println(solution.firstUniqueChar("leetcode"));
		System.out.println(solution.firstUniqueChar("loveleetcode"));
		System.out.println(solution.firstUniqueChar("aabb"));
		
	}
}
