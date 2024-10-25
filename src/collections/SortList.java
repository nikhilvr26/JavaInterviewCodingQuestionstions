package collections;

import java.util.Arrays;
import java.util.List;

public class SortList {
    static List<Integer> sortingInAscending(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(j)<list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,1,3,7,6);
        List<Integer> result = sortingInAscending(list);
        System.out.println(result+" ");

    }
}
