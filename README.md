# java-diaries

## Method Overloading 
When multiple methods in the same class have the same name but different parameters (number or type).
This allows a method to perform different tasks based on input.
**Note:**  Overload methods do not need to have the same return type however the return type alone cannot differentiate overloaded methods

```java
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score);
        return score * 1000;
    }
    public static void calculateScore(int score) {
        // Java's equivalent to having a default value for a param
        calculateScore("Anonymous ", score);
    }
```
## Classes
Classes are groups into packages
### Top level class
A class that is defined in the source code files and not enclosed in the code block of another class, type or method
### Fields
Fields in java are assigned default values (boolean: false, numeric types: 0, any other type: null)

```java
public class Car {
    private String make;
    private String model;
    private String color;
}
```
### Getters & Setters
* a getter - retrieves the value of a private field and returns it
* a setter - sets the value of a private field
```java
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
```

## Access Keywords
* **public** - any other class in any package can access this class
* **protected** - classes in the same package have access
* **private** - no other class can access this method (generally all fields on a class should be private)

## Encapsulation
* The bundling of behavior and attributes on a single object
* The practice of hiding fields and methods from public access

## Constructors 
If a class contains no constructor declarations then a constructor is implicitly declared This constructor has no params - 
often called the **no-args constructor** constructors have the same name as the class and no return type