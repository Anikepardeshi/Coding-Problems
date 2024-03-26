//given string in that replace alternate element with xyz
//input---> 	i.like.java.programming
//output--->	i.xyz.java.xyz


package rajasoftwarelab;

public class AlternateReplace {

	public static void main(String[] args) {

		String input = "i.like.java.programming";
		System.out.println("Input: "+input);
		String output = replaceAlternate(input);
		
		 System.out.println("Output: " + output);
	}

	public static String replaceAlternate(String input) {
		//array of splitted words
		String[] splittedWords = input.split("\\.");
		
		for (int i = 0; i < splittedWords.length; i += 2) {
			
			splittedWords[i] ="xyz";
			
		}

			return String.join(".", splittedWords);	
	}
	
}
