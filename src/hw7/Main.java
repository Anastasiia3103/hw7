package hw7;

public class Main {
    private static Animals Animal;

    public static void main(String[] args) {

        Cat markiz = new Cat("Markiz");
        Dog sharik = new Dog("Sharik");
        Cat marusya = new Cat("Marusya");

        markiz.run(100);
        markiz.swim(20);
        sharik.run(550);
        sharik.swim(5);
        marusya.run(300);
        marusya.swim(0);

        System.out.println(Animal.getAnimalCount() + " animal(s) created");
        System.out.println(Cat.getCatCount() + " cat(s) created");
        System.out.println(Dog.getDogCount() + " dog(s) created");

    }
}
