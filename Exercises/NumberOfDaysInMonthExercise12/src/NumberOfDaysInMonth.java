public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else return year % 100 != 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) return -1;
        if ((year < 1 || year > 999)) return -1;

        int februaryInLeapYear = 29;
        int february = 28;

        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                    return 31;
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                break;
            }
        }
        return -1;
    }
}

