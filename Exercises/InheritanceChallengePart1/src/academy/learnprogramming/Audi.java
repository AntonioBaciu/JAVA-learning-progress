package academy.learnprogramming;

public class Audi extends Car {

    private int speed;

    public Audi(int doors, String make, String model, String color, String steering, String fuelType, int speed) {
        super(doors, make, model, color, steering, fuelType);
        this.speed = speed;
    }

    public void getSpeed() {
        System.out.println("Get Speed " + speed);
    }

    public void increaseSpeedBy(int number) {
        this.speed = speed + number;
        System.out.println("Current Speed " + this.speed);
    }

    public void decreaseSpeedBy(int number) {
        if (this.speed < number) {
            this.speed = 0;
            System.out.println("Current Speed " + this.speed);
        } else {
            this.speed = speed - number;
            System.out.println("Current Speed " + this.speed);
        }
    }
}
