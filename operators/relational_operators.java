// relational_operators.java — Relational (Comparison) Operators in Java
//
//   ==  Equal to          |  !=  Not equal to
//   >   Greater than      |  <   Less than
//   >=  Greater or equal  |  <=  Less or equal
//
// Returns boolean (true/false). For objects, use .equals() instead of ==.

public class relational_operators {
    public static void main(String[] args) {

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);   // false
        System.out.println(currentStreak != targetStreak);   // true
        System.out.println(currentStreak > targetStreak);    // false
        System.out.println(currentStreak < targetStreak);    // true
        System.out.println(currentStreak >= targetStreak);   // false
        System.out.println(currentStreak <= targetStreak);   // true
    }
}