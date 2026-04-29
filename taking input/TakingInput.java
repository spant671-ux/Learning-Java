import java.util.Scanner;

public class takinginput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for firstnum: ");
        int firstnum = sc.nextInt();
        System.out.print("Enter the value for secondnum: ");
        int secondnum = sc.nextInt();
        int sum = firstnum + secondnum;
        System.out.println("The sum of " + firstnum + " and " + secondnum + " is: " + sum);
    }

    
}
