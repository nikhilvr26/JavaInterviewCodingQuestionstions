public class FibonacciDemo {

    //First approach by swapping numbers
    public static void fibonacciSwapNumber(int n){
        int a = 0; int b = a+1;
        for(int i = 0; i<=n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    // Using Recursive approach
    static int fibonacciRecursive(int n){
        if(n<=1){
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        fibonacciSwapNumber(n);
        System.out.println();
        for(int i=0; i<=n; i++){
            System.out.print(fibonacciRecursive(i)+ " ");
        }
    }
}
