package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int ohGodPleaseWork = numberList(1,10,2);
        System.out.println(ohGodPleaseWork);
    }

    // Create a new method that returns the first 5  numbers and  the sum of them
    public static int numberList(int start, int end, int length) {
        int count = 0;
        int sum = 0;

        if ((start <= 0) || (end < start) || (length <= 0) || (length >= end)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            count++;
            sum += i;

            if (count == length) {
                break;
            }
        }
        return sum;
    }


    // Create a method that returns the first 5 prime numbers

    // Create a method that calculates the sum of the prime, whole and odd numbers
}
