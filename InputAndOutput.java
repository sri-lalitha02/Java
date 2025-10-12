import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        // Scanner class is used for taking input
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int a = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        boolean b0 = sc.nextBoolean();
        System.out.println("short type : "+ s);
        System.out.println("byte type : "+ b);
        System.out.println("int type : "+ a);
        System.out.println("long type : "+ l);
        System.out.println("float type : "+ f);
        System.out.println("double type : "+ d);
        System.out.println("Boolean type : "+ b0);
        
        String str1 = sc.next(); // string without spaces
        sc.nextLine(); // mandatory before using nextLine
        String str2 = sc.nextLine(); // string with spaces
        
        char ch = sc.next().charAt(0);
        System.out.println("String with spaces : "+ str2);
        System.out.println("String with spaces : " + str1);
        System.out.println("char type : "+ ch);

        // output formatting
        System.out.println("Java is Object oriented programming language"); // println() moves the crsor to nextline
        System.out.print("Hello" ); // print() does not take console to nxt line
        System.out.println(" world");
        System.out.printf("%d" , 10); // printf() take the format specifier

    }
    
}
