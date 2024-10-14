public class StringPalindromeDemo {
    public static boolean isStringPalindrome(String str){
        str = str.toLowerCase(); // convert string into lower case. So, capital letters will not give any problem if string have that.
        char[] strArray = str.toCharArray(); // storing string into char array, so that we can iterate that.
        for(int i=0; i<strArray.length/2; i++){ // iterating the char array to the half of its length because no need to iterate whole length
            if(strArray[i]==strArray[strArray.length-1-i]){ // comparing first index with the last index and increasing from the start and decreasing from the last.
                return true; // if the condition is true the return true
            }
        }
        return false; // else false
    }
    public static void main(String[] args) {
        String str = "Madam";
        if(isStringPalindrome(str)){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }
    }
}