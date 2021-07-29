package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int test = sumDigits(11111);
        System.out.println(test);

    }

    public static int sumDigits(int number) {
        if(number < 10){
            return -1;
        }

        int sum = 0;
        while (number > 0){
            // number % 10 -> gets the last digit and put it in the sum
            int digit = number % 10;
            sum += digit;

            // removes the last digit from the number and restarts the loop
            number /= 10;

            // So if the number is 123, 123 % 10 = 12, sum = 0 + 3, sum = 3 , 123 / 10 = 12, number = 12,
            // 12 % 10 = 2 -> sum = 3 + 2, sum = 5, 12 / 10 = 1 -> 1 % 10 = 1 => sum = 5 + 1, sum = 6
        }
        return sum;
    }
}
