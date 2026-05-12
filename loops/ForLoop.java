// forloop.java — The for Loop in Java
//
// The 'for' loop repeats a block of code a fixed number of times.
//
// Syntax:
//   for (initialization; condition; update) {
//       // code to repeat
//   }
//
// Key concepts demonstrated:
//   - Basic counting loop
//   - Step increment (i += 2)
//   - Nested loops (pattern printing, index tracking)
//   - break — exits the loop entirely when a condition is met
//   - continue — skips the current iteration and moves to the next

public class ForLoop {

    public static void main(String[] args) {
        //first loop
        // for (int i=1; i <=5; i++){
        //     System.out.println("Value of i: " + i);
        // }
        // for (int i = 1; i <= 10; i += 2) {
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i<=3;i++){
        //     for (int j = 1; j<=3;j++){
        //         System.out.println("i = " +i + " ,j = "+j);
        //     }
        // }

        // for(int i =1; i<=10; i++){
        //     if(i==5){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        for(int i =1; i<=10; i++){
            if(i==5){
                
                continue;
            }
            System.out.println(i);
        }
    }
}