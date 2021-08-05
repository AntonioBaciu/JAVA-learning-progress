package academy.learnprogramming;

// Parent Class
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// Movie #1
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() { // here the plot() could be overridden since it has the same structure as in the parent Class
        return "A shark eats lots of people";
    }
}

// Movie #2
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

// Movie #3
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

// Movie #4
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

// #5
class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    // No plot method
    // We do not specify a plot method here, since the plot() from Movie will he used
}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie(); // movie stores the value returned from randomMovie()
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    // Will return a random movie
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1; // we use (int) to cast the value to an int since Math.random() returns double
        System.out.println("Random number generated was: " + randomNumber);
        // No break is needed since the value will be returned only once
        switch (randomNumber) {
            // We can use new Jaws() instead of new Movie("Jaws") thanks to the inheritance between Movie() and its children
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
