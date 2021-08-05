package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Primitive Types Challenge
        System.out.println("##Challenge Output##");

        byte myByteNumber =  12;
        short myShortNumber = 900;
        int myIntNumber = 2010;
        long myLongNumber = 50_000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        System.out.println(myLongNumber);
    }
}
