public class PrintAllSubArrays {

    public static void printSubArrays(int[] arrNum){
        for(int si = 0; si<arrNum.length; si++){
            for(int ei = si; ei< arrNum.length; ei++){
                for(int k=si; k<=ei; k++){
                    System.out.print(arrNum[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arrNum = {1,2,3,4};
        printSubArrays(arrNum);
    }
}

/*
       si  ei
        0	0
        0	1
        0	2
        0	3
        1	1
        1	2
        1	3
        2	2
        2	3
        3	3
*/

