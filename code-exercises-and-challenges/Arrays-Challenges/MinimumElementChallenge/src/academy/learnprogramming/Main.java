package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readIntegers(6);
        findMin(myArray);
    }

    // returns an array of the typed values
    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values:");
        int[] arrayOfValues = new int[count]; // array with "x" number of elements
        for (int i = 0; i < arrayOfValues.length; i++) {
            arrayOfValues[i] = scanner.nextInt();
        }
        System.out.println("readIntegers() = " + Arrays.toString(arrayOfValues));
        return arrayOfValues;
    }

    // returns the minimum number of the array
    private static void findMin(int[] array) {
        Arrays.sort(array);
        System.out.println("Minimum Value = " + array[0]);
    }
}
