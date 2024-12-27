import java.util.HashMap;
import java.util.Map;

public class CountHighestFrequencyDigitInNumber {

    static void countFrequency(Long num){
        String numString = Long.toString(num);
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : numString.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        char highestFrequencyChar = ' ';
        int highestFrequency = 0;
        for(Map.Entry<Character, Integer> result : frequencyMap.entrySet()){
            if(result.getValue()>highestFrequency){
                highestFrequencyChar = result.getKey();
                highestFrequency = result.getValue();
            }
        }
        System.out.println("Highest frequency digit in a number is : "+ highestFrequencyChar + " and its having frequency : "+highestFrequency);
    }
    public static void main(String[] args) {
        Long num = 1223422L;
        countFrequency(num);
    }
}
