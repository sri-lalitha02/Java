import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        // Creating an object for random class
        Random rnd = new Random();
        // For boolean --> gives either true or false
        boolean boolVal = rnd.nextBoolean();
        System.out.println(boolVal);
        // For integer --> gives the integer value between the Integer.MIN_VALUE and Integer.MAX_VALUE
        int intVal = rnd.nextInt();
        System.out.println(intVal);
        // For long --> gives the long value between the Long.MIN_VALUE and Long.MAX_VALUE
        long longVal = rnd.nextLong();
        System.out.println(longVal);
        // For float  , double --> gives the decimal number between 0.0 (included) and 1.0 (excluded)
        float floatVal = rnd.nextFloat();
        System.out.println(floatVal);
        double doubleVal = rnd.nextDouble();
        System.out.println(doubleVal);

        // Sometimes , we need to restrict the range of numbers that can be generated
        // Syntax = rnd.nextInt(max_value + 1); --> the numbers from 0 - max_value are obtained
        int randNum = rnd.nextInt(21); // obtains 0 - 20
        System.out.println(randNum);

        // if the range starts with 1 --> then add 1 to the result of the nextInt() method
        int randNum2 = rnd.nextInt(100)+1;
        System.out.println(randNum2);

        // If the range starts from a higher number than 1:
        //     −Subtract the starting number from the upper-limit number and then add 1
        //     −Add the starting number to the result of the nextInt() method
        int randNum3 = rnd.nextInt(51) + 50; // 50 to 100 
        System.out.println(randNum3); 

        // In the above we notice that the random number sequence is different for each time
        // sometimes , we need to generate same random number sequence every time

        // When you create an instance of the Random class, pass a constant integer to specify the seed
        // seed is nothing but constant value
        Random random = new Random(20L);

        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        random.setSeed(5L);
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        random.setSeed(22L);
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));
        System.out.println(random.nextInt(22));

    }
}
