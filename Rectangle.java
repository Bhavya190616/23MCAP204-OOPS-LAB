public // Rectangle class
class Rectangle {
    private double length;
    private double width;

    // Default constructor (sets length and width to 1)
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor (initializes length and width with given values)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("---------------------------------");
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a rectangle using the default constructor
        Rectangle rect1 = new Rectangle();
        rect1.display();

        // Create rectangles using the parameterized constructor
        Rectangle rect2 = new Rectangle(5, 3);
        rect2.display();

        Rectangle rect3 = new Rectangle(7.5, 4.2);
        rect3.display();
    }
}
 