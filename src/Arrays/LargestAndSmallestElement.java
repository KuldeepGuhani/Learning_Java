package Arrays;

import java.util.Arrays;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
    int[] arr={0,22,74,2,3,55,199}; //TC - 0(N) and SC - 0(1)
    int large=arr[0];
    int small=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            large=arr[i];
        }else if(arr[i]<small){
            small=arr[i];
        }
    }
        System.out.println("Largest : "+large+" Small : "+small);


        //using sorting
        Arrays.sort(arr);
        System.out.println("Smallest : "+arr[0]+" Largest : "+arr[arr.length-1]);

    }


}
