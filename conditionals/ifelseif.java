// ifelseif.java — The if-else if-else Ladder in Java
//
// An 'if-else if-else' ladder checks multiple conditions in order.
// Java evaluates each condition from top to bottom:
//   - The FIRST condition that is true → its block runs, and the rest are skipped.
//   - If NO condition is true → the 'else' block runs (acts as a default/fallback).
//
// Syntax:
//   if (condition1) {
//       // runs if condition1 is true
//   } else if (condition2) {
//       // runs if condition1 is false AND condition2 is true
//   } else {
//       // runs if ALL conditions above are false (default case)
//   }
//
// Important: Order matters! Place stricter conditions first
// (e.g., >=90 before >=75), otherwise a broader check will catch values early.

public class ifelseif {

    public static void main(String[] args) {

        // ─── Example: Accuracy grading system ──────────────────────────

        int accuracy = 78;

        // Evaluates top-to-bottom, stops at the FIRST true condition:
        //   Check 1: 78 >= 90? → false → skip
        //   Check 2: 78 >= 75? → true  → prints "Good", skips the rest

        if (accuracy >= 90) {
            System.out.println("Excellent");          // 90 and above
        } else if (accuracy >= 75) {
            System.out.println("Good");               // 75 to 89  ← This runs (78 >= 75)
        } else if (accuracy >= 60) {
            System.out.println("Average");            // 60 to 74
        } else {
            System.out.println("Needs Improvement");  // Below 60
        }
    }
}
