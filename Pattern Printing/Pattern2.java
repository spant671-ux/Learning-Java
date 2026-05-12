// Pattern2.java — Fixed-Size Rectangle Pattern
//
// Prints a 3×5 rectangle of stars (3 rows, 5 columns).
//
// Output (n = 3, columns = 5):
//   * * * * *
//   * * * * *
//   * * * * *
//
// How it works:
//   - Outer loop (i) controls the rows → runs n times (3)
//   - Inner loop (j) controls the columns → prints 5 stars per row
//   - Unlike Pattern1, row count and column count are different

public class Pattern2 {
    static void main() {
        int i, j;
        int n = 3; // number of rows

        // Outer loop: iterate through each row
        for (i = 1; i <= n; i++) {
            // Inner loop: print 5 stars in every row (fixed column count)
            for (j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row

        }
    }
    
}