public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // bark between 8 and 22
        if (barking && hourOfDay < 8 && hourOfDay >= 0 || hourOfDay == 23) {
            return true;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return false;
    }
}