/**
 * Pattern 10: Hollow Pyramid (Equilateral Triangle)
 * 
 * Example Output (for n = 5):
 *         * 
 *       *   * 
 *     *       * 
 *   *           * 
 *  * * * * * * * *
 */
public class Pattern10 {
     static void main() {
        int n = 5; // Number of rows
        
        // Outer loop for each row
        for (int row = 1; row <= n; row++) {
            
            // Inner loop 1: Print leading spaces to create the pyramid shape
            for (int col = 1; col <= (n - row); col++) {
                System.out.print("  ");
            }
            
            // Check if it's the first row or the last row
            if (row == 1 || row == n) {
                // Inner loop 2: Print stars for the top vertex and the entire bottom base
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                // For intermediate rows, print the hollow part
                
                // Print the left border star
                System.out.print("* ");
                
                // Inner loop 3: Print spaces inside the hollow triangle
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                
                // Print the right border star
                System.out.print("* ");
            }
            
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
*/jbubuuv*/