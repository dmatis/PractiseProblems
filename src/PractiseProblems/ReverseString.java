package PractiseProblems;

public class ReverseString {


    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int arraySize = charArray.length;
        for (int i = 0; i < str.length()/2; i++) {
            char c = charArray[i];
            charArray[i] = charArray[arraySize - 1 - i];
            charArray[arraySize - 1 - i] = c;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {

        String strA = "hello";
        System.out.println(reverseString(strA));
    }
}
