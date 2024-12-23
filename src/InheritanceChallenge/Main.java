package InheritanceChallenge;

public class Main {
    public static void main (String[] args) {
        SalariedEmployee bob = new SalariedEmployee("Bob", 55, "Today" , 939393, "May 5, 2020", 5000.00, false );
        System.out.println(bob.retire());
    }
}
