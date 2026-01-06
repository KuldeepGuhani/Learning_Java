package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,22,35,84,97,15400};

        //using inplace
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        // using two pointers
        int left=0;
        int right=arr.length-1;
        while(left < right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
        }
        System.out.println();
        System.out.println("two pointer approach ");
        for(int rst:arr) {
            System.out.print(" "+rst);// TC - 0(N) and SC - 0(N).
        }
    }
}
