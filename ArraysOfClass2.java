import java.util.Scanner;

class Rectangle{
    // Instance variables
    int length;
    int width;
    int area;
    int perimeter;

    // COnstructors
    Rectangle(int length , int width)
    {
        this.length = length;
        this.width = width;
    }
    
    // Instance methods
    int getArea()
    {
        area = length*width;
        return area;
    }
    int getPerimeter()
    {
        perimeter = 2*(length + width);
        return perimeter;
    }
}
public class ArraysOfClass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Tell me how many Rectangles data would you provide
        System.out.println("Enter number of circles: ");
        int n = sc.nextInt();
        // An array of n Rectangles
        Rectangle[] rectangles = new Rectangle[n];
        // No memory will be allocated for each circle
        for (int i = 0; i < n; i++) {
        // Each Rectangle is now created / memory will be allocated
        int len = sc.nextInt();
        int wid = sc.nextInt();
        rectangles[i] = new Rectangle(len, wid);
        }
        // for-each loop
        for(Rectangle eachRectangle : rectangles)
        {
            System.out.println("Details of rectangle : ");
            System.out.println("length : " + eachRectangle.length);
            System.out.println("Breath : " + eachRectangle.width);
            System.out.println("Area : " + eachRectangle.getArea());
            System.out.println("Perimeter : " + eachRectangle.getPerimeter());
            System.out.println();
        }

        // for loop
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("Details of "+(i+1)+" Rectangle");
            System.out.println("Area of rectangle : " + rectangles[i].getArea());
            System.out.println("perimeter of rectangle : " + rectangles[i].getPerimeter());
            System.out.println();
        }

        
}
}
