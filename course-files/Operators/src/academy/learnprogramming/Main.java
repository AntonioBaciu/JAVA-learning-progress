package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // If Statement
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score");
        }

        // And Operator
        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Or Operator
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        ////// Operator Challenge //////
        double firstNumber = 20.00;
        double secondNumber = 80.00;

        double numberOperation = (firstNumber + secondNumber) * 100;
        double numberModule = numberOperation % 40.00;

        boolean isReminder = numberModule == 0 ? true : false;
        System.out.println("isReminder = " + isReminder);

        if(!isReminder){
            System.out.println("Got some remainder");
        }

        /// Solution ///
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder );

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}

























