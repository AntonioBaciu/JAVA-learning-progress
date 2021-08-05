package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(2, 1));
        System.out.println(getDurationString(121));
    }

    public static String getDurationString(int minutes, int seconds) {
        // Created remainingSeconds so the conversion will still work
        // in case the seconds are over 59
        if ((minutes >= 0) || (seconds >= 0) && (seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
        }
        return "Invalid value.";
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid Value";
    }
}
