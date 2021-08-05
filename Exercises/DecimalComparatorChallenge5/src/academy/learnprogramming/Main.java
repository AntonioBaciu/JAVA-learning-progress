package academy.learnprogramming;

import java.text.DecimalFormat;

public class Main {
    // built in function that formats a number based on a pattern
    private static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        boolean test = areEqualByThreeDecimalPlaces(1.12345d,1.1234567d);
        System.out.println(test);
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        // Simplified if else statement
        // Now it only returns true or false based on equality
        // Used .equals instead of ==
        return df.format(number1).equals(df.format(number2));
    }
}
