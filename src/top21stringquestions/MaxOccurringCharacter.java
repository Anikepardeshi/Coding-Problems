package top21stringquestions;

//Write an efficient Java  program to return the maximum occurring character in the input string, 
//e.g., if the input string is "Java" then the function should return 'a'


public class MaxOccurringCharacter {
    public static char getMaxOccurringChar(String str) {
        // Assuming ASCII characters (total 256 characters)
        int[] frequency = new int[256];

        // Count frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
       
        char maxChar = ' ';
        int maxFrequency = 0;
        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String input = "Java";
        char maxChar = getMaxOccurringChar(input);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}

