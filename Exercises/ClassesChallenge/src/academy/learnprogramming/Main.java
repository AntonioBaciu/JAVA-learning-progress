package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account(); //"12345", 0d, "Antonio", "antonio@gmail.com", "(66) 666 666");

        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());

        myAccount.withdrawal(100d);

        myAccount.deposit(50d);
        myAccount.withdrawal(100d);

        myAccount.deposit(51d);
        myAccount.withdrawal(50d);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    }
}
