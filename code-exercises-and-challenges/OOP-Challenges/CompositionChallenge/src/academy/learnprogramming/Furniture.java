package academy.learnprogramming;

public class Furniture {
    private int sofa;
    private int TV;

    public Furniture(int sofa, int TV) {
        this.sofa = sofa;
        this.TV = TV;
    }

    public void furnitureInfo() {
        System.out.println("The room have " + sofa + " sofa and " + TV + " TV");
    }

    public void hideSofa() {
        sofa = 0;
        System.out.println("The sofa is now hidden");
    }

    public void hideTV() {
        TV = 0;
        System.out.println("The TV is now hidden");
    }
}
