package JavaObject;

// Java includes all objects from its core library automagically,
// so we can refer to them without the package name java.lang.Object -> Object
public class Main extends Object {
    public static void main (String[] args) {
        Student max = new Student("Max", 27);
        // this prints out the name followed by @hashcode
        // java implicitly calls the toString() method on object if you print the object
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 5, "Carol");
        System.out.println(jimmy);
    }
}

// only one class in a java src file can be public
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}