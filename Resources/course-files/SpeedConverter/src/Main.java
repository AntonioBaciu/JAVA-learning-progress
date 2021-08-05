public class Main {

    public static void main(String[] args) {
        // print the returned value
        long miles = SpeedConverter.toMilesPerHour(1);
        System.out.println("Miles = " + miles);

        // print the value
        SpeedConverter.printConversion(1);
    }
}
