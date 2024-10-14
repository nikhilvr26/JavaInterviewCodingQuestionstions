public class PrimeNumberCheckDemo {

    public static boolean isNumberPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2; i<=num-1; i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 1;
        if(isNumberPrime(num)){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
