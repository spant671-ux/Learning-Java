// bitwise_operators.java — Bitwise Operators in Java
//
//   &   AND          → 1 only if both bits are 1
//   |   OR           → 1 if either bit is 1
//   ^   XOR          → 1 if bits are different
//   ~   NOT          → flips all bits
//   <<  Left shift   → multiply by 2^n
//   >>  Right shift  → divide by 2^n

public class BitwiseOperators {
    public static void main(String[] args) {

        int x = 6;   // binary: 0110
        int y = 3;   // binary: 0011

        System.out.println(x & y);    // AND  → 0010 → 2
        System.out.println(x | y);    // OR   → 0111 → 7
        System.out.println(x ^ y);    // XOR  → 0101 → 5
        System.out.println(~x);       // NOT  → -(x+1) → -7

        System.out.println(x << 1);   // left shift  → 1100 → 12
        System.out.println(x >> 1);   // right shift → 0011 → 3
    }
}