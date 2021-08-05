package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

// get input and store it in array
// sort the array
// display the result

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); // sets the capacity of the array
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    // gets the input and stores in an array
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // print all the values on multiple rows
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        // duplicates the array (sortedArray[i] = array[i])

        // Using a manual way
        /////////////////////////////////////////////////
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        ////////////////////////////////////////////////

        // Using the Arrays.copyOf() built-in function
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // will loop until the if statement returns false
                if (sortedArray[i] < sortedArray[i + 1]) { // will swap places of the numbers
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
