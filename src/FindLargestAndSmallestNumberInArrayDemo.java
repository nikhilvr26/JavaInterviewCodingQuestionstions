public class FindLargestAndSmallestNumberInArrayDemo {
    public static int findLargestNumber(int[] max ){
        int largestNum = max[0];
        for (int j : max) {
            if (largestNum < j) { //if first number is smallest then second number then its obvious that we have to store larger number to first number.
                largestNum = j;
            }
        }
        return largestNum;
    }

    public static int findSmallestNumber(int[] min){
        int smallestNum = min[0];
        for(int i : min){
            if(smallestNum>i){
                smallestNum = i;
            }
        }
        return smallestNum;
    }
    public static void main(String[] args) {
        int[] arr = {12,34,2,56,68,45};
        System.out.println("Largest Number is: "+ findLargestNumber(arr));
        System.out.println("Smallest Number is: "+ findSmallestNumber(arr));
    }
}
