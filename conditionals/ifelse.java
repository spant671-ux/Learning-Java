// ifelse.java — The if-else Statement in Java
//
// The 'if-else' statement provides two paths:
//   - If the condition is true  → the 'if' block runs
//   - If the condition is false → the 'else' block runs
//
// Exactly ONE of the two blocks will always execute — never both, never neither.
//
// Syntax:
//   if (condition) {
//       // runs when condition is true
//   } else {
//       // runs when condition is false
//   }

public class ifelse {

    public static void main(String[] args) {

        // ─── Example: Pass or Fail based on score ──────────────────────

        int score = 42;

        // Checks if score is 50 or above
        // 42 >= 50 is false → 'if' block is skipped, 'else' block runs
        if (score >= 50) {
            System.out.println("Pass");    // Skipped (42 < 50)
        } else {
            System.out.println("Fail");    // Prints — condition was false
        }
    }
}
