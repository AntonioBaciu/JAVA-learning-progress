public class TeenNumberConverter {

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((age1 >= 13) && (age1 <= 19) || (age2 >= 13) && (age2 <= 19) || (age3 >= 13) && (age3 <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
