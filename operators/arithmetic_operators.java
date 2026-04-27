/**
 * arithmetic_operators.java - Arithmetic Operators in Java
 * 
 * Arithmetic operators perform basic mathematical operations:
 * 
 *   +   Addition         → adds two operands
 *   -   Subtraction      → subtracts right operand from left
 *   *   Multiplication   → multiplies two operands
 *   /   Division         → divides left by right (integer division truncates)
 *   %   Modulus          → returns the remainder after division
 * 
 * Note: When both operands are int, the result is also int.
 *       For example, 25 / 7 = 3 (not 3.57), because the decimal part is truncated.
 */
public class arithmetic_operators {
    public static void main(String[] args) {

        // Sample data: problems solved in a coding challenge
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        // Addition (+): total problems solved across two weeks
        int total = solvedThisWeek + solvedLastWeek;           // 25 + 15 = 40

        // Subtraction (-): how many more problems were solved this week
        int difference = solvedThisWeek - solvedLastWeek;      // 25 - 15 = 10

        // Multiplication (*): projected problems in 4 weeks at this pace
        int projected = solvedThisWeek * 4;                    // 25 * 4 = 100

        // Division (/): average problems per day (integer division, truncates decimal)
        int average = solvedThisWeek / 7;                      // 25 / 7 = 3

        // Modulus (%): leftover problems after distributing evenly across 7 days
        int remainder = solvedThisWeek % 7;                    // 25 % 7 = 4

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);
    }
}