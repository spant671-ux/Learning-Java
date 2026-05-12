// Pattern3.java — Right-Angled Triangle (Staircase) Pattern
//
// Prints a right-angled triangle where each row has one more star than the previous.
//
// Output (n = 5):
//   *
//   * *
//   * * *
//   * * * *
//   * * * * *
//
// How it works:
//   - Outer loop (i) controls the rows → runs from 1 to n
//   - Inner loop (j) runs from 1 to i → so row 1 gets 1 star, row 2 gets 2, etc.
//   - The key difference from a rectangle: the inner loop's limit is 'i' (not 'n')

public class Pattern3 {

    public static void main(String[] args) {
        int i, j;
        int n = 5; // number of rows (height of the triangle)

        // Outer loop: iterate through each row
        for (i = 1; i <= n; i++) {
            // Inner loop: print 'i' stars — increases with each row
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row
        }

    }
}
