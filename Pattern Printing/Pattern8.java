public class Pattern8{
    static void main(){

        int n =4; // Number of rows for the hollow rectangle pattern

        // Outer loop controls the number of rows
        for (int row =1; row <=n; row++){

            // Inner loop controls the columns (fixed at 6 columns)
            for (int col =1; col <=6; col++){
                
                // If it's the first or last row, print a solid line of stars
                if(row==1 || row == n){
                    System.out.print("* ");
                }
                else{
                    // For middle rows, print stars only at the first and last columns
                    if(col==1){
                        System.out.print("* ");
                    }
                    else if (col==6){
                        System.out.print("* ");
                    }
                    else{
                        // Print spaces for the hollow inside
                        System.out.print("  ");
                    }
                }
            }
            
            // Move to the next line after completing the current row
            System.out.println();
        }
    }
}