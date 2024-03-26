package stringQuestions;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String s = "aniket";
		System.out.println(recursiveString(s));
	}
	
	public static String recursiveString(String s){
		
		if(s.length()<=1) {
			return s;
		}
		
		return recursiveString(s.substring(1))+s.charAt(0);
	}
}
