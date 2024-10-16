public class FindMissingNumberInArrayDemo {
    static int checkMissingNumberInArray(int[] arr, int n){
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return totalSum - sum;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,5,6,7};
        System.out.println("Missing number is: "+ checkMissingNumberInArray(arr, n));
    }
}
