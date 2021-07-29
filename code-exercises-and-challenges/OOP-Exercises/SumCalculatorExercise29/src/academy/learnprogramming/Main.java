package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        // set numbers
        calculator.setFirstNumber(5.0d);
        calculator.setSecondNumber(4.0d);
        // addition & subtraction
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("substract = " + calculator.getSubtractionResult() );

        //set new numbers
        calculator.setFirstNumber(5.25d);
        calculator.setSecondNumber(0d);
        // multiplication & division
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
    }
}
