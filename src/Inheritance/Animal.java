package Inheritance;

public class Animal {
    // private fields cannot be used by subclasses
    // protected fields can be used by subclasses
    protected String type;
    private String size;
    private double weight;

    // default constructor
    public Animal() {
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
