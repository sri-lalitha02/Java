import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        // Break --> The break statement is used to exit from a loop (or a switch) immediately,even if the loop condition is still true.
        while(i <= 50)
        {
            if(i == 20)
            {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Continue --> The continue statement skips the current iteration of a loop and moves to the next iteration.
        //To print odd numbers from 1 to 10
        for(int j = 0 ; j <= 10 ; j++)
        {
            if(j%2 == 0) continue;
            System.out.print(j + " ");
        } 
    }
    
}
