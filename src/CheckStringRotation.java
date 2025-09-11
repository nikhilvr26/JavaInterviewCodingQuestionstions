public class CheckStringRotation {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defabc";
        if(isStringRotate(s1, s2)){
            System.out.println("Second String ia a rotation of first String");
        }else {
            System.out.println("Not a rotation");
        }
    }

    static boolean isStringRotate(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return (s1 + s1).contains(s2);
    }
}
