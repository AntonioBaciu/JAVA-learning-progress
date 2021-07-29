package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("charValue = A");
                break;
            case 'B':
                System.out.println("charValue = B");
                break;
            case 'C':
                System.out.println("charValue = C");
                break;
            case 'D':
                System.out.println("charValue = D");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
