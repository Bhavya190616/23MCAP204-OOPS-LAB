// Step 1: Define the Shape interface
interface Shape {
    double calculateArea(); // Abstract method
}

// Step 2: Implement Triangle class
class Triangle implements Shape {
    private double base, height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override calculateArea() for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Step 3: Implement Rectangle class
class Rectangle implements Shape {
    private double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Step 4: Demonstrate polymorphism
public class shapes {
    public static void main(String[] args) {
        // Create Shape references for Triangle and Rectangle
        Shape[] shapes = new Shape[2];
        
        shapes[0] = new Triangle(5, 10); // Triangle object
        shapes[1] = new Rectangle(4, 6); // Rectangle object

        // Loop through shapes and call calculateArea() dynamically
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
