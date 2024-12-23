package InheritanceChallenge;

public class Worker {
    private String name;
    private int age;
    private String endDate;

   public Worker(String name, int age, String endDate) {
       this.name = name;
       this.age = age;
       this.endDate = endDate;
   }
   public void getAge() {
      System.out.println(name + " is " + age);
   }
   public void terminate() {
       if (endDate == "today") {
           System.out.println("Today is your last day of work");
       } else {
           System.out.println("You are not getting terminated today");
       }
   }
}
