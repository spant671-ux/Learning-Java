// BreakContinue.java — break and continue Statements in Java
//
// These keywords alter the normal flow of a loop:
//   - break    → immediately exits the entire loop
//   - continue → skips the rest of the current iteration and jumps to the next one
//
// Use cases:
//   - break:    stop searching once the answer is found
//   - continue: skip unwanted values without stopping the loop

public class breakContinue {
    void main() {

        // ─── Example 1 (commented out): break statement ─────────────────
        // Loops from 1 to 6, but exits early when testCase reaches 4.
        // Only prints: 1, 2, 3

        // for(int testCase =1; testCase<=6; testCase++){
        // if(testCase==4){
        // break;
        // }
        // System.out.println(testCase);
        // }

        // ─── Example 2: continue statement ──────────────────────────────
        // Loops from 1 to 5, but skips day 3.
        // Prints: 1, 2, 4, 5 (day 3 is skipped, not printed)

        for (int day = 1; day <= 5; day++) {
            if (day == 3) {
                continue; // Skip the rest of this iteration — jump to day++
            }
            System.out.println(day);
        }
    }

}