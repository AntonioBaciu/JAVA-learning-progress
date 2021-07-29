package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(10, 0, true);
        printer.fillInkLevel(10);
        printer.fillInkLevel(90);
        System.out.println(printer.getInkLevel());
    }
}
