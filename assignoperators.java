public class assignoperators {
    public static void main(String[] args) {

        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30

        System.out.println(ratingPoints);
    }
}