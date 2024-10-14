public class Swap2NumbersDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping: num1 is: "+num1+" and "+"num2 is: "+num2);
        num2 = num1+num2;
        num1 = num2 - num1; // num1+num2-num1 = num2 which means num1 = num2
        num2 = num2 - num1; // num1+num2-num2 = num1 which means num2 = num1

        System.out.println("After swapping: num1 is: "+num1+" and "+"num2 is: "+num2);
    }
}
