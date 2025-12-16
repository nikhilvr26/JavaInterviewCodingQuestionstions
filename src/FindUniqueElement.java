public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,0,4,3,1,0,3};
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        System.out.println("Unique element is : "+ans);
    }
}
