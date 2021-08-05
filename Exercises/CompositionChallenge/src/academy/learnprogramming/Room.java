package academy.learnprogramming;

public class Room {
    private int walls;
    private int doors;
    private int windows;
    private String floorMaterial;
    private RoomDimensions roomDimensions;


    public Room(int walls, int doors, int windows, String floorMaterial, RoomDimensions roomDimensions) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.floorMaterial = floorMaterial;
        this.roomDimensions = roomDimensions;
    }

    public void roomInfo() {
        System.out.println("The room have " + walls + " walls, " + doors + " doors, " + windows + " windows and the floor is made of " + floorMaterial);
    }
}
