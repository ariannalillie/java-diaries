package Inheritance;

public class Main {
    public static void main (String[] args) {
        Animal animal = new Animal("Generic Animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        // we can pass a dog instance to any method that takes an animal type because
        // the Dog class is a subclass of the Animal class
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}