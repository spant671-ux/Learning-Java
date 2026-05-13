/**
 * Pattern 9: Hollow Right-Angled Triangle Pattern
 * 
 * Prints a staircase pattern with a hollow interior.
 * First two rows and the last row are completely filled with stars.
 * The middle rows only have stars at the boundaries.
 * 
 * Example Output (for n = 5):
 *  * 
 *  * * 
 *  *   * 
 *  *     * 
 *  * * * * * 
 */
public class Pattern9 {
    static void main(){
        int n = 5; // Number of rows for the hollow right-angled triangle

        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++){
            
            // Check if it's the first row, second row, or the last row
            // These rows are fully filled with stars
            if(row == 1 || row == 2 || row == n){
                // Inner loop prints stars equal to the current row number
                for (int col = 1; col <= row; col++){
                    System.out.print("* ");
                }
            }
            else {
                // For middle hollow rows:
                
                // Print the leading star for the left boundary
                System.out.print("* ");

                // Print spaces for the hollow interior
                // We subtract 2 because the first and last columns are stars
                for(int col = 1; col <= (row - 2); col++){
                    System.out.print("  "); // Two spaces align with the two-character "* "
                }
                
                // Print the trailing star for the right boundary (diagonal edge)
                System.out.print("* ");
            }
            
            // Move to the next line after completing the current row
            System.out.println();
        }
    }
}