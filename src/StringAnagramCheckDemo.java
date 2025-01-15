import java.util.Arrays;
import java.util.HashMap;

public class StringAnagramCheckDemo {
    //An anagram of a string is another string that contains the same characters, only the order of characters can be different.
    //For example, “abcd” and “dabc” are an anagram of each other.
    //First approach
    static boolean checkAnagram(String s1, String s2){
        s1 = s1.replace(" ","").toLowerCase();
        s2 = s2.replace(" ","").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1); // sorting so that we can compare both array using Arrays.equals
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
    //Second Approach
    public static boolean anagramCheck(String s1, String s2){
        s1 = s1.replace(" ","").toLowerCase();
        s2 = s2.replace(" ","").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(char c : s1.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            if(!countMap.containsKey(c)){
                return false;
            }
            countMap.put(c, countMap.get(c)-1);
            if(countMap.get(c) == 0){
                countMap.remove(c);
            }
        }
        return countMap.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "Rescue secure ";
        String s2 = "Secure rescue";
        if(checkAnagram(s1, s2)){
            System.out.println("Both Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }
        if(anagramCheck(s1,s2)){
            System.out.println("Both Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }
    }
}
