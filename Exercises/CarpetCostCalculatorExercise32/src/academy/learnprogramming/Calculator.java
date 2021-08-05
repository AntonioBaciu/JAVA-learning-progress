package academy.learnprogramming;

public class Calculator {
    // Floor & Carpet are used as data types, so I can access their methods in order to calculate the TotalCost
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost(); // getArea() is accessed from the Floor class and the same for Carpet
    }
}
