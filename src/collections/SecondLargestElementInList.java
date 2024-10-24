package collections;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElementInList {
    static int secondLargestElement(List<Integer> list){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > largest) {
                int temp = largest;
                largest = integer;
                secondLargest = temp;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,34,23,56,75);
        System.out.println(secondLargestElement(list));
    }
}
