package OOP_LAB_3;

public class Mobile {   //TASK 2
    String brand;
    String model;
    double price;

    // Default constructor
    Mobile() {
        brand = "Unknown";
        model = "N/A";
        price = 0.0;
    }

    // Parameterized constructor
    Mobile(String b, String m, double p) {
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    // Display method
    void display() {
        System.out.println("_______________");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("_______________");
    }

    public static void main(String[] args) {
        //using Default constructor
        Mobile defaultPhone = new Mobile();

        //using parameterized constructor
        Mobile realPhone = new Mobile("Samsung", "Galaxy S26 Ultra", 1500.0);

        // Display
        defaultPhone.display();
        realPhone.display();
    }
}