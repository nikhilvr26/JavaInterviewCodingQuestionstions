public class ReverseString {

    static String reverseString(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "My name is Nikhil";
        System.out.print(reverseString(str));

    }
}
