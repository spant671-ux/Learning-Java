// assignment_operators.java — Assignment Operators in Java
//
//   =   Assign          |  +=  Add & assign     |  -=  Subtract & assign
//   *=  Multiply & assign  |  /=  Divide & assign  |  %=  Modulus & assign
//
// Shorthand: a += b  is equivalent to  a = a + b  (same pattern for all)

public class AssignmentOperators {
    public static void main(String[] args) {

        int ratingPoints = 100;

        ratingPoints += 20;   // 100 + 20 = 120
        ratingPoints -= 10;   // 120 - 10 = 110
        ratingPoints *= 2;    // 110 *  2 = 220
        ratingPoints /= 4;    // 220 /  4 = 55
        ratingPoints %= 30;   // 55  % 30 = 25

        System.out.println(ratingPoints);  // 25
    }
}