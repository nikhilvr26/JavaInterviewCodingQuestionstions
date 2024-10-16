import java.util.Arrays;
import java.util.List;

public class CheckIfListContainsOnlyOddNumbersDemo {

    static boolean checkOnlyOddNumber(List<Integer> intList){
        for(int i : intList){
            if(i%2 == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,7,9);
        if(checkOnlyOddNumber(intList)){
            System.out.println("List contains only odd numbers");
        }else{
            System.out.println("List doesn't contains only odd numbers");
        }
        //using streams
        boolean allOdd = intList
                .stream()
                .allMatch(i -> i%2 != 0);
        if(allOdd){
            System.out.println("List contains only odd numbers");
        }else{
            System.out.println("List doesn't contains only odd numbers");
        }
    }
}
