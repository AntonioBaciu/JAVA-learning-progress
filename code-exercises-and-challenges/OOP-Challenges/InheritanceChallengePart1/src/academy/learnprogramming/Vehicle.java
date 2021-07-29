package academy.learnprogramming;

public class Vehicle {
    private int motor;
    private int wheels;
    private int doors;

    public Vehicle(int motor, int wheels, int doors) {
        this.motor = motor;
        this.wheels = wheels;
        this.doors = doors;
    }

    public int getMotor() {
        return motor;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}
