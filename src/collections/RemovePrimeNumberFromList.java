package collections;

import java.util.ArrayList;

public class RemovePrimeNumberFromList {
    static void removePrimeNumber(ArrayList<Integer> list){
        for(int i = list.size()-1; i>=0; i--){
            if(isPrime(list.get(i))){
                list.remove(i);
            }
        }
        System.out.print(list+" ");
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(22);
        list.add(5);
        list.add(2);
        list.add(6);
        System.out.println("Original list:");
        System.out.print(list+" ");
        System.out.println("\nAfter removing prime numbers: ");
        removePrimeNumber(list);
    }
}
