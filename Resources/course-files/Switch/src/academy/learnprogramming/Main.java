package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Switch in Java

        //#1
        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually was " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3 or 5");
                break;
        }

        //#2
        String month = "JuNE";
        switch (month.toLowerCase()) { // converts the month value to lowercase
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
