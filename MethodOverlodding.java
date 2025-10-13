public class MethodOverlodding {
    // Method overlodding means writing a method with same name but different signatures
        // 1.Number of parameters , 2.Type of parameter , 3.Order of parameter
        // * returntype of the method does not count under overlodding

        // overloaded method
        static void add(int a , int b)
        {
            System.out.println(a+b);
        }
        // Overlaoded method -->change in number of parameters
        static void add(int a , int b , int c)
        {
            System.out.println(a+b+c);
        }
        // Overlaoded method -->change in type of parameters
        static void add(int a , double b)
        {
            System.out.println(a+b);
        }
         // Overloaded method -> change in type of parameter
        static void add(int[] A) {
            int sum = 0;
            for (int eachElement: A) {
            sum += eachElement;
            }
            System.out.println(sum);
        }
        // by changing the order of parameters
        static void add(String x, int p) {
            System.out.println(x.charAt(0) + p);
        }
        // by changing the order of parameters
        static void add(int p, String x) {
            System.out.println(p + x.charAt(x.length() - 1));
        }
    public static void main(String[] args) {
        add(10 , 20);
        add(10 , 20 , 30);
        add(1 , 2.2);
        add(new int[] {10 , 20 ,30 ,40});
        add("HelloWorls" , 10);
        add(10 , "HelloWorld");

        int a = 10;
        float p = 2.1f;
        double x = 77.81;
        boolean b = false;
        char ch = '#';
        // println() is overloaded method
        System.out.println();
        System.out.println(a);
        System.out.println(p);
        System.out.println(x);
        System.out.println(b);
        System.out.println(ch);
    }
    
}
