//Write a method to reverse a List of integers in Java without using built-in reverse methods.
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    static List<Integer> reverseList(List<Integer> list){
        List<Integer> reversedList = new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.print(reverseList(list)+" ");
    }
}
