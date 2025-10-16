// Rules of constructor:
// Constructor name must be same as the class name.
// Constructors do not have a return type (not even void).
// They are called automatically when you create an object.
// If no constructor is defined, Java provides a default constructor.

class Product{
    // Instance variables
    int id;
    String name, type;
    double price;
    int discountPercentage;
    // Constructors
    // A constructor is a special method in Java used to initialize objects.
    // It’s called automatically when an object is created using the new keyword.
    
    // Non - parametric constructor
    Product()
    {

    }

    // parametric constructors
    Product(int i, String n, String t, double p, int dp) 
    {
        id = i;
        name = n;
        type = t;
        price = p;
        discountPercentage = dp;
    }

    //Instance methods
    double getDiscountAmount() 
    {
        return price * (discountPercentage / 100.0);
    }
    void printProductDetails() 
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + type);
        System.out.println("Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage);
    }


}
public class Constructors {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", "Electronics", 65000.00, 10);
        p1.printProductDetails();
        System.out.println(p1.getDiscountAmount());
        Product p2 = new Product(102, "Chair", "Furniture", 1000.00, 7);
        p2.printProductDetails();
        System.out.println(p2.getDiscountAmount());
        
    }
    
}
