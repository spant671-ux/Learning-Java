// Pattern8.java - Hollow Rectangle Pattern
//
// Prints a 4x6 rectangle outline with a hollow interior.
// The first and last rows are completely filled with stars.
// The middle rows only have stars at the first and last columns.

public class Pattern8 {
    public static void main(String[] args) {
        int n = 4; // Number of rows for the hollow rectangle pattern

        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++) {

            // Inner loop controls the columns (fixed at 6 columns)
            for (int col = 1; col <= 6; col++) {

                // Check if it's the first or last row
                // These rows form the top and bottom borders
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    // For middle rows, print stars only at the borders
                    if (col == 1) {
                        System.out.print("* "); // Left border
                    } else if (col == 6) {
                        System.out.print("* "); // Right border
                    } else {
                        // Print spaces for the hollow interior
                        // Two spaces are used to align with the two-character "* "
                        System.out.print("  ");
                    }
                }
            }

            // Move to the next line after completing the current row
            System.out.println();
        }
    }
}