package Coding_Questions.Arrays;

import java.util.Arrays;

public class Left_Right_Rotate_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        //System.out.println(Arrays.toString(leftRotate(arr, k)));
        //System.out.println(Arrays.toString(leftRotateRec(arr, k)));
        //System.out.println(Arrays.toString(rightRotate(arr,k)));
        System.out.println(Arrays.toString(rightRotateRec(arr,k)));

    }

    private static int[] leftRotate(int[] arr, int k) {
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        return arr;
    }


    private static int[] rightRotate(int[] arr, int k) {
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            int last = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        return arr;
    }


    private static int[] leftRotateRec(int[] arr, int k) {
        int n=arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    private static int[] rightRotateRec(int[] arr, int k) {
        int n=arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);


        return arr;
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;

        }
    }
}
