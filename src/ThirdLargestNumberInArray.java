public class ThirdLargestNumberInArray {

    static int findThirdLargestNumber(int [] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num>secondLargest && num<firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num>thirdLargest) {
                thirdLargest = num;
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args) {
        int[] arr = {22,34,56,78,92,45};
        System.out.println("Third Largest Number is: "+findThirdLargestNumber(arr));
    }
}
