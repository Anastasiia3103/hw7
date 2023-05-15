package hw7;

public class Animals {
    public static int animalCount;
    String name;

    public Animals (String name){
        this.name = name;
        animalCount++;
    }

    public void run (int distance){
        System.out.println ("This animal ran " + distance + " m.");
    }

    public void swim (int distance){
        System.out.println ("This animal swam " + distance + " m.");
    }

    public static int getAnimalCount (){
        return animalCount;
    }
}

