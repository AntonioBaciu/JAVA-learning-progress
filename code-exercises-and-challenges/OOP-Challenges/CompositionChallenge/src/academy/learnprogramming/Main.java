package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Creating a new room
        Room room = new Room(4, 2, 2, "wood", new RoomDimensions(4, 50, 50));

        // Adding furniture
        Furniture furniture = new Furniture(1, 1);

        // Creating the House
        House house = new House(room, furniture, new SofaDimensions(100, 1500, 2500), new TvDimensions(75), new RoomDimensions(3, 50, 50));
        house.HouseInfo();

        house.getFurniture().hideSofa();
        house.getFurniture().hideTV();
    }
}
