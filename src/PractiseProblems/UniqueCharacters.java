package PractiseProblems;

import java.util.LinkedHashMap;
import java.util.Map;

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

    public static char getFirstUniqueCharacter(String string) {
        Map<Character, Integer> counts = new LinkedHashMap<>(string.length());

        for (char c : string.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1: 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("no unique characters in the string");
    }

    public static void main(String[] args) {

        String test_false = "hello";
        String test_true = "abcd";

        //System.out.println(allUniqueChars(test_false));
        //System.out.println(allUniqueChars(test_true));

        System.out.println(getFirstUniqueCharacter(test_false));
        System.out.println(getFirstUniqueCharacter(test_true));
        System.out.println(getFirstUniqueCharacter("eller"));

    }
}
