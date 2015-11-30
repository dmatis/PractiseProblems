package PractiseProblems;

import java.util.LinkedList;
import java.util.ListIterator;

public class AddNumbers {

    // add up the resulting numbers from 2 linked lists
    // num1: 1 -> 2 -> 3, num2: 4 -> 5 -> 6, result: 123456
    public static int addLLNumbers(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        int addedNumbers = 0;
        int listLengths = num1.size() + num2.size();
        int i = 0;
        while (i < listLengths) {

            ListIterator<Integer> it = num1.listIterator();
            while (it.hasNext()) {
                addedNumbers += it.next().intValue()*Math.pow(10,listLengths-1-i);
                i++;
            }

            ListIterator<Integer> it2 = num2.listIterator();
            while (it2.hasNext()) {
                addedNumbers += it2.next().intValue()*Math.pow(10,listLengths-1-i);
                i++;
            }
        }
        return addedNumbers;
    }

    public static void main(String[] args) {
        LinkedList<Integer> smallList = new LinkedList<Integer>();
        LinkedList<Integer> emptyList = new LinkedList<Integer>();
        LinkedList<Integer> bigList = new LinkedList<Integer>();

        smallList.add(1);
        smallList.add(2);
        smallList.add(3);

        bigList.add(4);
        bigList.add(5);
        bigList.add(6);
        bigList.add(7);
        bigList.add(8);




        int result = addLLNumbers(smallList, emptyList);
        int bigResult = addLLNumbers(smallList, bigList);
        System.out.println(result);
        System.out.println(bigResult);
    }
}
