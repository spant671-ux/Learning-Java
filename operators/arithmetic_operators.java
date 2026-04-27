// arithmetic_operators.java — Arithmetic Operators in Java
//
//   +  Addition       |  -  Subtraction    |  *  Multiplication
//   /  Division       |  %  Modulus (remainder)
//
// Note: int / int = int (decimal part is truncated, e.g. 25/7 = 3)

public class arithmetic_operators {
    public static void main(String[] args) {

        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total      = solvedThisWeek + solvedLastWeek;   // 40
        int difference = solvedThisWeek - solvedLastWeek;   // 10
        int projected  = solvedThisWeek * 4;                // 100
        int average    = solvedThisWeek / 7;                // 3  (truncated)
        int remainder  = solvedThisWeek % 7;                // 4

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);
    }
}