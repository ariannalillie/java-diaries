package Inheritance;

// Using `extends` specifies the superclass or the parent class
public class Dog extends Animal {
    public Dog() {
        // super() is a lot like this
        // `super` is a way to call the constructor of a superclass from the subclass
        super("Mutt", "Big", 300);
    }
}
