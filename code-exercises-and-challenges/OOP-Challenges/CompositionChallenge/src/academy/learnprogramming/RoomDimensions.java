package academy.learnprogramming;

public class RoomDimensions {
    private int height;
    private int width;
    private int length;

    public RoomDimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void roomMeasures(){
        System.out.println("The room is " + height + " meters high " + width + " meters wide and " + length + " meters long");
    }
}
