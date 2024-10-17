public class FindSecondLargestNumberInArrayDemo {
    static int findSecondLargestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i>largest){  // if current number is largest then we assign that value to largest
                secondLargest = largest; // before that we assign the largest value to second largest
                largest = i; // now largest have new largest value
            } else if (i>secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Second largest number is: "+ findSecondLargestNumber(arr));

    }
}
