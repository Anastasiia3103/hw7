package hw7;

public class Cat extends Animals {
    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_SWIM_DISTANCE = 0;
    private static int catCount;

    public Cat (String name) {
        super (name);
        catCount++;
    }

    @Override
    public void run (int distance) {
        if ( distance > MAX_RUN_DISTANCE ) {
            System.out.println ("This cat can't run that far.");
        }
        else {
            System.out.println ("This cat ran " + distance + " m.");
        }
    }

    @Override
    public void swim (int distance) {
        System.out.println ("This cat can't swim.");
    }

    public static int getCatCount () {
        return catCount;
    }
}
