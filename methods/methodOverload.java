public class methodOverload {
   static int add(int p, int q){
       int sum = p+q;
       return sum;
   }
   static int add(int p, int q, int r){
       int ans = p+q+r;
       return ans;
   }
   static void main(){
       int ans1= add(1,2);
       int ans2= add(3, 5, 6);
       System.out.println(ans1);
       System.out.println(ans2);
   }
}