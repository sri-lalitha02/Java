public class Loops {
    public static void main(String[] args) {
        // loops 4 types --> 1. while loop , 2. for loop , 3. do-while loop , for - each loop

        // 1. while loop --> Executes the block of code as long as condition is true
        // Syntax:
        // while(condition)
        // {
        //     block of code
        // }
        int i = 0;
        while(i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2. for loop --> executes the block of code as long as condition is true
        // Syntax:
        // for(initialization ; condition ; updation)
        // {
        //     // block of code
        // }
        for(int j = 0 ; j <= 10 ; j++)
        {
            System.out.print(j + " ");
        }
        System.out.println();

        // 3. do-while loop --> executes the loop body at least once, even if the condition is false.
        // Syntax:
        // do{
        //     // block of code
        // }while(condition);
        int j = 0;
        do{
            System.out.print(j + " ");
            j++;
        }while(j <= 10);
        System.out.println();

        //4. for-each loop --> it is a simpler way to iterate over elements in arrays or collections
        // it is automatically goes through each element , no need for index handling
        // Syntax:
        //  for(dataType variableName : CollectionOrArray)
        //  {
        //     // Body of the code
        //  }
        int[] arr = {10 , 20 , 30 , 40 , 50};
        for(int element : arr)
        {
            System.out.print(element + " ");
        }



    }
    
}
