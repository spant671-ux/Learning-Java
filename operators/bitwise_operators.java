/**
 * bitwise_operators.java - Bitwise Operators in Java
 * 
 * Bitwise operators work directly on the binary (bit-level) representation
 * of integer values. They are useful for low-level programming, flags,
 * masks, and performance-critical operations.
 * 
 *   &    AND         → sets bit to 1 only if BOTH corresponding bits are 1
 *   |    OR          → sets bit to 1 if EITHER corresponding bit is 1
 *   ^    XOR         → sets bit to 1 if corresponding bits are DIFFERENT
 *   ~    NOT (complement) → flips all bits (0→1, 1→0)
 *   <<   Left shift  → shifts bits left by n positions (multiplies by 2^n)
 *   >>   Right shift → shifts bits right by n positions (divides by 2^n)
 */
public class bitwise_operators {
    public static void main(String[] args) {

        // Binary representations:
        int x = 6;  // binary: 00000110
        int y = 3;  // binary: 00000011

        // AND (&): 00000110 & 00000011 = 00000010 → 2
        System.out.println(x & y);

        // OR (|): 00000110 | 00000011 = 00000111 → 7
        System.out.println(x | y);

        // XOR (^): 00000110 ^ 00000011 = 00000101 → 5
        System.out.println(x ^ y);

        // NOT (~): flips all bits of x → -(x+1) = -(6+1) = -7
        System.out.println(~x);

        // Left shift (<<): 00000110 << 1 = 00001100 → 12 (6 × 2)
        System.out.println(x << 1);

        // Right shift (>>): 00000110 >> 1 = 00000011 → 3 (6 ÷ 2)
        System.out.println(x >> 1);
    }
}