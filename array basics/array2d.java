import java.util.Scanner;
public class array2d{
    static void main(){

        int arr[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);
        //input

        for(int i = 0 ; i<=arr.length-1; i++){
            for( int j = 0 ; j<=arr[i].length-1; j++){
                System.out.println("Provide value for row = "+i+ "and value for column = "+j );
                arr[i][j] = sc.nextInt();
            }
        }

        //print

        for(int rowIndex= 0; rowIndex<= arr.length-1; rowIndex++){
           for(int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
               System.out.print(arr[rowIndex][colIndex] + " ") ;
            }
            System.out.println();
        }



//        //declaration
//        int[][] arr;
//        //allocation
//        arr= new int[3][4];
//        //init
//        int[][]brr= {
//                {1,2},
//                {2,3,4,5},
//                {3,4,5,6,7,8},
//                {4}
//        };
        //System.out.println(brr[3][0]);

//        int rowLength= brr.length;
//        //int colLength= brr[0].length;
//        for(int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++){
//            int colLength= brr[rowIndex].length;
//            for (int colIndex = 0; colIndex <= colLength-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //traversal in 2d array
//        for(int rowIndex= 0; rowIndex<= brr.length-1; rowIndex++){
//            for(int colIndex=0; colIndex<=brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ") ;
//            }
//            System.out.println();
//        }

    }
}