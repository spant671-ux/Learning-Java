// logical_operators.java — Logical Operators in Java
//
//   &&  AND  → true only if BOTH operands are true
//   ||  OR   → true if at least one operand is true
//   !   NOT  → inverts the boolean value
//
// Both && and || use short-circuit evaluation:
//   && stops if the first operand is false
//   || stops if the first operand is true

public class LogicalOperators {
    public static void main(String[] args) {

        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);   // false — both must be true
        System.out.println(completedDSA || completedCore);   // true  — at least one is true
        System.out.println(!completedCore);                  // true  — inverts false
    }
}