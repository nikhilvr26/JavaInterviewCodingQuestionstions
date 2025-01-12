import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

    static String removeDuplicatesUsingSet(String str){
        Set<Character> charSet = new HashSet<>();
        StringBuffer finalString = new StringBuffer();
        for(char c : str.toCharArray()){
            if(charSet.add(c)){
                finalString.append(c);
            }
        }
        return finalString.toString();
    }
    public static void main(String[] args) {
        String str = "Duplicate Strings";
        System.out.println("Original String: "+ str);
        System.out.println("String without duplicates: "+removeDuplicatesUsingSet(str));
    }
}
