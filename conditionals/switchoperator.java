// switchoperator.java — The switch Statement in Java
//
// The 'switch' statement selects one block of code to execute from many options.
// It compares one variable against multiple constant values (cases).
//
// Syntax:
//   switch (expression) {
//       case value1:
//           // code for value1
//           break;
//       case value2:
//           // code for value2
//           break;
//       default:
//           // code if no case matches (optional, like 'else')
//   }
//
// Key points:
//   - 'break' exits the switch block after a case matches.
//     Without it, execution "falls through" to the next case.
//   - 'default' is optional and acts as a catch-all (like 'else').
//   - Works with: int, char, String, byte, short, and enums.
//   - Does NOT work with: float, double, long, or boolean.

import java.util.Scanner;

public class switchoperator {

    public static void main(String[] args) {

        // ─── Example: Day of the week from user input ──────────────────
        // Prompt the user
        System.out.println("Enter the day number (1-7): ");

        // Scanner reads input from the console (System.in)
        Scanner sc = new Scanner(System.in);

        // Read the integer entered by the user
        int day = sc.nextInt();

        // switch: compares 'day' against each case value
        // Only the matching case block runs (thanks to 'break')
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;    // Exit switch — prevents fall-through to case 2
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                // Runs if day doesn't match any case (1–6)
                // Covers day = 7 and any invalid input
                System.out.println("Sunday");
                break;
        }
    }
}
