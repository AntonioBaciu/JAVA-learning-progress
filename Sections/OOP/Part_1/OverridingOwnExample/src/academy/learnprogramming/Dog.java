package academy.learnprogramming;

public class Dog {
    private String fur;
    private String bark;

    public Dog(String fur, String bark) {
        this.fur = fur;
        this.bark = bark;
    }

    public String getFur() {
        return fur;
    }

    public String getBark() {
        return bark;
    }

    public void bark(){
        System.out.println(bark);
    }
}
