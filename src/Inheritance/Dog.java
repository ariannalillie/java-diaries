package Inheritance;

// Using `extends` specifies the superclass or the parent class
public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        // super() is a lot like this
        // `super` is a way to call the constructor of a superclass from the subclass
        super("Mutt", "Big", 300);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small": "large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    // Overrides the Animal classes make noise method when called on a Dog instance
    // Overriding a method is when you create a method on a subclass that has the same signature as the superclass
    // You override a parent class when you want the subclass to have different behavior for that method
    public void makeNoise() {
    }
}
