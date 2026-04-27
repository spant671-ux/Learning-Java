// unary_operators.java — Unary Operators in Java
//
//   ++x  Prefix increment   → increments first, then returns new value
//   x++  Postfix increment  → returns current value, then increments
//   --x  Prefix decrement   → decrements first, then returns new value
//   x--  Postfix decrement  → returns current value, then decrements
//
// Other unary operators: + (positive), - (negate), ! (logical NOT), ~ (bitwise NOT)

public class unary_operators {
    public static void main(String[] args) {

        int activeUsers = 100;

        // prefix: increment happens BEFORE the value is used
        int prefix = ++activeUsers;     // activeUsers → 101, prefix = 101

        // postfix: increment happens AFTER the value is used
        int postfix = activeUsers++;    // postfix = 101, activeUsers → 102

        System.out.println(prefix);       // 101
        System.out.println(postfix);      // 101
        System.out.println(activeUsers);  // 102
    }
}