package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        String numberString = "150.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String laststring = "10";
        int myInt = 50;
        laststring = laststring + myInt;
        System.out.println("LastString is equal to " + laststring);
        double doubleNumber = 120.47d;
        laststring = laststring + doubleNumber;
        System.out.println("LastString is equal to " + laststring);
    }
}
