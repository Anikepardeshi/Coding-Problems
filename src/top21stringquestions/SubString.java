package top21stringquestions;

public class SubString {

	public static void findSubString(String s) {
		int n = s.length();
		for (int len = 1; len <= n; len++) {
			for (int i = 0; i <= n - len; i++) {
				int j = i+len;
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		String s = "606";
		findSubString(s);

	}
}
