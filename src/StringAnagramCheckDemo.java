import java.util.Arrays;

public class StringAnagramCheckDemo {
    //An anagram of a string is another string that contains the same characters, only the order of characters can be different.
    //For example, “abcd” and “dabc” are an anagram of each other.
    static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase(); // making lower case, So any capital letters will not impact our operation.
        s2 = s2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1); // sorting so that we can compare both array using Arrays.equals
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String s1 = "Rescue";
        String s2 = "Secure";
        if(checkAnagram(s1, s2)){
            System.out.println("Both Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }
    }
}
