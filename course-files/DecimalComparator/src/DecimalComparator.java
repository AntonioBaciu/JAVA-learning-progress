public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = Math.round(num1 * 1000d) / 1000d;
        num2 = Math.round(num1 * 1000d) / 1000d;

        if(num1 == num2){
            return true;
        }
        return false;
    }
}
