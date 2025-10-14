import java.util.Scanner;

class Student {
    // Instance variables
    String name; 
    int rollNumber;
    String branch;
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;
    int totalMarks;
    char grade;

    // Instance methods
    int getTotalMarks()
    {
        totalMarks = subject1Marks + subject2Marks + subject3Marks;
        return totalMarks;
    }
    char getGrade()
    {
        if(totalMarks >= 260) return grade = 'A';
        else if(totalMarks < 260 && totalMarks >= 200) return grade = 'B';
        else if(totalMarks < 200 && totalMarks >= 150) return grade = 'C';
        else if(totalMarks < 150 && totalMarks >= 100) return grade = 'D';
        else if(totalMarks < 100 && totalMarks >= 50) return grade = 'E';
        else return grade = 'F';
    }
    void printStudentDetails()
    {
        System.out.println("Name of student : " + name);
        System.out.println("Roll Number is : " + rollNumber);
        System.out.println("Branch : " + branch);
        System.out.println("Subject1 Marks is : "+ subject1Marks);
        System.out.println("Subject2 Marks is : " + subject2Marks);
        System.out.println("Subject3 Marks is : " + subject3Marks);
        System.out.println("Total Marks is : " + totalMarks);
        System.out.println("Grade is : " + grade);
    }

}
public class CreatingClasses2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating student object
        Student s1 = new Student();
        String name = sc.next();
        int rollnum = sc.nextInt();
        String branch = sc.next();
        int sub1Marks = sc.nextInt();
        int sub2Marks = sc.nextInt();
        int sub3Marks = sc.nextInt();
        s1.name = name;
        s1.rollNumber = rollnum;
        s1.branch = branch;
        s1.subject1Marks = sub1Marks;
        s1.subject2Marks = sub2Marks;
        s1.subject3Marks = sub3Marks;
        s1.getTotalMarks();
        s1.getGrade();
        s1.printStudentDetails();



        
    }
    
}
