public class IntToStringConversion {
    public static void main(String[] args) {
        // Integer class contains some methods
        // which will help us convert numbers into string and strings into numbers
        // Integer class presents in java.lang package 
        String str  = "123";
        // Integer.parseInt(); -> Takes a string and returns it's integer representation in Base-10 (Decimal System)
        int num = Integer.parseInt(str);
        System.out.println(num+num);
        String binaryStr = "1010";
        int num1 = Integer.parseInt(binaryStr , 2); // convert binary to decimal
        System.out.println(num1);
        String octalStr = "70123";
        int num2 = Integer.parseInt(octalStr , 8); // convert octal to decimal
        System.out.println(num2);
        String hexaStr = "123e";
        int num3 = Integer.parseInt(hexaStr , 16); // convert hexadecimal to decimal
        System.out.println(num3);

        // integer to string convertion
        // toString() is used to convert a number into a string 
        int i = 123;
        // Integer.toString(); --> Takes a integer and converts into String
        String str1 = Integer.toString(i);
        System.out.println(str1+str1);
        int x = 891;
        String binaryString = Integer.toString(x,2); // convert decimal to binary number as a string
        System.out.println(binaryString); 
        int y = 981;
        String octalString = Integer.toString(y , 8); // Convert decimal to Octal as a string
        System.out.println(octalString);
        int z = 189;
        String hexaString = Integer.toString(z , 16); // Convert decimal to hexadecimal as a string
        String hexaString2 = Integer.toHexString(z);  // Integer.toHexString() --> base-16
        System.out.println(hexaString + "\n" + hexaString2);
        // Integer.toHexString() --> base-16
        // Integer.toBinaryString(i) --> base-2
        // Integer.toOctalString() --> base-8


    }
    
}
