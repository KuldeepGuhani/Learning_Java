package Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int[] result =new int [arr.length];
        int idx=0;
        for(int num:arr){
            if(num!=0){
                result[idx++]=num;
            }
        }

        for(int num:result){
            System.out.print(num+" ");
        }
    }

}
