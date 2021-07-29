package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // for loop example
        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // Challenge #1: for loop interest
        System.out.println("Challenge #1");
        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        // Challenge #2: loop from 8% to 2%
        System.out.println("Challenge #2");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        // Challenge #3 = ??
        System.out.println("Challenge #3");
        int count = 0; // when the counter gets to 3 stop looping trough the numbers
        for (int i = 10; i < 50; i++) { // prints the first 3 prime numbers between 10 - 50
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting loop");
                    break; // use break to stop looping when count gets to 3
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    // Challenge #3: given code(checks is a number is prime or not)
    // Given code:
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
