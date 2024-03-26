//given String 
//input--->	str=3[a]4[b]5[c]  
//output---> 	aaabbbbccccc;     
//
//input--->	3[a2[ac]] 
//output---> 	aacacaacacaacac


package rajasoftwarelab;

import java.util.*;

public class DecodeString {
    public static String decodeString(String str) {
        // Initialize two stacks to store counts and string fragments
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        // Initialize a StringBuilder to build the current string
        StringBuilder currentStr = new StringBuilder();
        // Initialize a variable to keep track of the count of repetitions
        int count = 0;

        // Iterate through each character in the input string
        for (char c : str.toCharArray()) {
            // If the character is a digit, accumulate it to form the count
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } 
            // If the character is an opening bracket, push count and currentStr onto their respective stacks
            else if (c == '[') {
                countStack.push(count);
                strStack.push(currentStr);
                // Reset currentStr and count for the new substring
                currentStr = new StringBuilder();
                count = 0;
            } 
            // If the character is a closing bracket, repeat currentStr and update it accordingly
            else if (c == ']') {
                // Pop the count and previous string fragment from their stacks
                int repeatCount = countStack.pop();
                StringBuilder temp = strStack.pop();
                // Repeat currentStr and append it to the previous string fragment
                for (int i = 0; i < repeatCount; i++) {
                    temp.append(currentStr);
                }
                // Update currentStr to the concatenated string
                currentStr = temp;
            } 
            // If the character is neither a digit nor a bracket, append it to currentStr
            else {
                currentStr.append(c);
            }
        }

        // Return the final decoded string
        return currentStr.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "3[a]4[b]5[c]";
        System.out.println("Output for \"" + str1 + "\": " + decodeString(str1));

        String str2 = "3[a2[ac]]";
        System.out.println("Output for \"" + str2 + "\": " + decodeString(str2));
    }
}
