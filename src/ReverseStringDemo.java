public class ReverseStringDemo {
    public static String reverseString(String str){
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = "Nikhil";
        System.out.println("Reverse string is "+ reverseString(str));

        //Second Approach: using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        String reverseString = sb.reverse().toString();
       // String s = sb.substring(1,2).toString();
      // String s =  sb.append("verma").toString();
        System.out.println("Reverse string using StringBuilder is "+reverseString);
        //System.out.println(s);

    }
}
