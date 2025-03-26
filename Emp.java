// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test
public class Emp {
    public static void main(String[] args) {
        FullTimeEmployee ftEmp = new FullTimeEmployee("Alice", 101, 50000);
        PartTimeEmployee ptEmp = new PartTimeEmployee("Bob", 102, 200, 20);

        ftEmp.displayDetails(); // Output: ID: 101, Name: Alice, Salary: 50000.0
        ptEmp.displayDetails(); // Output: ID: 102, Name: Bob, Salary: 4000.0
    }
}
