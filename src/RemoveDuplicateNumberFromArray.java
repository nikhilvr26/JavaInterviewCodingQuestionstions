import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateNumberFromArray {
// first approach
    static List<Integer> removeDuplicateElementByUsingList(int[] intArr){
        List<Integer> intList = new ArrayList<>();
        for(int i : intArr){
            if(!intList.contains(i)){ // in this condition, if any element is already there then it will not add into list
                intList.add(i);
            }
        }
        return intList;
    }

    // second approach
    static Set<Integer> removeDuplicateElementByUsingSet(int[] intArr){
        Set<Integer> intSet = new HashSet<>();
        for(int i : intArr){
            intSet.add(i); // in set duplicates are not allowed
        }
        return intSet;
    }
    public static void main(String[] args) {
        int[] intArr = {1,2,3,3,4,5,6,6,7};
        System.out.println(removeDuplicateElementByUsingList(intArr));
        System.out.println(removeDuplicateElementByUsingSet(intArr));
    }
}
