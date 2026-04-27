// datatypes.java — Primitive Data Types in Java
//
// Java has 8 primitive types:
//   Integer  →  byte (1B), short (2B), int (4B), long (8B)
//   Decimal  →  float (4B, suffix 'f'), double (8B, default)
//   Other    →  boolean (true/false), char (single character)

public class datatypes {
    static void main() {

        // --- Integer types ---

        byte num1 = 100;           // range: -128 to 127
        short num2 = 1000;         // range: -32,768 to 32,767
        long num3 = 100000;        // range: -2^63 to 2^63-1
        int num4 = 83293;          // most commonly used integer type

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // --- Floating-point types ---

        float num5 = 3.14f;       // single-precision, requires 'f' suffix
        double num6 = 3.1415926535897932384626433832795;  // double-precision (~15-16 digits)

        System.out.println(num5);
        System.out.println(num6);

        // --- Boolean and char ---

        boolean eligibleToVote = true;
        System.out.println("Am I eligible to vote? " + eligibleToVote);

        char firstCharacter = 'A';
        System.out.println("My First Character is: " + firstCharacter);

        // chars are stored as Unicode integers (A = 65), so arithmetic works
        System.out.println("My First Character is: " + (char)(firstCharacter + 2));
    }
}
