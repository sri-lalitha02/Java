import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator)
        {
            case '+':
                System.out.println("Sum : " + (a+b));
                break;
            case '-':
                System.out.println("Difference : " + (a-b));
                break;
            case '*':
                System.out.println("Product : " + (a*b));
                break;
            case '/':
                System.out.println("Quotient : " + (a/b));
                break;
            case '%':
                System.out.println("Reminder : " + (a%b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
