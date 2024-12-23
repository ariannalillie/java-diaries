package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, int age, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, age, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = age > 50 ? true : false;
    }
    public boolean retire() {
        if (isRetired) {
            System.out.println("It is time for you to retire");
        } else {
            System.out.println("Keep working hard!");
        }
        return isRetired;
    }
}
