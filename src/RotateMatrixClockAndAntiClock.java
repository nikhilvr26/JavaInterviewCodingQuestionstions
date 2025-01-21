public class RotateMatrixClockAndAntiClock {
     /*To rotate a Matrix we need to follow 2 steps -
      1. Transpose the matrix which means convert row int column and column into row.
      2. To rotate clockwise - reverse all row, To rotate anticlockwise - reverse all column.*/

    //Step-1
    static void transposeMatrix(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void printTransposeMatrix(int[][] arr){
        transposeMatrix(arr);
        printArray(arr);
    }

    static void rotateClockwise(int[][] arr){
        transposeMatrix(arr);
        for(int[] a : arr){
            reverseOneRow(a);
        }
        printArray(arr);
    }

    static void rotateAntiClockwise(int[][] arr){
        transposeMatrix(arr);
        int col = 0, endCol = arr[0].length;
        while(col<endCol){
            reverseOneColumn(arr, col);
            col++;
        }
        printArray(arr);
    }

    static void reverseOneRow(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void reverseOneColumn(int[][] arr, int col){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start][col];
            arr[start][col] = arr[end][col];
            arr[end][col] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        System.out.println("Original Matrix:");
        printArray(arr);
        /*System.out.println("Transpose Matrix:");
        printTransposeMatrix(arr);*/
        /*System.out.println("Clockwise rotating Matrix:");
        rotateClockwise(arr);*/
        System.out.println("AntiClockwise rotating Matrix:");
        rotateAntiClockwise(arr);
    }
}
