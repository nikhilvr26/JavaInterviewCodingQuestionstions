import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {

    static void checkIntersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int a : arr1){
            set.add(a);
        }
        for(int b : arr2){
            if (set.contains(b)){
                System.out.println("Intersection point is: "+ b);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7,8,9};
        checkIntersection(arr1, arr2);
    }
}
