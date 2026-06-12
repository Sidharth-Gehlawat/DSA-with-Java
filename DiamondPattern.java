import java.io.*;
public class DiamondPattern {

    // Main driver method
    public static void main(String[] args)
    {
       
        int number = 7;

        
        int m = 1;

        // Columnar printing
        int n;

        // Outer loop 1
        // Prints the first half diamond
        do {
            n = 1;

            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");

            }

            // Condition for inside do-while loop 1
            while (++n <= number - m + 1);

            // Now
            n = 1;

            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false

            do {

                // Print star
                System.out.print("*");
            }

            // Condition for inner do-while loop 2
            while (++n <= m * 2 - 1);

            // A new row requires a new line
            System.out.println();

        }

        while (++m <= number);

        m = number - 1;

        // Outer loop 2
        // Prints the second half diamond
        do {
            n = 1;

            do {
                System.out.print(" ");

            } while (++n <= number - m + 1);

            n = 1;

         
            do {
               
                System.out.print("*");

            } while (++n <= m * 2 - 1);

         
            System.out.println();

        }

        
        while (--m > 0);
    }
}
