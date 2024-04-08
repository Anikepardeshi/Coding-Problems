package amdocs;

public class Anagram2 {

    public static boolean areAnagrams(String str1, String str2) {
       
        str1 = removeSpacesAndToLowercase(str1);
        str2 = removeSpacesAndToLowercase(str2);

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

   
    private static String removeSpacesAndToLowercase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (ch >= 'A' && ch <= 'Z') { 
                    ch = (char) (ch + 32);
                }
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";

        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}

