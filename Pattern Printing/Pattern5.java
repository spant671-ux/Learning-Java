public class Pattern5{
    static void main(){
        int n = 5; // Number of rows for the inverted pattern
        
        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++){
            
            // Inner loop controls the columns. 
            // For row 1, we need 5 stars (5 - 1 + 1 = 5)
            // For row 2, we need 4 stars (5 - 2 + 1 = 4), and so on.
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            
            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}