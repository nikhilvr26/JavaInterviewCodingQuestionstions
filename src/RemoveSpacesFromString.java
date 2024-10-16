public class RemoveSpacesFromString {

    static String removeSpacesFromString(String str){
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(!Character.isWhitespace(c))
                 result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "My name is Nikhil";
        System.out.println(removeSpacesFromString(str));
    }
}
