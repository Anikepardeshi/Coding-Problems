package stringQuestions;

public class EvenLengthWord {

	public static void main(String[] args) {
		
		String str ="Hell World Hi You";
		
		for (String string : str.split(" ")) {
			if(string.length()%2 ==0) {
				System.out.println(string);
			}
		}
	}
}
