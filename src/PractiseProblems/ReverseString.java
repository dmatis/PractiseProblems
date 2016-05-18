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

    public static String reverseSentence(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.length() + 1);
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1);  // removes trailing spaces
        return sb.toString();
    }

    public static void main(String[] args) {

        String strA = "hello";
        String strB = "hello world!";
        System.out.println(reverseString(strA));
        System.out.println(reverseSentence(strB));
    }
}
