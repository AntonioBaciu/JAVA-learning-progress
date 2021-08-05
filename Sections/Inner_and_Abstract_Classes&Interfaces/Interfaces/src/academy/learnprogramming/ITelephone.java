package academy.learnprogramming;

public interface ITelephone {
    // defining the methods that form the interface
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
