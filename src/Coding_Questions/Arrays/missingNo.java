package Coding_Questions.Arrays;

public class missingNo {
    public static void main(String[] args) {
        int arr[] = {1, 2,3, 5};
        System.out.println(missNo(arr));
    }

    private static int missNo(int arr[]) {
        int n = 5;int arrSum=0;
        int totalsum = n *( n - 1) / 2;
        for (int i=0;i<arr.length-1;i++) {
            arrSum+=arr[i];
        }
        return totalsum-arrSum;
    }
}
