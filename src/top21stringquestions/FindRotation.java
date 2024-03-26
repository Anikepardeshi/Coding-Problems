package top21stringquestions;

//Write an efficient program to test if two given String is a rotation of each other or not,
//e.g. if the given String is "XYZ" and "ZXY" then your function should return true,
//but if the input is "XYZ" and "YXZ" then return false

public class FindRotation {

    public static boolean areRotations(String str1, String str2) {
     
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "XYZ";
        String str2 = "ZXY";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other : " + areRotations(str1, str2));

        str2 = "yxz";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other : " + areRotations(str1, str2)); 
    }
}

