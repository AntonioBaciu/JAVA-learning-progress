package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] unsorted = getIntegers(10);
        int[] sorted = sortIntegers(unsorted);
        printArray(sorted);
    }

    // get values
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // print values
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    // sort array
    public static int[] sortIntegers(int[] array) {
        // create a copy of the unsorted array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        int temporary;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
