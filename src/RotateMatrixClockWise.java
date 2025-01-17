public class RotateMatrixClockWise {
    public static void rotateMatrixClockWise(int[][] arr){
        //Step-1 : Transpose Matrix, which means convert all rows into columns
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Step-2 : reversing all rows
        for(int[] row : arr){
            reverseArray(row);
        }
        //printing the array
        for(int a=0; a< arr.length; a++){
            for(int b=0; b<arr[0].length; b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }

    }
    public static void reverseArray(int[] arrNum){
        int start = 0, end = arrNum.length-1;
        while(start<end){
            int temp = arrNum[start];
            arrNum[start] = arrNum[end];
            arrNum[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println("Original Array:");
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After rotating:");
        rotateMatrixClockWise(arr);
    }
}
