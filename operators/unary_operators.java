/**
 * unary_operators.java - Unary Operators in Java
 * 
 * Unary operators work with a SINGLE operand (unlike binary operators
 * that need two). This file focuses on the increment (++) operator.
 * 
 * INCREMENT (++):
 *   ++x  (Prefix)  → increments FIRST, then returns the new value
 *   x++  (Postfix) → returns the current value FIRST, then increments
 * 
 * DECREMENT (--):
 *   --x  (Prefix)  → decrements first, then returns the new value
 *   x--  (Postfix) → returns the current value first, then decrements
 *   (not demonstrated here, but works the same way as ++)
 * 
 * Other unary operators (not shown here):
 *   +    Unary plus      → indicates positive value (rarely used)
 *   -    Unary minus     → negates an expression
 *   !    Logical NOT     → inverts a boolean (covered in logical_operators.java)
 *   ~    Bitwise NOT     → flips all bits (covered in bitwise_operators.java)
 */
public class unary_operators {
    public static void main(String[] args) {

        // Starting value: 100 active users
        int activeUsers = 100;

        // PREFIX (++activeUsers):
        // Step 1: activeUsers is incremented from 100 → 101
        // Step 2: the NEW value (101) is assigned to 'prefix'
        int prefix = ++activeUsers;     // activeUsers = 101, prefix = 101

        // POSTFIX (activeUsers++):
        // Step 1: the CURRENT value (101) is assigned to 'postfix'
        // Step 2: activeUsers is then incremented from 101 → 102
        int postfix = activeUsers++;    // postfix = 101, activeUsers = 102

        System.out.println(prefix);       // Output: 101
        System.out.println(postfix);      // Output: 101
        System.out.println(activeUsers);  // Output: 102
    }
}