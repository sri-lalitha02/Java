import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
        // if (<condition1>) {
        // //code_block1
        // }
        // else if (<condition2>) {
        // // code_block2
        // }
        // else {
        // // default_code
        // }
        if(a>b&&a>c) 
        {
            System.out.println(a + " is Greater");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b + " is greater");
        }
        else
        {
            System.out.println(c + " is greater");
        }
    }
}

