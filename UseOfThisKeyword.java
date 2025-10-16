class Student{
    // Instance variables
    String name;
    int age;
    double cgpa;

    // Constructors
    Student(String name , int age)
    {
        this.name = name;  // using this keyword to distinguish between the local and instance variables
        this.age = age;
    }
    // chaining of constructor
    Student(String name , int age , double cgpa)
    {
        // we directly call by previous constructor and it must be write in the 1st line of constructor
        this(name , age);
        this.cgpa = cgpa;
    }

    // Instance methods
    // Proving this keyword represents the current object
    void xyz()
    {
        System.out.println(this);
    }
    void printStudentDetails()
    {
        System.out.println("Name is " + this.name);
        System.out.println("age is : " + age);
        System.out.println("cgpa is : "+ cgpa);
        System.out.print("Current object Hashcode is ");
        this.xyz(); // Calling xyz function by using this keyword
    }
}
public class UseOfThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 17, 2.2);
        s1.printStudentDetails();
        s1.xyz(); // prints the same id (hashcode) s1
        System.out.println(s1); // prints the hashcode of s1

        Student s2 = new Student("Alice" , 18);
        s2.printStudentDetails();

        

    }
    
}
