package academy.learnprogramming;

public class Car extends Vehicle {

    private String make;
    private String model;
    private String color;
    private String steering;
    private String fuelType;

    public Car(int doors, String make, String model, String color, String steering, String fuelType) {
        super(1, 4, doors);
        this.make = make;
        this.model = model;
        this.color = color;
        this.steering = steering;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getSteering() {
        return steering;
    }

    public String getFuelType() {
        return fuelType;
    }
}
