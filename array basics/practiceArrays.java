public class practiceArrays {
    static void main(){

        int arr[] = {3, 2, -5, 21, 10};
        int n= arr.length;
        int maxValue = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > maxValue){
                //update maxValue
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
//        int arr[] = {1, 2, 3, 4, 5};
//        int n= arr.length;
//        int sum =0;
//        for(int i=0; i<n; i++){
//            int value = arr[i];
//            sum = sum+value;
//        }
//        System.out.println(sum);

//        int arr[] = {2, 3, 10, 20};
//        int ans =1;
//        int n=arr.length;
//        for(int i=0; i<n; i++){
//            int value = arr[i];
//            ans = value* ans;
//        }
//        System.out.println(ans);


    }
}