/**
 * Pattern 12: Hollow Diamond Pattern
 *
 * Prints a hollow diamond pattern using stars.
 * The pattern is divided into an upper half (pyramid shape)
 * and a lower half (inverted pyramid shape) where only the boundary stars are printed.
 *
 * Example Output (for n = 4):
 *        * 
 *      *   * 
 *    *       * 
 *  *           * 
 *    *       * 
 *      *   * 
 *        * 
 */
public class pattern12 {
    static void main() {
        int n = 4; // Number of rows for the upper half

        // Outer loop for the upper half (pyramid pattern)
        for (int row = 1; row <= n; row++) {
            
            // Inner loop 1: Print leading spaces to create the pyramid shape
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            
            // Inner loop 2: Print stars/spaces for the current row
            if (row == 1) {
                // First row has only one star at the peak
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                // Other rows have boundary stars with spaces in between
                System.out.print("* ");
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }

        // Outer loop for the lower half (inverted pyramid pattern)
        for (int row = 1; row <= n - 1; row++) {
            
            // Inner loop 1: Print leading spaces for alignment
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            
            // Inner loop 2: Print stars/spaces for the current row of the inverted pyramid
            if (row == n - 1) {
                // Last row (tip of the bottom) has only one star
                System.out.print("* ");
            } else {
                // Other rows have boundary stars with spaces in between
                System.out.print("* ");
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}