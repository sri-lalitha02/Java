import java.util.Scanner;

public class SwitchCaseExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // switch (<variable or expression>) {
        //     case <literal value>: //code_block1
        //         [break;]
        //     case <literal value>: // code_block2
        //         [break;]
        //     default: //default_code
        // }
        // The switch statement provides more efficient syntax for choosing among several alternatives
        // Break statement is used to end the switch statement if the break statement is not put then all the conditions will executed
        switch(day)
        {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");    

        }

        // Another way to write a switch case
        String result = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        // in java switch case uses directly a datatype 
        //put semicolumn at last is important bcz it is assign to a variable
        System.out.println(result);

        String result2 = switch(day){
            case 1 , 2 , 3 , 4 , 5 -> "Weekday";
            case 6 , 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(result2);

    }
    
}
