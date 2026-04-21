public class operators {
    static void main() {
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int totalSolved = solvedThisWeek + solvedLastWeek;
        int totalDifference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek*4;
        int average = totalSolved/7;
        int remainder = totalSolved %7;

        System.out.println(totalSolved);
        System.out.println(totalDifference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

    }
}
