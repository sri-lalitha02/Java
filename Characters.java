public class Characters {
    public static void main(String[] args) {
        // Characters are associated with number ASCII char set
        // UNICODE - 0 - 65535(2^16 - 1) 
        // size of char in Java --> 2 bytes
        // a - z --> 97-122
        // A - Z --> 65-90
        // 0 - 9 --> 48-57
        // space --> 32
        char ch1 = 'a';
        char ch2 = 'b';
        // Comparing characters
        if(ch1 > ch2) System.out.println("yes");
        else System.out.println("No");

        // Type casting 
        System.out.println((int)ch1); // gives ASCII value of characters
        int x = 99;
        System.out.println((char)x); 

        // Arthemetic operators
        System.out.println(ch1*ch2); // it take ASCII values
        System.out.println(ch1 + ch2 );
        System.out.println(ch1 - ch2);

    }
    
}
