public class array2d{
    static void main(){

        //declaration
        int[][] arr;
        //allocation
        arr= new int[3][4];
        //init
        int[][]brr= {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        //System.out.println(brr[3][0]);

        int rowLength= brr.length;
        int colLength= brr[0].length;
        for(int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++){
            for (int colIndex = 0; colIndex <= colLength-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }
}