import java.util.*;

public class DuplicatesElementInArray {

    public static void duplicatesElementInArray(String[] strArray){
        Map<String, Integer> freqMap = new HashMap<>();
        for(String s : strArray){
            freqMap.put(s, freqMap.getOrDefault(s, 0)+1);
        }
        System.out.println("Duplicates elements are:");
        boolean hasDuplicates = false;
        for(Map.Entry<String, Integer> result : freqMap.entrySet()){
            if(result.getValue()>1){
                hasDuplicates = true;
                System.out.println(result.getKey());
            }
        }
        if(!hasDuplicates){
            System.out.println("No duplicates!!");
        }
    }

    public static void duplicate(int[] intArr){
        Set<Integer> original = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i : intArr){
            if(!original.add(i)){
                duplicates.add(i);
            }
        }
        if (duplicates.isEmpty()){
            System.out.println("No Duplicates");
        }else{
            System.out.println(duplicates);
        }
    }
    public static void main(String[] args) {
        String[] strArray = {"Apple", "Banana", "Grapes", "Apple", "Grapes"};
        duplicatesElementInArray(strArray);
        int[] intArr = {1,2,3,4,5,4,5};
        duplicate(intArr);
    }
}
