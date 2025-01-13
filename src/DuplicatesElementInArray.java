import java.util.HashMap;
import java.util.Map;

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
    public static void main(String[] args) {
        String[] strArray = {"Apple", "Banana", "Grapes", "Apple", "Grapes"};
        duplicatesElementInArray(strArray);
    }
}
