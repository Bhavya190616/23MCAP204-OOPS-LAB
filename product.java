class Product {
    int pcode;
    String pname;
    double price;

    // Constructor
    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }

    public static void main(String[] args) {
        // Creating three product objects
        Product product1 = new Product(101, "Laptop", 50000);
        Product product2 = new Product(102, "Smartphone", 30000);
        Product product3 = new Product(103, "Tablet", 20000);

        // Finding the product with the lowest price
        Product lowestPriceProduct = product1;
        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }
        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        // Displaying the product with the lowest price
        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();
    }
}
