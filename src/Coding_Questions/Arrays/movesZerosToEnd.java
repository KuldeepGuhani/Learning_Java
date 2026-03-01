package Coding_Questions.Arrays;

import java.util.Arrays;

public class movesZerosToEnd {
    public static void main(String[] args){
    int[] arr={1,0,2,5,0};
    int result[]=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            result[j++]=arr[i];
        }
    }
        System.out.println(Arrays.toString(result));
    }
}
