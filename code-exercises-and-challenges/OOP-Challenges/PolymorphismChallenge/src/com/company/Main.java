package com.company;


public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi("Audi", 10);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        BMW bmw = new BMW("BMW", 6);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Mercedes mercedes = new Mercedes("Mercedes", 8);
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());
    }
}


class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
//      return getClass().getSimpleName() → returns the executed class(Car,Audi,BMW,Mercedes) + the class name(Car,Audi,BMW,Mercedes)
        return getClass().getSimpleName() + "-> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}

class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }
}

class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes -> brake()";
    }
}

