package stringQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "AbaZabad";
		str = str.toLowerCase();
		char result = findCharacter(str);
		
		if(result !='\0'){
			System.out.println("First non-repeated character : "+result);
		}else {
			System.out.println("no non-repeating character present");
		}
	}

	private static char findCharacter(String str) {
		
		Map<Character, Integer> mp = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			mp.put(ch, mp.containsKey(ch)?mp.get(ch)+1 : 1);
		}
		
		for (char ch : str.toCharArray()) {
			if(mp.get(ch) == 1) {
				return ch;
			}
			
		}
		return '\0';
	}
}
