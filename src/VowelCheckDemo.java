public class VowelCheckDemo {

    public static boolean vowelCheck(String str){
        str = str.toLowerCase();
        char[] vowelArray = str.toCharArray();
        for (char c : vowelArray) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
        }
        return false;
    }

    //second approach
    public static boolean checkVowel(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        String str = "VowEl";
        if(vowelCheck(str)){
            System.out.println("String contains vowel");
        }else{
            System.out.println("String doesn't contain vowel");
        }
        ///////////////////////////////
        if(checkVowel(str)){
            System.out.println("String contains vowel");
        }else{
            System.out.println("String doesn't contain vowel");
        }
    }
}
