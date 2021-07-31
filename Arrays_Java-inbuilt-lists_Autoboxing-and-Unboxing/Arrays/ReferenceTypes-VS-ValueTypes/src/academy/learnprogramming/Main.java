package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5]; // new -> creates a new object in memory
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // prints the content of the array
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // Both myIntArray and anotherArray will have the element at index 0 equal to 1
        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray)); // prints the content of the array
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8}; // create reference to a new array in memory
        // even if we use a method, the change will affect both variables, since there's still only one array in memory that has been modified
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}

