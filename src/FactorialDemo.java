public class FactorialDemo {
    static long factorialUsingLoop(int n){
        if(n<=2){
            return n;
        }
        int num = 1;
        for(int i = 1; i<=n; i++){
            num = num*i;
        }
        return num;
    }

    static long factorialUsingRecursion(int n){
        if(n<=2){
            return n;
        }
        return n*factorialUsingRecursion(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        long result = factorialUsingLoop(n);
        System.out.println("Factorial of "+n+" is: "+result);
        System.out.println("Factorial of "+n+" is: "+ factorialUsingRecursion(n));
    }
}
