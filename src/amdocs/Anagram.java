package amdocs;

public class Anagram {

    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

public static boolean areAnagrams(String s1, String s2){
    
        if (s1.length() != s2.length()) {
            return false;
        }
 
        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            count2[s2.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
