public class WhileLoop {
    public static void main(String[] args){
        
        /*
         * Example: A basic while loop.
         * The loop continues to execute as long as the condition (i <= 10) is true.
         */
        int i = 1; // Initialization: Set the starting value
        
        while (i <= 10){ // Condition: Check if the value is 10 or less
            System.out.println(i); // Action: Print the current value
            i++; // Update: Increment 'i' by 1 to eventually terminate the loop
        }
    }
}