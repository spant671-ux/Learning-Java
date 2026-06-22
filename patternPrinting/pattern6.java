/**
 * Pattern 6: Pyramid Pattern
 * 
 * Example Output (for n = 5):
 *         * 
 *       * * * 
 *     * * * * * 
 *   * * * * * * * 
 *  * * * * * * * * 
 */
public class pattern6 {
    static void main(){
        int n = 5; // Number of rows for the pyramid pattern
        
        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++){
            
            // First inner loop: Prints the leading spaces
            // We need decreasing spaces as we go down (n - row)
            for (int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
            
            // Second inner loop: Prints the stars
            // We need an odd number of stars per row: 1, 3, 5, 7...
            // Formula for odd numbers is (2 * row - 1)
            for (int col = 1; col <= 2 * row - 1; col++){
                System.out.print("* ");
            }
            
            // Move to the next line after printing spaces and stars for the current row
            System.out.println();
        }
    }
}