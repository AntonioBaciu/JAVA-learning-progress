package academy.learnprogramming;

public class GoldenRetriever extends Dog{

   private String name;

    public GoldenRetriever(String fur, String bark, String name) {
        super(fur, bark);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void bark() {
        System.out.println("Golden Retriever goes: woof woof woof" );
//        super.bark();
    }
}
