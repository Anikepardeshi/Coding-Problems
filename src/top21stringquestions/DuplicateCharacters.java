package top21stringquestions;

//Write an efficient Java program to return the duplicate characters from given String, 
//for example, if given String is "C++" then your program should print "+" Similarly, 
//if the input is "Java and JavaScript" then your program should print "J", "a" and "v". 
//You can ignore the case for finding duplicates.


import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                duplicateChars.add(ch);
            }
        }

        // Print duplicate characters
        for (char ch : duplicateChars) {
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String input1 = "C++";
        System.out.println("Duplicate characters in \"" + input1 + "\":");
        findDuplicateCharacters(input1);

        String input2 = "Java and JavaScript";
        System.out.println("\nDuplicate characters in \"" + input2 + "\":");
        findDuplicateCharacters(input2);
    }
}


//without using collections 
/*
public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }

        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (seen[ch]) {
                    System.out.println(ch);
                } else {
                    seen[ch] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "C++";
        System.out.println("Duplicate characters in \"" + input1 + "\":");
        findDuplicateCharacters(input1);

        String input2 = "Java and JavaScript";
        System.out.println("\nDuplicate characters in \"" + input2 + "\":");
        findDuplicateCharacters(input2);
    }
}
*/

