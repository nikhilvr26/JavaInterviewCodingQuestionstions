public class ConvertUpperCaseToLowerCase {
    static String convertUpperToLower(String s){
        char[] ch = s.toCharArray();
        for(int i = 0; i< ch.length; i++){
            if(ch[i] >='A' && ch[i]<='Z'){
                char ansCh = (char)(ch[i] - 'A' + 'a');
                ch[i] = ansCh;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "HeLLo WorlD";
        System.out.println(convertUpperToLower(s));
    }
}
