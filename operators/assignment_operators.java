/**
 * assignment_operators.java - Assignment Operators in Java
 * 
 * Assignment operators combine an arithmetic operation with assignment.
 * They are shorthand for performing an operation and storing the result
 * back into the same variable.
 * 
 *   =    Simple assignment    → assigns right value to left variable
 *   +=   Add and assign       → a += b  is equivalent to  a = a + b
 *   -=   Subtract and assign  → a -= b  is equivalent to  a = a - b
 *   *=   Multiply and assign  → a *= b  is equivalent to  a = a * b
 *   /=   Divide and assign    → a /= b  is equivalent to  a = a / b
 *   %=   Modulus and assign   → a %= b  is equivalent to  a = a % b
 */
public class assignment_operators {
    public static void main(String[] args) {

        // Start with an initial rating of 100 points
        int ratingPoints = 100;

        // Each compound assignment modifies ratingPoints in place:
        ratingPoints += 20;  // ratingPoints = 100 + 20 = 120
        ratingPoints -= 10;  // ratingPoints = 120 - 10 = 110
        ratingPoints *= 2;   // ratingPoints = 110 * 2  = 220
        ratingPoints /= 4;   // ratingPoints = 220 / 4  = 55
        ratingPoints %= 30;  // ratingPoints = 55 % 30  = 25

        // Final result after all compound assignments
        System.out.println(ratingPoints); // Output: 25
    }
}