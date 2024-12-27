public class Swap2NumbersDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping: num1 is: "+num1+" and "+"num2 is: "+num2);
        num2 = num1+num2;
        num1 = num2 - num1; // num1+num2-num1 = num2 which means num1 = num2
        num2 = num2 - num1; // num1+num2-num2 = num1 which means num2 = num1

        System.out.println("After swapping: num1 is: "+num1+" and "+"num2 is: "+num2);
        swapTwoNumbers(num1, num2);

    }

    static void swapTwoNumbers(int n1, int n2){
        System.out.println("Before swapping- n1: "+ n1+" and n2: "+n2);
        n1 = n1^n2; // n1 contains n1 and n2
        n2 = n1^n2; // n1 + n2 + n2 -> n2 cancels n2 and now n1 is left, So, n2 = n1
        n1 = n1^n2; // n1 + n2 + n1 -> n1 cancels n1 and now n2 is left, So n1 = n2
        System.out.println("After swapping- n1 "+ n1+" and n2: "+n2);
    }
}
