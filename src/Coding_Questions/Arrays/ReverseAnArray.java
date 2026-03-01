package Coding_Questions.Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverseInPlace(arr)));
    }

    private static int[] reverse(int[] arr) { //TC- O(N) and SC - O(N)
        int result[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            result[j++]=arr[i];
        }
        return result;
    }


    private static int[] reverseInPlace(int[] arr) { //TC- O(N) and SC - O(1)
        int left=0;int right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[left]<arr[right]){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
