import java.util.Scanner;

public class Arrays_1D {
    public static void main(String[] args) {
        // An array is a collection of elements of the same data type, stored in contiguous memory locations.
        // Syntax : data_type[] array_name = new data_type[size];
        //  datatype arrayname[size];

        // initialization of an array
        int[] arr1 = {10 , 20 , 30};
        // index's :  0    1     2
        String[] names = {"Alice" , "Bob" , "charalie" , "Diana"};
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 12;
        System.out.println(arr[0]);
        System.out.println(arr[4]); // at 4 index the element is not initilized so , default value 0 is stored

        // length of the array can be obtained by arr_name.length
        System.out.println(arr.length);

        // for loop to accessing elements in arr1 
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.println(i + "-->" + arr1[i]);
        }
        // for-each loop on names array
        for(String eachName : names)
        {
            System.out.println(eachName);
        }
        // Reading array by user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // reading array length
        int[] array1 = new int[n]; // Declaring array of length n
        // Reading array elements 
        for(int i = 0 ; i < n ; i++)
        {
            array1[i] = sc.nextInt();
        } 
        // accessing array elements
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(array1[i] + " " + array1[i]*array1[i]);
        }
        // finding sum , maximum , minimum of the array elements
        int sum = 0 , maxi = array1[0] , mini = array1[0];
        for(int eachElement : array1)
        {
            sum += eachElement;
            maxi = Math.max(eachElement , maxi);
            mini = Math.min(eachElement , mini);
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Maximum value : "+maxi);
        System.out.println("Minimum value : "+mini); 
        
        int[] A = {10 , 20 , 30};
        // int[] B = A --->which is not coorect way bcz it leads to deep copy the array
        // (based on address the elements are copied)
        // Syntax : DupicateArray = OriginalArray.clone();
        int[] B = A.clone();//Duplicating array using clone
        // clone is used for any type of array not an integer
        B[1] = 200;
        System.out.println(A[1]);
        System.out.println(B[1]);
        int[] C = {10 , 20 , 30};
        int[] D = C;
        D[1] = 120;
        System.out.println(C[1]);
        System.out.println(D[1]); 





    }
    
}
