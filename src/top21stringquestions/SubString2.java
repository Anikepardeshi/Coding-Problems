package top21stringquestions;

public class SubString2 {

    public static void findSubString(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len;
                for (int k = i; k < j; k++) {
                    System.out.print(ch[k]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String s = "606";
        findSubString(s);
    }
}
