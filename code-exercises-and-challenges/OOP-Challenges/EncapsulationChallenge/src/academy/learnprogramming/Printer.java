package academy.learnprogramming;

public class Printer {
    private int inkLevel = 0;
    private int printedPages = 0;
    private boolean isDuplex;

    public Printer(int inkLevel, int printedPages, boolean isDuplex) {
        if ((inkLevel >= 0) && (inkLevel <= 100)) {
            this.inkLevel = inkLevel;
        }
        if (printedPages >= 0) {
            this.printedPages = printedPages;
        }

        this.isDuplex = isDuplex;
    }

    public int fillInkLevel(int number) {
        // Number validation ( between 0 & 100 )
        if ((number < 0) || (number > 100)) {
            System.out.println("Invalid ink value!");
            return 0;
        }

        if (number + inkLevel <= 100) {
            System.out.println("The ink level has been increased by " + number);
            return inkLevel += number;
        } else {
            System.out.println("In order to avoid overfilling, reduce the amount of ink");
            return inkLevel;
        }
    }

    public void printPages(int number) {
        // Number & ink level validation
        if ((number > 0) && (inkLevel - number >= 0)) {
            printedPages += number;
            System.out.println("You printed " + number + " pages");
            inkLevel -= number;
        } else if(number < 0){
            System.out.println("Invalid number of pages");
        }else {
            System.out.println("Check toner level.");
        }
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
