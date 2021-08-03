package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        // Autoboxing - convert the int primitive type to Integer class
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        // Unboxing - convert Integer class to primitive value int
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // same as Integer myIntValue = Integer.valueOf(56)
        int myInt = myIntValue; // same as myInt.intValue();

        // ## Long way ##
        // Convert double to Double
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        // convert Double to double
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        // ## Short way ##
        // Convert double to Double
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        // convert Double to double
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }

}

