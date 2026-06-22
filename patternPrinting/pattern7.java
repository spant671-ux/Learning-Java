/**
 * Pattern 7: Inverted Pyramid Pattern
 * 
 * Example Output (for n = 4):
 *  * * * * * * 
 *   * * * * * 
 *     * * * 
 *       * 
 */
public class pattern7{
    static void main(){
        int n=4; // Number of rows for the inverted pyramid pattern

        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++){
            
            // First inner loop: Prints the leading spaces
            // We need increasing spaces as we go down (row - 1)
            for (int col =1; col <=row-1; col++){
                System.out.print("  ");
            }
            
            // Second inner loop: Prints the stars
            // We need a decreasing odd number of stars per row
            // Formula for decreasing odd numbers is (2 * n - 2 * row + 1)
            for (int col =1; col <= 2*n-2*row+1; col++ ){
                System.out.print("* ");
            }
            
            // Move to the next line after printing spaces and stars for the current row
            System.out.println();
        }
    }
}