// Pattern4.java — Parallelogram Pattern
//
// Prints a parallelogram (slanted shape) using leading spaces and stars.
// Each row has the same number of stars, but the decreasing spaces
// shift the stars leftward, creating a slanted effect.
//
// Output (n = 5):
//       * * * * *
//      * * * * *
//     * * * * *
//    * * * * *
//   * * * * *
//
// How it works:
//   - Outer loop (i) controls the rows → runs from 1 to n
//   - First inner loop (j) prints (n - i) leading spaces for the slant
//     → Row 1 gets 4 spaces, Row 2 gets 3, ..., Row 5 gets 0
//   - Second inner loop (j) prints n stars in every row
//   - Combining decreasing spaces + fixed stars creates the parallelogram

public class Pattern4 {
    static void main() {
        int i, j;
        int n = 5; // number of rows and columns

        // Outer loop: iterate through each row
        for (i = 1; i <= n; i++) {

            // First inner loop: print leading spaces for right-alignment
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Second inner loop: print n stars in the current row
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row
        }
    }
}