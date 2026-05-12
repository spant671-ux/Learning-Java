// DoWhileLoop.java — The do-while Loop in Java
//
// A do-while loop executes its body AT LEAST ONCE before checking the condition.
// This is different from a regular while loop, which checks the condition first.
//
// Syntax:
//   do {
//       // code runs first, then condition is checked
//   } while (condition);
//
// Use when the loop body must run at least once (e.g., menus, input validation).

public class DoWhileLoop{
    static void main() {

        // ─── Example: Revision rounds ───────────────────────────────────
        // Prints revision rounds 1 through 3.
        // The body executes first, then checks if revisionRound <= 3.

        int revisionRound = 1;              // Start at round 1

        do {
            System.out.println("Revision Round: "+ revisionRound);  // Print current round
            revisionRound++;                // Move to the next round
        }while(revisionRound<=3);           // Continue while round is 3 or less
    }
}