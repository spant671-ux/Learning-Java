// NestedLoops.java — Nested Loops in Java
//
// A nested loop is a loop inside another loop.
// The inner loop completes ALL its iterations for EACH single iteration of the outer loop.
//
// How it works:
//   Outer loop (row) runs 3 times  →  row = 1, 2, 3
//     For EACH row, the inner loop (col) runs 3 times  →  col = 1, 2, 3
//   Total iterations = outer × inner = 3 × 3 = 9
//
// Output:
//   * * *
//   * * *
//   * * *

public class NestedLoops {
    public static void main(String[] args) {

        // ─── Example: Print a 3×3 star pattern ──────────────────────────
        // Outer loop controls the rows (vertical)
        for (int row =1; row <=3; row++){

            // Inner loop controls the columns (horizontal)
            // Runs fully (1 to 3) for EACH row
            for (int col =1; col<=3; col++){
                System.out.print("* ");    // Print a star WITHOUT moving to the next line
            }

            System.out.println();          // After each row, move to the next line
        }

    }
}