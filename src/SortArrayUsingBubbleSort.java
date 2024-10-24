public class SortArrayUsingBubbleSort {
    static void increaseSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public void decreaseSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,7,8,5,6,3};
        increaseSort(arr);
        System.out.println();
        SortArrayUsingBubbleSort s = new SortArrayUsingBubbleSort();
        s.decreaseSort(arr);
    }
}
