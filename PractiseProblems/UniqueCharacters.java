package PractiseProblems;

public class UniqueCharacters {

    public static boolean allUniqueChars(String string) {
        if (string.isEmpty() || string.length() == 1) {
            return true;
        }
        char head = string.toCharArray()[0];
        String tail = string.substring(1);

        if (!(tail.indexOf(head) >= 0)) {
            return allUniqueChars(tail);
        }
        return false;
        }

    public static void main(String[] args) {

        String test_false = "hello";
        String test_true = "abcd";

        System.out.println(allUniqueChars(test_false));
        System.out.println(allUniqueChars(test_true));

    }
}
