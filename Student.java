public 
class Student {
    private int studentId;     
    private String name;         
    private double marks;        

    
    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

   
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    
    public boolean isPassed() {
        return marks >= 40;
    }

   
    public static void main(String[] args) {
     
        Student student1 = new Student(101, "Bhavya", 85.5);
        Student student2 = new Student(102, "Aarav", 38.0);
        Student student3 = new Student(103, "Diya", 65.0);

        
        student1.displayDetails();
        System.out.println("Passed: " + student1.isPassed());
        System.out.println("--------------------------");

        student2.displayDetails();
        System.out.println("Passed: " + student2.isPassed());
        System.out.println("--------------------------");

        student3.displayDetails();
        System.out.println("Passed: " + student3.isPassed());
    }
}
 
