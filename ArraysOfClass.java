class Circle{
    // Instance variables
    double radius;

    // Constructor
    Circle(double radius)
    {
        this.radius = radius;
    }

    // Instance methods
    double getDiameter()
    {
        return 2*radius;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }
    double getPerimeter()
    {
        return 2 * 3.14 * radius;
    }
    
}
public class ArraysOfClasses {
    public static void main(String[] args) {
        // Creating array of objects
        Circle[] circles = {new Circle(10),
                            new Circle(20),
                            new Circle(30) };
        System.out.println(circles.length);
        // for loop to access the behaviours and attributes of the circle class
        for(int i = 0 ; i < circles.length ; i++)
        {
            System.out.println("Details of circle : " + (i+1));
            System.out.println("Radius of Circle : " + circles[i].radius);
            System.out.println("Diameter of Circle : " + circles[i].getDiameter());
            System.out.println("Area of Circle : " + circles[i].getArea());
            System.out.println("Perimeter of Circle : " + circles[i].getPerimeter());
            System.out.println();
        }
        // for-each loop to access the behaviours and attributes of the circle class
        for(Circle eachCircle : circles)
        {
            System.out.println("Radius of Circle : " + eachCircle.radius);
            System.out.println("Diameter of Circle : " + eachCircle.getDiameter());
            System.out.println("Area of Circle : " + eachCircle.getArea());
            System.out.println("Perimeter of Circle : " + eachCircle.getPerimeter());
            System.out.println();
        }
        
    }
    
}
