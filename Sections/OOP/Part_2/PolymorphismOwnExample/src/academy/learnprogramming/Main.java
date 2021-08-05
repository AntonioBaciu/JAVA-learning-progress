package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Animals animals = randomAnimals();
            System.out.println("Guinea Pig number #" + i + " : " + animals.getName() + "\n" +
                    "Fur Colour: " + animals.furColour() + "\n");
        }
    }

    public static Animals randomAnimals() {
        int randomNumber = (int) (Math.random() * 2) + 1;

        switch (randomNumber) {
            case 1:
                return new Garry();
            case 2:
                return new Milo();
        }
        return null;
    }
}

