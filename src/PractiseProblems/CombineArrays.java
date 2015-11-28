package PractiseProblems;

public class CombineArrays {

    // Combine 2 sorted arrays in sorted order
    public static int[] combineArrays(int[] arrayA, int[] arrayB) {
        int[] combinedArray = new int[arrayA.length + arrayB.length];
        int combinedSize = arrayA.length + arrayB.length;
        int i = 0;
        int j = 0;

        for (int k = 0; k < combinedSize; k++) {
            if (i+1 > arrayA.length) {
                combinedArray[k] = arrayB[j];
                j++;
            }
            else if (j+1 > arrayB.length) {
                combinedArray[k] = arrayA[i];
            }
            else if (arrayA[i] <= arrayB[j]) {
                combinedArray[k] = arrayA[i];
                i++;
            } else {
                combinedArray[k] = arrayB[j];
                j++;
            }
        }
        return combinedArray;
    }


    public static void printValues(int[] array) {
        for (int e : array) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {6,7,8,9,10};
        int[] arrayC = {4,3,2};
        int[] arrayD = {1,0};
        int[] arrayE = {};
        int[] arrayF = {1,2,7,9};
        int[] arrayG = {3,4,5,6,8};

        int[] combined = combineArrays(arrayF, arrayG);

        printValues(combined);
    }
}
