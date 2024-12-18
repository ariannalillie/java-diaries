// Classes are groups into packages
// Top level class - A class that is defined in the source codd files
// and not enclosed in the code block of another class, type or method

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

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