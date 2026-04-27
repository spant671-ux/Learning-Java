/**
 * logical_operators.java - Logical Operators in Java
 * 
 * Logical operators are used to combine or invert boolean expressions.
 * They are essential for building complex conditions in if-statements and loops.
 * 
 *   &&   Logical AND  → true only if BOTH operands are true
 *   ||   Logical OR   → true if AT LEAST ONE operand is true
 *   !    Logical NOT   → inverts the boolean value (true→false, false→true)
 * 
 * Short-circuit evaluation:
 *   - && stops evaluating if the first operand is false (result is already false)
 *   - || stops evaluating if the first operand is true (result is already true)
 */
public class logical_operators {
    public static void main(String[] args) {

        // Scenario: checking if a student is ready for placements
        boolean completedDSA = true;
        boolean completedCore = false;

        // AND (&&): true only if BOTH conditions are met
        // true && false → false (needs both skills for placement)
        System.out.println(completedDSA && completedCore);

        // OR (||): true if at least one condition is met
        // true || false → true (has at least one skill)
        System.out.println(completedDSA || completedCore);

        // NOT (!): inverts the value
        // !false → true (completedCore was false, so NOT makes it true)
        System.out.println(!completedCore);
    }
}