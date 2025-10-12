// Variable sized arrays means arrays of varying lengths

import java.util.Arrays;

public class VariableSizedArrays {
    public static void main(String[] args) {
        //java allows variable sized  inner most arrays
        int[][] arr = {
                         {10 , 20 , 30},
                         {1 , 2},
                         {100}
                      };
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

       int[][] mat = new int[3][];
       mat[0] = new int[4]; // 1st 1-D array with 4 integers
       mat[1] = new int[10]; // 2nd 1-D array with 10 integers
       mat[2] = new int[6]; // 3rd 1-D array with 6 integers
       for(int i = 0 ; i < mat.length ; i++)
       {
           System.out.println(Arrays.toString(mat[i]));
       }

    // Arrays.deepToString()
    // Used to quick look of the 2-D Array in the form of list --> return type is String   
       System.out.println(Arrays.deepToString(mat));
        
    }
    
}
