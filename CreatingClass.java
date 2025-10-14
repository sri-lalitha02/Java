class Square{
    // instance variables (properties / attributes)
    int side ; 
    int area;
    int perimeter;

    //Instance methods
    void calculateArea()
    {
        area = side * side;
    }
    void calculatePerimeter()
    {
        perimeter = 4 * side;
    } 

}
public class CreatingClass {
    // Working as runnable class
    // That means , Which class contains main method called as runnable class 
    public static void main(String[] args) {
        // Create an object of Square class
        // Syntax : ClassName obj_name = new ClassName();
        Square s1 = new Square();
        s1.side = 10; // populating side varible with a value 10
        System.out.println(s1.area); // printing area before calculating area
        s1.calculateArea(); // calculate area
        System.out.println(s1.area);
        s1.calculatePerimeter(); 
        System.out.println(s1.perimeter);

        Square s2 = new Square();
        s2.side = 4;
        System.out.println("Side of square 2 : " + s2.side);
        s2.calculateArea();
        System.out.println("Area of Square 2 : " + s2.area);
        s2.calculatePerimeter();
        System.out.println("Perimeter of square 2 : " + s2.perimeter);

        
    }
    
}
