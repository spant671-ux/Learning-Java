// ifconditional.java — The if Statement in Java
//
// The 'if' statement executes a block of code ONLY when its condition is true.
// If the condition is false, the block is simply skipped — nothing happens.
//
// Syntax:
//   if (condition) {
//       // code runs only when condition is true
//   }
//
// The condition inside the parentheses must evaluate to a boolean (true/false).

public class ifconditional {

    static void main() {

        // ─── Example 1: Daily practice check ───────────────────────────

        int dailyPractice = 12;

        // Checks if dailyPractice is 10 or more
        // 12 >= 10 is true → the block EXECUTES
        if (dailyPractice >= 10) {
            System.out.println("Good Conistency");
        }

        // ─── Example 2: Voting eligibility ─────────────────────────────

        int age = 10;

        // Checks if age is 18 or more
        // 10 >= 18 is false → the block is SKIPPED, nothing prints
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
    }
}
