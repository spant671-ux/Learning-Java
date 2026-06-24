public class newd{
    static void main(){
//        int arr[] = {1, 2, 3, 4, 5};
//        int n= arr.length;
//        int sum =0;
//        for(int i=0; i<n; i++){
//            int value = arr[i];
//            sum = sum+value;
//        }
//        System.out.println(sum);

        int arr[] = {2, 3, 10, 20};
        int ans =1;
        int n=arr.length;
        for(int i=0; i<n; i++){
            int value = arr[i];
            ans = value* ans;
        }
        System.out.println(ans);
    }
}