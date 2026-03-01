package Coding_Questions.Arrays;

public class Find_Largest_Smallest_ele {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Find Largest : "+findLargest(arr));
        System.out.println("Find Smallest : "+findSmallest(arr));

    }

    private static int findLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static int findSmallest(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
