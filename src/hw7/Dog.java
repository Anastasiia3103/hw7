package hw7;

public class Dog extends Animals {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount;

    public Dog (String name) {
        super (name);
        dogCount++;
    }

    @Override
    public void run (int distance) {
        if ( distance > MAX_RUN_DISTANCE ) {
            System.out.println ("This dog can't run that far.");
        }
        else {
            System.out.println ("This dog ran " + distance + " m.");
        }
    }

    @Override
    public void swim (int distance) {
        if ( distance > MAX_SWIM_DISTANCE ) {
            System.out.println ("This dog can't swim that far.");
        }
        else {
            System.out.println ("This dog swam " + distance + " m.");
        }
    }

    public static int getDogCount ( ) {
        return dogCount;
    }
}
