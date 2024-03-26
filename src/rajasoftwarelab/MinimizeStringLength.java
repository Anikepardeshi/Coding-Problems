//Minimize length of a string by removing suffixes and prefixes of same characters
//Input: S = “aacbcca”
//Output: 4
//i.e cbcc

package rajasoftwarelab;

public class MinimizeStringLength {
    public static int minimizeLength(String S) {
        int n = S.length(); // Get the length of the input string

        // Find the longest prefix of the same characters
        int prefixLength = 0; // Initialize the prefix length counter
        while (prefixLength < n && S.charAt(prefixLength) == S.charAt(0)) {
            // Increment prefixLength while the characters match the first character of the string
            prefixLength++;
        }

        // Find the longest suffix of the same characters
        int suffixLength = 0; // Initialize the suffix length counter
        while (suffixLength < n && S.charAt(n - 1 - suffixLength) == S.charAt(n - 1)) {
            // Increment suffixLength while the characters match the last character of the string
            suffixLength++;
        }

        // Calculate the remaining length after removing prefix and suffix
        int remainingLength = n - prefixLength - suffixLength; // Calculate the remaining length

        return remainingLength; // Return the remaining length
    }

    public static void main(String[] args) {
        String S = "aacbcca"; // Define the input string
        int minLength = minimizeLength(S); // Call the minimizeLength function
        System.out.println("Output: " + minLength); // Print the result
    }
}


