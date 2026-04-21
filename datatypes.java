public class datatypes {
    static void main() {

        //Numeric DT - short, long, int, byte

        byte num1 = 100;
        System.out.println(num1);

        short num2 = 1000;
        long num3 = 100000;
        int num4 = 83293;
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    
        //floating point DT - float, double

        float num5= 3.14f;
        System.out.println(num5);

        double num6 = 3.1415926535897932384626433832795;
        System.out.println(num6);

        //other - char, boolean

        boolean eligibleToVote = true;
        System.out.println("Am I eligible to vote? " + eligibleToVote);

        char firstCharacter = 'A';
        System.out.println("My First Character is: " + firstCharacter);
        System.out.println("My First Character is: " + (char)(firstCharacter+2) );
        
    

    }
}
