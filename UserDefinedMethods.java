public class UserDefinedMethods {
    // non - static (instance) method
    int getSum(int a , int b)
    {
        return a+b;
    }

    // static method
    static int getProduct(int a , int b)
    {
        return a*b;
    }

    public static void main(String[] args) {

        // Calling a non-static method (2 step process)
        // 1. create a object , 2.  call the method by using dot operator
        // Syntax of creating object : className variableName = new className();
        UserDefinedMethods m1 = new UserDefinedMethods();
        System.out.println(m1.getSum(10 , 20));

        // Calling static method (direct)
        System.out.println(getProduct(10, 20));

        
    }
}
