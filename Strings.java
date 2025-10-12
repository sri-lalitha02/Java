import java.util.Scanner;
import java.lang.String;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading String from user --> next() , nextLine() 
        String str = sc.next(); // used to read string upto a space 
        sc.nextLine(); 
        String str1 = sc.nextLine(); // used to read string when a new line encournted
        System.out.println(str);
        System.out.println(str1);

        // String initialization
        // 1. directly assign string literal to string references
        String firstName = "Lalitha";
        // 2.new operator
        String firstName2 = new String("Lalitha");

        // Strings are immutable 
        // means if a string is created it cannot be changed
        String name = "Alice"; // idx's : A - 0 , l - 1 , i - 2 , c - 3 , e - 4
        // access in c,c++,python -->string_name[index] for A = s[0]
        // to access a character from string you need to use charAt() method
        // string_name.charAt(index_value);
        System.out.println(name.charAt(0) + " " + name.charAt(1));
        // length() method is used how many characters are there in the string
        // Syntax : string_name.length();
        int len = name.length();
        System.out.println(len);

        // equals() --> returns boolean value 
        //  if both strings are same it returns true , otherwise it returns false
        // string1.equals(string2)
        String s1 = "AbC" , s2 = "ABC";
        System.out.println(s1.equals(s2));
        // equalsIgnoreCase() --> it returns true irrespective of case i.e it treats lower and upper case as same
        System.out.println(s1.equalsIgnoreCase(s2));

        // compareTo() --> it Compares two strings and returns an integer
        // a negative value if, s1 is less than s2
        // a positive value if, s1 is greater than s2
        // a zero, if s1 == s2
        System.out.println(s1.compareTo(s2));
        // compareToIgnoreCase() --> it compares two strings irrespective of case
        System.out.println(s1.compareToIgnoreCase(s2));

        // contains() --> used to check if a sequence of characters is a part of string
        // Syntax : string_name.contains(word); return boolean value
        String sen =   "Java is a goat programming language";
        String word = "goat";
        char ch = 'g';
        System.out.println(sen.contains(word));
        System.out.println(sen.contains(ch + "")); // for checking character 1st we convert char into string

        // isEmpty() --> check if there are any characters present in the string or not
        // it treat space as a character
        String x = "    ";
        String y = "";
        System.out.println(x.isEmpty());
        System.out.println(y.isEmpty());

        // isBlank() --> check if there are any characters present in the string or not
        // it treat space is not a character
        System.out.println(x.isBlank());
        System.out.println(y.isBlank());
        
        // indexOf() --> used to give the first index of a character or a substring in a string
        // if not exists return -1
        word = "James gosling";
        ch = 'g';
        String word2 = "gosling";
        System.out.println(word.indexOf(ch));
        System.out.println(word.indexOf(word2));
        // stringname.index(char ch  , int beginidx) --> returns the index value of 1st occurence of character in string
        // starts from beginidx yo end of the string
        System.out.println(word.indexOf(ch , 2));
        System.out.println(word.lastIndexOf(ch));
        
        //substring() --> you can extract a substring from a given string
        // Returns the substring from beginidx to the end of the string
        // stringName.substring(int beginidx);
        System.out.println(word.substring(2));
        // StringName.substring(int beginindex , int endindex);
        System.out.println(word.substring(2 , 10));

        // replace() --> This method replaces the all occurences of the  matching characters in a string
        // Syntax : stringname.replace(char oldcharacter , char newcharacter);
        String s1String = "Java Programming";
        System.out.println(s1String.replace('a' , 'A'));
        // replaceFirst() --> this method replaces only first occurence 
        // Syntax : stringName.replaceFirst(String pattern , String replacement);
        System.out.println(s1String.replaceFirst("a", "A"));

        // startsWith() , endsWith()
        // startsWith() --> is used to check the string is startswith the another substring (prefix) or not
        // return type --> boolean
        String rollnum = "24p31a4200";
        if(rollnum.startsWith("24p31a42"))
        {
            System.out.println("Acet Aiml student");
        }
        
        sen = "JavaProgram.pdf";
        if(sen.endsWith(".pdf"))
        {
            System.out.println("The given one is pdf");
        }

        // Mixing Strings and numbers 
        String stri = "Total is :" + 200;
        System.out.println(stri);
        String strii = "Total cost is : " +1 +2 +3;
        System.out.println(strii);
        String striii = "Total is : " + (1+2+3);
        System.out.println(striii);


        

    }
}