
class Mobile {

    String brand;
    double price;

    // No-argument constructor
    Mobile() {
        brand = "Samsung";
        price = 25000;
    }

    // Display mobile details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

public class Main9 {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.displayDetails();
    }
}
