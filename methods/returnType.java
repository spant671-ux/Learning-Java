public class returnType{
    static void printMultiplication(int a, int b){
        int ans = (a*b);
        System.out.println("Result: "+ans);
    }
    static int add(int p, int q){
        int sum = p+q;
        return sum;
    }
    static void main(){
        int result = add(5,10);
        System.out.println("Result: "+result);;
        }
    }
