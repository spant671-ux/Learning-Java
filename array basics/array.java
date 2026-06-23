public class array{
    static void main(){

        //declaration
        int arr[];

        //allocation
        arr= new int[5];

        //init
         int brr[] = {10, 20, 30};
         int n=brr.length;
//        System.out.println("Value at '0' index: "+brr[0]);
//        System.out.println("Value at '1' index: "+brr[1]);
//        System.out.println("Value at '2' index: "+brr[2]);
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }
        for(int val: brr){
            System.out.println(val);
        }

    }
}