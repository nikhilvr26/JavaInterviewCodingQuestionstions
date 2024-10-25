public class Armstrong {

    static void isNumberArmstrong(int num){
        if(num<0){
            System.out.println(num+ " is not armstrong as negative number can't be!");
        }
        int original = num;
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        int temp = original;
        int result = 0;
        while(original>0){
             int digit = original%10;
             result += (int) Math.pow(digit, count);
             original /= 10;
        }
        if(temp == result){
            System.out.println(temp+" is Armstrong");
        }else{
            System.out.println(temp+ " is not Armstrong");
        }
    }
    public static void main(String[] args) {
        int n = 153;
        isNumberArmstrong(n);
    }
}
