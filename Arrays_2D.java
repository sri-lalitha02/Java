import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        // MultiDimesional array syntax:
        // datatype[][] array_name = new datatype[r][c]; -- 2d
        // datatype[][][] arr_name = new datatype[x][y][z]; -- 3d
        //               0  1     0   1     0   1
        int[][] arr = {{10, 20}, {30, 40}, {50, 60}};
        //  idx's :       0          1         2
        // it's 3 x 2 matrix
        System.out.println(arr.length); // 3 = rows size
        System.out.println(arr[1][1]);
        System.out.println(arr[0][1]);
        // outer loop on rows
        for (int i = 0; i < arr.length; i++) {
            // inner loop on columns
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

         // 3 1-D arrays
        String[]  moneyHeist = {"professor", "berlin", "tokyo"};
        String[] squidGame = {"player-456", "player-100", "player-222"};
        String[] breakingBad = {"walter", "jesse", "skyler"};
        // 1 2-D array
        String[][] webSeriesCast = {moneyHeist, squidGame, breakingBad};
        for (int i = 0; i  < webSeriesCast.length; i++) {
        for (int j = 0; j < webSeriesCast[i].length; j++) {
            System.out.print(webSeriesCast[i][j] + " ");
        }
        System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        // dimensions
        int r = sc.nextInt(); // rows
        int c = sc.nextInt(); // columns
        // declaration
        int[][] mat = new int[r][c];
        // reading values into matrix
        for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            mat[i][j] = sc.nextInt();
        }
        }
        // accessing the elements
        // runs on rows
        for (int i = 0; i < r; i++) {
        // runs on column
        for (int j = 0; j < c; j++) {
            System.out.print(mat[i][j] * mat[i][j] + " ");
        }
        System.out.println();
        }

        // Running for each loop on a 2-D array
        int[][] A = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        // each element in 2-D array is a 1-D array of integers
        for (int[] eachArray: A) {
        for (int eachValue: eachArray) {
            System.out.print(eachValue + " ");
        }
        System.out.println();
        }
    
    }
}
