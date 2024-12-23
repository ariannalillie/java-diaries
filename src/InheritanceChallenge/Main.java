package InheritanceChallenge;

public class Main {
    public static void main (String[] args) {
      Employee tim = new Employee("Tim", "11/11/1995", "01/01/2020");
      System.out.println(tim);
      System.out.println(tim.getAge());
      System.out.println(tim.collectPay());

      SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1990", "03/03/2020", 35000);
      System.out.println(joe);
      System.out.println("Joe's paycheck: " + joe.collectPay());
      joe.retire();
      System.out.println("Joe's Pension check = $" + joe.collectPay());
    }
}
