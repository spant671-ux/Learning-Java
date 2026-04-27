/**
 * relational_operators.java - Relational (Comparison) Operators in Java
 * 
 * Relational operators compare two values and return a boolean result (true/false).
 * They are commonly used in conditions (if-else, loops).
 * 
 *   ==   Equal to                → true if both values are the same
 *   !=   Not equal to            → true if values are different
 *   >    Greater than            → true if left is larger than right
 *   <    Less than               → true if left is smaller than right
 *   >=   Greater than or equal   → true if left is larger or equal
 *   <=   Less than or equal      → true if left is smaller or equal
 * 
 * Note: == compares values for primitives. For objects (e.g., Strings),
 *       use .equals() instead to compare content.
 */
public class relational_operators {
    public static void main(String[] args) {

        // Scenario: tracking a coding streak vs. a target goal
        int currentStreak = 45;
        int targetStreak = 50;

        // Equal to (==): is currentStreak exactly equal to targetStreak?
        System.out.println(currentStreak == targetStreak);   // false (45 ≠ 50)

        // Not equal to (!=): are they different?
        System.out.println(currentStreak != targetStreak);   // true  (45 ≠ 50)

        // Greater than (>): is currentStreak more than targetStreak?
        System.out.println(currentStreak > targetStreak);    // false (45 < 50)

        // Less than (<): is currentStreak less than targetStreak?
        System.out.println(currentStreak < targetStreak);    // true  (45 < 50)

        // Greater than or equal to (>=): has the target been met or exceeded?
        System.out.println(currentStreak >= targetStreak);   // false (45 < 50)

        // Less than or equal to (<=): is currentStreak at most targetStreak?
        System.out.println(currentStreak <= targetStreak);   // true  (45 ≤ 50)
    }
}