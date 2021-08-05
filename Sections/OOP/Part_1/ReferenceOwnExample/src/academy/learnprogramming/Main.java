package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // create a blue house
        House blueHouse = new House("blue"); // blueHouse is the reference to the created object
        blueHouse.getColor(); // blue

        // create a second house
        House secondHouse = new House("red");
        secondHouse.getColor(); // red

        // set the same reference for both houses
        blueHouse = secondHouse; // blue = red
        blueHouse.getColor(); // red
        secondHouse.getColor(); // red

        // create a third house
        House greenHouse = new House("green");
        greenHouse.getColor(); // green

        // set the same reference between greenHouse and secondHouse
        secondHouse = greenHouse; // red = green
        secondHouse.getColor(); // green
        greenHouse.getColor(); // green
        blueHouse.getColor(); // red

        // set the same color for all the houses
        blueHouse = secondHouse;
        secondHouse = greenHouse;
        blueHouse.getColor(); // green
        secondHouse.getColor(); // green
        greenHouse.getColor(); // green
    }
}
