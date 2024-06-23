package swabahavTechLab;
public class SubstringExample {
	
	public static String findSubstring(String str, int startIndex, int endIndex) {
        if (str == null || startIndex < 0 || endIndex > str.length() || startIndex >= endIndex) {
            return null; // Invalid indices
        }

        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
	
    public static void main(String[] args) {
        String str = "Hello, world!";
        int startIndex = 7;
        int endIndex = 13;

        String substring = findSubstring(str, startIndex, endIndex);
        if (substring != null) {
            System.out.println("The substring is: " + substring);
        } else {
            System.out.println("Invalid indices provided.");
        }
    }

    
}
