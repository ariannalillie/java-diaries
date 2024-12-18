// Classes are groups into packages
// Top level class - A class that is defined in the source codd files
// and not enclosed in the code block of another class, type or method

public class Car {
    // Fields in java are assigned default values
    // (boolean: false, numeric types: 0, any other type: null)
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // Getters & Setters (used to control & protect access of private fields)
    // a getter - retrieves the value of a private field and returns it
    // a setter - sets the value of a private field

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        // this - refers to the instance that was created when the obj was instantiated
        // allows us to access fields on the class
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}

// Access Keywords
    // public - any other class in any package can access this class
    // protected - classes in the same package have access
    // private - no other class can access this method (generally all fields
    // on a class should be private)

// Encapsulation
    // Bundling of behavior and attributes on a single object
    // The practice of hiding fields and methods from public access