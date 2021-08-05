package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(10, 0, true);

        System.out.println("Total printed pages: " + printer.getPrintedPages());
        printer.fillInkLevel(90);
        printer.printPages(100);
        System.out.println("Total printed pages: " + printer.getPrintedPages());
        System.out.println("Ink level " + printer.getInkLevel());
    }
}
