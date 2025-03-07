public class ReverseVowelsInString {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    static String reverseVowelInString(String s){
        char[] ch = s.toCharArray();
        int start = 0, end = ch.length-1;
        while (start<end){
            if(!isVowel(ch[start])){
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            }else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "This is vOwEl";
        System.out.println(reverseVowelInString(s));
    }
}
