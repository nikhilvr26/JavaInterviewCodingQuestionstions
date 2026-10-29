public class MaxProductOfThreeNum {
    static void main() {
        int[] arr = {-20,-1,0,1,20,30,2};
        int maxProduct = maxProduct(arr);
        System.out.println(maxProduct);
    }

    static int maxProduct(int [] arr){

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num > firstSmallest) {
                secondSmallest = num;
            }
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            }else if (num > thirdLargest && num < secondLargest){
                thirdLargest = num;
            }
        }

        return Math.max((firstSmallest*secondLargest*firstLargest), (firstLargest*secondLargest*thirdLargest));
    }
}
