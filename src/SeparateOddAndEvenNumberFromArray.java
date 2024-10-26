import java.util.ArrayList;

public class SeparateOddAndEvenNumberFromArray {
    static void separateOddAndEven(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i : arr){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("Even numbers are: "+ even);
        System.out.println("Odd numbers are:"+ odd);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        separateOddAndEven(arr);
    }
}
