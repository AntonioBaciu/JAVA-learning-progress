package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    petInfo("Garry");
    petInfo("Garry", 3);

    }

    public static void petInfo(String name) {
        System.out.println("Your pet is named " + name);
    }

    public static void petInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }
}
