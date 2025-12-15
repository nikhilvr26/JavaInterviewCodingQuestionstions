import java.util.Arrays;

public class MoveAllZeroesToRight {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,5,0,6};
        int [] result = moveAllZeroesToRight(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] moveAllZeroesToRight(int[] arr){
        int nonZeroIndex = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
        return arr;
    }
}
