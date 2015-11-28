package PractiseProblems;

/**A string is a permutation of another if it contains the same number of
 * letters just within a different ordering
 */
public class PermutationString {

    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < b.length(); i++) {
            if (!(b.contains(a.charAt(i)+""))) {
                return false;
            }
            b.replace(""+a.charAt(i), "");
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "olleh";
        String str3 = "abc";
        String str4 = "cb";

        //true
        System.out.println(isPermutation("", ""));

        //true
        System.out.println(isPermutation(str1, str2));

        //false
        System.out.println(isPermutation(str1, str3));

        //false
        System.out.println(isPermutation(str3, str4));
    }

}


