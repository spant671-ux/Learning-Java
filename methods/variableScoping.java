public class variableScoping {
    static int value = 1;
    static void printMultiples(){
        int value= 20;
        for(int i=1; i<=10; i++){
            System.out.println(20*i);
        }
    }

    static void main(){
        System.out.println(value);
    }
}