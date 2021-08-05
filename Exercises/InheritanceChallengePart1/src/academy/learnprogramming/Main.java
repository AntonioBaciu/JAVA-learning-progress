package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // new vehicle
        Vehicle myCarVehicle = new Vehicle(1, 4, 2);

        //new car
        Car myNewCar = new Car(4, "BMW", "X5", "Blue", "Auto", "Disel");

        // new Audi
        Audi myNewAudi = new Audi(2, "AUDI", "A9", "Black", "Manual", "Disel", 0);

        myNewAudi.increaseSpeedBy(100);
        myNewAudi.decreaseSpeedBy(9999);
        myNewAudi.getSpeed();

        System.out.println("#1 " + myCarVehicle.getMotor());
        System.out.println("#2 " + myNewCar.getDoors());
        System.out.println("#3 " + myNewAudi.getModel());

        // new bike
        Vehicle bike = new Vehicle(0,2,0);
        System.out.println(bike.getWheels() );
    }
}
