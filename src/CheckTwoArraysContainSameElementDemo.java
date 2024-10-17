import java.util.Arrays;

public class CheckTwoArraysContainSameElementDemo {
    static boolean checkArraysContainSameElement(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1); // sorting because if element having different index then it will not mark as equal.
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};
        int[] arr3 = {2,3,4,5,6};
        int[] arr4 = {1,2,3,5,4};

        if(checkArraysContainSameElement(arr1,arr4)){
            System.out.println("Both Arrays contains same element");
        }else{
            System.out.println("Both Arrays has not contains same element");
        }
    }
}
