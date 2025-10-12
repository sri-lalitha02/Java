public class MathMethod {
    public static void main(String[] args) {
        // java.lang package contains a class called Math class
        // Math class contains  some methods
        // abs() , ceil() , floor() , sqrt() , pow() , max() , min() , log() , log10() , sin() , cos() ...
        // these methods are called by prefacing them with math dot(.) operator
        
        // Math class contains two constants
        // Math.E --> 2.7182818  , Math.PI --> 3.1415926

        System.out.println(Math.E); // exponential value
        System.out.println(Math.PI); // Pi value
        
        System.out.println(Math.sqrt(25)); // sqrt(value) -> returns the squareroot of a number as its return type double value
        int x = (int)Math.sqrt(10);
        double y = Math.sqrt(10);
        System.out.println(x);
        System.out.println(y + "\n");

        System.out.println(Math.pow(2 , 5)); // pow(base , exponent) --> it returns the base to exponent power
        x = (int)Math.pow(10 , 20);
        System.out.println(x);
        y = Math.pow(9 , 2);
        System.out.println(y + "\n");

        System.out.println(Math.abs(-123)); // abs(value) --> returns abosolute(+ve) value
        x = Math.abs(-129);
        System.out.println(x);
        y = Math.abs(-123.99);
        System.out.println(y + "\n");

        System.out.println(Math.ceil(123/7.0)); // ceil(value) --> it rounds the number to upperbound ->returns double value
        x = (int)Math.ceil(103/2.0);
        System.out.println(x);
        y = Math.ceil(121/2.0);
        System.out.println(y + "\n");

        System.out.println(Math.floor(123/7.0)); // floor(value) --> it rounds the number to lowerbound ->returns double value
        x = (int)Math.floor(103/2.0);
        System.out.println(x);
        y = Math.floor(121/2.0);
        System.out.println(y + "\n");

        System.out.println(Math.round(10.8)); // round(val) --> rounds to nearest whole number and it's return type is int
        
        System.out.println(Math.min(10 , 20)); // min(val1 , val2) --> returns min value
        System.out.println(Math.max(23 , 10)); // max(val1 , val2) --> returns max value

        System.out.println(Math.log(10)); // log(val) --> returns the "logarithm base e" value and it's returntype is double
        System.out.println(Math.log10(10)); // log10(val) --> returns the "logarithm base 10 " value and it's returntype is double

        System.out.println(Math.random()); // random() -> random double value between the 0 and 1
        System.out.println(Math.sin(120));
        System.out.println(Math.cos(0)); //cos() , sin() --> returns the cosine and sine value in radians

    }

    
}
