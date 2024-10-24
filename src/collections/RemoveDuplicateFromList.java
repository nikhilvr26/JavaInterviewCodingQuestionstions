package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {
    static List<Integer> removeDuplicate(List<Integer> list){
        List<Integer> listWithoutDuplicate = new ArrayList<>();
        for(int i : list){
            if(!listWithoutDuplicate.contains(i)){
                listWithoutDuplicate.add(i);
            }
        }
        return listWithoutDuplicate;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,4,5,5,6,4,3);
        System.out.print(removeDuplicate(list)+" ");
    }
}
