package InheritanceChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, int age, String endDate, long employeeId, String hireDate) {
        super(name, age, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
