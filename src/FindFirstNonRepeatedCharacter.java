import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedCharacter(String str){
        str = str.toLowerCase();
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> result : frequencyMap.entrySet()){
            if(result.getValue() == 1){
                return result.getKey();
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String str = "success";
        char output = findFirstNonRepeatedCharacter(str);
        if(output == '0'){
            System.out.println("String does not contain any duplicate character");
        }else{
            System.out.println("First non repeated character is: "+output);
        }
    }
}
