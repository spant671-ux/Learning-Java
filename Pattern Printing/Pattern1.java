// Pattern1.java — Solid Rectangle (Square) Pattern
//
// Prints an 8×8 grid of stars using nested for loops.
//
// Output (n = 8):
//   * * * * * * * *
//   * * * * * * * *
//   ...             (8 rows total)
//
// How it works:
//   - Outer loop (i) controls the rows → runs n times
//   - Inner loop (j) controls the columns → prints n stars per row
//   - System.out.println() after the inner loop moves to the next line

public class Pattern1 {
    public static void main(String[] args) {
        int i, j;
        int n = 8; // size of the square grid

        // Outer loop: iterate through each row
        for (i = 1; i <= n; i++) {
            // Inner loop: print n stars in the current row
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row
        }
    }
}