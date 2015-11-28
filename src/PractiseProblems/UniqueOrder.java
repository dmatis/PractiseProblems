package PractiseProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueOrder {

    // return only the unique numbers in the order given
    public static Set<Integer> returnUniqueNumbers(String nums) {
        Set<Integer> uniqueNums = new LinkedHashSet<Integer>();

        char[] charArray = nums.toCharArray();
        for (char c : charArray) {
            uniqueNums.add(Character.getNumericValue(c));
        }
        return uniqueNums;
    }

    public static void printNums(Set<Integer> uniqueNums) {
        for (Integer i : uniqueNums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String numbers = "12345";
        String dupNumbers = "121343";

        printNums(returnUniqueNumbers(numbers));
        System.out.println("---------------");
        printNums(returnUniqueNumbers(dupNumbers));

    }
}
