public class FindAverageOfPositiveNumber {
    static double findAverage(int[] arr){
        int count = 0;
        int sum = 0;
        for(int i : arr){
            if(i > 0){
                sum += i;
                count++;
            }
        }
        double average = (double) sum/count;
        return average;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,2,3,4,-5};
        System.out.println(findAverage(arr));
    }
}
