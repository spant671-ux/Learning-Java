/**
 * datatypes.java - Primitive Data Types in Java
 * 
 * Java has 8 primitive data types. This file demonstrates the most commonly used ones:
 * 
 * INTEGER TYPES (whole numbers):
 *   - byte   : 1 byte  (-128 to 127)
 *   - short  : 2 bytes (-32,768 to 32,767)
 *   - int    : 4 bytes (-2^31 to 2^31 - 1)         ← most commonly used
 *   - long   : 8 bytes (-2^63 to 2^63 - 1)
 * 
 * FLOATING-POINT TYPES (decimal numbers):
 *   - float  : 4 bytes (~6-7 decimal digits precision)  — requires 'f' suffix
 *   - double : 8 bytes (~15-16 decimal digits precision) ← default for decimals
 * 
 * OTHER TYPES:
 *   - boolean : true or false
 *   - char    : a single 16-bit Unicode character
 */
public class datatypes {
    static void main() {

        // =============================================
        // 1. INTEGER (Numeric) Data Types
        // =============================================

        // byte: smallest integer type, range -128 to 127
        byte num1 = 100;
        System.out.println(num1);

        // short: range -32,768 to 32,767
        short num2 = 1000;

        // long: for very large numbers, range -2^63 to 2^63 - 1
        long num3 = 100000;

        // int: the default and most commonly used integer type
        int num4 = 83293;

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    
        // =============================================
        // 2. FLOATING-POINT Data Types
        // =============================================

        // float: single-precision, must end with 'f' to distinguish from double
        float num5= 3.14f;
        System.out.println(num5);

        // double: double-precision, default type for decimal literals
        // Note: double has ~15-16 digits of precision, so the value stored
        //       may be slightly rounded from the literal written here.
        double num6 = 3.1415926535897932384626433832795;
        System.out.println(num6);

        // =============================================
        // 3. OTHER Data Types — boolean and char
        // =============================================

        // boolean: stores only true or false (used in conditions/logic)
        boolean eligibleToVote = true;
        System.out.println("Am I eligible to vote? " + eligibleToVote);

        // char: stores a single character using single quotes
        char firstCharacter = 'A';
        System.out.println("My First Character is: " + firstCharacter);

        // Characters are internally stored as Unicode integers (A = 65),
        // so arithmetic on a char is possible: 'A' + 2 = 'C' (67)
        System.out.println("My First Character is: " + (char)(firstCharacter+2) );
        

    }
}
