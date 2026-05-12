import java.util.Scanner;
public class PracticeLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
         * Practice 1: Print the number 1.
         * A simple for loop that runs only once.
         */
//        int i = 1;
//        for(i =1; i<=1; i++){
//            System.out.println(i);
//        }

        /* 
         * Practice 2: Print numbers from 10 down to 1.
         * Demonstrates a descending for loop using i--.
         */
//        int i = 10;
//        for (i =10; i>=1; i--){
//            System.out.println(i);
//        }

        /* 
         * Practice 3: Print even numbers from 2 to 10.
         * Increments the loop counter by 2 in each iteration.
         */
//        int i;
//        for (i = 2; i<=10; i +=2){
//            System.out.println(i);
//        }

        /* 
         * Practice 4: Print the multiplication table of 7 (up to 70).
         * Increments the loop counter by 7 in each iteration.
         */
//        int i;
//        for (i =7; i<=70; i+=7){
//            System.out.println(i);
//        }

        /* 
         * Practice 5: A simple menu using a do-while loop.
         * The loop continues to display the menu until the user enters 0.
         */
//        int choice;
//        do{
//            System.out.println("Menu");
//            System.out.println("Option 1");
//            System.out.println("Option 2");
//            System.out.println("Option 3");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//
//        }while(choice != 0);
//        sc.close();

        /* 
         * Practice 6: Calculate the sum of numbers from 1 to n.
         * Uses a do-while loop to add each number 'i' to 'sum'.
         */
//        int n, i= 1, sum = 0;
//        System.out.println("Enter number: ");
//        n = sc.nextInt();
//        do{
//            sum+= i;
//            i++;
//        }while (i<=n);
//        System.out.println("The sum is: "+sum);
//        sc.close();

        /* 
         * Practice 7: Print a square pattern of asterisks.
         * Uses nested for loops to print 'n' rows and 'n' columns.
         */
//       int row,col,n;
//        System.out.println("Enter the size: ");
//        n = sc.nextInt();
//        for (row =1; row<=n; row++){
//            for (col =1; col<=n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* 
         * Practice 8: Print odd numbers from 1 to 20.
         * Increments the loop counter by 2, starting from 1.
         */
//        int i;
//        for(i=1;i <= 20;i=i+2){
//            System.out.println(i);
//        }

        /* 
         * Practice 9: Demonstrate the 'break' statement.
         * Loop runs from 1 to 10 but exits early when 'i' reaches 7.
         */
        int i;
        for(i=1; i<=10;i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        
        // Close the scanner resource to prevent memory leaks
        sc.close();
    }
}
