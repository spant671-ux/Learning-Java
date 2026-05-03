import java.math.BigInteger;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for firstnum: ");
        int firstnum = sc.nextInt();
        System.out.print("Enter the value for secondnum: ");
        int secondnum = sc.nextInt();
        int sum = firstnum + secondnum;
        System.out.println("The sum of " + firstnum + " and " + secondnum + " is: " + sum);
        System.out.println("Enter the value for BigInteger: ");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger : " + bg);
        
        System.out.println("Enter the value for Boolean: ");

        boolean flag = sc.nextBoolean();
        System.out.println("Boolean value : " + flag);

        sc.close();
    }
}
