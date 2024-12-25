public class ReverseFirstAndLastDigitOfNumber {

    static int reverseFirstAndLastDigit(int num){
        int originalNumber = num;

        //Extracting last digit
        int lastDigit = num%10;

        //Extracting first digit
        int divisor = 1;
        while(num >=10){
            num/=10;
            divisor *= 10;
        }
        int firstDigit = num;
        int middleNumber = originalNumber%divisor/10;

        int finalNumber = (lastDigit*divisor) + (middleNumber*10) + firstDigit;
        return finalNumber;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number before reversing the digit: "+ num);
        System.out.println("Number after reversing the digits: "+ reverseFirstAndLastDigit(num));
    }
}
