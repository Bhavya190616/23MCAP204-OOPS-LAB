import java.util.Scanner;

// Person class (Base Class)
class Person {
    protected String name, gender, address;
    protected int age;

    // Constructor to initialize Person
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class (Inherits Person)
class Employee extends Person {
    protected int empId;
    protected String companyName, qualification;
    protected double salary;

    // Constructor to initialize Employee
    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class (Inherits Employee)
class Teacher extends Employee {
    private String subject, department;
    private int teacherId;

    // Constructor to initialize Teacher
    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, 
                   int teacherId, String subject, String department) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.teacherId = teacherId;
        this.subject = subject;
        this.department = department;
    }

    // Method to display teacher details
    public void displayDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name      : " + name);
        System.out.println("Gender    : " + gender);
        System.out.println("Address   : " + address);
        System.out.println("Age       : " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company   : " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary    : " + salary);
        System.out.println("Subject   : " + subject);
        System.out.println("Department: " + department);
    }
}

// Main class
public class Teach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of teachers
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        // Create an array of Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();
            
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();
            
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            
            System.out.print("Enter Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            
            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            // Store teacher object in array
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, teacherId, subject, department);
        }

        // Display all teachers' details
        System.out.println("\nTeacher Details:");
        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }

        sc.close();
    }
}
