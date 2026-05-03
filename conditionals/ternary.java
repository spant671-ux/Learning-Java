// ternary.java — The Ternary (Conditional) Operator in Java
//
// The ternary operator is a one-line shorthand for a simple if-else.
// It evaluates a condition and returns one of two values.
//
// Syntax:
//   variable = (condition) ? valueIfTrue : valueIfFalse;
//
// Equivalent if-else:
//   if (condition) {
//       variable = valueIfTrue;
//   } else {
//       variable = valueIfFalse;
//   }
//
// Best used for simple assignments. For complex logic, prefer if-else for readability.

public class ternary {

    public static void main(String[] args) {

        // ─── Example: Streak status check ──────────────────────────────

        int streakDays = 35;

        // Ternary operator breakdown:
        //   Condition:    streakDays >= 30  →  35 >= 30  →  true
        //   If true:      "Active"
        //   If false:     "Inactive"
        // Result: status = "Active"
        String status = (streakDays >= 30) ? "Active" : "Inactive";

        // Print result using string concatenation (+)
        System.out.println("Your status is: " + status);  // Output: Your status is: Active
    }
}
