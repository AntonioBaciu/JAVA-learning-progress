package academy.learnprogramming;

public class Dog extends Animal {

    // set the dog's own fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // use super to inherit the rest, and set the brain & body to 1(true)
        // since all dogs have a brain and a body, so when we want to create the
        // new dog object in the Main class, the brain & body will be set as default.

        // also notice that inside the super we only wrote the inherited fields,
        // and in the Dog we wrote all the inherited fields(excluding the ones we set as default)
        // and also all it's own fields
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

//     @Override(I used Generate to create it)
//     allow us to create a new method in the Dog class, that has the same name as the one
//     in the Animal class.
//     With @Override we can use the eat() method here and change it's code block to something different.
//     Notice that using super.eat() will run the code block of the Animal eat() method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // calls the method chew()
        super.eat(); // calls the method eat() from Animal
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
