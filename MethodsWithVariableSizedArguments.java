public class MethodsWithVariableSizedArguments {
    static void add(int ... A)
    {
        // the value you send will be stored in A as array
        // of the data type provided
        int sum = 0 ;
        for(int EachValue : A)
        {
            sum += EachValue;
        }
        System.out.println("Sum of " + A.length + " values is : " + sum);
    }
    static int gcd(int a , int b)
    {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a > b) return gcd(a%b , b);
        else return gcd(a , b%a);
    }
    // Lcm 
    static void lcm(int ... nums)
    {
        int res = nums[0];
        for(int eachElement : nums)
        {
            int a = res , b = eachElement;
            int gcd1 = gcd(res , eachElement);
            res = (a*b)/gcd1;
        }
        System.out.println(res);
    }
    static void concatination(String ... names)
    {
        String str = "";
        for(String eachCharacter : names)
        {
            str += eachCharacter.charAt(0);
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
       add(100, 200);  // {100, 200} A
       add(100); // {100} A
       add(100, 200, 300); // {100, 200, 300} A
       lcm(10 , 20);
       lcm(1 , 2 , 3 , 4 , 5);
       concatination("Alice" , "Bob" , "Charalie");

        
    }
}
