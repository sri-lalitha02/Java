

public class Datatypes {
    public static void main(String[] args) {
        // primitive Datatypes
        // 1. byte 2 . short , 3. int , 4. long -->Integer type
        byte b1 = 127; // max value
        byte b2 = -128; // min value
        System.out.println(b1 + b2);
        short s1 = 32767;
        short s2 = -32768;
        System.out.println(s1 + s2);
        int i1 = 2147483647;
        int i2 = -2147483648;
        System.out.println(i1 + i2);
        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;
        System.out.println(l2 + l1);
        // 5. float , 6. double --> decimal type
        float f1 = 3.4028235E38f;
        System.out.println(f1);   
        double d1 = 1.7976931348623157E308;
        System.out.println(d1);
        // 7. char ---> character type , 8. boolean --> bool type
        char ch = 'A';
        System.out.println(ch);          
        boolean b = true;
        System.out.println(b);   


        
    }
    
}
