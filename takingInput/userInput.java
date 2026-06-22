// UserInput.java — Reading User Input with the Scanner Class in Java
//
// The Scanner class (java.util.Scanner) reads input from the console (System.in).
//
// Common Scanner methods:
//   nextInt()        → reads an int
//   nextDouble()     → reads a double
//   nextLine()       → reads a full line (String)
//   nextBoolean()    → reads a boolean (true/false)
//   nextBigInteger() → reads an arbitrarily large integer
//
// Always close the Scanner when done to release the underlying resource.

import java.math.BigInteger;   // Supports integers larger than long can hold
import java.util.Scanner;      // Provides methods to read console input

public class userInput {
    public static void main(String[] args) {

        // Create a Scanner object to read from standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // ─── Example 1: Reading two ints and computing their sum ────────

        System.out.print("Enter the value for firstnum: ");
        int firstnum = sc.nextInt();                        // Read the first integer

        System.out.print("Enter the value for secondnum: ");
        int secondnum = sc.nextInt();                       // Read the second integer

        int sum = firstnum + secondnum;                     // Calculate the sum
        System.out.println("The sum of " + firstnum + " and " + secondnum + " is: " + sum);

        // ─── Example 2: Reading a BigInteger ────────────────────────────
        // BigInteger can handle values far beyond int/long range (e.g., 100-digit numbers)

        System.out.println("Enter the value for BigInteger: ");
        BigInteger bg = sc.nextBigInteger();                // Read a large integer
        System.out.println("BigInteger : " + bg);

        // ─── Example 3: Reading a boolean ───────────────────────────────
        // Expects the literal text "true" or "false" from the user

        System.out.println("Enter the value for Boolean: ");
        boolean flag = sc.nextBoolean();                    // Read a boolean value
        System.out.println("Boolean value : " + flag);

        // Close the scanner to release System.in and prevent resource leaks
        sc.close();
    }
}
