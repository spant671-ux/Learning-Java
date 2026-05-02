
public class nestedifelse {

    static void main() {

        // int age = 12;
        // char gender = 'M';

        // if (gender == 'M') {
        //     System.out.println("You are a Male.");
        //     if (age >= 18) {
        //         System.out.println("You are an Adult Male.");
        //     } else {
        //         System.out.println("You are not an Adult Male.");
        //     }
        // } else {
        //     System.out.println("You are a Female.");
        //     if (age >= 18) {
        //         System.out.println("You are an Adult Female.");
        //     } else {
        //         System.out.println("You are not an Adult Female.");
        //     }
        // }

        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription){
            if (solvedProblems >= 200){
                System.out.println("Unlock Advanced Sheet.");
            }else{
                System.out.println("Practice more problems.");
            }
        } else {
            System.out.println("Upgrade to Premium");
        }
    }
}
    

    
       
        
    
