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

    public void fillInkLevel(int number) {
//        if ((number < 0) || (number > 100)) {
//            System.out.println("Invalid amount of ink!!!");
//        } else{
//            if ((this.inkLevel <= 100) && (this.inkLevel >= 0)) {
//                inkLevel += number;
//            }
//        }
//
//
//???????????????????????????
    }

    public void printPages(int number) {
        if (number > 0) {
            printedPages += number;
            System.out.println("You printed " + number + " pages");
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
