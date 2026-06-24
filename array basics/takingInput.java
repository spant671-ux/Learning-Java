import java.util.Scanner;

public class takingInput {
    static void main(){
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        int n = arr.length;
        //input
        for(int i=0; i<=n-1; i++){
            System.out.println("Provide value for index: "+i);
            arr[i] = sc.nextInt();
        }

        //print
        System.out.println("Your array contains: ");
        for(int val: arr){
            System.out.println(val);
        }
    }
}