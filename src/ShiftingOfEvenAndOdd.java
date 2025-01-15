import java.util.Arrays;

public class ShiftingOfEvenAndOdd {

    public static void shiftingOfEvenAndOdd(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && arr[left]%2==0){
                left++;
            }
            while(left<right && arr[right]%2 != 0){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        shiftingOfEvenAndOdd(arr);
    }
}
