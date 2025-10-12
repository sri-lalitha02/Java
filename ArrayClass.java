import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        // Arrays class is present in the java.util packages
        // The array class contain some utility method 
        // which will help to do some operations easily on arrays

        // toString() method 
        // Used to quick look of the array in the form of list -> returntype is 'String'
        // Syntax : Arrays.toString(array_name);
        int[] array1 = {10 , 20 , 30 , 40 , 50};
        String resultArray = Arrays.toString(array1);
        System.out.println(resultArray);
        String[] names = {"Alice" , "Charalie" , "Bob"};
        System.out.println(Arrays.toString(names));
        
        // Arrays.equals() method
        // Used to compare two arrays
        // return true if they are equal , otherwise return false i.e returntype is boolean
        // Syntax : Arrays.equals(array1 , array2);
        int[] array2 = {10 , 20 , 30};
        System.out.println(Arrays.equals(array1 , array2));

        // Arrays.compare() method
        // Used to compare two arrays but it tells which array is greather, smmaller or equal
        // returntype is integer i.e 1 , -1 , 0
        // -ve -> when first array is smaller than second
        // +ve --> when first array is greater than second
        // 0 --> when both arrays are equal
        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array2, array1));

        // Arrays.fill()
        // fill() is used to fill all the elements of an array with a since value
        // Syntax: Arrays.fill(arr_name, value);
        int[] arr = new int[10]; // default value : 0 
        System.out.println("Before filling : " + Arrays.toString(arr));
        Arrays.fill(arr , -1);  // filling all array elements with -1
        System.out.println("After filling : " + Arrays.toString(arr));
        String[] strings = new String[3]; // default value : null
        System.out.println("Before filling : " + Arrays.toString(strings));
        Arrays.fill(strings , "java");
        System.out.println("After filling : " + Arrays.toString(strings));

            // Arrays.sort()
            // Used to sort the given array in-place
            int[] integerArray = {7, 6, -2, 1, 4}; // {-2, 1, 4, 6, 7}
            System.out.println("Before sorting: " + Arrays.toString(integerArray));
            Arrays.sort(integerArray); // sorting an integer array
            System.out.println("After sorting: " + Arrays.toString(integerArray));
            System.out.println(Arrays.toString(names));
            Arrays.sort(names); // string array
            System.out.println(Arrays.toString(names));

    }
    
}
