package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone jakesPhone;
        jakesPhone = new DeskPhone(123456);
        jakesPhone.powerOn();
        jakesPhone.callPhone(123456);
        jakesPhone.answer();

        jakesPhone = new MobilePhone(6623);
        jakesPhone.powerOn();
        jakesPhone.callPhone(6623);
        jakesPhone.answer();
    }
}
