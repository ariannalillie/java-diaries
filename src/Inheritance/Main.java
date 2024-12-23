package Inheritance;

public class Main {
    public static void main (String[] args) {
        Animal animal = new Animal("Generic Animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        // we can pass a dog instance to any method that takes an animal type because
        // the Dog class is a subclass of the Animal class
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 14);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 64, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}