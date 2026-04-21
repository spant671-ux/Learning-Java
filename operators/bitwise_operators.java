public class bitwise_operators {
    public static void main(String[] args) {

        int x = 6;  // 00000110
        int y = 3;  // 00000011

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(x >> 1);
    }
}