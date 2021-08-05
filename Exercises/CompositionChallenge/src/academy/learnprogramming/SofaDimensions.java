package academy.learnprogramming;

public class SofaDimensions {
    private int height;
    private int width;
    private int length;

    public SofaDimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void sofaMeasures() {
        System.out.println("The sofa is " + height + " centimeters high, " + width + " centimeters wide, and " + length + " centimeters long");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
