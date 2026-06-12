/**
 * Pattern 11: Diamond Pattern
 *
 * Prints a complete diamond pattern using stars.
 * The pattern is divided into a regular pyramid (upper half)
 * and an inverted pyramid (lower half).
 *
 * Example Output (for n = 4):
 *        * 
 *      * * * 
 *    * * * * * 
 *  * * * * * * * 
 *    * * * * * 
 *      * * * 
 *        * 
 */
public class Pattern11 {
    static void main() {
        int n = 4; // Number of rows for the upper half
        
        // Outer loop for the upper half (pyramid pattern)
        for (int row = 1; row <= n; row++) {
            
            // Inner loop 1: Print leading spaces to create the pyramid shape
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            
            // Inner loop 2: Print stars for the current row
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
        
        // Outer loop for the lower half (inverted pyramid pattern)
        for (int row = 1; row <= n; row++) {
            
            // Skip the first row of the inverted loop to avoid duplicating the widest line
            if (row == 1) {
                continue;
            }
            
            // Inner loop 1: Print leading spaces for alignment
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            
            // Inner loop 2: Print stars for the current row of the inverted pyramid
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}