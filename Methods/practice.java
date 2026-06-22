public class practice {

    public static void printWelcome() {
        System.out.println("Welcome");
    }

    static void printSum(int a, int b){
        int sum = a+b;
        System.out.println("sum: "+ sum);
    }

    static boolean isEven(int number){
        return number %2 == 0;
    }

    static int getMaximum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static double calculatePercentage(int obtained, int total) {
        return (obtained * 100.0) / total;
    }

    static void display(int number) {
        System.out.println("Number: " + number);
    }

    static void display(String text) {
        System.out.println("Text: " + text);
    }

    static void updateValue(int x) {
        x = x + 10;
        System.out.println("Inside updateValue: " + x);
    }

    public static void main(String[] args) {
        printWelcome();
        printSum(1,3);
        System.out.println(isEven(2));
        System.out.println(getMaximum(10, 20));
        System.out.println(calculatePercentage(445, 500));
        display(2);
        display("hello");

        int num = 5;
        System.out.println("Before method call: " + num);
        updateValue(num);
        System.out.println("After method call: " + num);
    }
}