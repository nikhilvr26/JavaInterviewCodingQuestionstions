import java.util.Arrays;

public class MoveAllZeroToLeft {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,5,0,6};
        int [] result = moveAllZeroesToLeft(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] moveAllZeroesToLeft(int[] arr) {
        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index--;
            }
        }
        return arr;
    }

}
