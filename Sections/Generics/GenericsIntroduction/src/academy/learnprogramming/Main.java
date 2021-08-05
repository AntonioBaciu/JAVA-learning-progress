package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // array list using autoboxing (converts added items from int to Integer)
        // In this case ArrayList is a raw type (ArrayList<Integer> shall be used instead)
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("jake"); // The code runs and breaks when it gets here since String can't be added to ArrayList of Integers
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    // returns values * 2
    private static void printDoubled(ArrayList<Integer> list) {
        for (int item : list) {
            System.out.println(item * 2);
        }
    }
}
