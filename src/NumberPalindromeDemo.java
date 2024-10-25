public class NumberPalindromeDemo {
    static void isNumberPalindrome(int num){
        int originalNum = num;
        int result=0;
        while(num>0){
            int digit = num%10;
            result =result*10+ digit;
            num/=10;
        }
        if(originalNum == result){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        int num = 12321;
        isNumberPalindrome(num);
    }
}
