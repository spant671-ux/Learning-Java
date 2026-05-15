public class Method {
    /**
     * Prints the multiplication table of 2 from 1 to 10.
     */
    static void printTableOf2(){
        for (int i=1; i<=10; i++){
            int ans = 2*i;
            System.out.println("-> " +ans);
        }
    }
    /**
     * Main method to execute the program logic.
     */
    static void main(){
        System.out.println("Hi");
        printTableOf2();
        System.out.println("Bye");

    }
}
