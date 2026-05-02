// nestedifelse.java — Nested if-else Statements in Java
//
// A nested if-else places one if-else block INSIDE another.
// This is used when a decision depends on a PRIOR decision.
//
// Structure:
//   if (outerCondition) {
//       if (innerCondition) {
//           // both outer AND inner are true
//       } else {
//           // outer is true, but inner is false
//       }
//   } else {
//       // outer is false — inner check never runs
//   }
//
// Tip: Too many nesting levels make code hard to read.
//      Consider refactoring deeply nested logic into separate methods.

public class nestedifelse {

    static void main() {

        // ─── Example: Subscription + problem count check ───────────────

        boolean hasSubscription = true;
        int solvedProblems = 220;

        // OUTER if: does the user have a subscription?
        // hasSubscription is true → enter this block
        if (hasSubscription) {

            // INNER if: has the user solved 200+ problems?
            // 220 >= 200 is true → this block runs
            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet.");   // Prints (both conditions true)
            } else {
                System.out.println("Practice more problems.");  // Would run if solved < 200
            }

        } else {
            // Runs if hasSubscription is false
            // The inner if-else is never reached
            System.out.println("Upgrade to Premium");
        }
    }
}
