import java.util.HashMap;
import java.util.Map;

public class IdentifyUniqueElementInWord {
    static void identifyUniqueWord(String str){
        str = str.toLowerCase();
        Map<Character, Integer> countWord = new HashMap<>();
        for(char ch : str.toCharArray()){
            countWord.put(ch, countWord.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> result : countWord.entrySet()){
            if(result.getValue() == 1){
                System.out.print(result.getKey()+" ");
            }
        }

    }
    public static void main(String[] args) {
        String str = "programming";
        identifyUniqueWord(str);
    }
}
